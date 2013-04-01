package com.github.mineclingr.block;

import static net.minecraftforge.common.ForgeDirection.EAST;
import static net.minecraftforge.common.ForgeDirection.NORTH;
import static net.minecraftforge.common.ForgeDirection.SOUTH;
import static net.minecraftforge.common.ForgeDirection.WEST;

import java.util.Random;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

public class BlockScaffoldSide extends BlockCore {

	public BlockScaffoldSide(int par1) {
		super(par1, Material.air);
		this.setCreativeTab(CreativeTabs.tabFood);
		this.setBlockBounds(0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F);
	}
	
    @Override
    public boolean isLadder(World world, int x, int y, int z)
    {
        return true;
    }
    
    @Override
    public void onNeighborBlockChange(World world, int x, int y, int z, int metadeta)
    {
    	for(int i=0;i<4;++i) {
	    	int xi = (i & 1) == 1 ? x : x + ((i & 2) == 2 ? 1 : -1);
	    	int zi = (i & 1) == 1 ? z + ((i & 2) == 2 ? 1 : -1) : z;
	    	
	        if(BlockCore.scaffold.blockID == world.getBlockId(xi, y, zi)) {
	        	return;
	        }
    	}

        world.setBlockToAir(x, y, z);
    }
    
    @Override
    public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4)
    {
        return null;
    }
    
    @Override
    public int getRenderType()
    {
        return -1;
    }
    
    public boolean isOpaqueCube()
    {
        return false;
    }
    
    public int quantityDropped(Random par1Random)
    {
        return 0;
    }
    
    public boolean canPlaceBlockAt(World par1World, int par2, int par3, int par4)
    {
        return false;
    }

}
