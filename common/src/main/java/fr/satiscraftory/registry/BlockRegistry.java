package fr.satiscraftory.registry;

import fr.satiscraftory.SatiscraftoryMod;
import me.shedaniel.architectury.registry.DeferredRegister;
import me.shedaniel.architectury.registry.RegistrySupplier;
import net.minecraft.core.Registry;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;

import java.util.function.Supplier;

public class BlockRegistry {

    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(SatiscraftoryMod.MOD_ID, Registry.BLOCK_REGISTRY);

    public static final RegistrySupplier<Block> COAL_BLOCK_GEN = createBlock("coal_block_gen", () -> {
        return new Block(BlockBehaviour.Properties.of(Material.STONE));
    });

    public static final RegistrySupplier<Block> IRON_BLOCK_GEN = createBlock("iron_block_gen", () -> {
        return new Block(BlockBehaviour.Properties.of(Material.STONE));
    });

    public static final RegistrySupplier<Block> COPPER_BLOCK_GEN = createBlock("copper_block_gen", () -> {
        return new Block(BlockBehaviour.Properties.of(Material.STONE));
    });

    public static final RegistrySupplier<Block> CATERIUM_BLOCK_GEN = createBlock("caterium_block_gen", () -> {
        return new Block(BlockBehaviour.Properties.of(Material.STONE));
    });

    public static final RegistrySupplier<Block> EME_BLOCK_GEN = createBlock("eme_block_gen", () -> {
        return new Block(BlockBehaviour.Properties.of(Material.STONE));
    });

    public static final RegistrySupplier<Block> QUARTZ_BLOCK_GEN = createBlock("quartz_block_gen", () -> {
        return new Block(BlockBehaviour.Properties.of(Material.STONE));
    });

    public static final RegistrySupplier<Block> URANIUM_BLOCK_GEN = createBlock("uranium_block_gen", () -> {
        return new Block(BlockBehaviour.Properties.of(Material.STONE));
    });


    public static void registerBlocks() {
        BLOCKS.register();
    }

    private static RegistrySupplier<Block> createBlock(String id, Supplier<Block> block) {

        RegistrySupplier<Block> registryBlock = BLOCKS.register(id, block);
        ItemRegistry.ITEMS.register("item_" + id, () -> new BlockItem(registryBlock.get(), new Item.Properties().tab(TabRegistry.BLOCK_GEN_TAB)));
        return registryBlock;
    }
}
