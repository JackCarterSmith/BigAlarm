package fr.jcs.bigalarm.proxy;

import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.registry.GameRegistry;
import fr.jcs.bigalarm.BigAlarmRefs;
import fr.jcs.bigalarm.tileentitys.TileEntityAlarm;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class CommonProxy {
	public void registerTileEntities() {
		//GameRegistry.registerTileEntity(TileEntityThermo.class, "IC2Thermo");
	}
	
	public void openGui(int id, Object arg) {}
}
