package com.github.mineclingr.client.renderer;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;

public class RenderBlocksScaffold {
	public static void renderInventoryBlock(Block block, int metadata, int modelID, RenderBlocks renderer) {
		Tessellator tessellator = Tessellator.instance;
        tessellator.startDrawingQuads();
        tessellator.setNormal(0.0F, -1.0F, 0.0F);
        renderer.drawCrossedSquares(block, metadata, -0.5D, -0.5D, -0.5D, 1.0F);
        tessellator.draw();
	}
	
	public static boolean renderBlock(IBlockAccess world, int x, int y, int z, Block block, int modelId, RenderBlocks renderer) {
		if(modelId == 300) {
			Tessellator tessellator = Tessellator.instance;
			Icon icon;
			
			double xd = (double)x;
			double yd = (double)y;
			double zd = (double)z;
			
	        double ujm = 0.000244140625D;
	        double thick = 0.0625D;
	        
	        float f = 1.0F;
	        
			tessellator.setColorOpaque_F(f, f, f);
			
			tessellator.setBrightness(block.getMixedBrightnessForBlock(renderer.blockAccess, x, y, z));
			
			for(int i=0;i<16;++i) {
				icon = renderer.getBlockIconFromSideAndMetadata(block, i, world.getBlockMetadata(x, y, z));
				if (icon == null) {
					break;
				}
			
				
		        double texSU = (double)icon.getMinU();
		        double texSV = (double)icon.getMinV();
		        double texXU = (double)icon.getMaxU();
		        double texXV = (double)icon.getMaxV();
		        
				switch(i) {
				case 0:
		            tessellator.addVertexWithUV(xd + 0.0D, yd + 1.0D, zd + 0.0D, texSU, texSV);
		            tessellator.addVertexWithUV(xd + 0.0D, yd + 0.0D, zd + 0.0D, texSU, texXV);
		            tessellator.addVertexWithUV(xd + 0.0D, yd + 0.0D, zd + 1.0D, texXU, texXV);
		            tessellator.addVertexWithUV(xd + 0.0D, yd + 1.0D, zd + 1.0D, texXU, texSV);
//				case 1:
//		            tessellator.addVertexWithUV(xd + 1.0D, yd + 1.0D, zd + 1.0D, texSU, texSV);
//		            tessellator.addVertexWithUV(xd + 1.0D, yd + 0.0D, zd + 1.0D, texSU, texXV);
//		            tessellator.addVertexWithUV(xd + 1.0D, yd + 0.0D, zd + 1.0D, texXU, texXV);
//		            tessellator.addVertexWithUV(xd + 1.0D, yd + 1.0D, zd + 1.0D, texXU, texSV);
//				case 2:
//		            tessellator.addVertexWithUV(xd + 1.0D, yd + 1.0D, zd + 0.0D, texSU, texSV);
//		            tessellator.addVertexWithUV(xd + 1.0D, yd + 0.0D, zd + 0.0D, texSU, texXV);
//		            tessellator.addVertexWithUV(xd + 0.0D, yd + 0.0D, zd + 0.0D, texXU, texXV);
//		            tessellator.addVertexWithUV(xd + 0.0D, yd + 1.0D, zd + 0.0D, texXU, texSV);
//				case 3:
//		            tessellator.addVertexWithUV(xd + 0.0D, yd + 1.0D, zd + 0.0D, texSU, texSV);
//		            tessellator.addVertexWithUV(xd + 0.0D, yd + 0.0D, zd + 0.0D, texSU, texXV);
//		            tessellator.addVertexWithUV(xd + 1.0D, yd + 0.0D, zd + 0.0D, texXU, texXV);
//		            tessellator.addVertexWithUV(xd + 1.0D, yd + 1.0D, zd + 0.0D, texXU, texSV);
//				case 4:
//		            tessellator.addVertexWithUV(xd + 0.0D, yd + 1.0D, zd + 0.0D, texSU, texSV);
//		            tessellator.addVertexWithUV(xd + 0.0D, yd + 0.0D, zd + 0.0D, texSU, texXV);
//		            tessellator.addVertexWithUV(xd + 0.0D, yd + 0.0D, zd + 1.0D, texXU, texXV);
//		            tessellator.addVertexWithUV(xd + 0.0D, yd + 1.0D, zd + 1.0D, texXU, texSV);
//				case 5:
//		            tessellator.addVertexWithUV(xd + 1.0D, yd + 1.0D, zd + 1.0D, texSU, texSV);
//		            tessellator.addVertexWithUV(xd + 1.0D, yd + 0.0D, zd + 1.0D, texSU, texXV);
//		            tessellator.addVertexWithUV(xd + 1.0D, yd + 0.0D, zd + 0.0D, texXU, texXV);
//		            tessellator.addVertexWithUV(xd + 1.0D, yd + 1.0D, zd + 0.0D, texXU, texSV);
//				case 6:
//		            tessellator.addVertexWithUV(xd + 1.0D, yd + 1.0D, zd + 0.0D, texSU, texSV);
//		            tessellator.addVertexWithUV(xd + 1.0D, yd + 0.0D, zd + 0.0D, texSU, texXV);
//		            tessellator.addVertexWithUV(xd + 0.0D, yd + 0.0D, zd + 0.0D, texXU, texXV);
//		            tessellator.addVertexWithUV(xd + 0.0D, yd + 1.0D, zd + 0.0D, texXU, texSV);
//				case 7:
//		            tessellator.addVertexWithUV(xd + 0.0D, yd + 1.0D, zd + 0.0D, texSU, texSV);
//		            tessellator.addVertexWithUV(xd + 0.0D, yd + 0.0D, zd + 0.0D, texSU, texXV);
//		            tessellator.addVertexWithUV(xd + 1.0D, yd + 0.0D, zd + 0.0D, texXU, texXV);
//		            tessellator.addVertexWithUV(xd + 1.0D, yd + 1.0D, zd + 0.0D, texXU, texSV);
				case 12:
		            tessellator.addVertexWithUV(xd + 0.0D, yd + 1.0D, zd + 1.0D, texSU, texSV);
		            tessellator.addVertexWithUV(xd + 1.0D, yd + 1.0D, zd + 1.0D, texSU, texXV);
		            tessellator.addVertexWithUV(xd + 1.0D, yd + 1.0D, zd + 0.0D, texXU, texXV);
		            tessellator.addVertexWithUV(xd + 0.0D, yd + 1.0D, zd + 0.0D, texXU, texSV);
				case 13:
		            tessellator.addVertexWithUV(xd + 1.0D, yd + 1.0D - thick, zd + 1.0D, texSU, texSV);
		            tessellator.addVertexWithUV(xd + 0.0D, yd + 1.0D - thick, zd + 1.0D, texSU, texXV);
		            tessellator.addVertexWithUV(xd + 0.0D, yd + 1.0D - thick, zd + 0.0D, texXU, texXV);
		            tessellator.addVertexWithUV(xd + 1.0D, yd + 1.0D - thick, zd + 0.0D, texXU, texSV);
				}
				icon = null;
			}
		}
		return true;
	}
}
