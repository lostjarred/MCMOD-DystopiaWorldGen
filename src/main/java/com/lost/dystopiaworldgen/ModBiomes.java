package com.lost.dystopiaworldgen;

import com.lost.dystopiaworldgen.world.biome.BiomeSandyWasteland;
import com.lost.dystopiaworldgen.world.biome.BiomeSnowyWasteland;

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
	
	public static BiomeSnowyWasteland snowy_wasteland = new BiomeSnowyWasteland(new BiomeProperties("snowy_wasteland")
			.setBaseHeight(0.45F)
			.setHeightVariation(0.3F)
			.setTemperature(0.0F)
			.setRainfall(0.5F)
			.setSnowEnabled(), 
			"snowy_wasteland");
	
	public static void register(IForgeRegistry<Biome> event) {
		event.register(sandy_wasteland);
		event.register(snowy_wasteland);
	}
}
