package me.bukkit.fly;
 
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import net.md_5.bungee.api.ChatColor;


 
public class fly extends JavaPlugin {
 
	public void onEnable() {
		
	}
	
	public void onDisable() {
		
	}
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args ) {
		
		
		
		
		if (cmd.getName().equals("fly") && sender instanceof Player) {
			
			Player player = (Player) sender;
			
			player.sendMessage(ChatColor.BOLD + "Fly enabled");
			
			player.setAllowFlight(isEnabled());
			
			boolean fly = true;
			
			
			
			}
		return false;
	
}
}