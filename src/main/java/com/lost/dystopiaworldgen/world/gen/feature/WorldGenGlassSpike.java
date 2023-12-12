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

			int height = rand.nextInt(5) + 7;
			int width = rand.nextInt(3) + 4;
			int depth = width;

		if ( checkArea(worldIn, position, width, depth) ) {
			return false;
		} else {
			

			
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
	public boolean checkArea(World worldIn, BlockPos position, int sizex, int sizez) {
		BlockPos checkblockpos = position.down();
		for (int x = 0; x < sizex; x ++) {
			for (int z = 0; z < sizez; z ++) {
				checkblockpos.add(x, 0, z);
				if (worldIn.getBlockState(checkblockpos).getBlock() != Blocks.SAND) {
					return true;
				}
			}
		}
		return false;
	}
}
