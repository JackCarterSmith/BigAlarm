package fr.jcs.bigalarm.proxy;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

public class ClientProxy extends CommonProxy {
	@Override
	public void registerTileEntities() {
		//TileEntityIC2ThermoRenderer renderThermalMonitor = new TileEntityIC2ThermoRenderer();

		//ClientRegistry.registerTileEntity(shedar.mods.ic2.nuclearcontrol.tileentities.TileEntityThermo.class, "IC2Thermo", renderThermalMonitor);
		//GameRegistry.registerTileEntity(shedar.mods.ic2.nuclearcontrol.tileentities.TileEntityHowlerAlarm.class, "IC2HowlerAlarm");
	}
}
