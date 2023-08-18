package com.lost.dystopiaworldgen;

import com.lost.dystopiaworldgen.proxy.CommonProxy;

import net.minecraft.item.Item;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod(modid = DystopiaWorldGen.MODID, name = DystopiaWorldGen.NAME, version = DystopiaWorldGen.VERSION)
public class DystopiaWorldGen {
	public static final String MODID = "dystopiaworldgen";
	public static final String NAME = "Dystopia World Gen";
	public static final String VERSION = "0.1.0";
	
	public static final ModWorldTypes worldtypes = new ModWorldTypes();
	
	@Mod.Instance(MODID)
	public static DystopiaWorldGen instance;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		System.out.println(NAME + " is loading!");
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		ModBiomes.initBiomeManagerDictionary();
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {

	}
	
	@SidedProxy(serverSide = "com.lost.dystopiaworldgen.proxy.CommonProxy", clientSide = "com.lost.dystopiaworldgen.proxy.ClientProxy")
	public static CommonProxy proxy;
	
	@Mod.EventBusSubscriber
	public static class RegistrationHandler {
		@SubscribeEvent
		public static void registerItems(RegistryEvent.Register<Item> event) {
		}
		
		@SubscribeEvent
		public static void registerItems(ModelRegistryEvent event) {
		}
		
		@SubscribeEvent
		public static void registerBiomes(RegistryEvent.Register<Biome> event) {
			ModBiomes.register(event.getRegistry());
		}
	}
}
