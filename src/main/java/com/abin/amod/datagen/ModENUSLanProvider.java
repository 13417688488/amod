package com.abin.amod.datagen;

import com.abin.amod.block.ModBlocks;
import com.abin.amod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModENUSLanProvider extends FabricLanguageProvider {
    public ModENUSLanProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "en_us",registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup registryLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add(ModItems.A, "ITEMA");
        translationBuilder.add(ModItems.PROSPECTOR, "PROSPECTOR");
        translationBuilder.add(ModItems.CHEESE, "CHEESE");
        translationBuilder.add(ModItems.STRAWBERY, "STRAWBERRY");
        translationBuilder.add(ModItems.LIGHTNINGSTICK, "LIGHTNINGSTICK");

        translationBuilder.add(ModBlocks.B_BLOCK, "BLOCKB");

        translationBuilder.add("itemGroup.a_group","AMODItemGroup");
    }
}
