package fr.jcs.bigalarm.items;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class AlarmBlockItem extends ItemBlock {

	public AlarmBlockItem(Block p_i45328_1_) {
		super(p_i45328_1_);
		this.setCreativeTab(CreativeTabs.tabDecorations);
	}
	
	@Override
	public String getUnlocalizedName(ItemStack item) {
		return "tile.bigalarm.alarmblock";
	}

}
