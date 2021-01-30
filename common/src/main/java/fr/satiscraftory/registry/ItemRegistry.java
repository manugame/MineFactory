package fr.satiscraftory.registry;

import fr.satiscraftory.SatiscraftoryMod;
import me.shedaniel.architectury.registry.DeferredRegister;
import me.shedaniel.architectury.registry.RegistrySupplier;
import net.minecraft.core.Registry;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;

public class ItemRegistry {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(SatiscraftoryMod.MOD_ID, Registry.ITEM_REGISTRY);
    public static final RegistrySupplier<Item> XENON_ZAPPER = ITEMS.register("xeno_zapper", () -> {
        return new Item(new Item.Properties().tab(TabRegistry.MAIN_TAB));
    });



    public static void registerItems() {
        ITEMS.register();
    }
}
