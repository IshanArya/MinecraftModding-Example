package com.camp.block;

import com.example.examplemod.ExampleMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class ZeonOre extends Block{

	public static final String name = "ZeonOre";
	public ZeonOre(){
		super(Material.rock);
		
		this.setUnlocalizedName(ExampleMod.MODID + "_" + name);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setLightLevel(1.0f);
		this.setResistance(13000f);
		this.setHarvestLevel("pickaxe", 3);
		this.setHardness(60f);
	}
	
	@Override
	public boolean canProvidePower() {
		return true;
	}
	
	@Override
	public void onFallenUpon(World worldIn, BlockPos pos, Entity entityIn,
			float fallDistance) {
		// TODO Auto-generated method stub
		if(entityIn instanceof EntityLivingBase){
			((EntityLivingBase) entityIn).setHealth(2.0f);
		}
		super.onFallenUpon(worldIn, pos, entityIn, fallDistance);
	}
}
