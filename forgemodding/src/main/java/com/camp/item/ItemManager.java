package com.camp.item;

import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.example.examplemod.ExampleMod;
 
public class ItemManager {
 
	public static CustomItem customItem;
	public static CustomPickaxe customPickaxe;
	public static CustomSword customSword;
	public static CustomFood customFood;
	public static CustomArmor customHelm;
	public static Zeon zeon;
    public static void mainRegistry() {
        initializeItem();
        registerItem();
    }
 
    public static void initializeItem() {
    	customItem = new CustomItem();
    	customPickaxe = new CustomPickaxe(ExampleMod.customToolMaterial);
    	customSword = new CustomSword(ExampleMod.customToolMaterial);
    	customFood = new CustomFood(10, 1.0F, true);
    	customHelm = new CustomArmor(ExampleMod.customArmorMaterial, 0, 0, "CustomHelm");
    	zeon = new Zeon();
    }
 
    public static void registerItem() {
    	GameRegistry.registerItem(customItem, customItem.name);
    	GameRegistry.registerItem(customPickaxe, customPickaxe.name);
    	GameRegistry.registerItem(customSword, customSword.name);
    	GameRegistry.registerItem(customFood, customFood.name);
    	GameRegistry.registerItem(customHelm, customHelm.name);
    	GameRegistry.registerItem(zeon, zeon.name);
    }
 
}