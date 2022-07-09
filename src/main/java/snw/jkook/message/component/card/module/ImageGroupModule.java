/*
 * Copyright 2022 JKook contributors
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

package snw.jkook.message.component.card.module;

import org.apache.commons.lang.Validate;
import snw.jkook.message.component.FileComponent;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Represents a group of image components.
 */
public class ImageGroupModule extends BaseModule {
    private final List<FileComponent> images;

    public ImageGroupModule(List<FileComponent> images) {
        Validate.isTrue(images.size() >= 1, "Unexpected image module count, expected >= 1, got " + images.size());
        Validate.isTrue(images.size() <= 9, "Unexpected image module count, expected <= 9, got " + images.size());
        Validate.isTrue(images.stream().allMatch(IT -> IT.getType() == FileComponent.Type.IMAGE), "The container only contains the image files.");
        this.images = Collections.unmodifiableList(new LinkedList<>(images));
    }

    /**
     * Get the images that already stored in this module.
     */
    public List<FileComponent> getImages() {
        return images;
    }
}
