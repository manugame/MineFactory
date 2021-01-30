package fr.satiscraftory.registry;

import fr.satiscraftory.SatiscraftoryMod;
import me.shedaniel.architectury.registry.CreativeTabs;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

import java.util.function.Supplier;

public class TabRegistry {

    // Registering a new creative tab
    public static final CreativeModeTab MAIN_TAB = CreativeTabs.create(new ResourceLocation(SatiscraftoryMod.MOD_ID, "satisfactory_tab"), () -> {
        return new ItemStack(ItemRegistry.XENON_ZAPPER.get());
    });

}
