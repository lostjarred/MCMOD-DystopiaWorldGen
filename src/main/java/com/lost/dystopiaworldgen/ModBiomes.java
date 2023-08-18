package com.lost.dystopiaworldgen;

import com.lost.dystopiaworldgen.world.biome.BiomeSandyWasteland;
import com.lost.dystopiaworldgen.world.biome.BiomeSnowyWasteland;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biome.BiomeProperties;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeManager.BiomeEntry;
import net.minecraftforge.common.BiomeManager.BiomeType;
import net.minecraftforge.registries.IForgeRegistry;

public class ModBiomes {
	
	public static BiomeSandyWasteland sandy_wasteland = new BiomeSandyWasteland(new BiomeProperties("wastelandsand")
			.setBaseHeight(0.125F)
			.setHeightVariation(0.05F)
			.setTemperature(2.0F)
			.setRainfall(0.0F)
			.setRainDisabled(), "wastelandsand");
	
	public static BiomeSnowyWasteland snowy_wasteland = new BiomeSnowyWasteland(new BiomeProperties("wastelandsnow")
			.setBaseHeight(0.45F)
			.setHeightVariation(0.3F)
			.setTemperature(0.0F)
			.setRainfall(0.5F)
			.setSnowEnabled(), 
			"wastelandsnow");
	
	public static void register(IForgeRegistry<Biome> event) {
		event.register(sandy_wasteland);
		event.register(snowy_wasteland);
	}
	
	public static void initBiomeManagerDictionary() {
		BiomeManager.addBiome(BiomeType.DESERT, new BiomeEntry(sandy_wasteland, 0));
		BiomeManager.addSpawnBiome(sandy_wasteland);
		BiomeManager.addStrongholdBiome(sandy_wasteland);
		BiomeManager.addVillageBiome(sandy_wasteland, false);
		BiomeDictionary.addTypes(sandy_wasteland, BiomeDictionary.Type.DRY);
	}
}
