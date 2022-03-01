/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.gradle.mpp

import org.gradle.api.Project
import org.gradle.api.internal.project.ProjectInternal
import org.gradle.testfixtures.ProjectBuilder
import org.jetbrains.kotlin.gradle.addBuildEventsListenerRegistryMock
import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension
import org.jetbrains.kotlin.gradle.dsl.kotlinExtension
import org.jetbrains.kotlin.gradle.kpm.KpmExtension

fun buildProject(
    configBuilder: ProjectBuilder.() -> Unit = { Unit },
    configProject: Project.() -> Unit
): ProjectInternal = ProjectBuilder
    .builder()
    .apply(configBuilder)
    .build()
    //temporary solution for BuildEventsListenerRegistry
    .also { addBuildEventsListenerRegistryMock(it) }
    .apply(configProject)
    .let { it as ProjectInternal }

fun buildProjectWithMPP(code: Project.() -> Unit) = buildProject {
    project.plugins.apply("kotlin-multiplatform")
    code()
}

fun buildProjectWithKPM(code: Project.() -> Unit) = buildProject {
    project.plugins.apply("org.jetbrains.kotlin.kpm")
    code()
}


fun Project.kotlin(code: KotlinMultiplatformExtension.() -> Unit) {
    val kotlin = project.kotlinExtension as KotlinMultiplatformExtension
    kotlin.code()
}

fun Project.projectModel(code: KpmExtension.() -> Unit) {
    val extension = project.extensions.getByType(KpmExtension::class.java)
    extension.code()
}