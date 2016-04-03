package me.bukkit.firstflames.PlayerScripts;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class PlayerScript extends JavaPlugin {
	@Override
	public void onEnable() {
		getLogger().info("Player Script working!");
	}
	@Override
	public void onDisable() {
		
	}
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args ) {
		
		
		if (cmd.getName().equals("The_Dead_Crafter") && sender instanceof Player) {
			
			Player player = (Player) sender;
			player.chat("The Dead Crafter is the best in the world");
			
			
			return true;
			
		}
			
			
		
		
		return false;
	}
}
