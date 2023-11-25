package com.lost.dystopiaworldgen.world.biome;

import com.lost.dystopiaworldgen.ModBlocks;

import net.minecraft.init.Blocks;

public class BiomeSandyGlassWasteland extends BiomeSandyWasteland {

	public BiomeSandyGlassWasteland(BiomeProperties properties, String name) {
		super(properties, name);
		this.topBlock = ModBlocks.DGLASS.getDefaultState();
		this.fillerBlock = Blocks.SANDSTONE.getDefaultState();
	}

}
