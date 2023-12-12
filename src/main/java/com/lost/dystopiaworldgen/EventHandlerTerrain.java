package com.lost.dystopiaworldgen;

import com.lost.dystopiaworldgen.world.gen.layer.GenLayerCustomBiomeGenerators;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.gen.feature.WorldGenLakes;
import net.minecraftforge.event.terraingen.PopulateChunkEvent;
import net.minecraftforge.event.terraingen.WorldTypeEvent;
import net.minecraftforge.fml.common.eventhandler.Event;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class EventHandlerTerrain {
	@SubscribeEvent
	public void onEvent(PopulateChunkEvent.Populate event) {
		if (event.getWorld().getWorldType() == ModWorldTypes.MulBioSandyWasteland || event.getWorld().getWorldType() == ModWorldTypes.MulBioSnowWasteland) {
			if (event.getType() == PopulateChunkEvent.Populate.EventType.LAKE) {
				int blockposx = (event.getChunkX() * 16) + 8;
				int blockposz = (event.getChunkZ() * 16) + 8;
				int blockposy = 256;
				(new WorldGenLakes(ModBlocks.CONTAINMENTEDWATERBLOCK)).generate(event.getWorld(), event.getRand(), new BlockPos(blockposx, blockposy, blockposz));
				event.setResult(Event.Result.DENY);
			}
		}
	}
	
	@SubscribeEvent
	public void onevent(WorldTypeEvent.InitBiomeGens event) {
		if (event.getWorldType() == ModWorldTypes.MulBioSandyWasteland || event.getWorldType() == ModWorldTypes.MulBioSnowWasteland) {
			event.setNewBiomeGens(GenLayerCustomBiomeGenerators.initializeAllBiomeGenerators(event.getSeed(), event.getWorldType(), null));
		}
	}
	
}
