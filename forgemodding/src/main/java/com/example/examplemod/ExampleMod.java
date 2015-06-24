package com.example.examplemod;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;

import com.camp.block.BlockManager;
import com.camp.item.ItemManager;

@Mod(modid = ExampleMod.MODID, version = ExampleMod.VERSION)
public class ExampleMod
{
    public static final String MODID = "examplemod";
    public static final String VERSION = "1.0";
    public static ToolMaterial customToolMaterial;
    public static ArmorMaterial customArmorMaterial;
    @EventHandler
    public void preinit (FMLPreInitializationEvent event) {
    	customToolMaterial = EnumHelper.addToolMaterial("Zeon", 3, 10000, 1000f, 1000, 10);
    	customArmorMaterial = EnumHelper.addArmorMaterial("Zeon","Zeon", 1000, new int[]{100, 100, 100, 100}, 100);
    	ItemManager.mainRegistry();
    	BlockManager.mainRegistry();
    }
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
		// some example code
        System.out.println("DIRT BLOCK >> "+Blocks.dirt.getUnlocalizedName());
        if(event.getSide() == Side.CLIENT)
        {
            RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
 
            //for items
            renderItem.getItemModelMesher().register(ItemManager.customItem, 0, new ModelResourceLocation(this.MODID + ":" + ItemManager.customItem.name, "inventory"));
            renderItem.getItemModelMesher().register(ItemManager.customPickaxe, 0, new ModelResourceLocation(this.MODID + ":" + ItemManager.customPickaxe.name, "inventory"));
            renderItem.getItemModelMesher().register(ItemManager.customSword, 0, new ModelResourceLocation(this.MODID + ":" + ItemManager.customSword.name, "inventory")); //examplemod:CustomSword
            renderItem.getItemModelMesher().register(ItemManager.customFood, 0, new ModelResourceLocation(this.MODID + ":" + ItemManager.customFood.name, "inventory"));
            renderItem.getItemModelMesher().register(ItemManager.customHelm, 0, new ModelResourceLocation(this.MODID + ":" + ItemManager.customHelm.name, "inventory"));
            
            //for blocks
            renderItem.getItemModelMesher().register(Item.getItemFromBlock(BlockManager.customBlock), 0, new ModelResourceLocation(this.MODID + ":" + BlockManager.customBlock.name, "inventory"));
            
            //rules
            GameRegistry.addShapelessRecipe(new ItemStack(Items.diamond, 64), Blocks.dirt);
            ItemStack dirtStack = new ItemStack(Blocks.dirt);
            ItemStack sandStack = new ItemStack(Blocks.sand);
            GameRegistry.addShapelessRecipe(new ItemStack(Items.emerald, 64), dirtStack, dirtStack, dirtStack, dirtStack, sandStack, sandStack);
            
            //crafting
            GameRegistry.addShapedRecipe(new ItemStack(Items.book), "xy", "yx", 'x', Blocks.stone, 'y', Blocks.gravel);
            GameRegistry.addShapedRecipe(new ItemStack(BlockManager.customBlock), "xxx", " y ", " y ", 'x', Blocks.tnt, 'y', Items.gunpowder);
            
            //smelting
            GameRegistry.addSmelting(new ItemStack(BlockManager.customBlock), new ItemStack(ItemManager.customFood), 10.0f);
            
            
        }
    }
}
