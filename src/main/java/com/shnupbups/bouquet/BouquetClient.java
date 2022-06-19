package com.shnupbups.bouquet;

import net.minecraft.block.Block;
import net.minecraft.client.render.RenderLayer;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;

public class BouquetClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), BouquetCollections.SMALL_BOUQUET_FLOWERS.toArray(new Block[0]));
		BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), BouquetCollections.POTTED_BOUQUET_FLOWERS.toArray(new Block[0]));
		BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), BouquetCollections.TALL_BOUQUET_FLOWERS.toArray(new Block[0]));
		BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), BouquetCollections.BARE_FLOWER_BUSHES.toArray(new Block[0]));
	}
}
