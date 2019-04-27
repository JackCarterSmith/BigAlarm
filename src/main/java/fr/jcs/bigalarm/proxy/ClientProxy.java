package fr.jcs.bigalarm.proxy;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import fr.jcs.bigalarm.BigAlarmRefs;
import fr.jcs.bigalarm.gui.GuiAlarmBlock;
import fr.jcs.bigalarm.tileentitys.TileEntityAlarm;
import net.minecraft.client.Minecraft;

public class ClientProxy extends CommonProxy {
	@Override
	public void registerTileEntities() {
		//TileEntityIC2ThermoRenderer renderThermalMonitor = new TileEntityIC2ThermoRenderer();

		//ClientRegistry.registerTileEntity(shedar.mods.ic2.nuclearcontrol.tileentities.TileEntityThermo.class, "IC2Thermo", renderThermalMonitor);
		//GameRegistry.registerTileEntity(shedar.mods.ic2.nuclearcontrol.tileentities.TileEntityHowlerAlarm.class, "IC2HowlerAlarm");
	}
	
	@Override
	public void openGui(int id, Object arg) {
		switch (id) {
		case BigAlarmRefs.GUIID_AlarmBlock:
			Minecraft.getMinecraft().displayGuiScreen(new GuiAlarmBlock((TileEntityAlarm)arg));
			break;
		}
	}
}
