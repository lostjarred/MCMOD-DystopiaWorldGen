package com.lost.dystopiaworldgen;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.gen.feature.WorldGenLakes;
import net.minecraftforge.event.terraingen.PopulateChunkEvent;
import net.minecraftforge.event.terraingen.WorldTypeEvent;
import net.minecraftforge.fml.common.eventhandler.Event;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class EventHandlerTerrain {
	@SubscribeEvent
	public void onEvent(PopulateChunkEvent.Populate event) {
		//System.out.println(">>>> a populate event has occured and I have found it");
		if (event.getWorld().getWorldType() == ModWorldTypes.MulBioSandyWasteland) {
			if (event.getType() == PopulateChunkEvent.Populate.EventType.LAKE) {
				int blockposx = (event.getChunkX() * 16) + 8;
				int blockposz = (event.getChunkZ() * 16) + 8;
				int blockposy = 256;
				//System.out.println(">>>> a lake generation event has occured and I have found it " + blockposx + " " + blockposy + " "+ blockposz);
				(new WorldGenLakes(ModBlocks.containmentedwaterfluidblock)).generate(event.getWorld(), event.getRand(), new BlockPos(blockposx, blockposy, blockposz));
				event.setResult(Event.Result.DENY);
			}
		}
	}
	
	@SubscribeEvent
	public void onevent(WorldTypeEvent.InitBiomeGens event) {
	}
	
}
