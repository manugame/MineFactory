package fr.satiscraftory.forge;

import fr.satiscraftory.SatiscraftoryExpectPlatform;
import net.minecraftforge.fml.loading.FMLPaths;

import java.io.File;

public class SatiscraftoryExpectPlatformImpl {
    /**
     * This is our actual method to {@link SatiscraftoryExpectPlatform#getConfigDirectory()}.
     */
    public static File getConfigDirectory() {
        return FMLPaths.CONFIGDIR.get().toFile();
    }
}
