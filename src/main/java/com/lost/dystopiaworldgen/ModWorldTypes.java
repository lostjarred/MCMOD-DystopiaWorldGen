package com.lost.dystopiaworldgen;

import com.lost.dystopiaworldgen.world.WorldTypeMultiWastelandSandy;
import com.lost.dystopiaworldgen.world.WorldTypeMultiWastelandSnow;
import com.lost.dystopiaworldgen.world.WorldTypeSingleBiome;

import net.minecraft.world.WorldType;

public class ModWorldTypes {
	//single biome World Types
		public static final WorldType SinBioSandyWasteland = new WorldTypeSingleBiome("sbsanwas", ModBiomes.sandy_wasteland);
		public static final WorldType SinBioSnowyWasteland = new WorldTypeSingleBiome("sbsnowas", ModBiomes.snowy_wasteland);
	
	//multi biome world types
		public static final WorldType MulBioSandyWasteland = new WorldTypeMultiWastelandSandy("mbsanwas");
		public static final WorldType MulBioSnowWasteland = new WorldTypeMultiWastelandSnow("mbsnowas");
}
