package com.abin.amod.datagen;

import com.abin.amod.block.ModBlocks;
import com.abin.amod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModZHCNLanProvider extends FabricLanguageProvider{
    public ModZHCNLanProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "zh_cn",registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup registryLookup, FabricLanguageProvider.TranslationBuilder translationBuilder) {
        translationBuilder.add(ModItems.A, "物品A");
        translationBuilder.add(ModItems.PROSPECTOR, "探矿器");
        translationBuilder.add(ModItems.LIGHTNINGSTICK, "闪电棒");
        translationBuilder.add(ModItems.CHEESE, "奶酪");
        translationBuilder.add(ModItems.STRAWBERY, "草莓");
        translationBuilder.add(ModItems.TNT, "TNT");
        translationBuilder.add(ModItems.JUMPEGG, "跳蛋");

        translationBuilder.add(ModBlocks.B_BLOCK, "方块B");

        translationBuilder.add("itemGroup.a_group","AMOD物品组");
    }
}
