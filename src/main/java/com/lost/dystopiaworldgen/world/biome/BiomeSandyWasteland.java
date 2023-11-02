package com.lost.dystopiaworldgen.world.biome;

import net.minecraft.entity.monster.EntityHusk;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.Biome;

public class BiomeSandyWasteland extends BiomeBase {

	public BiomeSandyWasteland(BiomeProperties properties, String name) {
		super(properties, name);
		this.topBlock = Blocks.SAND.getDefaultState();
        this.fillerBlock = Blocks.SAND.getDefaultState();
        this.decorator.deadBushPerChunk = 2;
        this.spawnableMonsterList.add(new Biome.SpawnListEntry(EntityHusk.class, 80, 4, 4));
	}

}
