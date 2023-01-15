/*
 * Copyright 2022 - 2023 JKook contributors
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

package snw.jkook.message.component.card;

import java.util.HashMap;
import java.util.Map;

/**
 * 表示 Bootstrap 栅格布局的四种大小。
 */
public enum Size {

    /**
     * 推荐。<br>
     * 但是对于卡片，手机端 KOOK 将用 SM 大小渲染卡片。
     */
    LG("lg"),

    SM("sm"),

    // The unsupported size for card (not its module) is following:

    XS("xs"),

    MD("md");

    private static final Map<String, Size> values = new HashMap<>();

    static {
        for (Size value : values()) {
            values.put(value.getValue(), value);
        }
    }

    private final String value;

    Size(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    /**
     * 获取提供的值对应的枚举对象。
     *
     * @param name The value
     */
    public static Size value(String name) {
        return values.get(name);
    }
}
