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
        translationBuilder.add(ModItems.GUN, "枪");
        translationBuilder.add(ModItems.FIREBALLSTICK, "火球棒");
        translationBuilder.add(ModItems.HUB, "传送门");
        translationBuilder.add(ModItems.MAGICMIRROR, "魔镜");
        translationBuilder.add("item.amod.prospector.tooltip", "右键模糊搜索，shift+右键精准搜索");
        translationBuilder.add(ModItems.PLATE, "盘子");
        translationBuilder.add(ModBlocks.B_BLOCK, "方块B");
        translationBuilder.add(ModItems.MAGICSTICK, "魔棒");
        translationBuilder.add(ModItems.TEST, "测试");
        translationBuilder.add(ModItems.VAMPIRICSCEPTER, "吸血魔杖");

        translationBuilder.add("itemGroup.a_group","AMOD物品组");
    }
}
