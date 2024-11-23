package net.dovahkiinforged;

import net.dovahkiinforged.commons.ModBlocks;
import net.dovahkiinforged.commons.block.ModBlock;
import net.dovahkiinforged.commons.constant.ModConstant;
import net.dovahkiinforged.mapper.BlockMapper;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.List;

public class Blocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(ModConstant.MOD_ID);

    public static DeferredBlock<Block> register(ModBlock modBlock, boolean shouldRegisterItem) {
        // Register the block and its item.
        BlockBehaviour.Properties settings = BlockMapper.map(modBlock);
        DeferredBlock<Block> block = BLOCKS.registerSimpleBlock(modBlock.getName(), settings);

        // Sometimes, you may not want to register an item for the modBlock.
        // Eg: if it's a technical modBlock like `minecraft:air` or `minecraft:end_gateway`
        if (shouldRegisterItem) {
            Items.register(block);
        }

        return block;
    }

    public static final DeferredBlock<Block> MALACHITE_ORE;
    public static final DeferredBlock<Block> MOONSTONE_ORE;
    public static final DeferredBlock<Block> RAW_MALACHITE_BLOCK;
    public static final DeferredBlock<Block> RAW_MOONSTONE_BLOCK;
    public static final DeferredBlock<Block> MALACHITE_BLOCK;
    public static final DeferredBlock<Block> MOONSTONE_BLOCK;

    static {
        MALACHITE_ORE = register(ModBlocks.MALACHITE_ORE, true);
        MOONSTONE_ORE = register(ModBlocks.MOONSTONE_ORE, true);
        RAW_MALACHITE_BLOCK = register(ModBlocks.RAW_MALACHITE_BLOCK, true);
        RAW_MOONSTONE_BLOCK = register(ModBlocks.RAW_MOONSTONE_BLOCK, true);
        MALACHITE_BLOCK = register(ModBlocks.MALACHITE_BLOCK, true);
        MOONSTONE_BLOCK = register(ModBlocks.MOONSTONE_BLOCK, true);
    }

    public static final List<DeferredBlock<Block>> ALL_BLOCKS = List.of(
            MALACHITE_BLOCK, MOONSTONE_BLOCK, RAW_MALACHITE_BLOCK, RAW_MOONSTONE_BLOCK, MALACHITE_ORE, MOONSTONE_ORE);
}
