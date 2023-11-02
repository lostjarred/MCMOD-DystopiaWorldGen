package com.lost.dystopiaworldgen.world.biome;

import net.minecraft.init.Blocks;

public class BiomeSandyGlassWasteland extends BiomeSandyWasteland {

	public BiomeSandyGlassWasteland(BiomeProperties properties, String name) {
		super(properties, name);
		this.topBlock = Blocks.GLASS.getDefaultState();
		this.fillerBlock = Blocks.GLASS.getDefaultState();
	}

}
