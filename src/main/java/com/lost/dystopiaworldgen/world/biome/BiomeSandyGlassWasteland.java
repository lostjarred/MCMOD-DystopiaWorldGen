package com.lost.dystopiaworldgen.world.biome;

import java.util.Random;

import com.lost.dystopiaworldgen.world.gen.feature.WorldGenGlassSpike;

import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BiomeSandyGlassWasteland extends BiomeSandyWasteland {
	
	private final WorldGenGlassSpike glassspike = new WorldGenGlassSpike();

	public BiomeSandyGlassWasteland(BiomeProperties properties, String name) {
		super(properties, name);
		this.topBlock = Blocks.SAND.getDefaultState();
		this.fillerBlock = Blocks.SANDSTONE.getDefaultState();
	}
	
	@Override
	public void decorate(World worldIn, Random rand, BlockPos pos) {
		
		for (int i = 0; i < 2; i ++) {
			int x = rand.nextInt(16) + 8;
			int z = rand.nextInt(16) + 8;
			
			this.glassspike.generate(worldIn, rand, worldIn.getHeight(pos.add(x, 0, z)));
		}
		
		super.decorate(worldIn, rand, pos);
	}
	
}
