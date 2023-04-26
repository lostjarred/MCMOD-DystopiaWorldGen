package com.lost.dystopiaworldgen;

import com.lost.dystopiaworldgen.world.biome.BiomeSandyWasteland;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biome.BiomeProperties;
import net.minecraftforge.registries.IForgeRegistry;

public class ModBiomes {
	
	public static BiomeSandyWasteland sandy_wasteland = new BiomeSandyWasteland(new BiomeProperties("sandy_wasteland")
			.setBaseHeight(0.125F)
			.setHeightVariation(0.05F)
			.setTemperature(2.0F)
			.setRainfall(0.0F)
			.setRainDisabled(), "sandy_wasteland");
	
	public static void register(IForgeRegistry<Biome> event) {
		event.register(sandy_wasteland);
	}
}
