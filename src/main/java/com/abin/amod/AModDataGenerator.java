package com.abin.amod;

import com.abin.amod.datagen.*;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class AModDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModBlockTagsProvider::new);
		pack.addProvider(ModENUSLanProvider::new);
		pack.addProvider(ModLootTableProvider::new);
		pack.addProvider(ModModelsProvider::new);
		pack.addProvider(ModItemTagsProvider::new);
		pack.addProvider(ModRecipesProvider::new);
		pack.addProvider(ModZHCNLanProvider::new);

	}
}
