package com.lost.dystopiaworldgen.world;

import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeProviderSingle;

public class WorldTypeSingleBiome extends WorldType {

	private Biome worldbiome;
	
	public WorldTypeSingleBiome(String name, Biome biome) {
		super(name);
		this.worldbiome = biome;
	}
	
	@Override
	public net.minecraft.world.biome.BiomeProvider getBiomeProvider(World world){
		return new BiomeProviderSingle(worldbiome);
	}
}
