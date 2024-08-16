package mods.usefulfood.items;

import mods.usefulfood.UsefulFood;
import mods.usefulfood.UFItem2Model;
import net.minecraft.item.ItemFood;

public class ItemFoodUF extends ItemFood {
	public ItemFoodUF(String name, int hunger, float saturation, boolean canwolfeat) {
		super(hunger, saturation, canwolfeat);
		this.setCreativeTab(UsefulFood.tabUsefulFood);
		//this.setUnlocalizedName(name);
		//this.setRegistryName(name);
		//GameRegistry.register(this, resourceLocation);
		UsefulFood.getItem2Models().add(new UFItem2Model(this, name));
	}
}
