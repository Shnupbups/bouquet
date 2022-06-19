package com.shnupbups.bouquet.datagen.provider;

import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;

import com.shnupbups.bouquet.BouquetCollections;

public class BouquetModelProvider extends FabricModelProvider {
	public BouquetModelProvider(FabricDataGenerator dataGenerator) {
		super(dataGenerator);
	}

	@Override
	public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
		BouquetCollections.SMALL_BOUQUET_FLOWERS_TO_POTTED.forEach((flower, potted) -> blockStateModelGenerator.registerFlowerPotPlant(flower, potted, BlockStateModelGenerator.TintType.NOT_TINTED));
		BouquetCollections.TALL_BOUQUET_FLOWERS.forEach(flower -> blockStateModelGenerator.registerDoubleBlock(flower, BlockStateModelGenerator.TintType.NOT_TINTED));
		BouquetCollections.BARE_FLOWER_BUSHES.forEach(flower -> blockStateModelGenerator.registerDoubleBlock(flower, BlockStateModelGenerator.TintType.NOT_TINTED));
	}

	@Override
	public void generateItemModels(ItemModelGenerator itemModelGenerator) {

	}
}
