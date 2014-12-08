package com.jonessc6.c2c;

import ic2.api.item.IC2Items;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid="c2c", name="Coal 2 Charcoal", version="3.1.0.0")
public class c2c {
	
	public static boolean EnableIC2 = true;
	
	@EventHandler
	public static void preinit(FMLPreInitializationEvent event){
		
		try{
			
			Class.forName("ic2.core.IC2");
			
		} catch (ClassNotFoundException e) {
			
			EnableIC2 = false;
			
		}	
		
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event){
		
		if(EnableIC2 == true){
			
			ItemStack coalDust = IC2Items.getItem("coalDust");
			
			GameRegistry.addShapelessRecipe(coalDust, coalDust);
			
			
		}
		
		GameRegistry.addShapelessRecipe(new ItemStack(Items.coal, 1, 0), new ItemStack(Items.coal, 1, 1));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.coal, 1, 1), new ItemStack(Items.coal, 1, 0));
		
	}

}
