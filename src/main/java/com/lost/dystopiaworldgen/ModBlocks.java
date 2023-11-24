package com.lost.dystopiaworldgen;

import com.lost.dystopiaworldgen.block.BlockBase;
import com.lost.dystopiaworldgen.block.BlockFluidContainWater;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModBlocks {
	
	public static BlockFluidContainWater containmentedwaterfluidblock = new BlockFluidContainWater(ModFluids.contaminated_water, ModMaterials.Containainedwater);
	public static final BlockBase DGLASS = new BlockBase(Material.GLASS, "dglass").setCreativeTab(CreativeTabs.MATERIALS);
	
	public static void register(IForgeRegistry<Block> registry) {
		System.out.println("Registering Blocks");
		registry.register(containmentedwaterfluidblock);
		registry.register(DGLASS);
	}
	
	public static void registeritemblock(IForgeRegistry<Item> registry) {
		System.out.println("Registering Item Blocks");
		registry.register(containmentedwaterfluidblock.createitemblock());
		registry.register(DGLASS.createItemBlock());
	}
	
	public static void registermodels() {
		System.out.println("Registering Block Models");
		containmentedwaterfluidblock.registerItemModel(Item.getItemFromBlock(containmentedwaterfluidblock));
		DGLASS.registerItemModel(Item.getItemFromBlock(DGLASS));
	}
}
