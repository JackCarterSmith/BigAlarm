package fr.jcs.bigalarm.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fr.jcs.bigalarm.BigAlarm;
import fr.jcs.bigalarm.BigAlarmRefs;
import fr.jcs.bigalarm.tileentitys.TileEntityAlarm;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
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
		this.setLightOpacity(15);
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
	public void breakBlock(World worldIn, int x, int y, int z, Block blockBroken, int meta) {
		super.breakBlock(worldIn, x, y, z, blockBroken, meta);
	}
	
	@Override
	public boolean onBlockActivated(World worldIn, int x, int y, int z, EntityPlayer player, int side, float subX, float subY, float subZ) {
		if (!worldIn.isRemote) {
			BigAlarm.proxy.openGui(BigAlarmRefs.GUIID_AlarmBlock,worldIn.getTileEntity(x, y, z));
		}
		
		return super.onBlockActivated(worldIn, x, y, z, player, side, subX, subY, subZ);
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
		return new TileEntityAlarm();
	}
	
}
