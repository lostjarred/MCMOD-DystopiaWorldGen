package com.lost.dystopiaworldgen;

import net.minecraft.util.math.BlockPos;
import net.minecraftforge.event.terraingen.PopulateChunkEvent;
import net.minecraftforge.fml.common.eventhandler.Event;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class EventHandlerTerrain {
	@SubscribeEvent
	public void onEvent(PopulateChunkEvent.Populate event) {
		//System.out.println(">>>> a populate event has occured and I have found it");
		if (event.getWorld().getWorldType() == ModWorldTypes.MulBioSandyWasteland) {
			if (event.getType() == PopulateChunkEvent.Populate.EventType.LAKE) {
				int blockposx = event.getChunkX() * 16;
				int blockposz = event.getChunkZ() * 16;
				System.out.println(">>>> a lake generation event has occured and I have found it " + blockposx + " " + blockposz);
				ModWorldGen.LAKE_CONTAINMENTEDWATER.generate(event.getWorld(), event.getRand(), new BlockPos( (event.getChunkX() * 16), 0, (event.getChunkZ() * 16) ) );
				event.setResult(Event.Result.DENY);
			}
		}
	}
}
