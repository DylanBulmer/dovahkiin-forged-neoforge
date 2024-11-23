package net.dovahkiinforged.generator;

import net.dovahkiinforged.commons.constant.ModConstant;
import net.dovahkiinforged.generator.provider.ModelProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, modid = ModConstant.MOD_ID)
public class Generator {

    @SubscribeEvent
    public static void generateData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput output = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
//        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        generator.addProvider(
                event.includeClient(),
                new ModelProvider.Block(output, existingFileHelper)
        );

        generator.addProvider(
                event.includeClient(),
                new ModelProvider.Item(output, existingFileHelper)
        );
    }

}
