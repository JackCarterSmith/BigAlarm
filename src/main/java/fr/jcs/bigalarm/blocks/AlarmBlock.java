package fr.jcs.bigalarm.blocks;

import fr.jcs.bigalarm.BigAlarmRefs;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class AlarmBlock extends BlockContainer {
	public AlarmBlock() {
		super(Material.iron);
		this.setHardness(5.0F);
		this.setResistance(4.0F);
		this.setStepSound(soundTypeMetal);
		this.setUnlocalizedName(BigAlarmRefs.MOD_ID + ":alarmBlock");
		this.setTextureName(BigAlarmRefs.MOD_ID + ":alarmBlock/front");
		this.setCreativeTab(CreativeTabs.tabDecorations);
	}
	
	@Override
    public boolean isFullBlock()
    {
        return false;
    }
	
	@Override
	public boolean isBlockNormalCube() {
		return false;
	}

	@Override
	public boolean renderAsNormalBlock() {
		return false;
	}

	@Override
	public boolean isOpaqueCube() {
		return false;
	}

	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return null;
	}
	
}
