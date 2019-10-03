package me.caleb.DeathMessages;

import org.bukkit.plugin.java.JavaPlugin;

import me.caleb.DeathMessages.Listeners.PlayerDeathListener;

public class Main extends JavaPlugin{
	@Override
	public void onEnable() {
		saveDefaultConfig();
		new PlayerDeathListener(this);
	}
}
