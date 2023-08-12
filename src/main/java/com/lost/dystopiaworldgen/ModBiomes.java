package com.lost.dystopiaworldgen;

import com.lost.dystopiaworldgen.world.biome.multi.BiomeWasteBeach;
import com.lost.dystopiaworldgen.world.biome.multi.BiomeWasteDesert;
import com.lost.dystopiaworldgen.world.biome.multi.BiomeWasteForrest;
import com.lost.dystopiaworldgen.world.biome.multi.BiomeWasteHills;
import com.lost.dystopiaworldgen.world.biome.multi.BiomeWasteOcean;
import com.lost.dystopiaworldgen.world.biome.multi.BiomeWastePlains;
import com.lost.dystopiaworldgen.world.biome.multi.BiomeWasteRiver;
import com.lost.dystopiaworldgen.world.biome.multi.BiomeWasteSnow;
import com.lost.dystopiaworldgen.world.biome.multi.BiomeWasteSwamp;
import com.lost.dystopiaworldgen.world.biome.multi.BiomeWasteTaiga;
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
	
	public static BiomeWasteForrest waste_forrest = new BiomeWasteForrest(new BiomeProperties("Waste Forrest")
			.setTemperature(0.7F)
			.setRainfall(0.8F), 
			"wasteforrest");
	
	public static BiomeWasteTaiga waste_taiga = new BiomeWasteTaiga(new BiomeProperties("Waste Taiga")
			.setBaseHeight(0.2F)
			.setHeightVariation(0.2F)
			.setTemperature(0.25F)
			.setRainfall(0.8F), "wastetaiga");
	
	public static BiomeWasteSwamp waste_swampland = new BiomeWasteSwamp(new BiomeProperties("Waste Swampland")
			.setBaseHeight(-0.2F)
			.setHeightVariation(0.1F)
			.setTemperature(0.8F)
			.setRainfall(0.9F)
			.setWaterColor(14745518)
			, "wasteswampland");
	
	public static BiomeWasteRiver waste_river = new BiomeWasteRiver(new BiomeProperties("Waste River")
			.setBaseHeight(-0.5F)
			.setHeightVariation(0.0F)
			, "wasteriver");
	
	public static BiomeWasteOcean waste_frozen_ocean = new BiomeWasteOcean(new BiomeProperties("Waste Frozen Ocean")
			.setBaseHeight(-1.0F)
			.setHeightVariation(0.1F)
			.setTemperature(0.0F)
			.setRainfall(0.5F)
			.setSnowEnabled()
			, "wastefrozenocean");
	
	public static BiomeWasteRiver waste_frozen_river = new BiomeWasteRiver(new BiomeProperties("Waste Frozen River")
			.setBaseHeight(-0.5F)
			.setHeightVariation(0.0F)
			.setTemperature(0.0F)
			.setRainfall(0.5F)
			.setSnowEnabled()
			, "wastefrozenriver");
	
	public static BiomeWasteSnow waste_ice_flats = new BiomeWasteSnow(new BiomeProperties("Waste Ice Flats") 
			.setBaseHeight(0.125F)
			.setHeightVariation(0.05F)
			.setTemperature(0.0F)
			.setRainfall(0.5F)
			.setSnowEnabled()
			, "wasteiceflats");
	
	public static BiomeWasteSnow waste_ice_mountains = new BiomeWasteSnow(new BiomeProperties("Waste Ice mountin")
			.setBaseHeight(0.45F)
			.setHeightVariation(0.3F)
			.setTemperature(0.0F)
			.setRainfall(0.5F)
			.setSnowEnabled()
			, "wasteicemountains");
	
	public static BiomeWasteBeach waste_beaches = new BiomeWasteBeach(new BiomeProperties("Waste Beach")
			.setBaseHeight(0.0F)
			.setHeightVariation(0.025F)
			.setTemperature(0.8F)
			.setRainfall(0.4F)
			,"wastebeach");
	
	public static BiomeWasteDesert waste_desert_hills = new BiomeWasteDesert(new BiomeProperties("Waste Desert Hills")
			.setBaseHeight(0.45F)
			.setHeightVariation(0.3F)
			.setTemperature(2.0F)
			.setRainfall(0.0F)
			.setRainDisabled()
			, "wastedeserthillss");
	
	public static void register(IForgeRegistry<Biome> event) {
		//single biome gen biomes
		event.register(sandy_wasteland);
		event.register(snowy_wasteland);
		//multi Biomes
	}
}
