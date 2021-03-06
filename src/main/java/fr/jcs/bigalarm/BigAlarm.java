package fr.jcs.bigalarm;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import fr.jcs.bigalarm.blocks.AlarmBlock;
import fr.jcs.bigalarm.proxy.CommonProxy;
import net.minecraft.block.Block;

@Mod(modid = BigAlarmRefs.MOD_ID, name = BigAlarmRefs.MOD_NAME, version = "@VERSION@", canBeDeactivated = false, dependencies = "required-after:Forge@[10.13.4.1566,)")
public class BigAlarm {
	@Instance(BigAlarmRefs.MOD_ID)
	public static BigAlarm instance = new BigAlarm();

	@SidedProxy(clientSide = BigAlarmRefs.PROXY_CLIENT, serverSide = BigAlarmRefs.PROXY_SERVER)
	public static CommonProxy proxy;
	public static final SimpleNetworkWrapper netWrapper = NetworkRegistry.INSTANCE.newSimpleChannel(BigAlarmRefs.MOD_ID);
	
	public static AlarmBlock alarmBlock;
	
    @EventHandler
    public void preInit(FMLInitializationEvent event)
    {
        System.out.println("[BigAlarm]: Making nuut sound...");
        proxy.registerTileEntities();
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        System.out.println("[BigAlarm]: Connecting speakers...");
        alarmBlock = new AlarmBlock();
        GameRegistry.registerBlock(alarmBlock, "alarmBlock");
        //netWrapper.registerMessage(messageHandler, requestMessageType, 0, Side.SERVER);
    }
     
    @EventHandler
    public void postInit(FMLInitializationEvent event)
    {
        System.out.println("[BigAlarm]: Ready to make big NUUUUUUUUTTTT!!!");
    }

}
