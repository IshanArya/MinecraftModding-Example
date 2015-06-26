package com.camp.entity;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

import com.example.examplemod.ExampleMod;

public class RenderShreyas extends RenderBiped{

    public RenderShreyas(ModelBiped model, float scale) {
        super(Minecraft.getMinecraft().getRenderManager(), model, scale);
        // TODO Auto-generated constructor stub
    }
 
     
 
    @Override
    protected ResourceLocation getEntityTexture(Entity var1) {
        // TODO Auto-generated method stub
    	return new ResourceLocation(ExampleMod.MODID, "textures/entity/shreyas.png");
    }
}
