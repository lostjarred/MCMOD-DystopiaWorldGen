package com.lost.dystopiaworldgen.world.biome;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeDecorator;

public class BiomeBase extends Biome{

	public BiomeBase(BiomeProperties properties, String name) {
		super(properties);
		//clear default creatures spawns
		this.spawnableCreatureList.clear();
		this.spawnableCaveCreatureList.clear();
		this.spawnableWaterCreatureList.clear();
		this.setRegistryName(name);
		this.decorator.cactiPerChunk=0;
		this.decorator.extraTreeChance=0f;
		this.decorator.flowersPerChunk=0;
		this.decorator.grassPerChunk=0;
		this.decorator.reedsPerChunk=0;
		this.decorator.treesPerChunk=0;
		this.decorator.waterlilyPerChunk=0;
	}
	@Override
	public BiomeDecorator createBiomeDecorator() {
		return getModdedBiomeDecorator(new BiomeDecoratorDystopia());
	}
}
