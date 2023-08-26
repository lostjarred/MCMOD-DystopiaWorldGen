package com.lost.dystopiaworldgen;

import com.lost.dystopiaworldgen.block.BlockFluidCustom;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModBlocks {
	
	public static BlockFluidCustom containmentedwaterfluidblock = new BlockFluidCustom(ModFluids.contaminated_water, ModMaterials.Containainedwater);
	
	public static void register(IForgeRegistry<Block> registry) {
		System.out.println("Registering Blocks");
		registry.register(containmentedwaterfluidblock);
	}
	
	public static void registeritemblock(IForgeRegistry<Item> registry) {
		System.out.println("Registering Item Blocks");
		registry.register(containmentedwaterfluidblock.createitemblock());
	}
	
	public static void registermodels() {
		System.out.println("Registering Block Models");
		containmentedwaterfluidblock.registerItemModel(Item.getItemFromBlock(containmentedwaterfluidblock));
	}
}
