package com.lost.dystopiaworldgen;

import com.lost.dystopiaworldgen.world.biome.BiomeRiverWasteland;
import com.lost.dystopiaworldgen.world.biome.BiomeSandyGlassWasteland;
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
	
	public static BiomeSandyWasteland sandy_wasteland = new BiomeSandyWasteland(
			new BiomeProperties("wastelandsand")
				.setBaseHeight(0.125F)
				.setHeightVariation(0.05F)
				.setTemperature(2.0F)
				.setRainfall(0.0F)
				.setRainDisabled()
			, "wastelandsand");
	
	public static BiomeSnowyWasteland snowy_wasteland = new BiomeSnowyWasteland(
			new BiomeProperties("wastelandsnow")
				.setBaseHeight(0.45F)
				.setHeightVariation(0.3F)
				.setTemperature(0.0F)
				.setRainfall(0.5F)
				.setSnowEnabled()
			, "wastelandsnow");
	
	public static BiomeSandyGlassWasteland glass_wasteland = new BiomeSandyGlassWasteland(
			new BiomeProperties("wastelandGlass")
				.setBaseHeight(0.125f)
				.setHeightVariation(0.05F)
				.setTemperature(2.0F)
				.setRainfall(0.0F)
				.setRainDisabled()
			, "wastelandglass");
	
	public static BiomeSandyWasteland sandy_wasteland_hills = new BiomeSandyWasteland(
			new BiomeProperties("wastelandsandhills")
			.setBaseHeight(0.45F)
			.setHeightVariation(0.3F)
			.setTemperature(2.0F)
			.setRainfall(0.0F)
			.setRainDisabled()
			, "wastelandsandhills");
	
	public static BiomeRiverWasteland river_wasteland = new BiomeRiverWasteland(
			new BiomeProperties("wastelandriver")
			.setBaseHeight(-0.5F)
			.setHeightVariation(0.0F)
			,"wastelandriver");
	
	
	public static void register(IForgeRegistry<Biome> event) {
		System.out.println("Registering Biomes");
		event.register(sandy_wasteland);
		event.register(snowy_wasteland);
		event.register(glass_wasteland);
		event.register(sandy_wasteland_hills);
		event.register(river_wasteland);
	}
	
	public static void initBiomeManagerDictionary() {
		System.out.println("Adding biomes to biome manager and biome dictionary");
		//Sandy Wasteland
		BiomeManager.addBiome(BiomeType.DESERT, new BiomeEntry(sandy_wasteland, 0));
		BiomeManager.addSpawnBiome(sandy_wasteland);
		BiomeManager.addStrongholdBiome(sandy_wasteland);
		BiomeManager.addVillageBiome(sandy_wasteland, false);
		BiomeDictionary.addTypes(sandy_wasteland, BiomeDictionary.Type.DRY);
		BiomeDictionary.addTypes(sandy_wasteland, BiomeDictionary.Type.HOT);
		BiomeDictionary.addTypes(sandy_wasteland, BiomeDictionary.Type.SANDY);
		
		//Snowy Wasteland
		BiomeManager.addBiome(BiomeType.ICY, new BiomeEntry(snowy_wasteland, 0));
		BiomeManager.addSpawnBiome(snowy_wasteland);
		BiomeManager.addStrongholdBiome(snowy_wasteland);
		BiomeManager.addVillageBiome(snowy_wasteland, false);
		BiomeDictionary.addTypes(snowy_wasteland, BiomeDictionary.Type.SNOWY);
		BiomeDictionary.addTypes(snowy_wasteland, BiomeDictionary.Type.COLD);
		
		//glass wasteland
		BiomeManager.addBiome(BiomeType.DESERT, new BiomeEntry(glass_wasteland, 0));
		BiomeManager.addSpawnBiome(glass_wasteland);
		BiomeManager.addStrongholdBiome(glass_wasteland);
		BiomeManager.addVillageBiome(glass_wasteland, false);
		BiomeDictionary.addTypes(glass_wasteland, BiomeDictionary.Type.DRY);
		BiomeDictionary.addTypes(glass_wasteland, BiomeDictionary.Type.HOT);
		BiomeDictionary.addTypes(glass_wasteland, BiomeDictionary.Type.SANDY);
		
		//sandywasteland hills
		BiomeManager.addBiome(BiomeType.DESERT, new BiomeEntry(sandy_wasteland_hills, 0));
		BiomeManager.addSpawnBiome(sandy_wasteland_hills);
		BiomeManager.addStrongholdBiome(sandy_wasteland_hills);
		BiomeManager.addVillageBiome(sandy_wasteland_hills, false);
		BiomeDictionary.addTypes(sandy_wasteland_hills, BiomeDictionary.Type.DRY);
		BiomeDictionary.addTypes(sandy_wasteland_hills, BiomeDictionary.Type.HOT);
		BiomeDictionary.addTypes(sandy_wasteland_hills, BiomeDictionary.Type.SANDY);
		
		//river
		BiomeManager.addVillageBiome(river_wasteland, false);
	}
}
