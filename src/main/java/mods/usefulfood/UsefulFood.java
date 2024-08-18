package mods.usefulfood;

import java.util.ArrayList;


import mods.usefulfood.blocks.UFBlocks;
import mods.usefulfood.client.UFItem2Model;
import mods.usefulfood.items.UFItems;
import mods.usefulfood.util.CreativeTabUF;
import mods.usefulfood.util.UFRecipes;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;


@Mod(modid = UsefulFood.MOD_ID, name = "UsefulFood", version = "1.5.0")
public class UsefulFood {
	@SidedProxy(clientSide="mods.usefulfood.client.UFClient", serverSide="mods.usefulfood.UFServer")
	public static UFServer proxy;
	public static final String MOD_ID = "usefulfood";
	public static Logger logger;
	private static ArrayList<UFItem2Model> itemsToSetAsModels = new ArrayList<UFItem2Model>();
	public static UFBlocks blocks;
	public static UFItems items;
	public static CreativeTabs tabUsefulFood = new CreativeTabUF("UsefulFood");
	
	public static ArrayList<UFItem2Model> getItem2Models() {
		return itemsToSetAsModels;
	}

	@Mod.Instance("usefulfood")
	public static UsefulFood instance;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		logger = event.getModLog();
		proxy.preInit(event);
		MinecraftForge.EVENT_BUS.register(UFBlocks.class);
		MinecraftForge.EVENT_BUS.register(UFItems.class);
		MinecraftForge.EVENT_BUS.register(this);
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) 
	{
		proxy.init(event);
		new UFRecipes();

	}
}
