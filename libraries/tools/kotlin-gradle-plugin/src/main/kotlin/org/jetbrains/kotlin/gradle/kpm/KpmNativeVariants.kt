/*
 * Copyright 2010-2022 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.gradle.kpm

import org.gradle.api.artifacts.Configuration
import org.jetbrains.kotlin.konan.target.KonanTarget
import javax.inject.Inject

// DO NOT EDIT MANUALLY! Generated by org.jetbrains.kotlin.generators.gradle.dsl.KpmNativeVariantCodegenKt
open class KotlinAndroidNativeX64Variant @Inject constructor(
    containingModule: KotlinGradleModule,
    fragmentName: String,
    dependencyConfigurations: KotlinFragmentDependencyConfigurations,
    compileDependencyConfiguration: Configuration,
    apiElementsConfiguration: Configuration,
    hostSpecificMetadataElementsConfiguration: Configuration?
) : KotlinNativeVariantInternal(
    containingModule = containingModule,
    fragmentName = fragmentName,
    konanTarget = KonanTarget.ANDROID_X64,
    dependencyConfigurations = dependencyConfigurations,
    compileDependencyConfiguration = compileDependencyConfiguration,
    apiElementsConfiguration = apiElementsConfiguration,
    hostSpecificMetadataElementsConfiguration = hostSpecificMetadataElementsConfiguration
) {
    companion object {
        val constructor = KotlinNativeVariantConstructor(
            KonanTarget.ANDROID_X64, KotlinAndroidNativeX64Variant::class.java, ::KotlinAndroidNativeX64Variant
        )
    }
}

open class KotlinAndroidNativeX86Variant @Inject constructor(
    containingModule: KotlinGradleModule,
    fragmentName: String,
    dependencyConfigurations: KotlinFragmentDependencyConfigurations,
    compileDependencyConfiguration: Configuration,
    apiElementsConfiguration: Configuration,
    hostSpecificMetadataElementsConfiguration: Configuration?
) : KotlinNativeVariantInternal(
    containingModule = containingModule,
    fragmentName = fragmentName,
    konanTarget = KonanTarget.ANDROID_X86,
    dependencyConfigurations = dependencyConfigurations,
    compileDependencyConfiguration = compileDependencyConfiguration,
    apiElementsConfiguration = apiElementsConfiguration,
    hostSpecificMetadataElementsConfiguration = hostSpecificMetadataElementsConfiguration
) {
    companion object {
        val constructor = KotlinNativeVariantConstructor(
            KonanTarget.ANDROID_X86, KotlinAndroidNativeX86Variant::class.java, ::KotlinAndroidNativeX86Variant
        )
    }
}

open class KotlinAndroidNativeArm32Variant @Inject constructor(
    containingModule: KotlinGradleModule,
    fragmentName: String,
    dependencyConfigurations: KotlinFragmentDependencyConfigurations,
    compileDependencyConfiguration: Configuration,
    apiElementsConfiguration: Configuration,
    hostSpecificMetadataElementsConfiguration: Configuration?
) : KotlinNativeVariantInternal(
    containingModule = containingModule,
    fragmentName = fragmentName,
    konanTarget = KonanTarget.ANDROID_ARM32,
    dependencyConfigurations = dependencyConfigurations,
    compileDependencyConfiguration = compileDependencyConfiguration,
    apiElementsConfiguration = apiElementsConfiguration,
    hostSpecificMetadataElementsConfiguration = hostSpecificMetadataElementsConfiguration
) {
    companion object {
        val constructor = KotlinNativeVariantConstructor(
            KonanTarget.ANDROID_ARM32, KotlinAndroidNativeArm32Variant::class.java, ::KotlinAndroidNativeArm32Variant
        )
    }
}

open class KotlinAndroidNativeArm64Variant @Inject constructor(
    containingModule: KotlinGradleModule,
    fragmentName: String,
    dependencyConfigurations: KotlinFragmentDependencyConfigurations,
    compileDependencyConfiguration: Configuration,
    apiElementsConfiguration: Configuration,
    hostSpecificMetadataElementsConfiguration: Configuration?
) : KotlinNativeVariantInternal(
    containingModule = containingModule,
    fragmentName = fragmentName,
    konanTarget = KonanTarget.ANDROID_ARM64,
    dependencyConfigurations = dependencyConfigurations,
    compileDependencyConfiguration = compileDependencyConfiguration,
    apiElementsConfiguration = apiElementsConfiguration,
    hostSpecificMetadataElementsConfiguration = hostSpecificMetadataElementsConfiguration
) {
    companion object {
        val constructor = KotlinNativeVariantConstructor(
            KonanTarget.ANDROID_ARM64, KotlinAndroidNativeArm64Variant::class.java, ::KotlinAndroidNativeArm64Variant
        )
    }
}

open class KotlinIosArm32Variant @Inject constructor(
    containingModule: KotlinGradleModule,
    fragmentName: String,
    dependencyConfigurations: KotlinFragmentDependencyConfigurations,
    compileDependencyConfiguration: Configuration,
    apiElementsConfiguration: Configuration,
    hostSpecificMetadataElementsConfiguration: Configuration?
) : KotlinNativeVariantInternal(
    containingModule = containingModule,
    fragmentName = fragmentName,
    konanTarget = KonanTarget.IOS_ARM32,
    dependencyConfigurations = dependencyConfigurations,
    compileDependencyConfiguration = compileDependencyConfiguration,
    apiElementsConfiguration = apiElementsConfiguration,
    hostSpecificMetadataElementsConfiguration = hostSpecificMetadataElementsConfiguration
) {
    companion object {
        val constructor = KotlinNativeVariantConstructor(
            KonanTarget.IOS_ARM32, KotlinIosArm32Variant::class.java, ::KotlinIosArm32Variant
        )
    }
}

open class KotlinIosArm64Variant @Inject constructor(
    containingModule: KotlinGradleModule,
    fragmentName: String,
    dependencyConfigurations: KotlinFragmentDependencyConfigurations,
    compileDependencyConfiguration: Configuration,
    apiElementsConfiguration: Configuration,
    hostSpecificMetadataElementsConfiguration: Configuration?
) : KotlinNativeVariantInternal(
    containingModule = containingModule,
    fragmentName = fragmentName,
    konanTarget = KonanTarget.IOS_ARM64,
    dependencyConfigurations = dependencyConfigurations,
    compileDependencyConfiguration = compileDependencyConfiguration,
    apiElementsConfiguration = apiElementsConfiguration,
    hostSpecificMetadataElementsConfiguration = hostSpecificMetadataElementsConfiguration
) {
    companion object {
        val constructor = KotlinNativeVariantConstructor(
            KonanTarget.IOS_ARM64, KotlinIosArm64Variant::class.java, ::KotlinIosArm64Variant
        )
    }
}

open class KotlinIosX64Variant @Inject constructor(
    containingModule: KotlinGradleModule,
    fragmentName: String,
    dependencyConfigurations: KotlinFragmentDependencyConfigurations,
    compileDependencyConfiguration: Configuration,
    apiElementsConfiguration: Configuration,
    hostSpecificMetadataElementsConfiguration: Configuration?
) : KotlinNativeVariantInternal(
    containingModule = containingModule,
    fragmentName = fragmentName,
    konanTarget = KonanTarget.IOS_X64,
    dependencyConfigurations = dependencyConfigurations,
    compileDependencyConfiguration = compileDependencyConfiguration,
    apiElementsConfiguration = apiElementsConfiguration,
    hostSpecificMetadataElementsConfiguration = hostSpecificMetadataElementsConfiguration
) {
    companion object {
        val constructor = KotlinNativeVariantConstructor(
            KonanTarget.IOS_X64, KotlinIosX64Variant::class.java, ::KotlinIosX64Variant
        )
    }
}

open class KotlinIosSimulatorArm64Variant @Inject constructor(
    containingModule: KotlinGradleModule,
    fragmentName: String,
    dependencyConfigurations: KotlinFragmentDependencyConfigurations,
    compileDependencyConfiguration: Configuration,
    apiElementsConfiguration: Configuration,
    hostSpecificMetadataElementsConfiguration: Configuration?
) : KotlinNativeVariantInternal(
    containingModule = containingModule,
    fragmentName = fragmentName,
    konanTarget = KonanTarget.IOS_SIMULATOR_ARM64,
    dependencyConfigurations = dependencyConfigurations,
    compileDependencyConfiguration = compileDependencyConfiguration,
    apiElementsConfiguration = apiElementsConfiguration,
    hostSpecificMetadataElementsConfiguration = hostSpecificMetadataElementsConfiguration
) {
    companion object {
        val constructor = KotlinNativeVariantConstructor(
            KonanTarget.IOS_SIMULATOR_ARM64, KotlinIosSimulatorArm64Variant::class.java, ::KotlinIosSimulatorArm64Variant
        )
    }
}

open class KotlinWatchosArm32Variant @Inject constructor(
    containingModule: KotlinGradleModule,
    fragmentName: String,
    dependencyConfigurations: KotlinFragmentDependencyConfigurations,
    compileDependencyConfiguration: Configuration,
    apiElementsConfiguration: Configuration,
    hostSpecificMetadataElementsConfiguration: Configuration?
) : KotlinNativeVariantInternal(
    containingModule = containingModule,
    fragmentName = fragmentName,
    konanTarget = KonanTarget.WATCHOS_ARM32,
    dependencyConfigurations = dependencyConfigurations,
    compileDependencyConfiguration = compileDependencyConfiguration,
    apiElementsConfiguration = apiElementsConfiguration,
    hostSpecificMetadataElementsConfiguration = hostSpecificMetadataElementsConfiguration
) {
    companion object {
        val constructor = KotlinNativeVariantConstructor(
            KonanTarget.WATCHOS_ARM32, KotlinWatchosArm32Variant::class.java, ::KotlinWatchosArm32Variant
        )
    }
}

open class KotlinWatchosArm64Variant @Inject constructor(
    containingModule: KotlinGradleModule,
    fragmentName: String,
    dependencyConfigurations: KotlinFragmentDependencyConfigurations,
    compileDependencyConfiguration: Configuration,
    apiElementsConfiguration: Configuration,
    hostSpecificMetadataElementsConfiguration: Configuration?
) : KotlinNativeVariantInternal(
    containingModule = containingModule,
    fragmentName = fragmentName,
    konanTarget = KonanTarget.WATCHOS_ARM64,
    dependencyConfigurations = dependencyConfigurations,
    compileDependencyConfiguration = compileDependencyConfiguration,
    apiElementsConfiguration = apiElementsConfiguration,
    hostSpecificMetadataElementsConfiguration = hostSpecificMetadataElementsConfiguration
) {
    companion object {
        val constructor = KotlinNativeVariantConstructor(
            KonanTarget.WATCHOS_ARM64, KotlinWatchosArm64Variant::class.java, ::KotlinWatchosArm64Variant
        )
    }
}

open class KotlinWatchosX86Variant @Inject constructor(
    containingModule: KotlinGradleModule,
    fragmentName: String,
    dependencyConfigurations: KotlinFragmentDependencyConfigurations,
    compileDependencyConfiguration: Configuration,
    apiElementsConfiguration: Configuration,
    hostSpecificMetadataElementsConfiguration: Configuration?
) : KotlinNativeVariantInternal(
    containingModule = containingModule,
    fragmentName = fragmentName,
    konanTarget = KonanTarget.WATCHOS_X86,
    dependencyConfigurations = dependencyConfigurations,
    compileDependencyConfiguration = compileDependencyConfiguration,
    apiElementsConfiguration = apiElementsConfiguration,
    hostSpecificMetadataElementsConfiguration = hostSpecificMetadataElementsConfiguration
) {
    companion object {
        val constructor = KotlinNativeVariantConstructor(
            KonanTarget.WATCHOS_X86, KotlinWatchosX86Variant::class.java, ::KotlinWatchosX86Variant
        )
    }
}

open class KotlinWatchosX64Variant @Inject constructor(
    containingModule: KotlinGradleModule,
    fragmentName: String,
    dependencyConfigurations: KotlinFragmentDependencyConfigurations,
    compileDependencyConfiguration: Configuration,
    apiElementsConfiguration: Configuration,
    hostSpecificMetadataElementsConfiguration: Configuration?
) : KotlinNativeVariantInternal(
    containingModule = containingModule,
    fragmentName = fragmentName,
    konanTarget = KonanTarget.WATCHOS_X64,
    dependencyConfigurations = dependencyConfigurations,
    compileDependencyConfiguration = compileDependencyConfiguration,
    apiElementsConfiguration = apiElementsConfiguration,
    hostSpecificMetadataElementsConfiguration = hostSpecificMetadataElementsConfiguration
) {
    companion object {
        val constructor = KotlinNativeVariantConstructor(
            KonanTarget.WATCHOS_X64, KotlinWatchosX64Variant::class.java, ::KotlinWatchosX64Variant
        )
    }
}

open class KotlinWatchosSimulatorArm64Variant @Inject constructor(
    containingModule: KotlinGradleModule,
    fragmentName: String,
    dependencyConfigurations: KotlinFragmentDependencyConfigurations,
    compileDependencyConfiguration: Configuration,
    apiElementsConfiguration: Configuration,
    hostSpecificMetadataElementsConfiguration: Configuration?
) : KotlinNativeVariantInternal(
    containingModule = containingModule,
    fragmentName = fragmentName,
    konanTarget = KonanTarget.WATCHOS_SIMULATOR_ARM64,
    dependencyConfigurations = dependencyConfigurations,
    compileDependencyConfiguration = compileDependencyConfiguration,
    apiElementsConfiguration = apiElementsConfiguration,
    hostSpecificMetadataElementsConfiguration = hostSpecificMetadataElementsConfiguration
) {
    companion object {
        val constructor = KotlinNativeVariantConstructor(
            KonanTarget.WATCHOS_SIMULATOR_ARM64, KotlinWatchosSimulatorArm64Variant::class.java, ::KotlinWatchosSimulatorArm64Variant
        )
    }
}

open class KotlinTvosArm64Variant @Inject constructor(
    containingModule: KotlinGradleModule,
    fragmentName: String,
    dependencyConfigurations: KotlinFragmentDependencyConfigurations,
    compileDependencyConfiguration: Configuration,
    apiElementsConfiguration: Configuration,
    hostSpecificMetadataElementsConfiguration: Configuration?
) : KotlinNativeVariantInternal(
    containingModule = containingModule,
    fragmentName = fragmentName,
    konanTarget = KonanTarget.TVOS_ARM64,
    dependencyConfigurations = dependencyConfigurations,
    compileDependencyConfiguration = compileDependencyConfiguration,
    apiElementsConfiguration = apiElementsConfiguration,
    hostSpecificMetadataElementsConfiguration = hostSpecificMetadataElementsConfiguration
) {
    companion object {
        val constructor = KotlinNativeVariantConstructor(
            KonanTarget.TVOS_ARM64, KotlinTvosArm64Variant::class.java, ::KotlinTvosArm64Variant
        )
    }
}

open class KotlinTvosX64Variant @Inject constructor(
    containingModule: KotlinGradleModule,
    fragmentName: String,
    dependencyConfigurations: KotlinFragmentDependencyConfigurations,
    compileDependencyConfiguration: Configuration,
    apiElementsConfiguration: Configuration,
    hostSpecificMetadataElementsConfiguration: Configuration?
) : KotlinNativeVariantInternal(
    containingModule = containingModule,
    fragmentName = fragmentName,
    konanTarget = KonanTarget.TVOS_X64,
    dependencyConfigurations = dependencyConfigurations,
    compileDependencyConfiguration = compileDependencyConfiguration,
    apiElementsConfiguration = apiElementsConfiguration,
    hostSpecificMetadataElementsConfiguration = hostSpecificMetadataElementsConfiguration
) {
    companion object {
        val constructor = KotlinNativeVariantConstructor(
            KonanTarget.TVOS_X64, KotlinTvosX64Variant::class.java, ::KotlinTvosX64Variant
        )
    }
}

open class KotlinTvosSimulatorArm64Variant @Inject constructor(
    containingModule: KotlinGradleModule,
    fragmentName: String,
    dependencyConfigurations: KotlinFragmentDependencyConfigurations,
    compileDependencyConfiguration: Configuration,
    apiElementsConfiguration: Configuration,
    hostSpecificMetadataElementsConfiguration: Configuration?
) : KotlinNativeVariantInternal(
    containingModule = containingModule,
    fragmentName = fragmentName,
    konanTarget = KonanTarget.TVOS_SIMULATOR_ARM64,
    dependencyConfigurations = dependencyConfigurations,
    compileDependencyConfiguration = compileDependencyConfiguration,
    apiElementsConfiguration = apiElementsConfiguration,
    hostSpecificMetadataElementsConfiguration = hostSpecificMetadataElementsConfiguration
) {
    companion object {
        val constructor = KotlinNativeVariantConstructor(
            KonanTarget.TVOS_SIMULATOR_ARM64, KotlinTvosSimulatorArm64Variant::class.java, ::KotlinTvosSimulatorArm64Variant
        )
    }
}

open class KotlinLinuxX64Variant @Inject constructor(
    containingModule: KotlinGradleModule,
    fragmentName: String,
    dependencyConfigurations: KotlinFragmentDependencyConfigurations,
    compileDependencyConfiguration: Configuration,
    apiElementsConfiguration: Configuration,
    hostSpecificMetadataElementsConfiguration: Configuration?
) : KotlinNativeVariantInternal(
    containingModule = containingModule,
    fragmentName = fragmentName,
    konanTarget = KonanTarget.LINUX_X64,
    dependencyConfigurations = dependencyConfigurations,
    compileDependencyConfiguration = compileDependencyConfiguration,
    apiElementsConfiguration = apiElementsConfiguration,
    hostSpecificMetadataElementsConfiguration = hostSpecificMetadataElementsConfiguration
) {
    companion object {
        val constructor = KotlinNativeVariantConstructor(
            KonanTarget.LINUX_X64, KotlinLinuxX64Variant::class.java, ::KotlinLinuxX64Variant
        )
    }
}

open class KotlinMingwX86Variant @Inject constructor(
    containingModule: KotlinGradleModule,
    fragmentName: String,
    dependencyConfigurations: KotlinFragmentDependencyConfigurations,
    compileDependencyConfiguration: Configuration,
    apiElementsConfiguration: Configuration,
    hostSpecificMetadataElementsConfiguration: Configuration?
) : KotlinNativeVariantInternal(
    containingModule = containingModule,
    fragmentName = fragmentName,
    konanTarget = KonanTarget.MINGW_X86,
    dependencyConfigurations = dependencyConfigurations,
    compileDependencyConfiguration = compileDependencyConfiguration,
    apiElementsConfiguration = apiElementsConfiguration,
    hostSpecificMetadataElementsConfiguration = hostSpecificMetadataElementsConfiguration
) {
    companion object {
        val constructor = KotlinNativeVariantConstructor(
            KonanTarget.MINGW_X86, KotlinMingwX86Variant::class.java, ::KotlinMingwX86Variant
        )
    }
}

open class KotlinMingwX64Variant @Inject constructor(
    containingModule: KotlinGradleModule,
    fragmentName: String,
    dependencyConfigurations: KotlinFragmentDependencyConfigurations,
    compileDependencyConfiguration: Configuration,
    apiElementsConfiguration: Configuration,
    hostSpecificMetadataElementsConfiguration: Configuration?
) : KotlinNativeVariantInternal(
    containingModule = containingModule,
    fragmentName = fragmentName,
    konanTarget = KonanTarget.MINGW_X64,
    dependencyConfigurations = dependencyConfigurations,
    compileDependencyConfiguration = compileDependencyConfiguration,
    apiElementsConfiguration = apiElementsConfiguration,
    hostSpecificMetadataElementsConfiguration = hostSpecificMetadataElementsConfiguration
) {
    companion object {
        val constructor = KotlinNativeVariantConstructor(
            KonanTarget.MINGW_X64, KotlinMingwX64Variant::class.java, ::KotlinMingwX64Variant
        )
    }
}

open class KotlinMacosX64Variant @Inject constructor(
    containingModule: KotlinGradleModule,
    fragmentName: String,
    dependencyConfigurations: KotlinFragmentDependencyConfigurations,
    compileDependencyConfiguration: Configuration,
    apiElementsConfiguration: Configuration,
    hostSpecificMetadataElementsConfiguration: Configuration?
) : KotlinNativeVariantInternal(
    containingModule = containingModule,
    fragmentName = fragmentName,
    konanTarget = KonanTarget.MACOS_X64,
    dependencyConfigurations = dependencyConfigurations,
    compileDependencyConfiguration = compileDependencyConfiguration,
    apiElementsConfiguration = apiElementsConfiguration,
    hostSpecificMetadataElementsConfiguration = hostSpecificMetadataElementsConfiguration
) {
    companion object {
        val constructor = KotlinNativeVariantConstructor(
            KonanTarget.MACOS_X64, KotlinMacosX64Variant::class.java, ::KotlinMacosX64Variant
        )
    }
}

open class KotlinMacosArm64Variant @Inject constructor(
    containingModule: KotlinGradleModule,
    fragmentName: String,
    dependencyConfigurations: KotlinFragmentDependencyConfigurations,
    compileDependencyConfiguration: Configuration,
    apiElementsConfiguration: Configuration,
    hostSpecificMetadataElementsConfiguration: Configuration?
) : KotlinNativeVariantInternal(
    containingModule = containingModule,
    fragmentName = fragmentName,
    konanTarget = KonanTarget.MACOS_ARM64,
    dependencyConfigurations = dependencyConfigurations,
    compileDependencyConfiguration = compileDependencyConfiguration,
    apiElementsConfiguration = apiElementsConfiguration,
    hostSpecificMetadataElementsConfiguration = hostSpecificMetadataElementsConfiguration
) {
    companion object {
        val constructor = KotlinNativeVariantConstructor(
            KonanTarget.MACOS_ARM64, KotlinMacosArm64Variant::class.java, ::KotlinMacosArm64Variant
        )
    }
}

open class KotlinLinuxArm64Variant @Inject constructor(
    containingModule: KotlinGradleModule,
    fragmentName: String,
    dependencyConfigurations: KotlinFragmentDependencyConfigurations,
    compileDependencyConfiguration: Configuration,
    apiElementsConfiguration: Configuration,
    hostSpecificMetadataElementsConfiguration: Configuration?
) : KotlinNativeVariantInternal(
    containingModule = containingModule,
    fragmentName = fragmentName,
    konanTarget = KonanTarget.LINUX_ARM64,
    dependencyConfigurations = dependencyConfigurations,
    compileDependencyConfiguration = compileDependencyConfiguration,
    apiElementsConfiguration = apiElementsConfiguration,
    hostSpecificMetadataElementsConfiguration = hostSpecificMetadataElementsConfiguration
) {
    companion object {
        val constructor = KotlinNativeVariantConstructor(
            KonanTarget.LINUX_ARM64, KotlinLinuxArm64Variant::class.java, ::KotlinLinuxArm64Variant
        )
    }
}

open class KotlinLinuxArm32HfpVariant @Inject constructor(
    containingModule: KotlinGradleModule,
    fragmentName: String,
    dependencyConfigurations: KotlinFragmentDependencyConfigurations,
    compileDependencyConfiguration: Configuration,
    apiElementsConfiguration: Configuration,
    hostSpecificMetadataElementsConfiguration: Configuration?
) : KotlinNativeVariantInternal(
    containingModule = containingModule,
    fragmentName = fragmentName,
    konanTarget = KonanTarget.LINUX_ARM32_HFP,
    dependencyConfigurations = dependencyConfigurations,
    compileDependencyConfiguration = compileDependencyConfiguration,
    apiElementsConfiguration = apiElementsConfiguration,
    hostSpecificMetadataElementsConfiguration = hostSpecificMetadataElementsConfiguration
) {
    companion object {
        val constructor = KotlinNativeVariantConstructor(
            KonanTarget.LINUX_ARM32_HFP, KotlinLinuxArm32HfpVariant::class.java, ::KotlinLinuxArm32HfpVariant
        )
    }
}

open class KotlinLinuxMips32Variant @Inject constructor(
    containingModule: KotlinGradleModule,
    fragmentName: String,
    dependencyConfigurations: KotlinFragmentDependencyConfigurations,
    compileDependencyConfiguration: Configuration,
    apiElementsConfiguration: Configuration,
    hostSpecificMetadataElementsConfiguration: Configuration?
) : KotlinNativeVariantInternal(
    containingModule = containingModule,
    fragmentName = fragmentName,
    konanTarget = KonanTarget.LINUX_MIPS32,
    dependencyConfigurations = dependencyConfigurations,
    compileDependencyConfiguration = compileDependencyConfiguration,
    apiElementsConfiguration = apiElementsConfiguration,
    hostSpecificMetadataElementsConfiguration = hostSpecificMetadataElementsConfiguration
) {
    companion object {
        val constructor = KotlinNativeVariantConstructor(
            KonanTarget.LINUX_MIPS32, KotlinLinuxMips32Variant::class.java, ::KotlinLinuxMips32Variant
        )
    }
}

open class KotlinLinuxMipsel32Variant @Inject constructor(
    containingModule: KotlinGradleModule,
    fragmentName: String,
    dependencyConfigurations: KotlinFragmentDependencyConfigurations,
    compileDependencyConfiguration: Configuration,
    apiElementsConfiguration: Configuration,
    hostSpecificMetadataElementsConfiguration: Configuration?
) : KotlinNativeVariantInternal(
    containingModule = containingModule,
    fragmentName = fragmentName,
    konanTarget = KonanTarget.LINUX_MIPSEL32,
    dependencyConfigurations = dependencyConfigurations,
    compileDependencyConfiguration = compileDependencyConfiguration,
    apiElementsConfiguration = apiElementsConfiguration,
    hostSpecificMetadataElementsConfiguration = hostSpecificMetadataElementsConfiguration
) {
    companion object {
        val constructor = KotlinNativeVariantConstructor(
            KonanTarget.LINUX_MIPSEL32, KotlinLinuxMipsel32Variant::class.java, ::KotlinLinuxMipsel32Variant
        )
    }
}

open class KotlinWasm32Variant @Inject constructor(
    containingModule: KotlinGradleModule,
    fragmentName: String,
    dependencyConfigurations: KotlinFragmentDependencyConfigurations,
    compileDependencyConfiguration: Configuration,
    apiElementsConfiguration: Configuration,
    hostSpecificMetadataElementsConfiguration: Configuration?
) : KotlinNativeVariantInternal(
    containingModule = containingModule,
    fragmentName = fragmentName,
    konanTarget = KonanTarget.WASM32,
    dependencyConfigurations = dependencyConfigurations,
    compileDependencyConfiguration = compileDependencyConfiguration,
    apiElementsConfiguration = apiElementsConfiguration,
    hostSpecificMetadataElementsConfiguration = hostSpecificMetadataElementsConfiguration
) {
    companion object {
        val constructor = KotlinNativeVariantConstructor(
            KonanTarget.WASM32, KotlinWasm32Variant::class.java, ::KotlinWasm32Variant
        )
    }
}

internal val allKpmNativeVariantConstructors = listOf(
    KotlinAndroidNativeX64Variant.constructor,
    KotlinAndroidNativeX86Variant.constructor,
    KotlinAndroidNativeArm32Variant.constructor,
    KotlinAndroidNativeArm64Variant.constructor,
    KotlinIosArm32Variant.constructor,
    KotlinIosArm64Variant.constructor,
    KotlinIosX64Variant.constructor,
    KotlinIosSimulatorArm64Variant.constructor,
    KotlinWatchosArm32Variant.constructor,
    KotlinWatchosArm64Variant.constructor,
    KotlinWatchosX86Variant.constructor,
    KotlinWatchosX64Variant.constructor,
    KotlinWatchosSimulatorArm64Variant.constructor,
    KotlinTvosArm64Variant.constructor,
    KotlinTvosX64Variant.constructor,
    KotlinTvosSimulatorArm64Variant.constructor,
    KotlinLinuxX64Variant.constructor,
    KotlinMingwX86Variant.constructor,
    KotlinMingwX64Variant.constructor,
    KotlinMacosX64Variant.constructor,
    KotlinMacosArm64Variant.constructor,
    KotlinLinuxArm64Variant.constructor,
    KotlinLinuxArm32HfpVariant.constructor,
    KotlinLinuxMips32Variant.constructor,
    KotlinLinuxMipsel32Variant.constructor,
    KotlinWasm32Variant.constructor
)

internal fun kpmNativeVariantClass(konanTarget: KonanTarget): Class<out KotlinNativeVariantInternal>? = when (konanTarget) {
    KonanTarget.ANDROID_X64 -> KotlinAndroidNativeX64Variant::class.java
    KonanTarget.ANDROID_X86 -> KotlinAndroidNativeX86Variant::class.java
    KonanTarget.ANDROID_ARM32 -> KotlinAndroidNativeArm32Variant::class.java
    KonanTarget.ANDROID_ARM64 -> KotlinAndroidNativeArm64Variant::class.java
    KonanTarget.IOS_ARM32 -> KotlinIosArm32Variant::class.java
    KonanTarget.IOS_ARM64 -> KotlinIosArm64Variant::class.java
    KonanTarget.IOS_X64 -> KotlinIosX64Variant::class.java
    KonanTarget.IOS_SIMULATOR_ARM64 -> KotlinIosSimulatorArm64Variant::class.java
    KonanTarget.WATCHOS_ARM32 -> KotlinWatchosArm32Variant::class.java
    KonanTarget.WATCHOS_ARM64 -> KotlinWatchosArm64Variant::class.java
    KonanTarget.WATCHOS_X86 -> KotlinWatchosX86Variant::class.java
    KonanTarget.WATCHOS_X64 -> KotlinWatchosX64Variant::class.java
    KonanTarget.WATCHOS_SIMULATOR_ARM64 -> KotlinWatchosSimulatorArm64Variant::class.java
    KonanTarget.TVOS_ARM64 -> KotlinTvosArm64Variant::class.java
    KonanTarget.TVOS_X64 -> KotlinTvosX64Variant::class.java
    KonanTarget.TVOS_SIMULATOR_ARM64 -> KotlinTvosSimulatorArm64Variant::class.java
    KonanTarget.LINUX_X64 -> KotlinLinuxX64Variant::class.java
    KonanTarget.MINGW_X86 -> KotlinMingwX86Variant::class.java
    KonanTarget.MINGW_X64 -> KotlinMingwX64Variant::class.java
    KonanTarget.MACOS_X64 -> KotlinMacosX64Variant::class.java
    KonanTarget.MACOS_ARM64 -> KotlinMacosArm64Variant::class.java
    KonanTarget.LINUX_ARM64 -> KotlinLinuxArm64Variant::class.java
    KonanTarget.LINUX_ARM32_HFP -> KotlinLinuxArm32HfpVariant::class.java
    KonanTarget.LINUX_MIPS32 -> KotlinLinuxMips32Variant::class.java
    KonanTarget.LINUX_MIPSEL32 -> KotlinLinuxMipsel32Variant::class.java
    KonanTarget.WASM32 -> KotlinWasm32Variant::class.java
    else -> null
}