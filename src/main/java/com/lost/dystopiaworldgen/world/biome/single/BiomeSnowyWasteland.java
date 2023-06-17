package com.lost.dystopiaworldgen.world.biome.single;

import com.lost.dystopiaworldgen.world.biome.BiomeBase;

import net.minecraft.entity.monster.EntityStray;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.Biome;


public class BiomeSnowyWasteland extends BiomeBase {

	public BiomeSnowyWasteland(BiomeProperties properties, String name) {
		super(properties, name);
		this.topBlock = Blocks.SNOW.getDefaultState();
		this.spawnableMonsterList.add(new Biome.SpawnListEntry(EntityStray.class, 80, 4, 4));
	}
	
}
