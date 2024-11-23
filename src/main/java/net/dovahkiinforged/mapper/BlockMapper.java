package net.dovahkiinforged.mapper;

import net.dovahkiinforged.commons.block.ModBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class BlockMapper {

    public static BlockBehaviour.Properties map(final ModBlock block) {
        ModBlock.Traits traits = block.getTraits();
        BlockBehaviour.Properties properties = BlockBehaviour.Properties.of();

        properties.strength(traits.getHardness());

        if (traits.isBurnable()) { properties.ignitedByLava(); }
        if (traits.isLiquid()) { properties.liquid(); }

        return properties;
    }

}
