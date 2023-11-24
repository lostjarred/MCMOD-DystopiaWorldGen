package com.lost.dystopiaworldgen;

import com.lost.dystopiaworldgen.block.BlockBase;
import com.lost.dystopiaworldgen.block.BlockFluidContainWater;
import com.lost.dystopiaworldgen.block.BlockGlass;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModBlocks {
	public static final BlockFluidContainWater CONTAINMENTEDWATERBLOCK = new BlockFluidContainWater(ModFluids.contaminated_water, ModMaterials.Containainedwater);
	public static final BlockGlass DGLASS = new BlockGlass(Material.GLASS, "dglass").setCreativeTab(CreativeTabs.MATERIALS);
	
	public static void register(IForgeRegistry<Block> registry) {
		System.out.println("Registering Blocks");
		registry.register(DGLASS);
		registry.register(CONTAINMENTEDWATERBLOCK);
	}
	
	public static void registeritemblock(IForgeRegistry<Item> registry) {
		System.out.println("Registering Item Blocks");
		registry.register(CONTAINMENTEDWATERBLOCK.createitemblock());
		registry.register(DGLASS.createItemBlock());
	}
	
	public static void registermodels() {
		System.out.println("Registering Block Models");
		CONTAINMENTEDWATERBLOCK.registerItemModel(Item.getItemFromBlock(CONTAINMENTEDWATERBLOCK));
		DGLASS.registerItemModel(Item.getItemFromBlock(DGLASS));
	}
}
