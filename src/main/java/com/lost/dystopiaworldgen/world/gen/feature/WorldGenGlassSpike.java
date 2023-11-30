package com.lost.dystopiaworldgen.world.gen.feature;

import java.util.Random;

import com.lost.dystopiaworldgen.ModBlocks;

import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenGlassSpike extends WorldGenerator {

	@Override
	public boolean generate(World worldIn, Random rand, BlockPos position) {
		
		while (worldIn.isAirBlock(position) && position.getY() > 2) {
			position = position.down();
		}
		
		if (worldIn.getBlockState(position).getBlock() != Blocks.SAND) { 
			return false;
		} else {
			
			int height = rand.nextInt(5) + 7;
			int width = rand.nextInt(3) + 1;
			int depth = rand.nextInt(3) + 1;
			
			int bx = position.getX();
			int by = position.getY();
			int bz = position.getZ();
			
			for (int x = 0; x < width; x++ ) {
				for (int z = 0; z < depth; z++ ) {
					for (int y = 0; y < (rand.nextInt(height) + 3); y++) {
						this.setBlockAndNotifyAdequately(worldIn, new BlockPos((bx + x), (by + y), (bz + z)), ModBlocks.DGLASS.getDefaultState() );
					}
				}
			}
			return true;
		}
	}

}
