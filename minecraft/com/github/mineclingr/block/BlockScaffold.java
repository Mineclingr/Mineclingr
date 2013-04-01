package com.github.mineclingr.block;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLiving;
import net.minecraft.item.ItemMultiTextureTile;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockScaffold extends BlockCore {
	
	public static final String[] iconTypes = new String[] {"mineclingr:scaffold0", "mineclingr:scaffold2", "mineclingr:scaffold4"};
	public static final String[] woodType = new String[] {"wood", "wood_spruce", "wood_birch", "wood_jungle"};
	
    @SideOnly(Side.CLIENT)
    private Icon[][] iconRenderArray;
    
    @SideOnly(Side.CLIENT)
    private Icon[] iconWood;
    
	public BlockScaffold(int par1) {
		super(par1, Material.wood);
		this.setCreativeTab(CreativeTabs.tabDecorations);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
    public Icon getBlockTextureFromSideAndMetadata(int par1, int par2) {
		if (par1 < 12) {
			int lv = par2 % 4;
			if(par1 < 4) {
				return iconRenderArray[lv][0];
			} else if(par1 < 8) {
				return iconRenderArray[lv][1];
			} else {
				return iconRenderArray[lv][2];
			}
		} else {
			return iconWood[par2 >> 2];
		}
    }
	
	
	@Override
    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLiving entityLiving, ItemStack itemStack)
    {
    	world.setBlockMetadataWithNotify(x, y, z, itemStack.getItemDamage(), 2);
    	for(int i=0;i<4;++i) {
	    	int xi = (i & 1) == 1 ? x : x + ((i & 2) == 2 ? 1 : -1);
	    	int zi = (i & 1) == 1 ? z + ((i & 2) == 2 ? 1 : -1) : z;
	    	if(world.isAirBlock(xi, y, zi)) {
	    		world.setBlock(xi, y, zi, BlockCore.scaffoldSide.blockID);
	    	}
    	}
    }
	
	@Override
	@SideOnly(Side.CLIENT)
    public void getSubBlocks(int par1, CreativeTabs par2CreativeTabs, List par3List)
    {
		for(int i=0;i<16;++i) {
			par3List.add(new ItemStack(par1, 1, i));
		}
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
    
    public void onNeighborBlockChange(World par1World, int par2, int par3, int par4, int par5)
    {
    	this.onBlockAdded(par1World, par2, par3, par4);
    }
    
    @Override
    public int getRenderType() {
    	return 300;
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
    
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister)
    {
        Icon[] iconArray = new Icon[iconTypes.length];

        for (int i = 0; i < iconTypes.length; ++i)
        {
            iconArray[i] = par1IconRegister.registerIcon(iconTypes[i]);
        }
        iconRenderArray = new Icon[][]{{iconArray[0],iconArray[0],iconArray[1]},{iconArray[1],iconArray[1],iconArray[0]},{iconArray[2],iconArray[2],iconArray[0]},{iconArray[2],iconArray[2],iconArray[2]}};

        iconWood = new Icon[woodType.length];

        for (int i = 0; i < woodType.length; ++i)
        {
            iconWood[i] = par1IconRegister.registerIcon(woodType[i]);
        }

    }
}
