package mods.usefulfood.items.init;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemFoodStick extends ItemFoodUF {
	public ItemFoodStick(String name, int Hunger, float Saturation, boolean CanWolfEat) {
		super(name, Hunger, Saturation, CanWolfEat);
		this.setMaxStackSize(1);
	}

	public ItemStack onItemUseFinish(ItemStack stack, World worldIn, EntityLivingBase playerIn)
    {
        super.onItemUseFinish(stack, worldIn, playerIn);
        return new ItemStack(Items.STICK);
    }
}
