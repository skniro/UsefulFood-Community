package mods.usefulfood.util;

import mods.usefulfood.UsefulFood;
import mods.usefulfood.items.UFItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class CreativeTabUF extends CreativeTabs 
{	
	public CreativeTabUF(String label) {
		super(label);
	}

	@Override
    public ItemStack getIconItemStack() {
		return new ItemStack(UFItems.Cheese);
	}
	
	@Override
    public String getTranslatedTabLabel() {
		return "UsefulFood";
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(UFItems.Cheese);
	}
}
