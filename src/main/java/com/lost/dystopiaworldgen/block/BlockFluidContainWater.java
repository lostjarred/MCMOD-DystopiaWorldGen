package com.lost.dystopiaworldgen.block;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.MobEffects;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fluids.Fluid;

public class BlockFluidContainWater extends BlockFluidCustom {

	public BlockFluidContainWater(Fluid fluid, Material material) {
		super(fluid, material);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void onEntityCollision(World worldIn, BlockPos pos, IBlockState state, Entity entityIn) {
		if (entityIn instanceof EntityLivingBase) {
			entityIn.attackEntityFrom(DamageSource.CACTUS, 1.0f);
			( (EntityLivingBase) entityIn ).addPotionEffect( new PotionEffect(MobEffects.POISON, 60) );
		}
	}
}
