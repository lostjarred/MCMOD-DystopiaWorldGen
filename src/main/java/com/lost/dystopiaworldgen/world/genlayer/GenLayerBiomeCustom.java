package com.lost.dystopiaworldgen.world.genlayer;

import com.lost.dystopiaworldgen.ModBiomes;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.IntCache;

public class GenLayerBiomeCustom extends GenLayer 
{
	private Biome[] allowedBiomes = {ModBiomes.sandy_wasteland, ModBiomes.glass_wasteland};
	public GenLayerBiomeCustom(long seed) {
		super(seed);
	}

	@Override
	public int[] getInts(int areaX, int areaY, int areaWidth, int areaHeight) {
		int[] dest = IntCache.getIntCache(areaWidth*areaHeight);
		for (int dz = 0; dz < areaHeight; dz++) {
			for (int dx = 0; dx < areaWidth; dx++) {
				this.initChunkSeed(dx + areaX, dz + areaY);
				dest[(dx + dz * areaWidth)] = Biome.getIdForBiome(this.allowedBiomes[nextInt(this.allowedBiomes.length)]);
			}
		}
		return dest;
	}

}
