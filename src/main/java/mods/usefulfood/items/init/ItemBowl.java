package mods.usefulfood.items.init;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Items;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemBowl extends ItemFoodUF {
	
	boolean removepoison = false;
	
	public ItemBowl(String name, int hunger, float saturation, boolean removepoison) {
		super(name, hunger, saturation, false);
		this.setMaxStackSize(1);
		this.removepoison = removepoison;
	}

	public ItemStack onItemUseFinish(ItemStack stack, World worldIn, EntityLivingBase entityLiving)
    {
        super.onItemUseFinish(stack, worldIn, entityLiving);
        if(removepoison) {
			entityLiving.removePotionEffect(new PotionEffect(MobEffects.POISON).getPotion());
		}
        return new ItemStack(Items.BOWL);
    }
}
