package com.github.mineclingr.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BlockCopperOre extends Block {

	public BlockCopperOre(int par1) {
		super(par1, Material.rock);
		this.setCreativeTab(CreativeTabs.tabBlock);
	}
	
    public int idDropped(int par1, Random par2Random, int par3)
    {
        return this.blockID;
    }
    
    public int quantityDropped(Random par1Random)
    {
        return 1;
    }
    
    public int quantityDroppedWithBonus(int par1, Random par2Random)
    {
        int j = par2Random.nextInt(par1 + 2) - 1;

        if (j < 0)
        {
            j = 0;
        }

        return this.quantityDropped(par2Random) * (j + 1);
    }
    
    public int damageDropped(int par1)
    {
        return 0;
    }
}
