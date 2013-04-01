package com.github.mineclingr;

import com.github.mineclingr.block.BlockCore;
import com.github.mineclingr.item.ItemCore;
import com.github.mineclingr.item.crafting.FurnaceRecipesCore;
import com.github.mineclingr.item.crafting.RecipesCore;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid="Mineclingr", name="Mineclingr", version="alpha 0.0.2")
@NetworkMod(clientSideRequired=true, serverSideRequired=true)

public class Mineclingr {

	@Instance("Mineclingr")
	public static Mineclingr instance;

    @SidedProxy(clientSide="com.github.mineclingr.client.ClientProxy", serverSide="com.github.mineclingr.CommonProxy")
    public static CommonProxy proxy;

    @PreInit
    public void preInit(FMLPreInitializationEvent event) {
            // Stub Method
    }

    @Init
    public void Init(FMLInitializationEvent event) {
            proxy.registerRenderers();
            BlockCore.InitBlocks();
            ItemCore.InitItems();
            RecipesCore.InitRecipes();
    }

    @PostInit
    public void postInit(FMLPostInitializationEvent event) {
            // Stub Method
    }
    
    public static String LargerHelper(String name) {
    	String n = new String(name);
    	return n.substring(0,1).toUpperCase() + n.substring(1).toLowerCase();
    }
}