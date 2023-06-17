package com.lost.dystopiaworldgen.world.biome.single;

import com.lost.dystopiaworldgen.world.biome.BiomeBase;

import net.minecraft.entity.monster.EntityHusk;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.Biome;

public class BiomeSandyWasteland extends BiomeBase {

	public BiomeSandyWasteland(BiomeProperties properties, String name) {
		super(properties, name);
		this.topBlock = Blocks.SAND.getDefaultState();
        this.fillerBlock = Blocks.SAND.getDefaultState();
        this.decorator.treesPerChunk = -999;
        this.decorator.deadBushPerChunk = 2;
        this.decorator.reedsPerChunk = -999;
        this.decorator.cactiPerChunk = -999;
        this.spawnableMonsterList.add(new Biome.SpawnListEntry(EntityHusk.class, 80, 4, 4));
	}

}
