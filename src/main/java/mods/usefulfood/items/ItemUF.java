package mods.usefulfood.items;

import mods.usefulfood.UsefulFood;
import mods.usefulfood.UFItem2Model;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

public class ItemUF extends Item {

	String name;
	
	public ItemUF(String name) {
		super();
		this.setCreativeTab(UsefulFood.tabUsefulFood);
		//this.setUnlocalizedName(name);
		//this.setRegistryName(name);
		ResourceLocation resourceLocation = new ResourceLocation("UsefulFood", name);
		//GameRegistry.register(this, resourceLocation);
		UsefulFood.getItem2Models().add(new UFItem2Model(this, name));
	}
}
