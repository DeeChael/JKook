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

package snw.jkook.event.role;

import snw.jkook.entity.Role;
import snw.jkook.entity.User;
import snw.jkook.event.HandlerList;

import java.util.Objects;

/**
 * Represents an event related to a role was created.
 */
public class RoleCreateEvent extends RoleEvent {
    private static final HandlerList handlers = new HandlerList();

    private final User operator;

    public RoleCreateEvent(final long timeStamp, final Role role, final User operator) {
        super(timeStamp, role);
        this.operator = Objects.requireNonNull(operator);
    }

    /**
     * Get the operator of the new role.
     */
    public User getOperator() {
        return operator;
    }

    public static HandlerList getHandlers() {
        return handlers;
    }
}
