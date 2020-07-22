/*
 * Copyright 2010-2019 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.script.configuration

import com.intellij.ide.actions.ShowSettingsUtilImpl
import com.intellij.openapi.fileEditor.FileEditor
import com.intellij.openapi.project.Project
import com.intellij.openapi.ui.popup.JBPopupFactory
import com.intellij.openapi.ui.popup.util.BaseListPopupStep
import com.intellij.openapi.util.Key
import com.intellij.openapi.util.Ref
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.psi.PsiManager
import com.intellij.ui.EditorNotificationPanel
import com.intellij.ui.EditorNotifications
import com.intellij.ui.HyperlinkLabel
import org.jetbrains.kotlin.idea.KotlinBundle
import org.jetbrains.kotlin.idea.KotlinFileType
import org.jetbrains.kotlin.idea.core.script.ScriptDefinitionsManager
import org.jetbrains.kotlin.idea.core.script.StandardIdeScriptDefinition
import org.jetbrains.kotlin.idea.core.script.settings.KotlinScriptingSettings
import org.jetbrains.kotlin.parsing.KotlinParserDefinition
import org.jetbrains.kotlin.psi.KtFile
import org.jetbrains.kotlin.scripting.definitions.ScriptDefinition
import org.jetbrains.kotlin.scripting.resolve.KotlinScriptDefinitionFromAnnotatedTemplate
import org.jetbrains.kotlin.scripting.resolve.KtFileScriptSource

class MultipleScriptDefinitionsChecker(private val project: Project) : EditorNotifications.Provider<EditorNotificationPanel>() {

    override fun getKey(): Key<EditorNotificationPanel> = KEY

    override fun createNotificationPanel(file: VirtualFile, fileEditor: FileEditor): EditorNotificationPanel? {
        if (file.fileType != KotlinFileType.INSTANCE) return null

        val ktFile = PsiManager.getInstance(project).findFile(file) as? KtFile ?: return null

        if (!ktFile.isScript()) return null
        if (KotlinScriptingSettings.getInstance(ktFile.project).suppressDefinitionsCheck) return null
        if (!ScriptDefinitionsManager.getInstance(ktFile.project).isReady()) return null

        val allApplicableDefinitions = ScriptDefinitionsManager.getInstance(project)
            .getAllDefinitions()
            .filter {
                it.asLegacyOrNull<StandardIdeScriptDefinition>() == null && it.isScript(KtFileScriptSource(ktFile)) &&
                        KotlinScriptingSettings.getInstance(project).isScriptDefinitionEnabled(it)
            }
            .toList()
        if (allApplicableDefinitions.size < 2) return null
        if (areDefinitionsForGradleKts(allApplicableDefinitions)) return null

        return createNotification(
            ktFile,
            allApplicableDefinitions
        )
    }

    private fun areDefinitionsForGradleKts(allApplicableDefinitions: List<ScriptDefinition>): Boolean {
        return allApplicableDefinitions.all {
            val pattern = it.asLegacyOrNull<KotlinScriptDefinitionFromAnnotatedTemplate>()?.scriptFilePattern?.pattern
            pattern == ".*\\.gradle\\.kts" || pattern == "^(settings|.+\\.settings)\\.gradle\\.kts\$" || pattern == ".+\\.init\\.gradle\\.kts"
        }
    }

    companion object {
        private val KEY = Key.create<EditorNotificationPanel>("MultipleScriptDefinitionsChecker")

        private fun createNotification(psiFile: KtFile, defs: List<ScriptDefinition>): EditorNotificationPanel =
            EditorNotificationPanel().apply {
                setText(
                    KotlinBundle.message("script.text.multiple.script.definitions.are.applicable.for.this.script", defs.first().name))
                createComponentActionLabel(
                    KotlinBundle.message("script.action.text.show.all")
                ) { label ->
                    val list = JBPopupFactory.getInstance().createListPopup(
                        object : BaseListPopupStep<ScriptDefinition>(null, defs) {
                            override fun getTextFor(value: ScriptDefinition): String =
                                value.asLegacyOrNull<KotlinScriptDefinitionFromAnnotatedTemplate>()?.let {
                                    it.name + " (${it.scriptFilePattern})"
                                } ?: value.asLegacyOrNull<StandardIdeScriptDefinition>()?.let {
                                    it.name + " (${KotlinParserDefinition.STD_SCRIPT_EXT})"
                                } ?: value.name + " (${value.fileExtension})"
                        }
                    )
                    list.showUnderneathOf(label)
                }

                createComponentActionLabel(KotlinBundle.message("script.action.text.ignore")) {
                    KotlinScriptingSettings.getInstance(psiFile.project).suppressDefinitionsCheck = true
                    EditorNotifications.getInstance(psiFile.project).updateAllNotifications()
                }

                createComponentActionLabel(KotlinBundle.message("script.action.text.open.settings")) {
                    ShowSettingsUtilImpl.showSettingsDialog(psiFile.project, KotlinScriptingSettingsConfigurable.ID, "")
                }
            }

        private fun EditorNotificationPanel.createComponentActionLabel(labelText: String, callback: (HyperlinkLabel) -> Unit) {
            val label: Ref<HyperlinkLabel> = Ref.create()
            label.set(createActionLabel(labelText) {
                callback(label.get())
            })
        }
    }
}
