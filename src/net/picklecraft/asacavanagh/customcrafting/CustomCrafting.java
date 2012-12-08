package net.picklecraft.asacavanagh.customcrafting;

import org.bukkit.Material;
import org.bukkit.Server;
import org.bukkit.inventory.*;
import org.bukkit.plugin.java.JavaPlugin;

public class CustomCrafting extends JavaPlugin {
	
	public void onEnable(){
		getLogger().info("CustomCrafting (Version: " + getDescription().getVersion() + ", by " + getDescription().getAuthors() + ") enabled!");
		Server server = this.getServer();
		
		/*ShapelessRecipe diamond = new ShapelessRecipe(new ItemStack(Material.DIAMOND));
		diamond.addIngredient(3, Material.ENDER_PEARL);
		server.addRecipe(diamond);
		
		ShapedRecipe emerald = new ShapedRecipe(new ItemStack(Material.EMERALD));
		emerald.shape(
				"CCC", 
				"CLC", 
				"CCC"
		);
		emerald.setIngredient('C', Material.COAL);
		emerald.setIngredient('L', Material.LAVA_BUCKET);
		server.addRecipe(emerald);
		
		ShapedRecipe coalOre = new ShapedRecipe(new ItemStack(Material.COAL_ORE));
		coalOre.shape("CC", "CC");
		coalOre.setIngredient('C', Material.COAL);
		server.addRecipe(coalOre);
		
		With Byte data (Sub type - This is Chiseled Stone Brick)
		ShapedRecipe circlestone = new ShapedRecipe(new ItemStack(Material.SMOOTH_BRICK, 4, (short)0, (byte)3)); <- Amount, Damage, type(eg: 98:3)	
		circlestone.shape("SS", "SS");
		circlestone.setIngredient('S', Material.SMOOTH_BRICK);
		server.addRecipe(circlestone);*/
		
		/*Clay Ball x4*/
		ShapedRecipe clayball = new ShapedRecipe(new ItemStack(Material.CLAY_BALL, 4));
		clayball.shape("S", "C");
		clayball.setIngredient('C', Material.COBBLESTONE);
		clayball.setIngredient('S', Material.SLIME_BALL);
		server.addRecipe(clayball);
		
		/*Glass*/
		ShapedRecipe woolglass = new ShapedRecipe(new ItemStack(Material.GLASS));
		woolglass.shape("YR");
		woolglass.setIngredient('Y', Material.WOOL, (byte)4);
		woolglass.setIngredient('R', Material.WOOL, (byte)14);
		server.addRecipe(woolglass);
		
		/*Chiseled Stone Brick x4*/
		ShapedRecipe circlestone = new ShapedRecipe(new ItemStack(Material.SMOOTH_BRICK, 4, (short)0, (byte)3));		
		circlestone.shape("SS", "SS");
		circlestone.setIngredient('S', Material.SMOOTH_BRICK);
		server.addRecipe(circlestone);
		
		/*Leather*/
		ShapedRecipe leatherflesh = new ShapedRecipe(new ItemStack(Material.LEATHER));
		leatherflesh.shape("FFF", "FFF", "FFF");
		leatherflesh.setIngredient('F', Material.ROTTEN_FLESH);
		server.addRecipe(leatherflesh);
		
		/*Mossy Stone Brick*/
		ShapedRecipe mossystone = new ShapedRecipe(new ItemStack(Material.SMOOTH_BRICK, 1, (byte)1));
		mossystone.shape("M", "S", "B");
		mossystone.setIngredient('M', Material.INK_SACK, (byte)15);
		mossystone.setIngredient('S', Material.SEEDS);
		mossystone.setIngredient('B', Material.SMOOTH_BRICK);
		server.addRecipe(mossystone);
		
		/*Mossy Cobble*/
		ShapedRecipe mossycobble = new ShapedRecipe(new ItemStack(Material.MOSSY_COBBLESTONE));
		mossycobble.shape("M", "S", "B");
		mossycobble.setIngredient('M', Material.INK_SACK, (byte)15);
		mossycobble.setIngredient('S', Material.SEEDS);
		mossycobble.setIngredient('B', Material.COBBLESTONE);
		server.addRecipe(mossycobble);
		
		/*Powered Rail*/
		ShapedRecipe powerrail = new ShapedRecipe(new ItemStack(Material.POWERED_RAIL, 4));
		powerrail.shape("II", "ISI", "IRI");
		powerrail.setIngredient('I', Material.GOLD_NUGGET);
		powerrail.setIngredient('S', Material.STICK);
		powerrail.setIngredient('R', Material.REDSTONE);
		server.addRecipe(powerrail);
		}
}