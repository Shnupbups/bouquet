package com.shnupbups.bouquet.block;

import java.util.function.Supplier;

import javax.annotation.Nullable;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.TallFlowerBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ShearsItem;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import com.shnupbups.bouquet.Bouquet;

public class FlowerBushBlock extends TallFlowerBlock {
	public final Supplier<Block> bareBushSupplier;
	public final Block singleFlower;

	public FlowerBushBlock(Supplier<Block> bareBushSupplier, Block singleFlower, Settings settings) {
		super(settings);
		this.bareBushSupplier = bareBushSupplier;
		this.singleFlower = singleFlower;
	}

	public Block getBareBush() {
		return bareBushSupplier.get();
	}

	public Block getSingleFlower() {
		return singleFlower;
	}

	public void shear(World world, BlockState state, BlockPos pos, @Nullable ItemStack shears, @Nullable PlayerEntity player) {
		Bouquet.shearFlowerBush(world, state, pos, shears, player, getBareBush(), getSingleFlower());
	}

	@Override
	public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hitResult) {
		if(world.isClient() || player.isSpectator() || !player.canModifyBlocks() || !world.canPlayerModifyAt(player, pos)) return ActionResult.PASS;
		ItemStack stack = player.getStackInHand(hand);
		if(stack.getItem() instanceof ShearsItem) {
			shear(world, state, pos, stack, player);
			return ActionResult.SUCCESS;
		}
		return super.onUse(state, world, pos, player, hand, hitResult);
	}
}
