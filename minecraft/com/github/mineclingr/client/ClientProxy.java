package com.github.mineclingr.client;

import com.github.mineclingr.CommonProxy;
import com.github.mineclingr.client.renderer.RenderBlocksCore;

public class ClientProxy extends CommonProxy {
	@Override
	public void registerRenderers() {
		RenderBlocksCore.RenderBlocksInit(300);
	}
}