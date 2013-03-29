package com.github.mineclingr.block;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockOre;
import net.minecraft.block.material.Material;

public class BlockCore extends Block {
	
	public BlockCore(int par1, Material par2Material) {
		super(par1, par2Material);
	}

	public static final Block oreCropper = new BlockCropperOre(500).setHardness(3.0F).setResistance(5.0F)
	.setStepSound(Block.soundStoneFootstep).setUnlocalizedName("mineclingr:oreCropper");

	public static void InitBlocks() {
		GameRegistry.registerBlock(oreCropper, "mineclingr:oreCropper");
		LanguageRegistry.addName(oreCropper, "Cropper Ore");
	}
}
