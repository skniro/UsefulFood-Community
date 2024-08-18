package mods.usefulfood.blocks;

import mods.usefulfood.UsefulFood;
import mods.usefulfood.blocks.init.MagicCake;
import mods.usefulfood.blocks.init.SpecialCake;
import mods.usefulfood.items.init.ItemCakeUF;
import mods.usefulfood.items.init.ItemMagicCake;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

import java.util.ArrayList;
import java.util.List;


public class UFBlocks {

	private static List<Item> itemBlocks;
	public static Block AppleCake;
	public static Block ChocolateCake;
	public static Block MagicCake;
	public static Block CaramelCake;
	
	public Block ChocolateStillFluid;

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		IForgeRegistry<Block> registry = event.getRegistry();
		itemBlocks = new ArrayList<>();
		AppleCake =  registerCakeBlock(registry, new SpecialCake("applecake", 18, 0.6F),"applecake", UsefulFood.tabUsefulFood);
		ChocolateCake =  registerCakeBlock(registry, new SpecialCake("chocolatecake", 12, 0.5F),"chocolatecake", UsefulFood.tabUsefulFood);
		MagicCake = registerMagicCakeBlock(registry, new MagicCake("magiccake", 48, 0.5F),"magiccake", UsefulFood.tabUsefulFood);
		
		// 1.4
		CaramelCake = registerCakeBlock(registry, new SpecialCake("caramelcake", 19, 0.8F),"caramelcake", UsefulFood.tabUsefulFood);

	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		IForgeRegistry<Item> reg = event.getRegistry();
		for (Item i : itemBlocks)
			reg.register(i);
	}

	private static Block registerCakeBlock(IForgeRegistry<Block> reg, Block block, String name, CreativeTabs tab) {
		block.setRegistryName(name);
		block.setUnlocalizedName(UsefulFood.MOD_ID + "." + name);
		if (tab != null) block.setCreativeTab(tab);

		reg.register(block);

		Item item = new ItemCakeUF(block, name);
		item.setRegistryName(block.getRegistryName());
		itemBlocks.add(item);
		return block;
	}

	private static Block registerMagicCakeBlock(IForgeRegistry<Block> reg, Block block, String name, CreativeTabs tab) {
		block.setRegistryName(name);
		block.setUnlocalizedName(UsefulFood.MOD_ID + "." + name);
		if (tab != null) block.setCreativeTab(tab);

		reg.register(block);

		Item item = new ItemMagicCake(block,name);
		item.setRegistryName(block.getRegistryName());
		itemBlocks.add(item);
		return block;
	}

	public static Item registerItem(IForgeRegistry<Item> reg, Item item, String name, CreativeTabs tab) {
		item.setRegistryName(name);
		item.setUnlocalizedName(name);
		if (tab != null) item.setCreativeTab(tab);

		reg.register(item);

		return item;
	}
}
