package me.com_boy.minecraft.netherportalrestrict;

import org.bukkit.plugin.java.JavaPlugin;

public class NetherPortalRestrict extends JavaPlugin
{	
	private final NetherPortalRestrictListener listener = new NetherPortalRestrictListener(this);
	public void onEnable()
	{
		getServer().getPluginManager().registerEvents(listener, this);
		getLogger().info("NetherPortalRestrict by com. BOY has been enabled! Website: com-BOY.weebly.com");
	}
}
