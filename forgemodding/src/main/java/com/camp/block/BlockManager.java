package com.camp.block;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlockManager {

	public static CustomBlock customBlock;
	public static ZeonBlock zeonBlock;
	
	public static void mainRegistry(){
		initializeBlock();
		registerBlock();
		
	}
	
	public static void initializeBlock(){
		customBlock = new CustomBlock();
		zeonBlock = new ZeonBlock();
	}
	
	public static void registerBlock(){
		GameRegistry.registerBlock(customBlock, customBlock.name);
		GameRegistry.registerBlock(zeonBlock, zeonBlock.name);
	}
}
