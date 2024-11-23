package net.dovahkiinforged.mapper;

import net.dovahkiinforged.commons.item.ModItem;
import net.minecraft.core.component.DataComponents;
import net.minecraft.world.item.Item;

public final class ItemMapper {

    public static Item.Properties map(final ModItem item) {
        ModItem.Traits traits = item.getTraits();
        Item.Properties properties = new Item.Properties();

        properties.stacksTo(traits.getMaxStackSize());
        if (traits.getDurability() != null) {
            properties.durability(traits.getDurability());
        }
        if (traits.getMaxDamage() != null) {
            properties.component(DataComponents.MAX_DAMAGE, traits.getMaxDamage());
        }
        if (traits.isFireproof()) { properties.fireResistant(); }

        return properties;
    }

}
