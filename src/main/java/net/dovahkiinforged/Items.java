package net.dovahkiinforged;

import net.dovahkiinforged.commons.ModItems;
import net.dovahkiinforged.commons.constant.ModConstant;
import net.dovahkiinforged.commons.item.ModItem;
import net.dovahkiinforged.mapper.ItemMapper;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.List;

public class Items {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ModConstant.MOD_ID);

    public static DeferredItem<Item> register(ModItem modItem) {
        // Register the item.
        Item.Properties properties = ItemMapper.map(modItem);
        return ITEMS.registerSimpleItem(modItem.getName(), properties);
    }

    public static DeferredItem<BlockItem> register(DeferredBlock<Block> block) {
        return ITEMS.registerSimpleBlockItem(block);
    }

    // WEAPONS
    public static final DeferredItem<Item> ELVEN_DAGGER = register(ModItems.ELVEN_DAGGER);
    public static final DeferredItem<Item> ELVEN_SWORD = register(ModItems.ELVEN_SWORD);
    public static final DeferredItem<Item> GLASS_DAGGER = register(ModItems.GLASS_DAGGER);
    public static final DeferredItem<Item> GLASS_SWORD = register(ModItems.GLASS_SWORD);

    // MATERIALS
    public static final DeferredItem<Item> MALACHITE_INGOT = register(ModItems.MALACHITE_INGOT);
    public static final DeferredItem<Item> MALACHITE_NUGGET = register(ModItems.MALACHITE_NUGGET);
    public static final DeferredItem<Item> MOONSTONE_INGOT = register(ModItems.MOONSTONE_INGOT);
    public static final DeferredItem<Item> MOONSTONE_NUGGET = register(ModItems.MOONSTONE_NUGGET);
    public static final DeferredItem<Item> STEEL_INGOT = register(ModItems.STEEL_INGOT);
    public static final DeferredItem<Item> STEEL_NUGGET = register(ModItems.STEEL_NUGGET);

    public static final List<DeferredItem<Item>> ALL_ITEMS = List.of(
            ELVEN_DAGGER, ELVEN_SWORD, GLASS_SWORD, GLASS_DAGGER, MALACHITE_INGOT, MALACHITE_NUGGET, MOONSTONE_INGOT,
            MOONSTONE_NUGGET, STEEL_INGOT, STEEL_NUGGET);

}
