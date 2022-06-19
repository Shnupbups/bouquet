package com.shnupbups.bouquet;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

import com.google.common.collect.ImmutableMap;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;

import com.shnupbups.bouquet.init.BouquetBlocks;

public class BouquetCollections {
	public static Map<Block, Block> SMALL_BOUQUET_FLOWERS_TO_POTTED = new ImmutableMap.Builder<Block, Block>()
			.put(BouquetBlocks.AMARYLLIS, BouquetBlocks.POTTED_AMARYLLIS)
			.put(BouquetBlocks.BEGONIA, BouquetBlocks.POTTED_BEGONIA)
			.put(BouquetBlocks.BELLFLOWER, BouquetBlocks.POTTED_BELLFLOWER)
			.put(BouquetBlocks.BUTTERCUP, BouquetBlocks.POTTED_BUTTERCUP)
			.put(BouquetBlocks.BLACK_ROSE, BouquetBlocks.POTTED_BLACK_ROSE)
			.put(BouquetBlocks.CAMELIA, BouquetBlocks.POTTED_CAMELIA)
			.put(BouquetBlocks.CARNATION, BouquetBlocks.POTTED_CARNATION)
			.put(BouquetBlocks.CROCUS, BouquetBlocks.POTTED_CROCUS)
			.put(BouquetBlocks.CYAN_ROSE, BouquetBlocks.POTTED_CYAN_ROSE)
			.put(BouquetBlocks.DAFFODIL, BouquetBlocks.POTTED_DAFFODIL)
			.put(BouquetBlocks.DAHLIA, BouquetBlocks.POTTED_DAHLIA)
			.put(BouquetBlocks.FORGET_ME_NOT, BouquetBlocks.POTTED_FORGET_ME_NOT)
			.put(BouquetBlocks.HIBISCUS, BouquetBlocks.POTTED_HIBISCUS)
			.put(BouquetBlocks.HOLLYHOCK, BouquetBlocks.POTTED_HOLLYHOCK)
			.put(BouquetBlocks.HYDRANGEA, BouquetBlocks.POTTED_HYDRANGEA)
			.put(BouquetBlocks.IRIS, BouquetBlocks.POTTED_IRIS)
			.put(BouquetBlocks.LAVENDER, BouquetBlocks.POTTED_LAVENDER)
			.put(BouquetBlocks.MAGNOLIA, BouquetBlocks.POTTED_MAGNOLIA)
			.put(BouquetBlocks.MARIGOLD, BouquetBlocks.POTTED_MARIGOLD)
			.put(BouquetBlocks.PEONY, BouquetBlocks.POTTED_PEONY)
			.put(BouquetBlocks.PINK_DAISY, BouquetBlocks.POTTED_PINK_DAISY)
			.put(BouquetBlocks.PINK_HYACINTH, BouquetBlocks.POTTED_PINK_HYACINTH)
			.put(BouquetBlocks.PINK_ROSE, BouquetBlocks.POTTED_PINK_ROSE)
			.put(BouquetBlocks.PRIMROSE, BouquetBlocks.POTTED_PRIMROSE)
			.put(BouquetBlocks.PURPLE_HYACINTH, BouquetBlocks.POTTED_PURPLE_HYACINTH)
			.put(BouquetBlocks.PURPLE_PANSY, BouquetBlocks.POTTED_PURPLE_PANSY)
			.put(BouquetBlocks.RED_HYACINTH, BouquetBlocks.POTTED_RED_HYACINTH)
			.put(BouquetBlocks.RED_ROSE, BouquetBlocks.POTTED_RED_ROSE)
			.put(BouquetBlocks.WHITE_HYACINTH, BouquetBlocks.POTTED_WHITE_HYACINTH)
			.put(BouquetBlocks.WHITE_POPPY, BouquetBlocks.POTTED_WHITE_POPPY)
			.put(BouquetBlocks.WHITE_ROSE, BouquetBlocks.POTTED_WHITE_ROSE)
			.put(BouquetBlocks.YELLOW_HYACINTH, BouquetBlocks.POTTED_YELLOW_HYACINTH)
			.put(BouquetBlocks.YELLOW_PANSY, BouquetBlocks.POTTED_YELLOW_PANSY)
			.put(BouquetBlocks.YELLOW_POPPY, BouquetBlocks.POTTED_YELLOW_POPPY)
			.put(BouquetBlocks.YELLOW_ROSE, BouquetBlocks.POTTED_YELLOW_ROSE)
			.build();
	
	public static Set<Block> SMALL_BOUQUET_FLOWERS = SMALL_BOUQUET_FLOWERS_TO_POTTED.keySet();

	public static Collection<Block> POTTED_BOUQUET_FLOWERS = SMALL_BOUQUET_FLOWERS_TO_POTTED.values();

	public static Set<Block> TALL_BOUQUET_FLOWERS = Set.of(
			BouquetBlocks.BLACK_ROSE_BUSH,
			BouquetBlocks.CYAN_ROSE_BUSH,
			BouquetBlocks.PINK_ROSE_BUSH,
			BouquetBlocks.WHITE_ROSE_BUSH,
			BouquetBlocks.YELLOW_ROSE_BUSH
	);

	public static Set<Block> FLOWERING_BUSHES = Set.of(
			Blocks.PEONY,
			Blocks.ROSE_BUSH,
			BouquetBlocks.BLACK_ROSE_BUSH,
			BouquetBlocks.CYAN_ROSE_BUSH,
			BouquetBlocks.PINK_ROSE_BUSH,
			BouquetBlocks.WHITE_ROSE_BUSH,
			BouquetBlocks.YELLOW_ROSE_BUSH
	);

	public static Set<Block> BARE_FLOWER_BUSHES = Set.of(
			BouquetBlocks.BARE_BLACK_ROSE_BUSH,
			BouquetBlocks.BARE_CYAN_ROSE_BUSH,
			BouquetBlocks.BARE_PEONY_BUSH,
			BouquetBlocks.BARE_PINK_ROSE_BUSH,
			BouquetBlocks.BARE_RED_ROSE_BUSH,
			BouquetBlocks.BARE_WHITE_ROSE_BUSH,
			BouquetBlocks.BARE_YELLOW_ROSE_BUSH
	);

	public static Set<Block> SMALL_BLACK_FLOWERS = Set.of(
			Blocks.WITHER_ROSE,
			BouquetBlocks.BLACK_ROSE
	);

	public static Set<Block> SMALL_BLUE_FLOWERS = Set.of(
			Blocks.CORNFLOWER
	);

	public static Set<Block> SMALL_CYAN_FLOWERS = Set.of(
			BouquetBlocks.CYAN_ROSE
	);

	public static Set<Block> SMALL_LIGHT_BLUE_FLOWERS = Set.of(
			Blocks.BLUE_ORCHID,
			BouquetBlocks.FORGET_ME_NOT
	);

	public static Set<Block> SMALL_LIGHT_GRAY_FLOWERS = Set.of(
			Blocks.AZURE_BLUET,
			Blocks.OXEYE_DAISY,
			Blocks.WHITE_TULIP
	);

	public static Set<Block> SMALL_MAGENTA_FLOWERS = Set.of(
			Blocks.ALLIUM,
			BouquetBlocks.CAMELIA,
			BouquetBlocks.CARNATION,
			BouquetBlocks.DAHLIA,
			BouquetBlocks.HYDRANGEA
	);

	public static Set<Block> SMALL_ORANGE_FLOWERS = Set.of(
			Blocks.ORANGE_TULIP
	);

	public static Set<Block> SMALL_PINK_FLOWERS = Set.of(
			Blocks.PINK_TULIP,
			BouquetBlocks.HIBISCUS,
			BouquetBlocks.HOLLYHOCK,
			BouquetBlocks.PEONY,
			BouquetBlocks.PINK_DAISY,
			BouquetBlocks.PINK_HYACINTH,
			BouquetBlocks.PINK_ROSE
	);

	public static Set<Block> SMALL_PURPLE_FLOWERS = Set.of(
			BouquetBlocks.BELLFLOWER,
			BouquetBlocks.CROCUS,
			BouquetBlocks.IRIS,
			BouquetBlocks.LAVENDER,
			BouquetBlocks.PURPLE_HYACINTH,
			BouquetBlocks.PURPLE_PANSY
	);

	public static Set<Block> SMALL_RED_FLOWERS = Set.of(
			Blocks.POPPY,
			Blocks.RED_TULIP,
			BouquetBlocks.AMARYLLIS,
			BouquetBlocks.BEGONIA,
			BouquetBlocks.RED_HYACINTH,
			BouquetBlocks.RED_ROSE
	);

	public static Set<Block> SMALL_WHITE_FLOWERS = Set.of(
			Blocks.LILY_OF_THE_VALLEY,
			BouquetBlocks.MAGNOLIA,
			BouquetBlocks.WHITE_HYACINTH,
			BouquetBlocks.WHITE_POPPY,
			BouquetBlocks.WHITE_ROSE
	);

	public static Set<Block> SMALL_YELLOW_FLOWERS = Set.of(
			Blocks.DANDELION,
			BouquetBlocks.BUTTERCUP,
			BouquetBlocks.DAFFODIL,
			BouquetBlocks.MARIGOLD,
			BouquetBlocks.PRIMROSE,
			BouquetBlocks.YELLOW_HYACINTH,
			BouquetBlocks.YELLOW_PANSY,
			BouquetBlocks.YELLOW_POPPY,
			BouquetBlocks.YELLOW_ROSE
	);

	public static Set<Block> TALL_BLACK_FLOWERS = Set.of(
			BouquetBlocks.BLACK_ROSE_BUSH
	);

	public static Set<Block> TALL_CYAN_FLOWERS = Set.of(
			BouquetBlocks.CYAN_ROSE_BUSH
	);

	public static Set<Block> TALL_MAGENTA_FLOWERS = Set.of(
			Blocks.LILAC
	);

	public static Set<Block> TALL_PINK_FLOWERS = Set.of(
			Blocks.PEONY,
			BouquetBlocks.PINK_ROSE_BUSH
	);

	public static Set<Block> TALL_RED_FLOWERS = Set.of(
			Blocks.ROSE_BUSH
	);

	public static Set<Block> TALL_WHITE_FLOWERS = Set.of(
			BouquetBlocks.WHITE_ROSE_BUSH
	);

	public static Set<Block> TALL_YELLOW_FLOWERS = Set.of(
			Blocks.SUNFLOWER,
			BouquetBlocks.YELLOW_ROSE_BUSH
	);
}
