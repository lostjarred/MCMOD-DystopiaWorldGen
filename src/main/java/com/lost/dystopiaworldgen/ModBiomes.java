package com.lost.dystopiaworldgen;

import com.lost.dystopiaworldgen.world.biome.multi.BiomeWasteDesert;
import com.lost.dystopiaworldgen.world.biome.multi.BiomeWasteHills;
import com.lost.dystopiaworldgen.world.biome.multi.BiomeWasteOcean;
import com.lost.dystopiaworldgen.world.biome.multi.BiomeWastePlains;
import com.lost.dystopiaworldgen.world.biome.single.BiomeSandyWasteland;
import com.lost.dystopiaworldgen.world.biome.single.BiomeSnowyWasteland;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biome.BiomeProperties;
import net.minecraftforge.registries.IForgeRegistry;

public class ModBiomes {
	
	//Single Biomes
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
	
	//MultiBiomes
	public static BiomeWasteOcean waste_ocean = new BiomeWasteOcean(new BiomeProperties("Waste Ocean")
			.setBaseHeight(-1.0F)
			.setHeightVariation(0.1F), 
			"wasteocean");
	
	public static BiomeWastePlains waste_plains = new BiomeWastePlains(new BiomeProperties("Waste Plains")
			.setBaseHeight(0.125F)
			.setHeightVariation(0.05F)
			.setTemperature(0.8F)
			.setRainfall(0.4F)
			,"wasteplains");
	
	public static BiomeWasteDesert waste_desert = new BiomeWasteDesert(new BiomeProperties("Waste Desert")
			.setBaseHeight(0.125F)
			.setHeightVariation(0.05F)
			.setTemperature(2.0F)
			.setRainfall(0.0F)
			.setRainDisabled()
			,"wastedesert");
	
	public static BiomeWasteHills waste_extremehills = new BiomeWasteHills(new BiomeProperties("Waste Extreme Hills")
			.setBaseHeight(1.0F)
			.setHeightVariation(0.5F)
			.setTemperature(0.2F)
			.setRainfall(0.3F)
			,"wasteextremehills");
	
	public static void register(IForgeRegistry<Biome> event) {
		//single biome gen biomes
		event.register(sandy_wasteland);
		event.register(snowy_wasteland);
		//multi Biomes
	}
}
