package fr.jcs.bigalarm;

import net.minecraft.launchwrapper.Launch;

public class BigAlarmRefs {
	public static final String MOD_ID = "bigalarm";
	public static final String MOD_NAME = "BigAlarm";
	public static final String PROXY_CLIENT = "fr.jcs.bigalarm.proxy.ClientProxy";
	public static final String PROXY_SERVER = "fr.jcs.bigalarm.proxy.CommonProxy";
	public static final boolean isDevEnv = (Boolean)Launch.blackboard.get("fml.deobfuscatedEnvironment");
	
	public static final String GUI = "gui." + MOD_ID + ".";
	
	public static final int GUIID_AlarmBlock = 0;
}
