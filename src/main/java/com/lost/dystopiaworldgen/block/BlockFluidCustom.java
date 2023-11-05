package com.lost.dystopiaworldgen.block;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.lost.dystopiaworldgen.DystopiaWorldGen;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
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
	
	// from https://github.com/GregTechCEu/GregTech/blob/master/src/main/java/gregtech/api/fluids/MaterialFluidBlock.java
	@Nullable
    @Override
    public Boolean isEntityInsideMaterial(@Nonnull IBlockAccess world, @Nonnull BlockPos blockpos, @Nonnull IBlockState iblockstate, @Nonnull Entity entity, double yToTest, @Nonnull net.minecraft.block.material.Material materialIn, boolean testingHead) {
        return materialIn == net.minecraft.block.material.Material.WATER ? true : null;
    }
}
