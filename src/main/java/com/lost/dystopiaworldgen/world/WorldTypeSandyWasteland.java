package com.lost.dystopiaworldgen.world;

import com.lost.dystopiaworldgen.ModBiomes;

import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.BiomeProviderSingle;

public class WorldTypeSandyWasteland extends WorldType {

	public WorldTypeSandyWasteland(String name) {
		super(name);
	}
	
	@Override
	public net.minecraft.world.biome.BiomeProvider getBiomeProvider(World world){
		return new BiomeProviderSingle(ModBiomes.sandy_wasteland);
	}

}
