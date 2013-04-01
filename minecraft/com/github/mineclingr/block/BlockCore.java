package com.github.mineclingr.block;

import java.util.ArrayList;
import java.util.List;

import com.github.mineclingr.Mineclingr;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockOre;
import net.minecraft.block.BlockOreStorage;
import net.minecraft.block.BlockPressurePlateWeighted;
import net.minecraft.block.BlockWood;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;

public class BlockCore extends Block {

	public static final Block oreCopper = new BlockOre(500).setUnlocalizedName("mineclingr:oreCopper")
			.setHardness(3.0F).setResistance(5.0F).setStepSound(soundStoneFootstep);
	public static final Block blockCopper = new BlockOreStorage(501).setUnlocalizedName("mineclingr:blockCopper")
			.setHardness(5.0F).setResistance(10.0F).setStepSound(soundMetalFootstep);
	public static final Block scaffold = new BlockScaffold(502).setUnlocalizedName("mineclingr:scaffold")
			.setHardness(0.4F).setStepSound(soundWoodFootstep);
	public static final Block scaffoldSide = new BlockScaffoldSide(503).setUnlocalizedName("mineclingr:scaffoldSide")
			.setStepSound(soundLadderFootstep);
	
	
	public BlockCore(int par1, Material par2Material) {
		super(par1, par2Material);
	}
	
	public static void InitBlocks() {
		GameRegistry.registerBlock(oreCopper, "mineclingr:oreCopper");
		LanguageRegistry.addName(oreCopper, "Copper Ore");
		GameRegistry.registerBlock(blockCopper, "mineclingr:blockCopper");
		LanguageRegistry.addName(blockCopper, "Copper Block");
		for(int i = 0;i < (BlockWood.woodType.length * 4);++i) {
			GameRegistry.registerBlock(scaffold, "mineclingr:scaffold");
			LanguageRegistry.addName(new ItemStack(scaffold.blockID,1,i),
					String.format("%s Scaffold Lv%d",
							Mineclingr.LargerHelper(BlockWood.woodType[i >> 2]),
							(i % 4) + 1)
					);
		}
		GameRegistry.registerBlock(scaffoldSide, "Scaffold Side");
	}
}
