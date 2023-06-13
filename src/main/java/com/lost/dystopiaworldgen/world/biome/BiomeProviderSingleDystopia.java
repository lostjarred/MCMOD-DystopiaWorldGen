package com.lost.dystopiaworldgen.world.biome;

import java.util.List;

import com.google.common.collect.Lists;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeProviderSingle;

public class BiomeProviderSingleDystopia extends BiomeProviderSingle {
	
	public List<Biome> spawnbiomes = Lists.newArrayList();

	public BiomeProviderSingleDystopia(Biome biomeIn) {
		super(biomeIn);
		this.spawnbiomes.add(biomeIn);
	}
	
	@Override
	public List<Biome> getBiomesToSpawnIn(){
		return this.spawnbiomes;
	}

}
