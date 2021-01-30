package fr.satiscraftory;

import fr.satiscraftory.registry.BlockRegistry;
import fr.satiscraftory.registry.ItemRegistry;

public class SatiscraftoryMod {
    public static final String MOD_ID = "satiscraftory";

    
    public static void init() {
        BlockRegistry.registerBlocks();
        ItemRegistry.registerItems();
    }
}
