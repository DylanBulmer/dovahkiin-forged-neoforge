package net.dovahkiinforged;

import net.dovahkiinforged.commons.constant.ModConstant;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ItemGroups {

    public static final DeferredRegister<CreativeModeTab> ITEM_GROUPS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ModConstant.MOD_ID);

    private static void register(final String name, final CreativeModeTab tab) {
        ITEM_GROUPS.register(name, () -> tab);
    }

    public static void initialize() {
        register("dovahkiin-forged", DOVAHKIIN_FORGED);
    }

    public static final CreativeModeTab DOVAHKIIN_FORGED = CreativeModeTab.builder()
            .title(Component.translatable(ModConstant.ITEM_GROUP_KEY))
            .icon(() -> Items.ELVEN_DAGGER.get().getDefaultInstance())
            .displayItems((parameters, output) -> {
                Items.ALL_ITEMS.forEach(item -> {
                    output.accept(item.get());
                });
                Blocks.ALL_BLOCKS.forEach(block -> {
                    output.accept(block.get());
                });
            }).build();
}
