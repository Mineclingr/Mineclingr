package com.github.mineclingr.item.crafting;

import net.minecraft.item.ItemStack;

import com.github.mineclingr.block.BlockCore;
import com.github.mineclingr.item.ItemCore;

import cpw.mods.fml.common.registry.GameRegistry;

public class RecipesIngotsCore {
	
	public static void InitRecipes () {
		GameRegistry.addRecipe(new ItemStack(BlockCore.blockCopper, 1),
				"###",
				"###",
				"###",
				'#',new ItemStack(ItemCore.ingotCopper));
	}
	
}
