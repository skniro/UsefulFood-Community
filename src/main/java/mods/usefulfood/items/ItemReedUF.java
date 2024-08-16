package mods.usefulfood.items;


import mods.usefulfood.UsefulFood;
import mods.usefulfood.UFItem2Model;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;

public class ItemReedUF extends ItemBlock
{
	String name;
	
	public ItemReedUF(Block var2, String name) {
		super(var2);
		this.setMaxStackSize(1);
		this.setCreativeTab(UsefulFood.tabUsefulFood);
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		ResourceLocation resourceLocation = new ResourceLocation("UsefulFood", name);
		//GameRegistry.register(this, resourceLocation);
		UsefulFood.getItem2Models().add(new UFItem2Model(this, name));
	}
}
