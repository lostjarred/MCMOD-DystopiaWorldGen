package com.lost.dystopiaworldgen;

import com.lost.dystopiaworldgen.block.BlockBase;
import com.lost.dystopiaworldgen.block.BlockFluidContainWater;
import com.lost.dystopiaworldgen.block.BlockFluidCustom;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModBlocks {
	
	public static BlockFluidContainWater containmentedwaterfluidblock = new BlockFluidContainWater(ModFluids.contaminated_water, ModMaterials.Containainedwater);
	public static BlockBase glass = new BlockBase(Material.GLASS, "glass").setCreativeTab(CreativeTabs.MATERIALS);
	
	public static void register(IForgeRegistry<Block> registry) {
		System.out.println("Registering Blocks");
		registry.register(containmentedwaterfluidblock);
		registry.register(glass);
	}
	
	public static void registeritemblock(IForgeRegistry<Item> registry) {
		System.out.println("Registering Item Blocks");
		registry.register(containmentedwaterfluidblock.createitemblock());
		registry.register(glass.createItemBlock());
	}
	
	public static void registermodels() {
		System.out.println("Registering Block Models");
		containmentedwaterfluidblock.registerItemModel(Item.getItemFromBlock(containmentedwaterfluidblock));
		glass.registerItemModel(Item.getItemFromBlock(glass));
	}
}
