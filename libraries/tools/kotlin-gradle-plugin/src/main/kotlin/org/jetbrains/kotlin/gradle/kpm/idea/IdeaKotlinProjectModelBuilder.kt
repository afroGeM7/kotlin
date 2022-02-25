package org.jetbrains.kotlin.gradle.kpm.idea

import org.gradle.api.Project
import org.gradle.tooling.provider.model.ToolingModelBuilder
import org.jetbrains.kotlin.compilerRunner.konanHome
import org.jetbrains.kotlin.gradle.kpm.external.ExternalVariantApi
import org.jetbrains.kotlin.gradle.plugin.getKotlinPluginVersion
import org.jetbrains.kotlin.gradle.plugin.mpp.pm20.KotlinPm20ProjectExtension
import java.io.File

internal interface IdeaKotlinProjectModelBuildingContext {
    val dependencyResolver: IdeaKotlinFragmentDependencyResolver

    companion object Empty : IdeaKotlinProjectModelBuildingContext {
        override val dependencyResolver: IdeaKotlinFragmentDependencyResolver = IdeaKotlinFragmentDependencyResolver.Empty
    }
}

interface IdeaKotlinProjectModelBuilder {
    @ExternalVariantApi
    fun registerDependencyResolver(resolver: IdeaKotlinFragmentDependencyResolver)

    @ExternalVariantApi
    fun registerDependencyTransformer(transformer: IdeaKotlinFragmentDependencyTransformer)

    fun buildIdeaKotlinProjectModel(): IdeaKotlinProjectModel
}

internal class IdeaKotlinProjectModelBuilderImpl(
    private val extension: KotlinPm20ProjectExtension,
    dependencyResolvers: List<IdeaKotlinFragmentDependencyResolver> = listOf(
        IdeaKotlinVariantBinaryDependencyResolver(),
        IdeaKotlinMetadataDependencyResolver(),
        IdeaKotlinSourcesAndDocumentationResolver()
    ),
    dependencyTransformers: List<IdeaKotlinFragmentDependencyTransformer> = listOf(
        IdeaKotlinSinglePlatformStdlibCommonFilter,
        IdeaKotlinUnusedSourcesAndDocumentationFilter
    )
) : ToolingModelBuilder, IdeaKotlinProjectModelBuilder {

    private val dependencyResolvers = dependencyResolvers.toMutableList()
    private val dependencyTransformers = dependencyTransformers.toMutableList()

    @ExternalVariantApi
    override fun registerDependencyResolver(resolver: IdeaKotlinFragmentDependencyResolver) {
        dependencyResolvers.add(resolver)
    }

    @ExternalVariantApi
    override fun registerDependencyTransformer(transformer: IdeaKotlinFragmentDependencyTransformer) {
        dependencyTransformers.add(transformer)
    }

    override fun buildIdeaKotlinProjectModel(): IdeaKotlinProjectModel {
        return Context().toIdeaKotlinProjectModel(extension)
    }

    override fun canBuild(modelName: String): Boolean =
        modelName == IdeaKotlinProjectModel::class.java.name

    override fun buildAll(modelName: String, project: Project): IdeaKotlinProjectModel {
        check(project === extension.project) { "Expected project ${extension.project.path}, found ${project.path}" }
        return buildIdeaKotlinProjectModel()
    }

    private inner class Context : IdeaKotlinProjectModelBuildingContext {
        override val dependencyResolver = IdeaKotlinFragmentDependencyResolver { fragment ->
            val dependencies = IdeaKotlinFragmentDependencyResolver(dependencyResolvers).resolve(fragment)
            IdeaKotlinFragmentDependencyTransformer(dependencyTransformers).transform(fragment, dependencies)
        }
    }
}

internal fun IdeaKotlinProjectModelBuildingContext.toIdeaKotlinProjectModel(extension: KotlinPm20ProjectExtension): IdeaKotlinProjectModel {
    return IdeaKotlinProjectModelImpl(
        gradlePluginVersion = extension.project.getKotlinPluginVersion(),
        coreLibrariesVersion = extension.coreLibrariesVersion,
        explicitApiModeCliOption = extension.explicitApi?.cliOption,
        kotlinNativeHome = File(extension.project.konanHome).absoluteFile,
        modules = extension.modules.map { module -> toIdeaKotlinModule(module) }
    )
}
