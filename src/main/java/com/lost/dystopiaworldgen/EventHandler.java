package com.lost.dystopiaworldgen;

import net.minecraftforge.event.terraingen.PopulateChunkEvent.Populate;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class EventHandler {
	
	@SubscribeEvent
	public static void onEvent(Populate event) {
		if (event.getType() == Populate.EventType.LAKE) {
			System.out.println("a lake has just generate and I have detected it !");
		}
	}
	
}
