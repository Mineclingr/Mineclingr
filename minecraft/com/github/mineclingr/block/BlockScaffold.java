package com.github.mineclingr.block;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockScaffold extends BlockCore {
	
	public BlockScaffold(int par1) {
		super(par1, Material.wood);
		this.setCreativeTab(CreativeTabs.tabDecorations);
		
	}
	
	@SideOnly(Side.CLIENT)
	public Icon getBlockTextureFromSideAndMetadata(int par1, int par2) {
		if (par1 > 1) {
			return this.blockIcon;
		} else {
			return BlockCore.planks.getBlockTextureFromSideAndMetadata(par1, par2);
		}
	}
	
	@Override
	@SideOnly(Side.CLIENT)
    public void getSubBlocks(int par1, CreativeTabs par2CreativeTabs, List par3List)
    {
	    par3List.add(new ItemStack(par1, 1, 0));
	    par3List.add(new ItemStack(par1, 1, 1));
	    par3List.add(new ItemStack(par1, 1, 2));
	    par3List.add(new ItemStack(par1, 1, 3));
    }
	
    @Override
    public boolean isLadder(World world, int x, int y, int z)
    {
        return true;
    }
    
    @Override
    public int damageDropped(int par1)
    {
        return par1;
    }
    
    public boolean isOpaqueCube()
    {
        return false;
    }
    
    @SideOnly(Side.CLIENT)
    public boolean shouldSideBeRendered(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5)
    {
        return true;
    }

}
