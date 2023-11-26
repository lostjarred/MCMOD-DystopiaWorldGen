package com.lost.dystopiaworldgen.block;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.BlockRenderLayer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockGlass extends BlockBase {

	public BlockGlass(Material materialIn, String namein) {
		super(materialIn, namein);
		this.setHardness(0.4f);
		this.setSoundType(SoundType.GLASS);
	}
	
	@SideOnly(Side.CLIENT)
    public BlockRenderLayer getRenderLayer()
    {
        return BlockRenderLayer.TRANSLUCENT;
    }
	
	@Override
	public BlockGlass setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}
	
	@Override
	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}
}
