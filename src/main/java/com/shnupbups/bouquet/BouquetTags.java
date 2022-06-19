package com.shnupbups.bouquet;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BouquetTags {
	public static final String COMMON_NAMESPACE = "c";
	
	public static class BouquetBlockTags {
		public static final TagKey<Block> SMALL_BLACK_FLOWERS = TagKey.of(Registry.BLOCK_KEY, createCommonId("small_black_flowers"));
		public static final TagKey<Block> SMALL_BLUE_FLOWERS = TagKey.of(Registry.BLOCK_KEY, createCommonId("small_blue_flowers"));
		public static final TagKey<Block> SMALL_CYAN_FLOWERS = TagKey.of(Registry.BLOCK_KEY, createCommonId("small_cyan_flowers"));
		public static final TagKey<Block> SMALL_LIGHT_BLUE_FLOWERS = TagKey.of(Registry.BLOCK_KEY, createCommonId("small_light_blue_flowers"));
		public static final TagKey<Block> SMALL_LIGHT_GRAY_FLOWERS = TagKey.of(Registry.BLOCK_KEY, createCommonId("small_light_gray_flowers"));
		public static final TagKey<Block> SMALL_MAGENTA_FLOWERS = TagKey.of(Registry.BLOCK_KEY, createCommonId("small_magenta_flowers"));
		public static final TagKey<Block> SMALL_ORANGE_FLOWERS = TagKey.of(Registry.BLOCK_KEY, createCommonId("small_orange_flowers"));
		public static final TagKey<Block> SMALL_PINK_FLOWERS = TagKey.of(Registry.BLOCK_KEY, createCommonId("small_pink_flowers"));
		public static final TagKey<Block> SMALL_PURPLE_FLOWERS = TagKey.of(Registry.BLOCK_KEY, createCommonId("small_purple_flowers"));
		public static final TagKey<Block> SMALL_RED_FLOWERS = TagKey.of(Registry.BLOCK_KEY, createCommonId("small_red_flowers"));
		public static final TagKey<Block> SMALL_WHITE_FLOWERS = TagKey.of(Registry.BLOCK_KEY, createCommonId("small_white_flowers"));
		public static final TagKey<Block> SMALL_YELLOW_FLOWERS = TagKey.of(Registry.BLOCK_KEY, createCommonId("small_yellow_flowers"));
		public static final TagKey<Block> TALL_BLACK_FLOWERS = TagKey.of(Registry.BLOCK_KEY, createCommonId("tall_black_flowers"));
		public static final TagKey<Block> TALL_CYAN_FLOWERS = TagKey.of(Registry.BLOCK_KEY, createCommonId("tall_cyan_flowers"));
		public static final TagKey<Block> TALL_MAGENTA_FLOWERS = TagKey.of(Registry.BLOCK_KEY, createCommonId("tall_magenta_flowers"));
		public static final TagKey<Block> TALL_PINK_FLOWERS = TagKey.of(Registry.BLOCK_KEY, createCommonId("tall_pink_flowers"));
		public static final TagKey<Block> TALL_RED_FLOWERS = TagKey.of(Registry.BLOCK_KEY, createCommonId("tall_red_flowers"));
		public static final TagKey<Block> TALL_WHITE_FLOWERS = TagKey.of(Registry.BLOCK_KEY, createCommonId("tall_white_flowers"));
		public static final TagKey<Block> TALL_YELLOW_FLOWERS = TagKey.of(Registry.BLOCK_KEY, createCommonId("tall_yellow_flowers"));

		public static final TagKey<Block> FLOWERING_BUSHES = TagKey.of(Registry.BLOCK_KEY, Bouquet.id("flowering_bushes"));
		public static final TagKey<Block> BARE_FLOWER_BUSHES = TagKey.of(Registry.BLOCK_KEY, Bouquet.id("bare_flower_bushes"));
	}
	
	public static class BouquetItemTags {
		public static final TagKey<Item> SMALL_BLACK_FLOWERS = TagKey.of(Registry.ITEM_KEY, createCommonId("small_black_flowers"));
		public static final TagKey<Item> SMALL_BLUE_FLOWERS = TagKey.of(Registry.ITEM_KEY, createCommonId("small_blue_flowers"));
		public static final TagKey<Item> SMALL_CYAN_FLOWERS = TagKey.of(Registry.ITEM_KEY, createCommonId("small_cyan_flowers"));
		public static final TagKey<Item> SMALL_LIGHT_BLUE_FLOWERS = TagKey.of(Registry.ITEM_KEY, createCommonId("small_light_blue_flowers"));
		public static final TagKey<Item> SMALL_LIGHT_GRAY_FLOWERS = TagKey.of(Registry.ITEM_KEY, createCommonId("small_light_gray_flowers"));
		public static final TagKey<Item> SMALL_MAGENTA_FLOWERS = TagKey.of(Registry.ITEM_KEY, createCommonId("small_magenta_flowers"));
		public static final TagKey<Item> SMALL_ORANGE_FLOWERS = TagKey.of(Registry.ITEM_KEY, createCommonId("small_orange_flowers"));
		public static final TagKey<Item> SMALL_PINK_FLOWERS = TagKey.of(Registry.ITEM_KEY, createCommonId("small_pink_flowers"));
		public static final TagKey<Item> SMALL_PURPLE_FLOWERS = TagKey.of(Registry.ITEM_KEY, createCommonId("small_purple_flowers"));
		public static final TagKey<Item> SMALL_RED_FLOWERS = TagKey.of(Registry.ITEM_KEY, createCommonId("small_red_flowers"));
		public static final TagKey<Item> SMALL_WHITE_FLOWERS = TagKey.of(Registry.ITEM_KEY, createCommonId("small_white_flowers"));
		public static final TagKey<Item> SMALL_YELLOW_FLOWERS = TagKey.of(Registry.ITEM_KEY, createCommonId("small_yellow_flowers"));
		public static final TagKey<Item> TALL_BLACK_FLOWERS = TagKey.of(Registry.ITEM_KEY, createCommonId("tall_black_flowers"));
		public static final TagKey<Item> TALL_CYAN_FLOWERS = TagKey.of(Registry.ITEM_KEY, createCommonId("tall_cyan_flowers"));
		public static final TagKey<Item> TALL_MAGENTA_FLOWERS = TagKey.of(Registry.ITEM_KEY, createCommonId("tall_magenta_flowers"));
		public static final TagKey<Item> TALL_PINK_FLOWERS = TagKey.of(Registry.ITEM_KEY, createCommonId("tall_pink_flowers"));
		public static final TagKey<Item> TALL_RED_FLOWERS = TagKey.of(Registry.ITEM_KEY, createCommonId("tall_red_flowers"));
		public static final TagKey<Item> TALL_WHITE_FLOWERS = TagKey.of(Registry.ITEM_KEY, createCommonId("tall_white_flowers"));
		public static final TagKey<Item> TALL_YELLOW_FLOWERS = TagKey.of(Registry.ITEM_KEY, createCommonId("tall_yellow_flowers"));

		public static final TagKey<Item> FLOWERING_BUSHES = TagKey.of(Registry.ITEM_KEY, Bouquet.id("flowering_bushes"));
		public static final TagKey<Item> BARE_FLOWER_BUSHES = TagKey.of(Registry.ITEM_KEY, Bouquet.id("bare_flower_bushes"));
	}
	
	public static Identifier createCommonId(String path) {
		return new Identifier(COMMON_NAMESPACE, path);
	}
}
