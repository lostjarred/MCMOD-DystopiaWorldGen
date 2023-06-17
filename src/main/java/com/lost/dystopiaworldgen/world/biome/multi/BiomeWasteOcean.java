package com.lost.dystopiaworldgen.world.biome.multi;

import com.lost.dystopiaworldgen.world.biome.BiomeBase;

import net.minecraft.world.biome.Biome;

public class BiomeWasteOcean extends BiomeBase {

	public BiomeWasteOcean(BiomeProperties properties, String name) {
		super(properties, name);
	}
	
	public Biome.TempCategory getTempCategory()
    {
        return Biome.TempCategory.OCEAN;
    }
}
