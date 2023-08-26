package com.lost.dystopiaworldgen;

import com.lost.dystopiaworldgen.fluid.ModFluid;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.FluidRegistry;

public class ModFluids {
	public static ModFluid contaminated_water = new ModFluid(
			"conwater", 
			new ResourceLocation("dystopiaworldgen", "blocks/conwater_still"), 
			new ResourceLocation("dystopiaworldgen", "blocks/conwater_flow")
			);
	
	public static void register() {
		System.out.println("Registering Fluids");
		FluidRegistry.registerFluid(contaminated_water);
		System.out.println("Adding bucket for Fluids");
		FluidRegistry.addBucketForFluid(contaminated_water);
	}
}
