package com.lost.dystopiaworldgen.world.biome;

import net.minecraft.block.BlockDirt;
import net.minecraft.init.Blocks;

public class BiomeRiverWasteland extends BiomeBase {

	public BiomeRiverWasteland(BiomeProperties properties, String name) {
		super(properties, name);
		// TODO Auto-generated constructor stub
		this.topBlock = Blocks.SAND.getDefaultState();
		this.fillerBlock = Blocks.DIRT.getDefaultState().withProperty(BlockDirt.VARIANT, BlockDirt.DirtType.COARSE_DIRT);
	}

}
