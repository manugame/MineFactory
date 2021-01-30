package fr.satiscraftory.fabric;

import fr.satiscraftory.SatiscraftoryExpectPlatform;
import net.fabricmc.loader.api.FabricLoader;

import java.io.File;

public class SatiscraftoryExpectPlatformImpl {
    /**
     * This is our actual method to {@link SatiscraftoryExpectPlatform#getConfigDirectory()}.
     */
    public static File getConfigDirectory() {
        return FabricLoader.getInstance().getConfigDir().toFile();
    }
}
