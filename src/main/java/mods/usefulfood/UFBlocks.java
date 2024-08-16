package mods.usefulfood;

import mods.usefulfood.blocks.BlockCakeUF;
import mods.usefulfood.blocks.MagicCake;
import mods.usefulfood.blocks.SpecialCake;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
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
		AppleCake =  registerBlock(registry, new SpecialCake("applecake", 18, 0.6F),"applecake", UsefulFood.tabUsefulFood);
		ChocolateCake =  registerBlock(registry, new SpecialCake("chocolatecake", 12, 0.5F),"chocolatecake", UsefulFood.tabUsefulFood);
		MagicCake = registerBlock(registry, new MagicCake("magiccake", 48, 0.5F),"magiccake", UsefulFood.tabUsefulFood);
		
		// 1.4
		CaramelCake = registerBlock(registry, new SpecialCake("caramelcake", 19, 0.8F),"caramelcake", UsefulFood.tabUsefulFood);

	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		IForgeRegistry<Item> reg = event.getRegistry();
		for (Item i : itemBlocks)
			reg.register(i);
	}

	public static Block[] reedBlocks = {
			AppleCake,
			ChocolateCake,
			MagicCake,
			CaramelCake
	};

	private static Block registerBlock(IForgeRegistry<Block> reg, Block block, String name, CreativeTabs tab) {
		block.setRegistryName(name);
		block.setUnlocalizedName(name);
		if (tab != null) block.setCreativeTab(tab);

		reg.register(block);

		Item item = new ItemBlock(block);
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
