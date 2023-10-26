package com.lost.dystopiaworldgen;

import com.lost.dystopiaworldgen.world.WorldTypeMulti;
import com.lost.dystopiaworldgen.world.WorldTypeSingleBiome;

import net.minecraft.world.WorldType;

public class ModWorldTypes {
	//custome world type, single biome uses SandyWasteland biome
	public static final WorldType SinBioSandyWasteland = new WorldTypeSingleBiome("sbsanwas", ModBiomes.sandy_wasteland);
	//single biome snowy wasteland
	public static final WorldType SinBioSnowyWasteland = new WorldTypeSingleBiome("sbsnowas", ModBiomes.snowy_wasteland);
	
	public static final WorldType MulBioSandyWasteland = new WorldTypeMulti("mbsanwas");
}
