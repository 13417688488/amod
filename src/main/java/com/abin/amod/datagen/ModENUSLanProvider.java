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
        translationBuilder.add(ModItems.TNT, "TNT");
        translationBuilder.add(ModItems.JUMPEGG, "JUMPEGG");
        translationBuilder.add(ModItems.GUN, "GUN");
        translationBuilder.add(ModItems.FIREBALLSTICK, "FIREBALLSTICK");
        translationBuilder.add(ModItems.HUB, "HUB");
        translationBuilder.add(ModItems.MAGICMIRROR, "MAGICMIRROR");
        translationBuilder.add("item.amod.prospector.tooltip","Rightclick to fuzzy search, Shift+Rightclick to precise search");
        translationBuilder.add(ModItems.PLATE, "Plate");
        translationBuilder.add(ModBlocks.B_BLOCK, "BLOCKB");
        translationBuilder.add(ModItems.MAGICSTICK, "MAGICSTICK");
        translationBuilder.add(ModItems.TEST, "TEST");
        translationBuilder.add(ModItems.VAMPIRICSCEPTER, "VAMPIRICSCEPTER");

        translationBuilder.add("itemGroup.a_group","AMODItemGroup");
    }
}
