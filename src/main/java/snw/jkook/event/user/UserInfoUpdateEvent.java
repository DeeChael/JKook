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

package snw.jkook.event.user;

import snw.jkook.entity.User;
import snw.jkook.event.HandlerList;

/**
 * Represents an event related to a user's information (e.g. nickname?) was updated. <p>
 * To get new information, use methods in {@link User} interface.
 * <b>This event will be fired if the following situations happened:</b>
 * <ul>
 *     <li>The user's avatar or username was updated.</li>
 *     <li>The user have chat sessions with the Bot.</li>
 *     <li>The user is the friend of the Bot.</li>
 * </ul>
 */
public class UserInfoUpdateEvent extends UserEvent {
    private static final HandlerList handlers = new HandlerList();

    public UserInfoUpdateEvent(final long timeStamp, final User user) {
        super(timeStamp, user);
    }

    public static HandlerList getHandlers() {
        return handlers;
    }
}
