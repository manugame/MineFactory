package fr.satiscraftory.forge;

import me.shedaniel.architectury.platform.forge.EventBuses;
import fr.satiscraftory.SatiscraftoryMod;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(SatiscraftoryMod.MOD_ID)
public class SatiscraftoryModForge {
    public SatiscraftoryModForge() {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(SatiscraftoryMod.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        SatiscraftoryMod.init();
    }
}
