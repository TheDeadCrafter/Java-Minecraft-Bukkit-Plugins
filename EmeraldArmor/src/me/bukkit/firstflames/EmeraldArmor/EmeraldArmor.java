package me.bukkit.firstflames.EmeraldArmor;
 
import java.util.Arrays;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
//import org.bukkit.inventory.ShapelessRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

import net.md_5.bungee.api.ChatColor;
 
public class EmeraldArmor extends JavaPlugin {
	public void openGui(Player player) {
		Inventory helmet = Bukkit.createInventory(null, 3 * 3, ChatColor.DARK_GREEN + "helmet");
		
		
		
		
		
		
		//3 5
		
		
		player.openInventory(helmet);
		
		
		
		
		
	}
	public void onEnable() {
		
		
		/****************HELMET*****************/
		
		ItemStack helmet = new ItemStack(Material.DIAMOND_HELMET);
		ItemMeta meta = helmet.getItemMeta();
		meta.setDisplayName(ChatColor.GRAY + "§2Emerald helmet");
		meta.setLore(Arrays.asList());
		meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 6, true);
		meta.addEnchant(Enchantment.DURABILITY, 5, true);
		helmet.setItemMeta(meta);
		
		ShapedRecipe eHelmet = new ShapedRecipe(helmet);
		eHelmet.shape(
                        "@@@",
                        "@ @",
                        "   ");
		eHelmet.setIngredient('@', Material.EMERALD);
		
		/***************END HELMET*********************/
		/***************CHESTPLATE*********************/
		
		ItemStack chestplate = new ItemStack(Material.DIAMOND_CHESTPLATE);
		ItemMeta metaChest = chestplate.getItemMeta();
		metaChest.setDisplayName(ChatColor.GRAY + "§2Emerald chestplate");
		metaChest.setLore(Arrays.asList());
		metaChest.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 6, true);
		metaChest.addEnchant(Enchantment.DURABILITY, 5, true);
		chestplate.setItemMeta(metaChest);
		
		ShapedRecipe eChestplate = new ShapedRecipe(chestplate);
		eChestplate.shape(
                        "@ @",
                        "@@@",
                        "@@@");
		eChestplate.setIngredient('@', Material.EMERALD);
		
		/**************END CHESTPLATE*******************/
		/**************LEGGINGS*************************/
		
		ItemStack leggings = new ItemStack(Material.DIAMOND_LEGGINGS);
		ItemMeta metaLeg = chestplate.getItemMeta();
		metaLeg.setDisplayName(ChatColor.GRAY + "§2Emerald leggings");
		metaLeg.setLore(Arrays.asList());
		metaLeg.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 6, true);
		metaLeg.addEnchant(Enchantment.DURABILITY, 5, true);
		leggings.setItemMeta(metaLeg);
		
		ShapedRecipe eLeggings = new ShapedRecipe(leggings);
		eLeggings.shape(
                        "@@@",
                        "@ @",
                        "@ @");
		eLeggings.setIngredient('@', Material.EMERALD);
		
		
		
		/*************END LEGGINGS**********************/
		/*************BOOTS*****************************/
		
		ItemStack boots = new ItemStack(Material.DIAMOND_BOOTS);
		ItemMeta metaBoot = boots.getItemMeta();
		metaBoot.setDisplayName(ChatColor.GRAY + "§2Emerald boots");
		metaBoot.setLore(Arrays.asList());
		metaBoot.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 6, true);
		metaBoot.addEnchant(Enchantment.DURABILITY, 5, true);
		boots.setItemMeta(metaBoot);
		
		ShapedRecipe eBoots = new ShapedRecipe(boots);
		eBoots.shape(
                        "   ",
                        "@ @",
                        "@ @");
		eBoots.setIngredient('@', Material.EMERALD);
		
		/**************END ARMOR SECTION*************************/
		/*************SWORD******************************/
		
		ItemStack sword = new ItemStack(Material.DIAMOND_SWORD);
		ItemMeta metaSword = sword.getItemMeta();
		metaSword.setDisplayName(ChatColor.GRAY + "§2Emerald sword");
		metaSword.setLore(Arrays.asList());
		metaSword.addEnchant(Enchantment.DAMAGE_ALL, 5, true);
		metaSword.addEnchant(Enchantment.DURABILITY, 5, true);
		sword.setItemMeta(metaSword);
		
		ShapedRecipe eSword = new ShapedRecipe(sword);
		eSword.shape(
				" @ ",
				" @ ",
				" $ ");
		eSword.setIngredient('@', Material.EMERALD);
		eSword.setIngredient('$', Material.STICK);
		
		/****************END SWORD*****************/
		/****************SHOVEL*******************/
		
		ItemStack shovel = new ItemStack(Material.DIAMOND_SPADE);
		ItemMeta metaShovel = shovel.getItemMeta();
		metaShovel.setDisplayName(ChatColor.GRAY + "§2Emerald shovel");
		metaShovel.setLore(Arrays.asList());
		metaShovel.addEnchant(Enchantment.DIG_SPEED, 5, true);
		metaShovel.addEnchant(Enchantment.DURABILITY, 5, true);
		shovel.setItemMeta(metaShovel);
		
		ShapedRecipe eShovel = new ShapedRecipe(shovel);
		eShovel.shape(
				" @ ",
				" $ ",
				" $ ");
		eShovel.setIngredient('@', Material.EMERALD);
		eShovel.setIngredient('$', Material.STICK);
		
		/**************END SHOVEL********************/
		/**************PICKAXE***********************/
		
		ItemStack pickaxe = new ItemStack(Material.DIAMOND_PICKAXE);
		ItemMeta metaPickaxe = pickaxe.getItemMeta();
		metaPickaxe.setDisplayName(ChatColor.GRAY + "§2Emerald pickaxe");
		metaPickaxe.setLore(Arrays.asList());
		metaPickaxe.addEnchant(Enchantment.DIG_SPEED, 5, true);
		metaPickaxe.addEnchant(Enchantment.DURABILITY, 5, true);
		pickaxe.setItemMeta(metaPickaxe);
		
		ShapedRecipe ePickaxe = new ShapedRecipe(pickaxe);
		ePickaxe.shape(
				"%%%",
				" # ",
				" # ");
		ePickaxe.setIngredient('%', Material.EMERALD);
		ePickaxe.setIngredient('#', Material.STICK);
		
		/*****************END PICKAXE*****************/
		/*****************HOE*********************/
		
		ItemStack hoe = new ItemStack(Material.DIAMOND_HOE);
		ItemMeta metaHoe = hoe.getItemMeta();
		metaHoe.setDisplayName(ChatColor.GRAY + "§2Emerald hoe");
		metaHoe.setLore(Arrays.asList());
		metaHoe.addEnchant(Enchantment.DURABILITY, 5, true);
		hoe.setItemMeta(metaHoe);
		
		ShapedRecipe eHoe = new ShapedRecipe(hoe);
		eHoe.shape(
				" %%",
				" # ",
				" # ");
		eHoe.setIngredient('%', Material.EMERALD);
		eHoe.setIngredient('#', Material.STICK);
		
		/****************END HOE**********************/
		/****************AXE*********************/
		
		ItemStack axe = new ItemStack(Material.DIAMOND_AXE);
		ItemMeta metaAxe = axe.getItemMeta();
		metaAxe.setDisplayName(ChatColor.GRAY + "§2Emerald axe");
		metaAxe.setLore(Arrays.asList());
		metaAxe.addEnchant(Enchantment.DURABILITY, 5, true);
		metaAxe.addEnchant(Enchantment.DIG_SPEED, 5, true);
		axe.setItemMeta(metaAxe);
		
		ShapedRecipe eAxe = new ShapedRecipe(axe);
		eAxe.shape(
				" %%",
				" #%",
				" # ");
		eAxe.setIngredient('%', Material.EMERALD);
		eAxe.setIngredient('#', Material.STICK);
		
		
		
		
		
		Bukkit.getServer().addRecipe(eHelmet);
		Bukkit.getServer().addRecipe(eChestplate);
		Bukkit.getServer().addRecipe(eLeggings);
		Bukkit.getServer().addRecipe(eBoots);
		Bukkit.getServer().addRecipe(eSword);
		Bukkit.getServer().addRecipe(eShovel);
		Bukkit.getServer().addRecipe(ePickaxe);
		Bukkit.getServer().addRecipe(eHoe);
		Bukkit.getServer().addRecipe(eAxe);}
		
		/*******************RECIPE COMMANDS******************************/
		
		public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args ) {
			
			
			
			
			if (cmd.getName().equals("emeraldarmorhelp") && sender instanceof Player) {
				
				Player player = (Player) sender;
				
				
				player.sendMessage(ChatColor.BLUE + "Here are the commands for the Emerald Armor plugin");
				player.sendMessage(ChatColor.BLUE + "-------ARMOR------");
				player.sendMessage(ChatColor.BLUE + "		/Erecipe emHelmet");
				player.sendMessage(ChatColor.BLUE + "		/Erecipe emChest");
				player.sendMessage(ChatColor.BLUE + "		/Erecipe emLeggings");
				player.sendMessage(ChatColor.BLUE + "		/Erecipe emBoots");
				player.sendMessage(ChatColor.BLUE + "	-------TOOLS------");
				player.sendMessage(ChatColor.BLUE + "		/Erecipe emPick");
				player.sendMessage(ChatColor.BLUE + "       /Erecipe emShovel");
				player.sendMessage(ChatColor.BLUE + "       /Erecipe emSword");
				player.sendMessage(ChatColor.BLUE + "       /recipe emHoe");
				
				
				
		
			}
			
			if (cmd.getName().equals("Erecipe emHelmet") && sender instanceof Player) {
				
				
			}
			return false;
		
	}
 
	public void onDisable() {
		
	}
 
}