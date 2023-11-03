package com.lost.dystopiaworldgen;

import net.minecraftforge.event.terraingen.PopulateChunkEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber(modid = DystopiaWorldGen.MODID)
public class EventHandler {
	
	@SubscribeEvent
	public static void onEvent(PopulateChunkEvent event) {
		
	}	
}
