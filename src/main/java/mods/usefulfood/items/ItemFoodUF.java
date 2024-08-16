package mods.usefulfood.items;

import mods.usefulfood.UF;
import mods.usefulfood.UFItem2Model;
import net.minecraft.item.ItemFood;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemFoodUF extends ItemFood {
	
	String name;
	
	public ItemFoodUF(String name, int hunger, float saturation, boolean canwolfeat) {
		super(hunger, saturation, canwolfeat);
		this.setCreativeTab(UF.tabUsefulFood);
		this.setUnlocalizedName(name);
		this.name = name;
		ResourceLocation resourceLocation = new ResourceLocation("UsefulFood", name);
		GameRegistry.register(this, resourceLocation);
		UF.getItem2Models().add(new UFItem2Model(this, name));
	}
}
