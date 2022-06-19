package com.shnupbups.bouquet.datagen;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

import com.shnupbups.bouquet.datagen.provider.BouquetBlockLootTableProvider;
import com.shnupbups.bouquet.datagen.provider.tag.BouquetBlockTagProvider;
import com.shnupbups.bouquet.datagen.provider.tag.BouquetItemTagProvider;
import com.shnupbups.bouquet.datagen.provider.BouquetModelProvider;
import com.shnupbups.bouquet.datagen.provider.BouquetRecipeProvider;

public class BouquetDatagen implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		fabricDataGenerator.addProvider(BouquetBlockLootTableProvider::new);
		BouquetBlockTagProvider blockTagProvider = fabricDataGenerator.addProvider(BouquetBlockTagProvider::new);
		fabricDataGenerator.addProvider(new BouquetItemTagProvider(fabricDataGenerator, blockTagProvider));
		fabricDataGenerator.addProvider(BouquetRecipeProvider::new);
		fabricDataGenerator.addProvider(BouquetModelProvider::new);
	}
}
