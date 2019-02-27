package fr.jcs.bigalarm.utils;

import org.apache.logging.log4j.Level;

import cpw.mods.fml.common.FMLLog;
import fr.jcs.bigalarm.BigAlarmRefs;

public class LogHelper {
	public static void log(Level logLevel, Object object) {
		FMLLog.log(BigAlarmRefs.MOD_ID, logLevel, String.valueOf(object), new Object[0]);
	}

	public static void error(Object object) {
		log(Level.ERROR, object);
	}

	public static void info(Object object) {
		log(Level.INFO, object);
	}

	public static void warn(Object object) {
		log(Level.WARN, object);
	}
}
