package com.quantomworks.ripper;

import java.util.Iterator;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.IForgeRegistry;

@Mod(modid = Main.MODID, version = Main.VERSION)
public class Main
{
    public static final String MODID = "Ripper";
    public static final String VERSION = "1.0";
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        System.out.println("Waiting for other mods..");
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
    	System.out.println("Scanning for new items..");
    	
    	for (Iterator<Block> i = ForgeRegistries.BLOCKS.iterator(); i.hasNext(); )
    	{
    		Block block = i.next();
    		System.out.println("New block found:" + block.getLocalizedName());
    		//A bunch of other cool things
    	}
    	for (Iterator<Item> j = ForgeRegistries.ITEMS.iterator(); j.hasNext(); )
    	{
    		Item item = j.next();
    		System.out.println("New item found:" + item.getUnlocalizedName());
    		//A bunch of other cool things
    	}
    	
    }
}
