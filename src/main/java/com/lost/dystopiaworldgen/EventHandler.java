package com.lost.dystopiaworldgen;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.living.LivingEvent.LivingJumpEvent;
import net.minecraftforge.event.terraingen.PopulateChunkEvent;
import net.minecraftforge.event.terraingen.PopulateChunkEvent.Populate;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber(modid = DystopiaWorldGen.MODID)
public class EventHandler {
	
	@SubscribeEvent
	public static void onEvent(PopulateChunkEvent event) {
			System.out.println("a chunk populate event has occured and I have found it");
	}

	//from https://jabelarminecraft.blogspot.com/p/minecraft-forge-172-event-handling.html
	@SubscribeEvent(priority=EventPriority.HIGHEST, receiveCanceled=true)
	public static void onEvent(LivingJumpEvent event)
	{
	    // DEBUG
	    if (event.getEntity() instanceof EntityPlayer)
	    {
	        System.out.println("Boing");
	    }
	        
	}


	
}
