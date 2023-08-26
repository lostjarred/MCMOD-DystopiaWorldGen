package com.lost.dystopiaworldgen.fluid;

import java.awt.Color;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;

public class ModFluid extends Fluid {
	public ModFluid(String fluidName, ResourceLocation still, ResourceLocation flowing) {
		super(fluidName, still, flowing);
	}
	
	public ModFluid(String fluidName, ResourceLocation still, ResourceLocation flowing, Color color){
		super(fluidName, still, flowing, color);
	}
	
	public ModFluid(String fluidName, ResourceLocation still, ResourceLocation flowing, int color){
		super(fluidName, still, flowing, color);
	}
}
