package com.abin.amod.datagen;

import com.abin.amod.block.ModBlocks;
import com.abin.amod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelsProvider extends FabricModelProvider {
    public ModModelsProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.B_BLOCK);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.A, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHEESE, Models.GENERATED);
        itemModelGenerator.register(ModItems.STRAWBERY, Models.GENERATED);
        itemModelGenerator.register(ModItems.PROSPECTOR, Models.GENERATED);
        itemModelGenerator.register(ModItems.LIGHTNINGSTICK, Models.GENERATED);
        itemModelGenerator.register(ModItems.TNT, Models.GENERATED);
        itemModelGenerator.register(ModItems.JUMPEGG, Models.GENERATED);
        itemModelGenerator.register(ModItems.GUN, Models.GENERATED);
        itemModelGenerator.register(ModItems.FIREBALLSTICK, Models.GENERATED);
        itemModelGenerator.register(ModItems.HUB, Models.GENERATED);
        itemModelGenerator.register(ModItems.MAGICMIRROR, Models.GENERATED);
        itemModelGenerator.register(ModItems.PLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.MAGICSTICK, Models.GENERATED);
        itemModelGenerator.register(ModItems.TEST, Models.GENERATED);
        itemModelGenerator.register(ModItems.VAMPIRICSCEPTER, Models.GENERATED);

    }
}
