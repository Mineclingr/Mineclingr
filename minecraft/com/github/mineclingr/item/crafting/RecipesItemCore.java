package com.github.mineclingr.item.crafting;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.github.mineclingr.block.BlockCore;
import com.github.mineclingr.item.ItemCore;

import cpw.mods.fml.common.registry.GameRegistry;

public class RecipesItemCore {
	public static void InitRecipes () {
		GameRegistry.addRecipe(new ItemStack(ItemCore.pipe, 1),
				"#",
				"#",
				"#",
				'#',new ItemStack(ItemCore.ingotIron));
		
		GameRegistry.addRecipe(new ItemStack(ItemCore.stickCross, 2),
				"##",
				"##",
				'#',new ItemStack(Item.stick));
	}
}
