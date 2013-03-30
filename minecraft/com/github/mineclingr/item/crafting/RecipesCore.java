package com.github.mineclingr.item.crafting;

public class RecipesCore {
	
	public static void InitRecipes () {
		RecipesBlockCore.InitRecipes();
		RecipesItemCore.InitRecipes();
		//more recipes
		FurnaceRecipesCore.InitSmelting();
	}
	
}
