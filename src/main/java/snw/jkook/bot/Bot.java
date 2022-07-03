package snw.jkook.bot;

import org.slf4j.Logger;
import snw.jkook.Core;
import snw.jkook.HttpAPI;
import snw.jkook.config.file.FileConfiguration;
import snw.jkook.entity.User;

import java.io.File;
import java.io.InputStream;

/**
 * Represents a Bot. <p>
 * To make a Bot, extend {@link BaseBot}.
 */
public interface Bot {

    /**
     * Get the user representation of this Bot.
     */
    User getUser();

    /**
     * Get logger of this Bot. <p>
     * The result is different from {@link Core#getLogger()}.
     */
    Logger getLogger();

    /**
     * Calls on loading this Bot. <p>
     * You can do things (e.g. extract default configuration files) at this stage.
     */
    void onLoad();

    /**
     * Calls on enabling this Bot. <p>
     * You can do things (e.g. Register commands) at this stage.
     */
    void onEnable();

    /**
     * Calls on disabling this Bot (before client fully shutdown). <p>
     * You can do things (e.g. close services) at this stage. And the Bot won't receive events at this stage.
     */
    void onDisable();

    /**
     * Get the configuration. <p>
     * A empty configuration will be returned if the embedded file does not exist, or it is invalid.
     */
    FileConfiguration getConfig();

    /**
     * Discards all the changes in the <b>main</b> configuration stored in memory and reloads from disk.
     *
     * @implSpec This method should fail silently.
     */
    void reloadConfig();

    /**
     * Attempts to save default configuration file.
     *
     * @implSpec This should fail silently.
     */
    void saveDefaultConfig();

    /**
     * Attempts to save a resource embedded in the Bot archive file to the data folder of this Bot.
     *
     * @param path                The canonical path (e.g. "/lang/en_US.json")
     * @param replace             Decides the API implementation will overwrite the file on the disk.
     * @param ignorePathStructure True if you want to save the file at the root of data folder
     * @throws IllegalArgumentException Thrown if the path is invalid
     */
    void saveResource(String path, boolean replace, boolean ignorePathStructure) throws IllegalArgumentException;

    /**
     * Get the input stream of a resource embedded in the Bot archive file.
     *
     * @param path The canonical path (e.g. "/lang/en_US.json")
     * @return The input stream of the target resource, null is returned if the resource was not found
     */
    InputStream getResource(String path);

    /**
     * Get the data folder of this Bot.
     */
    File getDataFolder();

    /**
     * Get the token string for this Bot. Used for Kook HTTP API authentication. <b>NOT ENCRYPTED.</b>
     */
    String getToken();

    /**
     * Get the HTTP API.
     *
     * @see HttpAPI
     */
    HttpAPI getHttpAPI();

    /**
     * Get the binary file representation of this Bot.
     */
    File getFile();
}