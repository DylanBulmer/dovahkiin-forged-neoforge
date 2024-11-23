package net.dovahkiinforged.generator.provider;

import net.dovahkiinforged.Blocks;
import net.dovahkiinforged.Items;
import net.dovahkiinforged.commons.constant.ModConstant;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModelProvider {

    public static class Block extends BlockStateProvider {
        public Block(PackOutput output, ExistingFileHelper exFileHelper) {
            super(output, ModConstant.MOD_ID, exFileHelper);
        }

        @Override
        protected void registerStatesAndModels() {
            Blocks.ALL_BLOCKS.forEach(block -> simpleBlock(block.get()));
        }
    }

    public static class Item extends ItemModelProvider {
        public Item(PackOutput output, ExistingFileHelper existingFileHelper) {
            super(output, ModConstant.MOD_ID, existingFileHelper);
        }

        @Override
        public void registerModels() {
            Items.ALL_ITEMS.forEach(item -> basicItem(item.get()));
        }
    }

}
