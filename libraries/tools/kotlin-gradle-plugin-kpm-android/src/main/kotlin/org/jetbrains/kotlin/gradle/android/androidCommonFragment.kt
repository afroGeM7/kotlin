/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.gradle.android

import org.jetbrains.kotlin.gradle.kpm.KotlinGradleFragmentInternal
import org.jetbrains.kotlin.gradle.kpm.KotlinGradleModule

val KotlinGradleModule.androidCommon: KotlinGradleFragmentInternal
    get() = (fragments.findByName("android") ?: fragments.create("android") { fragment ->
        fragment.refines(common)
    }) as KotlinGradleFragmentInternal
