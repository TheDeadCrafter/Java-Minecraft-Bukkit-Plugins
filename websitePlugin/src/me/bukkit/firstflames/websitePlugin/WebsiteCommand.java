package me.bukkit.firstflames.websitePlugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class WebsiteCommand extends JavaPlugin {
	@Override
	public void onEnable() {
		getLogger().info("Plugin workingMyFirstPlugin working!");
	}
	@Override
	public void onDisable() {
		
	}
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args ) {
		
		if (cmd.getName().equals("website") && sender instanceof Player) {
			
			Player player = (Player) sender;
			
			player.sendMessage("Website address: §l§6http://4077th.mooo.com/~schelcc/zorak.html");
			return true; }
			
		/*if (cmd.getName().equals("") && sender instance of Player) {
			
			Player player = (Player) sender;
			player.chat("Hello world!");
			
			
			return true;
			
		}*/
			
			
		
		
		return false;
	}
}
