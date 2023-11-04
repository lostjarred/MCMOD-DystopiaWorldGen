package com.lost.dystopiaworldgen;

import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.chunk.Chunk;
import net.minecraftforge.event.terraingen.ChunkGeneratorEvent;
import net.minecraftforge.event.terraingen.PopulateChunkEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber(modid = DystopiaWorldGen.MODID)
public class EventHandler {
	
	@SubscribeEvent
	public static void onEvent(PopulateChunkEvent event) {
		Chunk pchunk = event.getWorld().getChunk(event.getChunkX(), event.getChunkZ());
		for (int x = 0; x < 16; x++) {
			for (int z = 0; z < 16; z++) {
				for (int y = pchunk.getHeightValue(x, z) - 20; y < pchunk.getHeightValue(x, z) + 1; y++) {
					if (pchunk.getBlockState(x, y, z).getBlock() == Blocks.WATER) {
						pchunk.setBlockState(new BlockPos(x, y, z), ModBlocks.containmentedwaterfluidblock.getDefaultState());
					}
				}
			}
		}
	}
	
}
