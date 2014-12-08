package com.jonessc6.c2c;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid="c2c", name="Coal 2 Charcoal", version="3.1.1.0")
public class c2c {
	
	@EventHandler
	public static void init(FMLInitializationEvent event){
		
		GameRegistry.addShapelessRecipe(new ItemStack(Items.coal, 1, 0), new ItemStack(Items.coal, 1, 1));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.coal, 1, 1), new ItemStack(Items.coal, 1, 0));
		
	}

}
