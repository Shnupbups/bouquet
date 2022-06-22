package com.shnupbups.bouquet.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.TallFlowerBlock;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;

import com.shnupbups.bouquet.Bouquet;

public class BareFlowerBushBlock extends TallFlowerBlock {
	public final Block floweringBush;

	public BareFlowerBushBlock(Block floweringBush, Settings settings) {
		super(settings);
		this.floweringBush = floweringBush;
	}

	public Block getFloweringBush() {
		return floweringBush;
	}

	@Override
	public void grow(ServerWorld world, Random random, BlockPos pos, BlockState state) {
		Bouquet.convertDoubleTallPlant(getFloweringBush(), world, state, pos);
	}
}
