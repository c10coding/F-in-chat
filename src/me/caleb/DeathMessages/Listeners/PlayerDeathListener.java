package me.caleb.DeathMessages.Listeners;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import me.caleb.DeathMessages.Main;
import me.caleb.DeathMessages.Utils.Utils;

public class PlayerDeathListener implements Listener{
	
	private Main plugin;
	
	public PlayerDeathListener(Main plugin) {
		this.plugin = plugin;
		
		Bukkit.getPluginManager().registerEvents(this,plugin);
	}
	
	@EventHandler
	public void onPlayerDeath(PlayerDeathEvent e) {
		
		Player p = e.getEntity();
		
		if(e.getEntity().getKiller() instanceof Player) {
			Bukkit.broadcastMessage(Utils.chat(plugin.getConfig().getString("death_message").replace("<player>", p.getName())));
		}else {
			Bukkit.broadcastMessage(Utils.chat(plugin.getConfig().getString("death_message").replace("<player>", p.getName())));
		}
	}
}
