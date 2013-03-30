package com.github.mineclingr.block;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockOre;
import net.minecraft.block.BlockOreStorage;
import net.minecraft.block.BlockPressurePlateWeighted;
import net.minecraft.block.material.Material;

public class BlockCore extends Block {
	
	public static final Block oreCopper = new BlockOre(500).setUnlocalizedName("mineclingr:oreCopper")
			.setHardness(3.0F).setResistance(5.0F).setStepSound(soundStoneFootstep);
	public static final Block blockCopper = new BlockOreStorage(501).setUnlocalizedName("mineclingr:blockCopper")
			.setHardness(5.0F).setResistance(10.0F).setStepSound(soundMetalFootstep);
	
	
	public BlockCore(int par1, Material par2Material) {
		super(par1, par2Material);
	}
	
	public static void InitBlocks() {
		GameRegistry.registerBlock(oreCopper, "mineclingr:oreCopper");
		LanguageRegistry.addName(oreCopper, "Copper Ore");
		GameRegistry.registerBlock(blockCopper, "mineclingr:blockCopper");
		LanguageRegistry.addName(blockCopper, "Copper Block");
	}
}
