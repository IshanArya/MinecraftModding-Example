package com.camp.item;

import com.example.examplemod.ExampleMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Zeon extends Item{
	
	public static final String name = "Zeon";
	
	public Zeon(){
		super();
		this.setUnlocalizedName(ExampleMod.MODID + "_" + name);
		this.setCreativeTab(CreativeTabs.tabMaterials);
		this.setMaxStackSize(64);
	}
	
	
}
