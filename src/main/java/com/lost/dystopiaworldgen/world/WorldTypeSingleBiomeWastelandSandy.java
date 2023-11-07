package com.lost.dystopiaworldgen.world;

import com.lost.dystopiaworldgen.ModBiomes;

public class WorldTypeSingleBiomeWastelandSandy extends WorldTypeSingleBiome {

	public WorldTypeSingleBiomeWastelandSandy(String name) {
		super(name, ModBiomes.sandy_wasteland);
	}
	
	@Override
	public boolean canBeCreated() {
		return false;
	}
}
