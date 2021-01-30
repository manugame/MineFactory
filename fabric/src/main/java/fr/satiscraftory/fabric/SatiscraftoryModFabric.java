package fr.satiscraftory.fabric;

import fr.satiscraftory.SatiscraftoryMod;
import net.fabricmc.api.ModInitializer;

public class SatiscraftoryModFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        SatiscraftoryMod.init();
    }
}
