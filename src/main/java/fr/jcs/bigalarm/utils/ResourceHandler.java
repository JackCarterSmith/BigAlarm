package fr.jcs.bigalarm.utils;

import java.util.HashMap;
import java.util.Map;

import fr.jcs.bigalarm.BigAlarmRefs;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ResourceLocation;

public class ResourceHandler {
	public static ResourceHandler instance = new ResourceHandler();
	private static Map<String, ResourceLocation> cachedResources = new HashMap<String, ResourceLocation>();
	
    public static ResourceLocation getResource(String rs) {
        if (!cachedResources.containsKey(rs))
            cachedResources.put(rs, new ResourceLocation(BigAlarmRefs.RESOURCESPREFIX + rs));
        return cachedResources.get(rs);
    }
	
    public static void bindTexture(ResourceLocation texture) {
        Minecraft.getMinecraft().renderEngine.bindTexture(texture);
    }

	public static void bindResource(String rs) {
		bindTexture(ResourceHandler.getResource(rs));
	}
}
