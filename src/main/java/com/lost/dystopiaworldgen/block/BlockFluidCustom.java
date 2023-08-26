package com.lost.dystopiaworldgen.block;

import com.lost.dystopiaworldgen.DystopiaWorldGen;

import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;

public class BlockFluidCustom extends BlockFluidClassic {
	String name;
	public BlockFluidCustom(Fluid fluid, Material material) {
		super(fluid, material);
		this.name = fluid.getName() + ".fluidblock";
		setRegistryName(name);
	}
	
	public void registerItemModel(Item itemblock) {
		DystopiaWorldGen.proxy.registerItemRenderer(itemblock, 0, name);
	}
	
	public Item createitemblock() {
		return new ItemBlock(this).setRegistryName(getRegistryName());
	}
}
