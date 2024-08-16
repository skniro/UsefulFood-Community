package mods.usefulfood.items;


import mods.usefulfood.UF;
import mods.usefulfood.UFItem2Model;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemReedUF extends ItemBlock
{
	String name;
	
	public ItemReedUF(Block var2, String name) {
		super(var2);
		this.setMaxStackSize(1);
		this.setCreativeTab(UF.tabUsefulFood);
		this.setUnlocalizedName(name);
		this.name = name;
		ResourceLocation resourceLocation = new ResourceLocation("UsefulFood", name);
		GameRegistry.register(this, resourceLocation);
		UF.getItem2Models().add(new UFItem2Model(this, name));
	}
}
