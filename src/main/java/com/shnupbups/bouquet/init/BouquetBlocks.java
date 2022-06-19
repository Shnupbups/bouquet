package com.shnupbups.bouquet.init;

import it.unimi.dsi.fastutil.objects.Object2IntArrayMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FlowerBlock;
import net.minecraft.block.FlowerPotBlock;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.registry.Registry;

import com.shnupbups.bouquet.Bouquet;
import com.shnupbups.bouquet.block.BareFlowerBushBlock;
import com.shnupbups.bouquet.block.FlowerBushBlock;

public class BouquetBlocks {
	public static final String POTTED_PREFIX = "potted_";

	public static final Object2IntMap<StatusEffect> STEW_EFFECT_DURATIONS = new Object2IntArrayMap<>();

	public static final FlowerBlock AMARYLLIS;
	public static final FlowerBlock BEGONIA;
	public static final FlowerBlock BELLFLOWER;
	public static final FlowerBlock BLACK_ROSE;
	public static final FlowerBlock BUTTERCUP;
	public static final FlowerBlock CAMELIA;
	public static final FlowerBlock CARNATION;
	public static final FlowerBlock CROCUS;
	public static final FlowerBlock CYAN_ROSE;
	public static final FlowerBlock DAHLIA;
	public static final FlowerBlock DAFFODIL;
	public static final FlowerBlock FORGET_ME_NOT;
	public static final FlowerBlock HIBISCUS;
	public static final FlowerBlock HOLLYHOCK;
	public static final FlowerBlock HYDRANGEA;
	public static final FlowerBlock IRIS;
	public static final FlowerBlock LAVENDER;
	public static final FlowerBlock MAGNOLIA;
	public static final FlowerBlock MARIGOLD;
	public static final FlowerBlock PEONY;
	public static final FlowerBlock PINK_DAISY;
	public static final FlowerBlock PINK_HYACINTH;
	public static final FlowerBlock PRIMROSE;
	public static final FlowerBlock PINK_ROSE;
	public static final FlowerBlock PURPLE_HYACINTH;
	public static final FlowerBlock PURPLE_PANSY;
	public static final FlowerBlock RED_HYACINTH;
	public static final FlowerBlock RED_ROSE;
	public static final FlowerBlock WHITE_HYACINTH;
	public static final FlowerBlock WHITE_POPPY;
	public static final FlowerBlock WHITE_ROSE;
	public static final FlowerBlock YELLOW_HYACINTH;
	public static final FlowerBlock YELLOW_PANSY;
	public static final FlowerBlock YELLOW_POPPY;
	public static final FlowerBlock YELLOW_ROSE;

	public static final FlowerPotBlock POTTED_AMARYLLIS;
	public static final FlowerPotBlock POTTED_BEGONIA;
	public static final FlowerPotBlock POTTED_BELLFLOWER;
	public static final FlowerPotBlock POTTED_BLACK_ROSE;
	public static final FlowerPotBlock POTTED_BUTTERCUP;
	public static final FlowerPotBlock POTTED_CAMELIA;
	public static final FlowerPotBlock POTTED_CARNATION;
	public static final FlowerPotBlock POTTED_CROCUS;
	public static final FlowerPotBlock POTTED_CYAN_ROSE;
	public static final FlowerPotBlock POTTED_DAFFODIL;
	public static final FlowerPotBlock POTTED_DAHLIA;
	public static final FlowerPotBlock POTTED_FORGET_ME_NOT;
	public static final FlowerPotBlock POTTED_HIBISCUS;
	public static final FlowerPotBlock POTTED_HOLLYHOCK;
	public static final FlowerPotBlock POTTED_HYDRANGEA;
	public static final FlowerPotBlock POTTED_IRIS;
	public static final FlowerPotBlock POTTED_LAVENDER;
	public static final FlowerPotBlock POTTED_MAGNOLIA;
	public static final FlowerPotBlock POTTED_MARIGOLD;
	public static final FlowerPotBlock POTTED_PEONY;
	public static final FlowerPotBlock POTTED_PINK_DAISY;
	public static final FlowerPotBlock POTTED_PINK_HYACINTH;
	public static final FlowerPotBlock POTTED_PINK_ROSE;
	public static final FlowerPotBlock POTTED_PRIMROSE;
	public static final FlowerPotBlock POTTED_PURPLE_HYACINTH;
	public static final FlowerPotBlock POTTED_PURPLE_PANSY;
	public static final FlowerPotBlock POTTED_RED_HYACINTH;
	public static final FlowerPotBlock POTTED_RED_ROSE;
	public static final FlowerPotBlock POTTED_WHITE_HYACINTH;
	public static final FlowerPotBlock POTTED_WHITE_POPPY;
	public static final FlowerPotBlock POTTED_WHITE_ROSE;
	public static final FlowerPotBlock POTTED_YELLOW_HYACINTH;
	public static final FlowerPotBlock POTTED_YELLOW_PANSY;
	public static final FlowerPotBlock POTTED_YELLOW_POPPY;
	public static final FlowerPotBlock POTTED_YELLOW_ROSE;

	public static final FlowerBushBlock BLACK_ROSE_BUSH;
	public static final FlowerBushBlock CYAN_ROSE_BUSH;
	public static final FlowerBushBlock PINK_ROSE_BUSH;
	public static final FlowerBushBlock WHITE_ROSE_BUSH;
	public static final FlowerBushBlock YELLOW_ROSE_BUSH;
	public static final BareFlowerBushBlock BARE_RED_ROSE_BUSH;
	public static final BareFlowerBushBlock BARE_PEONY_BUSH;
	public static BareFlowerBushBlock BARE_BLACK_ROSE_BUSH;
	public static BareFlowerBushBlock BARE_CYAN_ROSE_BUSH;
	public static BareFlowerBushBlock BARE_PINK_ROSE_BUSH;
	public static BareFlowerBushBlock BARE_WHITE_ROSE_BUSH;
	public static BareFlowerBushBlock BARE_YELLOW_ROSE_BUSH;
	
	static {
		STEW_EFFECT_DURATIONS.put(StatusEffects.INSTANT_DAMAGE, 1);
		STEW_EFFECT_DURATIONS.put(StatusEffects.INSTANT_HEALTH, 1);
		STEW_EFFECT_DURATIONS.put(StatusEffects.NAUSEA, 2);
		STEW_EFFECT_DURATIONS.put(StatusEffects.BAD_OMEN, 4);
		STEW_EFFECT_DURATIONS.put(StatusEffects.LUCK, 4);
		STEW_EFFECT_DURATIONS.put(StatusEffects.UNLUCK, 4);
		STEW_EFFECT_DURATIONS.put(StatusEffects.FIRE_RESISTANCE, 4);
		STEW_EFFECT_DURATIONS.put(StatusEffects.RESISTANCE, 4);
		STEW_EFFECT_DURATIONS.put(StatusEffects.WATER_BREATHING, 4);
		STEW_EFFECT_DURATIONS.put(StatusEffects.GLOWING, 5);
		STEW_EFFECT_DURATIONS.put(StatusEffects.NIGHT_VISION, 5);
		STEW_EFFECT_DURATIONS.put(StatusEffects.HASTE, 5);
		STEW_EFFECT_DURATIONS.put(StatusEffects.MINING_FATIGUE, 5);
		STEW_EFFECT_DURATIONS.put(StatusEffects.INVISIBILITY, 5);
		STEW_EFFECT_DURATIONS.put(StatusEffects.JUMP_BOOST, 6);
		STEW_EFFECT_DURATIONS.put(StatusEffects.SLOW_FALLING, 6);
		STEW_EFFECT_DURATIONS.put(StatusEffects.LEVITATION, 6);
		STEW_EFFECT_DURATIONS.put(StatusEffects.SATURATION, 7);
		STEW_EFFECT_DURATIONS.put(StatusEffects.HUNGER, 7);
		STEW_EFFECT_DURATIONS.put(StatusEffects.ABSORPTION, 7);
		STEW_EFFECT_DURATIONS.put(StatusEffects.REGENERATION, 8);
		STEW_EFFECT_DURATIONS.put(StatusEffects.BLINDNESS, 8);
		STEW_EFFECT_DURATIONS.put(StatusEffects.WITHER, 8);
		STEW_EFFECT_DURATIONS.put(StatusEffects.STRENGTH, 9);
		STEW_EFFECT_DURATIONS.put(StatusEffects.WEAKNESS, 9);
		STEW_EFFECT_DURATIONS.put(StatusEffects.SPEED, 10);
		STEW_EFFECT_DURATIONS.put(StatusEffects.SLOWNESS, 10);
		STEW_EFFECT_DURATIONS.put(StatusEffects.POISON, 12);
		STEW_EFFECT_DURATIONS.put(StatusEffects.DARKNESS, 12);

		AMARYLLIS = createFlowerBlock(StatusEffects.GLOWING);
		BEGONIA = createFlowerBlock(StatusEffects.BAD_OMEN);
		BELLFLOWER = createFlowerBlock(StatusEffects.REGENERATION);
		BLACK_ROSE = createFlowerBlock(StatusEffects.DARKNESS);
		BUTTERCUP = createFlowerBlock(StatusEffects.LUCK);
		CAMELIA = createFlowerBlock(StatusEffects.STRENGTH);
		CARNATION = createFlowerBlock(StatusEffects.REGENERATION);
		CROCUS = createFlowerBlock(StatusEffects.JUMP_BOOST);
		CYAN_ROSE = createFlowerBlock(StatusEffects.DARKNESS);
		DAHLIA = createFlowerBlock(StatusEffects.FIRE_RESISTANCE);
		DAFFODIL = createFlowerBlock(StatusEffects.BLINDNESS);
		FORGET_ME_NOT = createFlowerBlock(StatusEffects.NAUSEA);
		HIBISCUS = createFlowerBlock(StatusEffects.WEAKNESS);
		HOLLYHOCK = createFlowerBlock(StatusEffects.SATURATION);
		HYDRANGEA = createFlowerBlock(StatusEffects.STRENGTH);
		IRIS = createFlowerBlock(StatusEffects.LEVITATION);
		LAVENDER = createFlowerBlock(StatusEffects.INSTANT_HEALTH);
		MAGNOLIA = createFlowerBlock(StatusEffects.HASTE);
		MARIGOLD = createFlowerBlock(StatusEffects.INSTANT_DAMAGE);
		PEONY = createFlowerBlock(StatusEffects.LUCK);
		PINK_DAISY = createFlowerBlock(StatusEffects.REGENERATION);
		PINK_HYACINTH = createFlowerBlock(StatusEffects.SLOW_FALLING);
		PINK_ROSE = createFlowerBlock(StatusEffects.RESISTANCE);
		PRIMROSE = createFlowerBlock(StatusEffects.REGENERATION);
		PURPLE_HYACINTH = createFlowerBlock(StatusEffects.SLOW_FALLING);
		PURPLE_PANSY = createFlowerBlock(StatusEffects.NIGHT_VISION);
		RED_HYACINTH = createFlowerBlock(StatusEffects.SLOW_FALLING);
		RED_ROSE = createFlowerBlock(StatusEffects.RESISTANCE);
		WHITE_HYACINTH = createFlowerBlock(StatusEffects.SLOW_FALLING);
		WHITE_POPPY = createFlowerBlock(StatusEffects.NIGHT_VISION);
		WHITE_ROSE = createFlowerBlock(StatusEffects.RESISTANCE);
		YELLOW_HYACINTH = createFlowerBlock(StatusEffects.SLOW_FALLING);
		YELLOW_PANSY = createFlowerBlock(StatusEffects.NIGHT_VISION);
		YELLOW_POPPY = createFlowerBlock(StatusEffects.NIGHT_VISION);
		YELLOW_ROSE = createFlowerBlock(StatusEffects.RESISTANCE);

		POTTED_AMARYLLIS = createPotBlock(AMARYLLIS);
		POTTED_BEGONIA = createPotBlock(BEGONIA);
		POTTED_BELLFLOWER = createPotBlock(BELLFLOWER);
		POTTED_BUTTERCUP = createPotBlock(BUTTERCUP);
		POTTED_BLACK_ROSE = createPotBlock(BLACK_ROSE);
		POTTED_CAMELIA = createPotBlock(CAMELIA);
		POTTED_CARNATION = createPotBlock(CARNATION);
		POTTED_CROCUS = createPotBlock(CROCUS);
		POTTED_CYAN_ROSE = createPotBlock(CYAN_ROSE);
		POTTED_DAFFODIL = createPotBlock(DAFFODIL);
		POTTED_DAHLIA = createPotBlock(DAHLIA);
		POTTED_FORGET_ME_NOT = createPotBlock(FORGET_ME_NOT);
		POTTED_HIBISCUS = createPotBlock(HIBISCUS);
		POTTED_HOLLYHOCK = createPotBlock(HOLLYHOCK);
		POTTED_HYDRANGEA = createPotBlock(HYDRANGEA);
		POTTED_IRIS = createPotBlock(IRIS);
		POTTED_LAVENDER = createPotBlock(LAVENDER);
		POTTED_MAGNOLIA = createPotBlock(MAGNOLIA);
		POTTED_MARIGOLD = createPotBlock(MARIGOLD);
		POTTED_PEONY = createPotBlock(PEONY);
		POTTED_PINK_DAISY = createPotBlock(PINK_DAISY);
		POTTED_PINK_HYACINTH = createPotBlock(PINK_HYACINTH);
		POTTED_PINK_ROSE = createPotBlock(PINK_ROSE);
		POTTED_PRIMROSE = createPotBlock(PRIMROSE);
		POTTED_PURPLE_HYACINTH = createPotBlock(PURPLE_HYACINTH);
		POTTED_PURPLE_PANSY = createPotBlock(PURPLE_PANSY);
		POTTED_RED_HYACINTH = createPotBlock(RED_HYACINTH);
		POTTED_RED_ROSE = createPotBlock(RED_ROSE);
		POTTED_WHITE_HYACINTH = createPotBlock(WHITE_HYACINTH);
		POTTED_WHITE_POPPY = createPotBlock(WHITE_POPPY);
		POTTED_WHITE_ROSE = createPotBlock(WHITE_ROSE);
		POTTED_YELLOW_HYACINTH = createPotBlock(YELLOW_HYACINTH);
		POTTED_YELLOW_PANSY = createPotBlock(YELLOW_PANSY);
		POTTED_YELLOW_POPPY = createPotBlock(YELLOW_POPPY);
		POTTED_YELLOW_ROSE = createPotBlock(YELLOW_ROSE);

		BLACK_ROSE_BUSH = new FlowerBushBlock(() -> BARE_BLACK_ROSE_BUSH, BLACK_ROSE, createFlowerBushSettings());
		CYAN_ROSE_BUSH = new FlowerBushBlock(() -> BARE_CYAN_ROSE_BUSH, CYAN_ROSE, createFlowerBushSettings());
		PINK_ROSE_BUSH = new FlowerBushBlock(() -> BARE_PINK_ROSE_BUSH, PINK_ROSE, createFlowerBushSettings());
		WHITE_ROSE_BUSH = new FlowerBushBlock(() -> BARE_WHITE_ROSE_BUSH, WHITE_ROSE, createFlowerBushSettings());
		YELLOW_ROSE_BUSH = new FlowerBushBlock(() -> BARE_YELLOW_ROSE_BUSH, YELLOW_ROSE, createFlowerBushSettings());

		BARE_BLACK_ROSE_BUSH = new BareFlowerBushBlock(BLACK_ROSE_BUSH, createFlowerBushSettings());
		BARE_CYAN_ROSE_BUSH = new BareFlowerBushBlock(CYAN_ROSE_BUSH, createFlowerBushSettings());
		BARE_PEONY_BUSH = new BareFlowerBushBlock(Blocks.PEONY, createFlowerBushSettings());
		BARE_PINK_ROSE_BUSH = new BareFlowerBushBlock(PINK_ROSE_BUSH, createFlowerBushSettings());
		BARE_RED_ROSE_BUSH = new BareFlowerBushBlock(Blocks.ROSE_BUSH, createFlowerBushSettings());
		BARE_WHITE_ROSE_BUSH = new BareFlowerBushBlock(WHITE_ROSE_BUSH, createFlowerBushSettings());
		BARE_YELLOW_ROSE_BUSH = new BareFlowerBushBlock(YELLOW_ROSE_BUSH, createFlowerBushSettings());
	}

	public static void init() {
		registerFlowerAndPot("amaryllis", AMARYLLIS, POTTED_AMARYLLIS);
		registerFlowerAndPot("begonia", BEGONIA, POTTED_BEGONIA);
		registerFlowerAndPot("bellflower", BELLFLOWER, POTTED_BELLFLOWER);
		registerFlowerAndPot("buttercup", BUTTERCUP, POTTED_BUTTERCUP);
		registerFlowerAndPot("black_rose", BLACK_ROSE, POTTED_BLACK_ROSE);
		registerFlowerAndPot("camelia", CAMELIA, POTTED_CAMELIA);
		registerFlowerAndPot("carnation", CARNATION, POTTED_CARNATION);
		registerFlowerAndPot("crocus", CROCUS, POTTED_CROCUS);
		registerFlowerAndPot("cyan_rose", CYAN_ROSE, POTTED_CYAN_ROSE);
		registerFlowerAndPot("daffodil", DAFFODIL, POTTED_DAFFODIL);
		registerFlowerAndPot("dahlia", DAHLIA, POTTED_DAHLIA);
		registerFlowerAndPot("forget_me_not", FORGET_ME_NOT, POTTED_FORGET_ME_NOT);
		registerFlowerAndPot("hibiscus", HIBISCUS, POTTED_HIBISCUS);
		registerFlowerAndPot("hollyhock", HOLLYHOCK, POTTED_HOLLYHOCK);
		registerFlowerAndPot("hydrangea", HYDRANGEA, POTTED_HYDRANGEA);
		registerFlowerAndPot("iris", IRIS, POTTED_IRIS);
		registerFlowerAndPot("lavender", LAVENDER, POTTED_LAVENDER);
		registerFlowerAndPot("magnolia", MAGNOLIA, POTTED_MAGNOLIA);
		registerFlowerAndPot("marigold", MARIGOLD, POTTED_MARIGOLD);
		registerFlowerAndPot("peony", PEONY, POTTED_PEONY);
		registerFlowerAndPot("pink_daisy", PINK_DAISY, POTTED_PINK_DAISY);
		registerFlowerAndPot("pink_hyacinth", PINK_HYACINTH, POTTED_PINK_HYACINTH);
		registerFlowerAndPot("pink_rose", PINK_ROSE, POTTED_PINK_ROSE);
		registerFlowerAndPot("primrose", PRIMROSE, POTTED_PRIMROSE);
		registerFlowerAndPot("purple_hyacinth", PURPLE_HYACINTH, POTTED_PURPLE_HYACINTH);
		registerFlowerAndPot("purple_pansy", PURPLE_PANSY, POTTED_PURPLE_PANSY);
		registerFlowerAndPot("red_hyacinth", RED_HYACINTH, POTTED_RED_HYACINTH);
		registerFlowerAndPot("red_rose", RED_ROSE, POTTED_RED_ROSE);
		registerFlowerAndPot("white_hyacinth", WHITE_HYACINTH, POTTED_WHITE_HYACINTH);
		registerFlowerAndPot("white_poppy", WHITE_POPPY, POTTED_WHITE_POPPY);
		registerFlowerAndPot("white_rose", WHITE_ROSE, POTTED_WHITE_ROSE);
		registerFlowerAndPot("yellow_hyacinth", YELLOW_HYACINTH, POTTED_YELLOW_HYACINTH);
		registerFlowerAndPot("yellow_pansy", YELLOW_PANSY, POTTED_YELLOW_PANSY);
		registerFlowerAndPot("yellow_poppy", YELLOW_POPPY, POTTED_YELLOW_POPPY);
		registerFlowerAndPot("yellow_rose", YELLOW_ROSE, POTTED_YELLOW_ROSE);

		register("black_rose_bush", BLACK_ROSE_BUSH);
		register("cyan_rose_bush", CYAN_ROSE_BUSH);
		register("pink_rose_bush", PINK_ROSE_BUSH);
		register("white_rose_bush", WHITE_ROSE_BUSH);
		register("yellow_rose_bush", YELLOW_ROSE_BUSH);

		register("bare_black_rose_bush", BARE_BLACK_ROSE_BUSH);
		register("bare_cyan_rose_bush", BARE_CYAN_ROSE_BUSH);
		register("bare_peony_bush", BARE_PEONY_BUSH);
		register("bare_pink_rose_bush", BARE_PINK_ROSE_BUSH);
		register("bare_red_rose_bush", BARE_RED_ROSE_BUSH);
		register("bare_white_rose_bush", BARE_WHITE_ROSE_BUSH);
		register("bare_yellow_rose_bush", BARE_YELLOW_ROSE_BUSH);
	}
	
	static FlowerBlock createFlowerBlock(StatusEffect stewEffect) {
		return new FlowerBlock(stewEffect, STEW_EFFECT_DURATIONS.getOrDefault(stewEffect, 1), createFlowerSettings());
	}
	
	static FlowerPotBlock createPotBlock(FlowerBlock flower) {
		return new FlowerPotBlock(flower, createPotSettings());
	}
	
	static FabricBlockSettings createFlowerSettings() {
		return FabricBlockSettings.copyOf(Blocks.POPPY);
	}

	static FabricBlockSettings createPotSettings() {
		return FabricBlockSettings.copyOf(Blocks.POTTED_POPPY);
	}

	static FabricBlockSettings createFlowerBushSettings() {
		return FabricBlockSettings.copyOf(Blocks.ROSE_BUSH);
	}

	static void registerFlowerAndPot(String name, FlowerBlock flower, FlowerPotBlock pot) {
		register(name, flower);
		register(POTTED_PREFIX+name, pot, (BlockItem) null);
	}

	static <T extends Block> T register(String name, T block, Item.Settings settings) {
		return register(name, block, new BlockItem(block, settings));
	}

	static <T extends Block> T register(String name, T block) {
		return register(name, block, new Item.Settings().group(ItemGroup.DECORATIONS));
	}

	static <T extends Block> T register(String name, T block, BlockItem item) {
		T b = Registry.register(Registry.BLOCK, Bouquet.id(name), block);
		if (item != null) {
			Registry.register(Registry.ITEM, Bouquet.id(name), item);
			Item.BLOCK_ITEMS.put(item.getBlock(), item);
		}
		return b;
	}
}
