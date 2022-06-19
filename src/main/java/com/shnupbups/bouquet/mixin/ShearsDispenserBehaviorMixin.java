package com.shnupbups.bouquet.mixin;

import net.minecraft.block.BlockState;
import net.minecraft.block.dispenser.ShearsDispenserBehavior;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import com.shnupbups.bouquet.Bouquet;
import com.shnupbups.bouquet.BouquetTags;
import com.shnupbups.bouquet.block.FlowerBushBlock;

@Mixin(ShearsDispenserBehavior.class)
public class ShearsDispenserBehaviorMixin {
	@Inject(method = "tryShearBlock(Lnet/minecraft/server/world/ServerWorld;Lnet/minecraft/util/math/BlockPos;)Z", at = @At("HEAD"), cancellable = true)
	private static void tryShearRoseBush(ServerWorld world, BlockPos pos, CallbackInfoReturnable<Boolean> cir) {
		BlockState state = world.getBlockState(pos);
		if(state.isIn(BouquetTags.BouquetBlockTags.FLOWERING_BUSHES)) {
			if(state.getBlock() instanceof FlowerBushBlock flowerBushBlock) {
				flowerBushBlock.shear(world, state, pos, null, null);
				cir.setReturnValue(true);
			} else if(Bouquet.tryShearVanillaBush(world, state, pos, null, null)) {
				cir.setReturnValue(true);
			}
		}
	}
}
