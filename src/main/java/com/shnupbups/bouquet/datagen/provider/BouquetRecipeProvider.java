package com.shnupbups.bouquet.datagen.provider;

import java.util.function.Consumer;

import org.jetbrains.annotations.Nullable;

import net.minecraft.data.server.RecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.tag.TagKey;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;

import com.shnupbups.bouquet.BouquetTags;

public class BouquetRecipeProvider extends FabricRecipeProvider {
	public BouquetRecipeProvider(FabricDataGenerator dataGenerator) {
		super(dataGenerator);
	}

	@Override
	protected void generateRecipes(Consumer<RecipeJsonProvider> exporter) {
		offerSmallFlowerToDyeRecipe(exporter, Items.BLUE_DYE, BouquetTags.BouquetItemTags.SMALL_BLUE_FLOWERS, "blue_dye");
		offerSmallFlowerToDyeRecipe(exporter, Items.BLACK_DYE, BouquetTags.BouquetItemTags.SMALL_BLACK_FLOWERS, "black_dye");
		offerSmallFlowerToDyeRecipe(exporter, Items.CYAN_DYE, BouquetTags.BouquetItemTags.SMALL_CYAN_FLOWERS, "cyan_dye");
		offerSmallFlowerToDyeRecipe(exporter, Items.LIGHT_BLUE_DYE, BouquetTags.BouquetItemTags.SMALL_LIGHT_BLUE_FLOWERS, "light_blue_dye");
		offerSmallFlowerToDyeRecipe(exporter, Items.LIGHT_GRAY_DYE, BouquetTags.BouquetItemTags.SMALL_LIGHT_GRAY_FLOWERS, "light_gray_dye");
		offerSmallFlowerToDyeRecipe(exporter, Items.MAGENTA_DYE, BouquetTags.BouquetItemTags.SMALL_MAGENTA_FLOWERS, "magenta_dye");
		offerSmallFlowerToDyeRecipe(exporter, Items.ORANGE_DYE, BouquetTags.BouquetItemTags.SMALL_ORANGE_FLOWERS, "orange_dye");
		offerSmallFlowerToDyeRecipe(exporter, Items.PINK_DYE, BouquetTags.BouquetItemTags.SMALL_PINK_FLOWERS, "pink_dye");
		offerSmallFlowerToDyeRecipe(exporter, Items.PURPLE_DYE, BouquetTags.BouquetItemTags.SMALL_PURPLE_FLOWERS, "purple_dye");
		offerSmallFlowerToDyeRecipe(exporter, Items.RED_DYE, BouquetTags.BouquetItemTags.SMALL_RED_FLOWERS, "red_dye");
		offerSmallFlowerToDyeRecipe(exporter, Items.WHITE_DYE, BouquetTags.BouquetItemTags.SMALL_WHITE_FLOWERS, "white_dye");
		offerSmallFlowerToDyeRecipe(exporter, Items.YELLOW_DYE, BouquetTags.BouquetItemTags.SMALL_YELLOW_FLOWERS, "yellow_dye");

		offerTallFlowerToDyeRecipe(exporter, Items.BLACK_DYE, BouquetTags.BouquetItemTags.TALL_BLACK_FLOWERS, "black_dye");
		offerTallFlowerToDyeRecipe(exporter, Items.CYAN_DYE, BouquetTags.BouquetItemTags.TALL_CYAN_FLOWERS, "cyan_dye");
		offerTallFlowerToDyeRecipe(exporter, Items.MAGENTA_DYE, BouquetTags.BouquetItemTags.TALL_MAGENTA_FLOWERS, "magenta_dye");
		offerTallFlowerToDyeRecipe(exporter, Items.PINK_DYE, BouquetTags.BouquetItemTags.TALL_PINK_FLOWERS, "pink_dye");
		offerTallFlowerToDyeRecipe(exporter, Items.RED_DYE, BouquetTags.BouquetItemTags.TALL_RED_FLOWERS, "red_dye");
		offerTallFlowerToDyeRecipe(exporter, Items.WHITE_DYE, BouquetTags.BouquetItemTags.TALL_WHITE_FLOWERS, "white_dye");
		offerTallFlowerToDyeRecipe(exporter, Items.YELLOW_DYE, BouquetTags.BouquetItemTags.TALL_YELLOW_FLOWERS, "yellow_dye");
	}

	public static void offerSmallFlowerToDyeRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible output, TagKey<Item> input, @Nullable String group) {
		offerFlowerToDyeRecipe(exporter, output, input, group, 1);
	}

	public static void offerTallFlowerToDyeRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible output, TagKey<Item> input, @Nullable String group) {
		offerFlowerToDyeRecipe(exporter, output, input, group, 2);
	}

	public static void offerFlowerToDyeRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible output, TagKey<Item> input, @Nullable String group, int outputCount) {
		ShapelessRecipeJsonBuilder.create(output, outputCount).input(input).group(group).criterion("has_"+input.id().getPath(), RecipeProvider.conditionsFromTag(input)).offerTo(exporter, RecipeProvider.getItemPath(output)+"_from_"+input.id().getPath());
	}
}
