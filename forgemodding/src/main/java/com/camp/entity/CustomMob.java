package com.camp.entity;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.world.World;

import com.camp.block.BlockManager;
import com.camp.item.ItemManager;

public class CustomMob extends EntityMob{

	public CustomMob(World worldIn) {
		super(worldIn);
		// TODO Auto-generated constructor stub
		//tasks
		this.tasks.addTask(0, new EntityAISwimming(this));
		this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityPlayer.class, 1.0, false));
		
		//targets
		this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true));
		this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, true));
		
	}
	
	@Override
	protected void applyEntityAttributes(){
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(200.0);
		this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(10);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.5);
	}
	
	public boolean isAIEnabled(){
		return true;
	}
	
	@Override
	public void dropFewItems(boolean recentlyHit, int lootLevel){
		int quantity = this.rand.nextInt(4) + 1;
		
		for(int i = 0; i < quantity; i++){
			if(this.isBurning()){
				Item drop = Item.getItemFromBlock(BlockManager.zeonOre);
				this.dropItem(drop, 1);
			}
			else{
				//Item drop = Item.getItemFromBlock(BlockManager.customBlock);
				this.dropItem(ItemManager.zeon, 1);
			}
		}
	}
	
	@Override
	public void addRandomArmor(){
		Item here = Item.getItemFromBlock(BlockManager.zeonBlock);
		this.dropItem(here, 1);
	}

}
