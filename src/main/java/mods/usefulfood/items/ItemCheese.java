package mods.usefulfood.items;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemCheese extends ItemFoodUF {
	public ItemCheese(String name, int var2, float var3, boolean var4) {
		super(name, var2, var3, var4);
	}
	
	public ItemStack onItemUseFinish(ItemStack stack, World worldIn, EntityLivingBase playerIn)
    {
        super.onItemUseFinish(stack, worldIn, playerIn);
        playerIn.removePotionEffect(new PotionEffect(MobEffects.POISON).getPotion());
        
        return stack;
    }
	
	
}
