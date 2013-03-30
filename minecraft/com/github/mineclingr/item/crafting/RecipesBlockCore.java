package com.github.mineclingr.item.crafting;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;

import com.github.mineclingr.block.BlockCore;
import com.github.mineclingr.item.ItemCore;

import cpw.mods.fml.common.registry.GameRegistry;

public class RecipesBlockCore {
	
	public static void InitRecipes () {
		GameRegistry.addRecipe(new ItemStack(BlockCore.blockCopper, 1),
				"###",
				"###",
				"###",
				'#',new ItemStack(ItemCore.ingotCopper));
		for(int i=0;i<4;++i) {
			GameRegistry.addRecipe(new ItemStack(BlockCore.scaffold, 24, i),
					"###",
					"XXX",
					"XXX",
					'#', new ItemStack(Block.planks, 1, i),
					'X', new ItemStack(ItemCore.stickCross));
		}
	}
	
}
