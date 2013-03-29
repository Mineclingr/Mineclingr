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

	public static final Block oreCopper = new BlockCopperOre(500).setHardness(3.0F).setResistance(5.0F)
	.setStepSound(Block.soundStoneFootstep).setUnlocalizedName("mineclingr:oreCopper");

	public static void InitBlocks() {
		GameRegistry.registerBlock(oreCopper, "mineclingr:oreCopper");
		LanguageRegistry.addName(oreCopper, "Copper Ore");
	}
}
