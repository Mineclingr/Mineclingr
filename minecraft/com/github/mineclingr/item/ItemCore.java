package com.github.mineclingr.item;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemCore extends Item {

	public static Item ingotCopper = new ItemCore(5000).setUnlocalizedName("mineclingr:ingotCopper")
			.setCreativeTab(CreativeTabs.tabMaterials);
	public static Item stickCross = new ItemCore(5001).setUnlocalizedName("mineclingr:stickCross")
			.setCreativeTab(CreativeTabs.tabMaterials);
	public static Item pipe = new ItemCore(5002).setUnlocalizedName("mineclingr:pipe")
			.setCreativeTab(CreativeTabs.tabMaterials);
	
	public ItemCore(int par1) {
		super(par1);
	}
	
	public static void InitItems() {
		GameRegistry.registerItem(ingotCopper, "mineclingr:ingotCopper");
		LanguageRegistry.addName(ingotCopper, "Copper Ingot");
		GameRegistry.registerItem(stickCross, "mineclingr:stickCross");
		LanguageRegistry.addName(stickCross, "Cross Stick");
		GameRegistry.registerItem(pipe, "mineclingr:pipe");
		LanguageRegistry.addName(pipe, "Pipe");
	}

}
