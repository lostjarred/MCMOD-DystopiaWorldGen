package com.lost.dystopiaworldgen;

import net.minecraftforge.event.terraingen.PopulateChunkEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class EventHandlerTerrain {
	@SubscribeEvent
	public void onEvent(PopulateChunkEvent.Populate event) {
		//System.out.println(">>>> a populate event has occured and I have found it");
		if (event.getWorld().getWorldType() == ModWorldTypes.MulBioSandyWasteland) {
			if (event.getType() == PopulateChunkEvent.Populate.EventType.LAKE) {
				System.out.println(">>>> a lake generation event has occured and I have found it");
			}
		}
	}
}
