/*
 * Copyright (C) 2017-2019 Hazuki
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.hollabrowser.meforce.adblock.filter.unified.element

abstract class ElementFilter(
    val domain: String,
    val isHide: Boolean,
    val isNot: Boolean,
    val selector: String,
) {
    abstract val type: Int

    var next: ElementFilter? = null

    abstract fun isMatch(domain: String, tldRemoved: String?): Boolean

    companion object {
        const val TYPE_PLANE = 1
        const val TYPE_TLD_REMOVED = 2
    }
}
