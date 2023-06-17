package com.lost.dystopiaworldgen.world.biome.multi;

import com.lost.dystopiaworldgen.world.biome.BiomeBase;

import net.minecraft.init.Blocks;

public class BiomeWasteDesert extends BiomeBase {

	public BiomeWasteDesert(BiomeProperties properties, String name) {
		super(properties, name);
		// TODO Auto-generated constructor stub
		this.topBlock = Blocks.SAND.getDefaultState();
		this.fillerBlock = Blocks.SAND.getDefaultState();
	}

}
