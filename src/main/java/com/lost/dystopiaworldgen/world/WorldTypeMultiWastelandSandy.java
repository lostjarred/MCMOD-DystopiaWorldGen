package com.lost.dystopiaworldgen.world;

import com.lost.dystopiaworldgen.ModBiomes;
import com.lost.dystopiaworldgen.world.gen.layer.GenLayerBiomeCustom;

import net.minecraft.world.WorldType;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.ChunkGeneratorSettings;
import net.minecraft.world.gen.layer.GenLayer;

public class WorldTypeMultiWastelandSandy extends WorldType {
	private Biome[] allowedBiomes = {
			ModBiomes.sandy_wasteland, ModBiomes.glass_wasteland, ModBiomes.sandy_wasteland_hills
			};
	public WorldTypeMultiWastelandSandy(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public GenLayer getBiomeLayer(long worldSeed, GenLayer parentLayer, ChunkGeneratorSettings chunkSettings) {
		return new GenLayerBiomeCustom(worldSeed, allowedBiomes);
	}
}
