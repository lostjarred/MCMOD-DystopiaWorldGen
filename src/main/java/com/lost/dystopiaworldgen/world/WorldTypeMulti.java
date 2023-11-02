package com.lost.dystopiaworldgen.world;

import com.lost.dystopiaworldgen.world.gen.layer.GenLayerBiomeCustom;

import net.minecraft.world.WorldType;
import net.minecraft.world.gen.ChunkGeneratorSettings;
import net.minecraft.world.gen.layer.GenLayer;

public class WorldTypeMulti extends WorldType {

	public WorldTypeMulti(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public GenLayer getBiomeLayer(long worldSeed, GenLayer parentLayer, ChunkGeneratorSettings chunkSettings) {
		return new GenLayerBiomeCustom(worldSeed);
	}
}
