package me.com_boy.minecraft.netherportalrestrict;

import me.com_boy.minecraft.netherportalrestrict.NetherPortalRestrict;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerPortalEvent;

public class NetherPortalRestrictListener implements Listener {
	
	public static NetherPortalRestrict plugin;
	
	public NetherPortalRestrictListener(NetherPortalRestrict plugin)
	{
		this.plugin = plugin;
	}
	
	@EventHandler(priority = EventPriority.NORMAL)
	public void onPlayerPortal(PlayerPortalEvent event)
	{
		Player player = event.getPlayer();
		
		if ( ! player.hasPermission("NetherPortalRestrict.useportal"))
		{
			event.setCancelled(true);
			player.sendMessage("¤cYou don't have permission to use nether portals!");
		}
	}
}