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
			
			for (int bx = position.getX(); bx < ( position.getX() + width ); bx++ ) {
				for (int bz = position.getZ(); bz < ( position.getZ() + depth ); bz++ ) {
					for (int by = position.getY(); by < ( position.getY() + rand.nextInt(height) + 2 ); by++) {
						this.setBlockAndNotifyAdequately(worldIn, new BlockPos(bx, by, bz), ModBlocks.DGLASS.getDefaultState());
					}
				}
			}
			return true;
		}
	}

}
