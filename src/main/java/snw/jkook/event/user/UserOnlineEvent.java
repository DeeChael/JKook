package snw.jkook.event.user;

import snw.jkook.entity.User;
import snw.jkook.event.HandlerList;

/**
 * Represents an event about a user online.
 */
public class UserOnlineEvent extends UserEvent {
    private static final HandlerList handlers = new HandlerList();

    public UserOnlineEvent(final User user) {
        super(user);
    }

    public static HandlerList getHandlers() {
        return handlers;
    }
}