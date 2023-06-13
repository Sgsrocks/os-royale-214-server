package com.osroyale.fs.cache.decoder;

import com.osroyale.fs.cache.FileSystem;
import com.osroyale.fs.cache.archive.Archive;
import com.osroyale.fs.util.ByteBufferUtil;
import com.osroyale.game.world.object.GameObjectDefinition;
import com.osroyale.game.world.object.ObjectDefinition;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.nio.ByteBuffer;

/**
 * A class which parses object definitions.
 *
 * @author Ryley Kimmel <ryley.kimmel@live.com>
 * @author Artem Batutin <artembatutin@gmail.com>
 */
public final class ObjectDefinitionDecoder implements Runnable {

    /**
     * The logger to log process output.
     */
    private final static Logger LOGGER = LogManager.getLogger();

    /**
     * The IndexedFileSystem.
     */
    private final FileSystem fs;

    /**
     * Creates the {@link ObjectDefinitionDecoder}.
     *
     * @param fs The {@link FileSystem}.
     */
    public ObjectDefinitionDecoder(FileSystem fs) {
        this.fs = fs;
    }

    @Override
    public void run() {
        LOGGER.info("Loading object definitions.");

        ObjectDefinition.init(fs.getArchive(FileSystem.CONFIG_ARCHIVE));
    }
}