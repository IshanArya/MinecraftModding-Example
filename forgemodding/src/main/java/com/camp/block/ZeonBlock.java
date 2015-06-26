package com.camp.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

import com.example.examplemod.ExampleMod;

public class ZeonBlock extends Block{

	public static final String name = "ZeonBlock";
	public ZeonBlock() {
		super(Material.rock);
		// TODO Auto-generated constructor stub
		this.setUnlocalizedName(ExampleMod.MODID + "_" + name);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setHarvestLevel("pickaxe", 4);
		this.setHardness(75f);
		this.setResistance(13000f);
		this.setLightLevel(1.0f);
		
	}
	/* (non-Javadoc)
	 * @see net.minecraft.block.Block#canProvidePower()
	 */
	@Override
	public boolean canProvidePower() {
		return true;
	}
	
	
	

}
