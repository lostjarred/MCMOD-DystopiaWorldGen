package com.lost.dystopiaworldgen.block;

import com.lost.dystopiaworldgen.DystopiaWorldGen;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block {
	
	protected String name;

	public BlockBase(Material materialIn, String namein) {
		super(materialIn);
		this.name = namein;
		this.setRegistryName(name);
		this.setTranslationKey(name);
	}
	
	public void registerItemModel(Item itemBlock) {
		DystopiaWorldGen.proxy.registerItemRenderer(itemBlock, 0, name);
	}
	
	public Item createItemBlock() {
		return new ItemBlock(this).setRegistryName(getRegistryName());
	}
	
	@Override
	public BlockBase setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}
}
