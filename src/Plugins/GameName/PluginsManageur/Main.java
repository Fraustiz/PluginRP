package Plugins.GameName.PluginsManageur;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{
	
	public void onEnable(){
		System.out.println("[Plugin teste] Enabled");
		EventManager.registerEvents(this);
	}
	
	public void onDisable(){
		System.out.println("[Plugin teste] Enabled");
	}
	
}
