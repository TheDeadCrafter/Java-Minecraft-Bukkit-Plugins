package me.bukkit.firstflames.MyFirstPlugin;
 
import java.util.Arrays;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
//import org.bukkit.inventory.ShapelessRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

import net.md_5.bungee.api.ChatColor;
 
public class TestingPlugin extends JavaPlugin {
 
	public void onEnable() {
		ItemStack superSword = new ItemStack(Material.DIAMOND_SWORD);
		ItemMeta meta = superSword.getItemMeta();
		meta.setDisplayName(ChatColor.GRAY + "§6§l§k00§3Super Sword§6§l§k00");
		meta.setLore(Arrays.asList());
		meta.addEnchant(Enchantment.DAMAGE_ALL, 10, true);
		superSword.setItemMeta(meta);
		
		ShapedRecipe superSwordTwo = new ShapedRecipe(superSword);
		superSwordTwo.shape(
                        " % ",
                        " @ ",
                        " * ");
		superSwordTwo.setIngredient('@', Material.DIAMOND_BLOCK);
		superSwordTwo.setIngredient('*', Material.BLAZE_ROD);
		superSwordTwo.setIngredient('%', Material.DRAGON_EGG);
		
		
		
		ItemStack superChestplate = new ItemStack(Material.LEATHER_CHESTPLATE);
		ItemMeta superMeta = superChestplate.getItemMeta();
		superMeta.setDisplayName(ChatColor.GRAY + "§6§l§k00§3Super Chestplate§6§l§k00");
		superMeta.setLore(Arrays.asList());
		
		
		
		superMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 10, true);
		superMeta.addEnchant(Enchantment.PROTECTION_EXPLOSIONS, 10, true);
		superMeta.addEnchant(Enchantment.PROTECTION_FALL, 10, true);
		superMeta.addEnchant(Enchantment.PROTECTION_FIRE, 10, true);
		superMeta.addEnchant(Enchantment.PROTECTION_PROJECTILE, 10, true);
		superChestplate.setItemMeta(superMeta);
		
		ShapedRecipe superChestplateTwo = new ShapedRecipe(superChestplate);
		superChestplateTwo.shape(
                        "@&@",
                        "@%@",
                        "@@@");
		superChestplateTwo.setIngredient('@', Material.EMERALD_BLOCK);
		superChestplateTwo.setIngredient('%', Material.NETHER_STAR);
		superChestplateTwo.setIngredient('&', Material.DRAGON_EGG);
		
		
		ItemStack superHelmet = new ItemStack(Material.LEATHER_HELMET);
		ItemMeta superHelmetMeta = superChestplate.getItemMeta();
		superMeta.setDisplayName(ChatColor.GRAY + "§6§l§k00§3Super Helmet§6§l§k00");
		superMeta.setLore(Arrays.asList());
		
		/*********************************/
		
		superHelmetMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 10, true);
		superHelmetMeta.addEnchant(Enchantment.PROTECTION_EXPLOSIONS, 10, true);
		superHelmetMeta.addEnchant(Enchantment.PROTECTION_FALL, 10, true);
		superHelmetMeta.addEnchant(Enchantment.PROTECTION_FIRE, 10, true);
		superHelmetMeta.addEnchant(Enchantment.PROTECTION_PROJECTILE, 10, true);
		superHelmet.setItemMeta(superHelmetMeta);
		
		ShapedRecipe superHelmetTwo = new ShapedRecipe(superHelmet);
		superHelmetTwo.shape(
                        "@@@",
                        "@%@",
                        "   ");
		superChestplateTwo.setIngredient('@', Material.EMERALD_BLOCK);
		superChestplateTwo.setIngredient('%', Material.DRAGON_EGG);
		
		
		
		
		
		
		
		
		
        Bukkit.getServer().addRecipe(superSwordTwo);
        Bukkit.getServer().addRecipe(superChestplateTwo);
        Bukkit.getServer().addRecipe(superHelmetTwo);
		
		
		
	}
 
	public void onDisable() {
		
	}
 
}