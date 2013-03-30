package com.github.mineclingr.item.crafting;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;

import com.github.mineclingr.block.BlockCore;
import com.github.mineclingr.item.ItemCore;

public class FurnaceRecipesCore {
	
	public static void InitRecipes() {
		//Nothing
	}
	
	public static void InitSmelting() {
		FurnaceRecipes.smelting().addSmelting(BlockCore.oreCopper.blockID, new ItemStack(ItemCore.ingotCopper),0.7f);
	}
}
