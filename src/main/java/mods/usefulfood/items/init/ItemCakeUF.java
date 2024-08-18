package mods.usefulfood.items.init;


import mods.usefulfood.UsefulFood;
import mods.usefulfood.client.UFItem2Model;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;

public class ItemCakeUF extends ItemBlock
{
	String name;
	
	public ItemCakeUF(Block var2, String name) {
		super(var2);
		this.setMaxStackSize(1);
		this.setCreativeTab(UsefulFood.tabUsefulFood);
		UsefulFood.getItem2Models().add(new UFItem2Model(this, name));
	}
}
