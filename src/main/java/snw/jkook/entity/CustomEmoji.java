package snw.jkook.entity;

/**
 * Represents a emoji in a {@link Guild}.
 */
public interface CustomEmoji {

    /**
     * Get the image url of this emoji.
     */
    String getUrl();

    /**
     * Get the guild that owns this emoji.
     */
    Guild getGuild();

    /**
     * Get the uploader of this emoji.
     */
    User getUploader();
}