package com.github.mineclingr;

import com.github.mineclingr.block.BlockCore;

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

@Mod(modid="Mineclingr", name="Mineclingr", version="alpha 0.0.1")
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
    }

    @PostInit
    public void postInit(FMLPostInitializationEvent event) {
            // Stub Method
    }
}