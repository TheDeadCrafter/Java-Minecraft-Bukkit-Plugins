package me.bukkit.ChatColor;


import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.plugin.java.JavaPlugin;

import net.md_5.bungee.api.ChatColor;

public class spamOff extends JavaPlugin implements Listener {
	public void onEnable() {
		getServer().getPluginManager().registerEvents(this, this);
		
	}
	public void onDisable() {
		
	}
	@EventHandler
	public void playerChat(AsyncPlayerChatEvent event){
		 String message = event.getMessage();
		 
		
		 
	     message = message.replace("&6", ChatColor.GOLD + "");
	     message = message.replace("&b", ChatColor.BOLD + "");
	     
	     event.setMessage(message);
	    
	}
	

    
    

	 
	 
}
