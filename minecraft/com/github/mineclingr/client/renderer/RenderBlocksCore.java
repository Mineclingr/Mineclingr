package com.github.mineclingr.client.renderer;

import com.github.mineclingr.block.BlockCore;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;
import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class RenderBlocksCore implements ISimpleBlockRenderingHandler {
	
	public static RenderBlocksCore instance;
	

	
	private int typeId;
	
	public static void RenderBlocksInit(int renderTypeId) {
		instance = new RenderBlocksCore(renderTypeId);
		RenderingRegistry.registerBlockHandler(instance);
	}
	
	public RenderBlocksCore(int renderTypeId) {
		typeId = renderTypeId;
	}

	@Override
	public void renderInventoryBlock(Block block, int metadata, int modelID, RenderBlocks renderer) {
		RenderBlocksScaffold.renderInventoryBlock(block, metadata, modelID, renderer);
	}

	@Override
	public boolean renderWorldBlock(IBlockAccess world, int x, int y, int z, Block block, int modelId, RenderBlocks renderer) {
		return RenderBlocksScaffold.renderBlock(world, x, y, z, block, modelId, renderer);
	}

	@Override
	public boolean shouldRender3DInInventory() {
		return true;
	}

	@Override
	public int getRenderId() {
		return typeId;
	}
}
