package com.shnupbups.bouquet.datagen.provider;

import net.minecraft.block.Block;
import net.minecraft.block.TallPlantBlock;
import net.minecraft.block.enums.DoubleBlockHalf;
import net.minecraft.data.server.BlockLootTableGenerator;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

import com.shnupbups.bouquet.BouquetCollections;

public class BouquetBlockLootTableProvider extends FabricBlockLootTableProvider {
	public BouquetBlockLootTableProvider(FabricDataGenerator dataGenerator) {
		super(dataGenerator);
	}

	@Override
	protected void generateBlockLootTables() {
		BouquetCollections.SMALL_BOUQUET_FLOWERS.forEach(this::addDrop);
		BouquetCollections.POTTED_BOUQUET_FLOWERS.forEach(this::addPottedPlantDrop);
		BouquetCollections.TALL_BOUQUET_FLOWERS.forEach(flower -> this.addDrop(flower, (Block block) -> BlockLootTableGenerator.dropsWithProperty(block, TallPlantBlock.HALF, DoubleBlockHalf.LOWER)));
		BouquetCollections.BARE_FLOWER_BUSHES.forEach(flower -> this.addDrop(flower, (Block block) -> BlockLootTableGenerator.dropsWithProperty(block, TallPlantBlock.HALF, DoubleBlockHalf.LOWER)));
	}
}
