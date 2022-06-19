package com.shnupbups.bouquet.datagen.provider.tag;

import org.jetbrains.annotations.Nullable;

import net.minecraft.tag.BlockTags;
import net.minecraft.tag.ItemTags;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;

import com.shnupbups.bouquet.BouquetTags;

public class BouquetItemTagProvider extends FabricTagProvider.ItemTagProvider {
	public BouquetItemTagProvider(FabricDataGenerator dataGenerator, @Nullable BlockTagProvider blockTagProvider) {
		super(dataGenerator, blockTagProvider);
	}

	@Override
	protected void generateTags() {
		this.copy(BouquetTags.BouquetBlockTags.SMALL_BLACK_FLOWERS, BouquetTags.BouquetItemTags.SMALL_BLACK_FLOWERS);
		this.copy(BouquetTags.BouquetBlockTags.SMALL_BLUE_FLOWERS, BouquetTags.BouquetItemTags.SMALL_BLUE_FLOWERS);
		this.copy(BouquetTags.BouquetBlockTags.SMALL_CYAN_FLOWERS, BouquetTags.BouquetItemTags.SMALL_CYAN_FLOWERS);
		this.copy(BouquetTags.BouquetBlockTags.SMALL_LIGHT_BLUE_FLOWERS, BouquetTags.BouquetItemTags.SMALL_LIGHT_BLUE_FLOWERS);
		this.copy(BouquetTags.BouquetBlockTags.SMALL_LIGHT_GRAY_FLOWERS, BouquetTags.BouquetItemTags.SMALL_LIGHT_GRAY_FLOWERS);
		this.copy(BouquetTags.BouquetBlockTags.SMALL_MAGENTA_FLOWERS, BouquetTags.BouquetItemTags.SMALL_MAGENTA_FLOWERS);
		this.copy(BouquetTags.BouquetBlockTags.SMALL_ORANGE_FLOWERS, BouquetTags.BouquetItemTags.SMALL_ORANGE_FLOWERS);
		this.copy(BouquetTags.BouquetBlockTags.SMALL_PINK_FLOWERS, BouquetTags.BouquetItemTags.SMALL_PINK_FLOWERS);
		this.copy(BouquetTags.BouquetBlockTags.SMALL_PURPLE_FLOWERS, BouquetTags.BouquetItemTags.SMALL_PURPLE_FLOWERS);
		this.copy(BouquetTags.BouquetBlockTags.SMALL_RED_FLOWERS, BouquetTags.BouquetItemTags.SMALL_RED_FLOWERS);
		this.copy(BouquetTags.BouquetBlockTags.SMALL_WHITE_FLOWERS, BouquetTags.BouquetItemTags.SMALL_WHITE_FLOWERS);
		this.copy(BouquetTags.BouquetBlockTags.SMALL_YELLOW_FLOWERS, BouquetTags.BouquetItemTags.SMALL_YELLOW_FLOWERS);

		this.copy(BouquetTags.BouquetBlockTags.TALL_BLACK_FLOWERS, BouquetTags.BouquetItemTags.TALL_BLACK_FLOWERS);
		this.copy(BouquetTags.BouquetBlockTags.TALL_CYAN_FLOWERS, BouquetTags.BouquetItemTags.TALL_CYAN_FLOWERS);
		this.copy(BouquetTags.BouquetBlockTags.TALL_MAGENTA_FLOWERS, BouquetTags.BouquetItemTags.TALL_MAGENTA_FLOWERS);
		this.copy(BouquetTags.BouquetBlockTags.TALL_PINK_FLOWERS, BouquetTags.BouquetItemTags.TALL_PINK_FLOWERS);
		this.copy(BouquetTags.BouquetBlockTags.TALL_RED_FLOWERS, BouquetTags.BouquetItemTags.TALL_RED_FLOWERS);
		this.copy(BouquetTags.BouquetBlockTags.TALL_WHITE_FLOWERS, BouquetTags.BouquetItemTags.TALL_WHITE_FLOWERS);
		this.copy(BouquetTags.BouquetBlockTags.TALL_YELLOW_FLOWERS, BouquetTags.BouquetItemTags.TALL_YELLOW_FLOWERS);

		this.copy(BouquetTags.BouquetBlockTags.FLOWERING_BUSHES, BouquetTags.BouquetItemTags.FLOWERING_BUSHES);
		this.copy(BouquetTags.BouquetBlockTags.BARE_FLOWER_BUSHES, BouquetTags.BouquetItemTags.BARE_FLOWER_BUSHES);

		this.copy(BlockTags.SMALL_FLOWERS, ItemTags.SMALL_FLOWERS);
		this.copy(BlockTags.TALL_FLOWERS, ItemTags.TALL_FLOWERS);
	}
}
