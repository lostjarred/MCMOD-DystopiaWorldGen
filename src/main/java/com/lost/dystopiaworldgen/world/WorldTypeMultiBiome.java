package com.lost.dystopiaworldgen.world;

import com.lost.dystopiaworldgen.world.biome.multi.BiomeProviderMulti;

import net.minecraft.world.World;
import net.minecraft.world.WorldType;

public class WorldTypeMultiBiome extends WorldType {

	public WorldTypeMultiBiome(String name) {
		super(name);
	}
	@Override
	public net.minecraft.world.biome.BiomeProvider getBiomeProvider(World world){
		return new BiomeProviderMulti();
	}
}
