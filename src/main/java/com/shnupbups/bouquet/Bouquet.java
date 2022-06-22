package com.shnupbups.bouquet;

import java.util.ArrayList;
import java.util.Arrays;

import javax.annotation.Nullable;

import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.player.UseBlockCallback;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.fabricmc.fabric.api.registry.CompostingChanceRegistry;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.TallPlantBlock;
import net.minecraft.block.enums.DoubleBlockHalf;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ShearsItem;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvent;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.village.TradeOffers;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.event.GameEvent;

import com.shnupbups.bouquet.init.BouquetBlocks;

public class Bouquet implements ModInitializer {
	public static final String MOD_ID = "bouquet";

	public static final Logger LOGGER = LogUtils.getLogger();

	public static final Identifier SHEAR_FLOWER_BUSH_SOUND_EVENT_ID = id("block.flower_bush.shear");
	public static final SoundEvent SHEAR_FLOWER_BUSH_SOUND_EVENT = new SoundEvent(SHEAR_FLOWER_BUSH_SOUND_EVENT_ID);

	public static final int FLOWER_FIRE_BURN_CHANCE = 60;
	public static final int FLOWER_FIRE_SPREAD_CHANCE = 100;

	public static final float FLOWER_COMPOSTING_CHANCE = 0.65f;

	public static final int FLOWER_TRADE_PRICE = 1;
	public static final int FLOWER_TRADE_AMOUNT = 1;
	public static final int FLOWER_TRADE_MAX_USES = 12;
	public static final int FLOWER_TRADE_EXPERIENCE = 1;

	public static final int SHEAR_FLOWER_BUSH_DROPS_MIN = 4;
	public static final int SHEAR_FLOWER_BUSH_DROPS_MAX = 8;

	@Override
	public void onInitialize() {
		BouquetBlocks.init();

		Registry.register(Registry.SOUND_EVENT, SHEAR_FLOWER_BUSH_SOUND_EVENT_ID, SHEAR_FLOWER_BUSH_SOUND_EVENT);

		FlammableBlockRegistry flammableBlockRegistry = FlammableBlockRegistry.getDefaultInstance();
		ArrayList<TradeOffers.Factory> wanderingTraderTradesOne = new ArrayList<>();
		BouquetCollections.SMALL_BOUQUET_FLOWERS.forEach(block -> {
			flammableBlockRegistry.add(block, FLOWER_FIRE_BURN_CHANCE, FLOWER_FIRE_SPREAD_CHANCE);
			CompostingChanceRegistry.INSTANCE.add(block, FLOWER_COMPOSTING_CHANCE);
			wanderingTraderTradesOne.add(new TradeOffers.SellItemFactory(block, FLOWER_TRADE_PRICE, FLOWER_TRADE_AMOUNT, FLOWER_TRADE_MAX_USES, FLOWER_TRADE_EXPERIENCE));
		});
		TradeOfferHelper.registerWanderingTraderOffers(1, factories -> factories.addAll(wanderingTraderTradesOne));
		BouquetCollections.TALL_BOUQUET_FLOWERS.forEach(block -> {
			flammableBlockRegistry.add(block, FLOWER_FIRE_BURN_CHANCE, FLOWER_FIRE_SPREAD_CHANCE);
			CompostingChanceRegistry.INSTANCE.add(block, FLOWER_COMPOSTING_CHANCE);
		});
		BouquetCollections.BARE_FLOWER_BUSHES.forEach(block -> {
			flammableBlockRegistry.add(block, FLOWER_FIRE_BURN_CHANCE, FLOWER_FIRE_SPREAD_CHANCE);
			CompostingChanceRegistry.INSTANCE.add(block, FLOWER_COMPOSTING_CHANCE);
		});

		UseBlockCallback.EVENT.register(((player, world, hand, hitResult) -> {
			BlockPos pos = hitResult.getBlockPos();
			if(world.isClient() || player.isSpectator() || !player.canModifyBlocks() || !world.canPlayerModifyAt(player, pos)) return ActionResult.PASS;
			BlockState state = world.getBlockState(pos);
			ItemStack stack = player.getStackInHand(hand);
			if(stack.getItem() instanceof ShearsItem && state.isIn(BouquetTags.BouquetBlockTags.FLOWERING_BUSHES)) {
				if(tryShearVanillaBush(world, state, pos, stack, player)) return ActionResult.SUCCESS;
			}
			return ActionResult.PASS;
		}));
	}

	public static boolean tryShearVanillaBush(World world, BlockState state, BlockPos pos, @Nullable ItemStack shears, @Nullable PlayerEntity player) {
		if(state.isOf(Blocks.ROSE_BUSH)) {
			shearFlowerBush(world, state, pos, shears, player, BouquetBlocks.BARE_RED_ROSE_BUSH, BouquetBlocks.RED_ROSE);
			return true;
		} else if(state.isOf(Blocks.PEONY)) {
			shearFlowerBush(world, state, pos, shears, player, BouquetBlocks.BARE_PEONY_BUSH, BouquetBlocks.PEONY);
			return true;
		}
		return false;
	}

	public static void convertDoubleTallPlant(Block newBlock, WorldAccess world, BlockState usedState, BlockPos usedPos) {
		DoubleBlockHalf grownHalf = usedState.get(Properties.DOUBLE_BLOCK_HALF);
		BlockPos bottomHalfPos = switch(grownHalf) {
			case LOWER -> usedPos;
			case UPPER -> usedPos.down();
		};
		BlockState bottomHalfState = world.getBlockState(bottomHalfPos);
		TallPlantBlock.placeAt(world, newBlock.getStateWithProperties(bottomHalfState), bottomHalfPos, Block.FORCE_STATE | Block.NOTIFY_ALL);
	}

	public static void shearFlowerBush(World world, BlockState state, BlockPos pos, @Nullable ItemStack shears, @Nullable PlayerEntity player, Block bareRoseBush, Block singleFlower) {
		if(!state.isIn(BouquetTags.BouquetBlockTags.FLOWERING_BUSHES)) return;
		convertDoubleTallPlant(bareRoseBush, world, state, pos);
		ServerPlayerEntity serverPlayer = player instanceof ServerPlayerEntity ? (ServerPlayerEntity) player : null;
		if(shears != null) shears.damage(1, world.getRandom(), serverPlayer);
		Block.dropStack(world, pos, new ItemStack(singleFlower, world.getRandom().nextBetween(SHEAR_FLOWER_BUSH_DROPS_MIN, SHEAR_FLOWER_BUSH_DROPS_MAX)));
		world.playSound(null, pos, SHEAR_FLOWER_BUSH_SOUND_EVENT, SoundCategory.BLOCKS, 1.0f, 1.0f);
		world.emitGameEvent(player, GameEvent.SHEAR, pos);
	}

	public static Identifier id(String id) {
		return new Identifier(MOD_ID, id);
	}
}
