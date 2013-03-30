package com.github.mineclingr.item;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemCore extends Item {

	public static Item ingotCopper = new Item(5000).setUnlocalizedName("mineclingr:ingotCopper")
			.setCreativeTab(CreativeTabs.tabMaterials);
	
	public ItemCore(int par1) {
		super(par1);
	}
	
	public static void InitItems() {
		GameRegistry.registerItem(ingotCopper, "mineclingr:ingotCopper");
		LanguageRegistry.addName(ingotCopper, "Copper Ingot");
	}

}
