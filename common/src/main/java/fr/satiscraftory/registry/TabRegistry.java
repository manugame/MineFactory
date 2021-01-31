package fr.satiscraftory.registry;

import fr.satiscraftory.SatiscraftoryMod;
import me.shedaniel.architectury.registry.CreativeTabs;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class TabRegistry {

    public static final CreativeModeTab MAIN_TAB = CreativeTabs.create(new ResourceLocation(SatiscraftoryMod.MOD_ID, "satiscraftory_main"), () -> {
        return new ItemStack(ItemRegistry.XENON_ZAPPER.get());
    });

    public static final CreativeModeTab BLOCK_GEN_TAB = CreativeTabs.create(new ResourceLocation(SatiscraftoryMod.MOD_ID, "satiscraftory_blockgen_tab"), () -> {
        return new ItemStack(ItemRegistry.XENON_ZAPPER.get());
    });

}
