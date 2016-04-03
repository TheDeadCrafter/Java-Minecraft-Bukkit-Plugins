package me.bukkit.firstflames.playerChatScripts;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;


public class playerScripts extends JavaPlugin {
	@Override
	public void onEnable() {
		getLogger().info("Player chat scripts working!");
	}
	@Override
	public void onDisable() {
		
	}
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args ) {
		
		
		
			
		if (cmd.getName().equals("John1") && sender instanceof Player) {
			
			Player player = (Player) sender;
			
			
			player.chat("Ah, John, honestly the best server owner ever!");}
		
		
			
		if (cmd.getName().equals("John2") && sender instanceof Player) {
			
				Player player = (Player) sender;
				
				player.chat("Woah, John, can you flex those programming muscle's?");
				
			}
		
		if (cmd.getName().equals("John3") && sender instanceof Player) {
				Player player = (Player) sender;
				player.chat("D and D time!");
			}return false;
			
			
			
		}
		
	}

			
		