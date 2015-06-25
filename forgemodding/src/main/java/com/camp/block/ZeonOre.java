package com.camp.block;

import com.example.examplemod.ExampleMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class ZeonOre extends Block{

	public static final String name = "ZeonOre";
	protected ZeonOre() {
		super(Material.rock);
		// TODO Auto-generated constructor stub
		this.setUnlocalizedName(ExampleMod.MODID + "_" + name);
		this.setCreativeTab(CreativeTabs.tabBlock);
	}

}
