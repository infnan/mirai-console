/*
 * Copyright 2019-2020 Mamoe Technologies and contributors.
 *
 * 此源代码的使用受 GNU AFFERO GENERAL PUBLIC LICENSE version 3 with Mamoe Exceptions 许可证的约束, 可以在以下链接找到该许可证.
 * Use of this source code is governed by the GNU AFFERO GENERAL PUBLIC LICENSE version 3 with Mamoe Exceptions license that can be found via the following link.
 *
 * https://github.com/mamoe/mirai/blob/master/LICENSE
 */

import org.gradle.api.artifacts.dsl.DependencyHandler
import org.gradle.kotlin.dsl.DependencyHandlerScope

@Suppress("unused")
fun DependencyHandlerScope.kotlinx(id: String, version: String) = "org.jetbrains.kotlinx:kotlinx-$id:$version"

@Suppress("unused")
fun DependencyHandlerScope.ktor(id: String, version: String = Versions.ktor) = "io.ktor:ktor-$id:$version"

@Suppress("unused")
fun DependencyHandler.compileAndRuntime(any: Any) {
    add("compileOnly", any)
    add("runtimeOnly", any)
}
