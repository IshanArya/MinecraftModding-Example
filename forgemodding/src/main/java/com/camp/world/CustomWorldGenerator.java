package com.camp.world;

import java.util.Random;

import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

import com.camp.block.BlockManager;

public class CustomWorldGenerator implements IWorldGenerator{

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		// TODO Auto-generated method stub
		
		  // Code to run during world generation here
	       // Check what dimension is being generated
	        switch(world.provider.getDimensionId()){
	        case -1:
	        // Dim -1 Nether
	            break;
	        case 0:
	        // Dim 0 Surface
	            generateSurface(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
	            break;
	        case 1:
	        // Dim 1 End
	            break;
	        }
	}
	
	public void generateSurface(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		for(int i = 0; i < 5; i++){
			int startX = chunkX * 16 + random.nextInt(16);
			int startY = random.nextInt(32) * 16;
			int startZ = chunkZ * 16 + random.nextInt(16);
			BlockPos start = new BlockPos(startX, startY, startZ);
			(new WorldGenMinable(BlockManager.zeonOre.getDefaultState(), random.nextInt(5) + 3)).generate(world, random, start);
			
		}
	}

}
