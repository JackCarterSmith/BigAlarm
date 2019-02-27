package fr.jcs.bigalarm.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fr.jcs.bigalarm.BigAlarmRefs;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class AlarmBlock extends BlockContainer {
	private IIcon iconAlarm;

	public AlarmBlock() {
		super(Material.iron);
		setHardness(5.0F);
		setResistance(20.0F);
		this.setStepSound(soundTypeMetal);
		this.setUnlocalizedName(BigAlarmRefs.MOD_ID + ":alarmBlock");
		this.setTextureName(BigAlarmRefs.MOD_ID + ":default");
		this.setCreativeTab(CreativeTabs.tabDecorations);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister) {		//Method name different but is registerBlockIcons()
		this.blockIcon = iconRegister.registerIcon(BigAlarmRefs.MOD_ID + ":alarmBlock/side");
        this.iconAlarm = iconRegister.registerIcon(BigAlarmRefs.MOD_ID + ":alarmBlock/top");
	}
	@Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta)
    {
    	/*if (side == 1) {		//Simplified sentence below
			return this.iconAlarm;
		} else {
			return this.blockIcon;
		}*/
		
		return side == 1 ? this.iconAlarm : this.blockIcon;
    }
	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(IBlockAccess world, int x, int y, int z, int side)
	{
		return side == 1 ? this.iconAlarm : this.blockIcon;
	}
    
	@Override
    public boolean isFullBlock()
    {
        return true;
    }
	
	@Override
	public boolean isBlockNormalCube() {
		return true;
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
