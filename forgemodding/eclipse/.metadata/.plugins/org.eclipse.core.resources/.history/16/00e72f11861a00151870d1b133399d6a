package com.camp.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import com.camp.item.ItemManager;
import com.example.examplemod.ExampleMod;

public class CustomBlock extends Block{

	public static final String name = "CustomBlock";
	
	public CustomBlock(){
		super(Material.rock);
		this.setUnlocalizedName(ExampleMod.MODID + "_" + name);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setLightLevel(1.0f);
		this.setHardness(75f);
		this.setResistance(13000000f);
		this.setHarvestLevel("pickaxe", 3);
	}
	
	public boolean canProvidePower(){
		return true;
	}
	public int isProvidingWeakPower(IBlockAccess worldIn, BlockPos pos, IBlockState state, EnumFacing side){
		return 15;
	}
	
	@Override
    public int quantityDropped(Random random)
    {
        return 1;
    }
	@Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return ItemManager.customFood;
    }

	/* (non-Javadoc)
	 * @see net.minecraft.block.Block#onEntityCollidedWithBlock(net.minecraft.world.World, net.minecraft.util.BlockPos, net.minecraft.entity.Entity)
	 */
	@Override
	public void onEntityCollidedWithBlock(World worldIn, BlockPos pos,
			Entity entityIn) {
		// TODO Auto-generated method stub
		if(entityIn instanceof EntityLivingBase){
			entityIn.setFire(10);
		}
		super.onEntityCollidedWithBlock(worldIn, pos, entityIn);
	}
	

	
}
