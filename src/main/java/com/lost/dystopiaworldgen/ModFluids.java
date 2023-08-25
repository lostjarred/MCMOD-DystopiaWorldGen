package com.lost.dystopiaworldgen;

import com.lost.dystopiaworldgen.fluid.ModFluid;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.FluidRegistry;

public class ModFluids {
	public static ModFluid contaimnated_water = new ModFluid(
			"containmentedwater", 
			new ResourceLocation("minecraft", "water_still"), 
			new ResourceLocation("minecraft", "water_flow") 
			);
	
	public static void register() {
		System.out.println("Registering Fluids");
		FluidRegistry.registerFluid(contaimnated_water);
		System.out.println("Adding bucket for Fluids");
		FluidRegistry.addBucketForFluid(contaimnated_water);
	}
}
