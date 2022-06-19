package com.shnupbups.bouquet.datagen.provider.tag;

import net.minecraft.block.Block;
import net.minecraft.tag.BlockTags;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;

import com.shnupbups.bouquet.BouquetTags;
import com.shnupbups.bouquet.BouquetCollections;

public class BouquetBlockTagProvider extends FabricTagProvider.BlockTagProvider {
	public BouquetBlockTagProvider(FabricDataGenerator dataGenerator) {
		super(dataGenerator);
	}

	@Override
	protected void generateTags() {
		FabricTagBuilder<Block> flowerPots = getOrCreateTagBuilder(BlockTags.FLOWER_POTS);
		flowerPots.add(BouquetCollections.POTTED_BOUQUET_FLOWERS.toArray(new Block[0]));

		FabricTagBuilder<Block> floweringRoseBushes = this.getOrCreateTagBuilder(BouquetTags.BouquetBlockTags.FLOWERING_BUSHES);
		floweringRoseBushes.add(BouquetCollections.FLOWERING_BUSHES.toArray(new Block[0]));

		FabricTagBuilder<Block> bareRoseBushes = getOrCreateTagBuilder(BouquetTags.BouquetBlockTags.BARE_FLOWER_BUSHES);
		bareRoseBushes.add(BouquetCollections.BARE_FLOWER_BUSHES.toArray(new Block[0]));

		FabricTagBuilder<Block> smallBlackFlowers = this.getOrCreateTagBuilder(BouquetTags.BouquetBlockTags.SMALL_BLACK_FLOWERS);
		smallBlackFlowers.add(BouquetCollections.SMALL_BLACK_FLOWERS.toArray(new Block[0]));

		FabricTagBuilder<Block> smallBlueFlowers = this.getOrCreateTagBuilder(BouquetTags.BouquetBlockTags.SMALL_BLUE_FLOWERS);
		smallBlueFlowers.add(BouquetCollections.SMALL_BLUE_FLOWERS.toArray(new Block[0]));

		FabricTagBuilder<Block> smallCyanFlowers = this.getOrCreateTagBuilder(BouquetTags.BouquetBlockTags.SMALL_CYAN_FLOWERS);
		smallCyanFlowers.add(BouquetCollections.SMALL_CYAN_FLOWERS.toArray(new Block[0]));

		FabricTagBuilder<Block> smallLightBlueFlowers = this.getOrCreateTagBuilder(BouquetTags.BouquetBlockTags.SMALL_LIGHT_BLUE_FLOWERS);
		smallLightBlueFlowers.add(BouquetCollections.SMALL_LIGHT_BLUE_FLOWERS.toArray(new Block[0]));

		FabricTagBuilder<Block> smallLightGrayFlowers = this.getOrCreateTagBuilder(BouquetTags.BouquetBlockTags.SMALL_LIGHT_GRAY_FLOWERS);
		smallLightGrayFlowers.add(BouquetCollections.SMALL_LIGHT_GRAY_FLOWERS.toArray(new Block[0]));

		FabricTagBuilder<Block> smallMagentaFlowers = this.getOrCreateTagBuilder(BouquetTags.BouquetBlockTags.SMALL_MAGENTA_FLOWERS);
		smallMagentaFlowers.add(BouquetCollections.SMALL_MAGENTA_FLOWERS.toArray(new Block[0]));

		FabricTagBuilder<Block> smallOrangeFlowers = this.getOrCreateTagBuilder(BouquetTags.BouquetBlockTags.SMALL_ORANGE_FLOWERS);
		smallOrangeFlowers.add(BouquetCollections.SMALL_ORANGE_FLOWERS.toArray(new Block[0]));

		FabricTagBuilder<Block> smallPinkFlowers = this.getOrCreateTagBuilder(BouquetTags.BouquetBlockTags.SMALL_PINK_FLOWERS);
		smallPinkFlowers.add(BouquetCollections.SMALL_PINK_FLOWERS.toArray(new Block[0]));

		FabricTagBuilder<Block> smallPurpleFlowers = this.getOrCreateTagBuilder(BouquetTags.BouquetBlockTags.SMALL_PURPLE_FLOWERS);
		smallPurpleFlowers.add(BouquetCollections.SMALL_PURPLE_FLOWERS.toArray(new Block[0]));

		FabricTagBuilder<Block> smallRedFlowers = this.getOrCreateTagBuilder(BouquetTags.BouquetBlockTags.SMALL_RED_FLOWERS);
		smallRedFlowers.add(BouquetCollections.SMALL_RED_FLOWERS.toArray(new Block[0]));

		FabricTagBuilder<Block> smallWhiteFlowers = this.getOrCreateTagBuilder(BouquetTags.BouquetBlockTags.SMALL_WHITE_FLOWERS);
		smallWhiteFlowers.add(BouquetCollections.SMALL_WHITE_FLOWERS.toArray(new Block[0]));

		FabricTagBuilder<Block> smallYellowFlowers = this.getOrCreateTagBuilder(BouquetTags.BouquetBlockTags.SMALL_YELLOW_FLOWERS);
		smallYellowFlowers.add(BouquetCollections.SMALL_YELLOW_FLOWERS.toArray(new Block[0]));
		
		FabricTagBuilder<Block> smallFlowers = getOrCreateTagBuilder(BlockTags.SMALL_FLOWERS);
		smallFlowers.addTag(BouquetTags.BouquetBlockTags.SMALL_BLACK_FLOWERS);
		smallFlowers.addTag(BouquetTags.BouquetBlockTags.SMALL_BLUE_FLOWERS);
		smallFlowers.addTag(BouquetTags.BouquetBlockTags.SMALL_CYAN_FLOWERS);
		smallFlowers.addTag(BouquetTags.BouquetBlockTags.SMALL_LIGHT_BLUE_FLOWERS);
		smallFlowers.addTag(BouquetTags.BouquetBlockTags.SMALL_LIGHT_GRAY_FLOWERS);
		smallFlowers.addTag(BouquetTags.BouquetBlockTags.SMALL_MAGENTA_FLOWERS);
		smallFlowers.addTag(BouquetTags.BouquetBlockTags.SMALL_ORANGE_FLOWERS);
		smallFlowers.addTag(BouquetTags.BouquetBlockTags.SMALL_PINK_FLOWERS);
		smallFlowers.addTag(BouquetTags.BouquetBlockTags.SMALL_PURPLE_FLOWERS);
		smallFlowers.addTag(BouquetTags.BouquetBlockTags.SMALL_RED_FLOWERS);
		smallFlowers.addTag(BouquetTags.BouquetBlockTags.SMALL_WHITE_FLOWERS);
		smallFlowers.addTag(BouquetTags.BouquetBlockTags.SMALL_YELLOW_FLOWERS);

		FabricTagBuilder<Block> tallBlackFlowers = this.getOrCreateTagBuilder(BouquetTags.BouquetBlockTags.TALL_BLACK_FLOWERS);
		tallBlackFlowers.add(BouquetCollections.TALL_BLACK_FLOWERS.toArray(new Block[0]));
		
		FabricTagBuilder<Block> tallCyanFlowers = this.getOrCreateTagBuilder(BouquetTags.BouquetBlockTags.TALL_CYAN_FLOWERS);
		tallCyanFlowers.add(BouquetCollections.TALL_CYAN_FLOWERS.toArray(new Block[0]));

		FabricTagBuilder<Block> tallMagentaFlowers = this.getOrCreateTagBuilder(BouquetTags.BouquetBlockTags.TALL_MAGENTA_FLOWERS);
		tallMagentaFlowers.add(BouquetCollections.TALL_MAGENTA_FLOWERS.toArray(new Block[0]));

		FabricTagBuilder<Block> tallPinkFlowers = this.getOrCreateTagBuilder(BouquetTags.BouquetBlockTags.TALL_PINK_FLOWERS);
		tallPinkFlowers.add(BouquetCollections.TALL_PINK_FLOWERS.toArray(new Block[0]));

		FabricTagBuilder<Block> tallRedFlowers = this.getOrCreateTagBuilder(BouquetTags.BouquetBlockTags.TALL_RED_FLOWERS);
		tallRedFlowers.add(BouquetCollections.TALL_RED_FLOWERS.toArray(new Block[0]));

		FabricTagBuilder<Block> tallWhiteFlowers = this.getOrCreateTagBuilder(BouquetTags.BouquetBlockTags.TALL_WHITE_FLOWERS);
		tallWhiteFlowers.add(BouquetCollections.TALL_WHITE_FLOWERS.toArray(new Block[0]));
		
		FabricTagBuilder<Block> tallYellowFlowers = this.getOrCreateTagBuilder(BouquetTags.BouquetBlockTags.TALL_YELLOW_FLOWERS);
		tallYellowFlowers.add(BouquetCollections.TALL_YELLOW_FLOWERS.toArray(new Block[0]));

		FabricTagBuilder<Block> tallFlowers = getOrCreateTagBuilder(BlockTags.TALL_FLOWERS);
		tallFlowers.addTag(BouquetTags.BouquetBlockTags.TALL_BLACK_FLOWERS);
		tallFlowers.addTag(BouquetTags.BouquetBlockTags.TALL_CYAN_FLOWERS);
		tallFlowers.addTag(BouquetTags.BouquetBlockTags.TALL_MAGENTA_FLOWERS);
		tallFlowers.addTag(BouquetTags.BouquetBlockTags.TALL_PINK_FLOWERS);
		tallFlowers.addTag(BouquetTags.BouquetBlockTags.TALL_RED_FLOWERS);
		tallFlowers.addTag(BouquetTags.BouquetBlockTags.TALL_WHITE_FLOWERS);
		tallFlowers.addTag(BouquetTags.BouquetBlockTags.TALL_YELLOW_FLOWERS);

		FabricTagBuilder<Block> replaceablePlants = getOrCreateTagBuilder(BlockTags.REPLACEABLE_PLANTS);
		replaceablePlants.addTag(BouquetTags.BouquetBlockTags.BARE_FLOWER_BUSHES);
		replaceablePlants.addTag(BouquetTags.BouquetBlockTags.TALL_BLACK_FLOWERS);
		replaceablePlants.addTag(BouquetTags.BouquetBlockTags.TALL_CYAN_FLOWERS);
		replaceablePlants.addTag(BouquetTags.BouquetBlockTags.TALL_MAGENTA_FLOWERS);
		replaceablePlants.addTag(BouquetTags.BouquetBlockTags.TALL_PINK_FLOWERS);
		replaceablePlants.addTag(BouquetTags.BouquetBlockTags.TALL_RED_FLOWERS);
		replaceablePlants.addTag(BouquetTags.BouquetBlockTags.TALL_WHITE_FLOWERS);
		replaceablePlants.addTag(BouquetTags.BouquetBlockTags.TALL_YELLOW_FLOWERS);
	}
}
