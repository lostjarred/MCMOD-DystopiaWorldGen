package com.lost.dystopiaworldgen;

import net.minecraftforge.event.terraingen.PopulateChunkEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class EventHandlerTerrain {
	@SubscribeEvent
	public void onEvent(PopulateChunkEvent.Populate event) {
		System.out.println(">>>> a populate event has occured and I have found it");
	}
}
