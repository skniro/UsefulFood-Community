package mods.usefulfood.items.init;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;

public class ItemTea extends ItemBottle {

	int hearts;
	
	public ItemTea(String name, int hearts) {
		super(name, 0, 0.0F, true);
		this.hearts = hearts;
	}
	
	public ItemStack onItemUseFinish(ItemStack stack, World worldIn, EntityLivingBase playerIn)
    {
        EntityPlayer player = (EntityPlayer) playerIn;
		if (!player.capabilities.isCreativeMode)
        {
            stack.shrink(1);
        }

        player.getFoodStats().addStats(this, stack);

        if (!player.capabilities.isCreativeMode)
        {
            if (stack.getCount() <= 0)
            {
                return new ItemStack(Items.GLASS_BOTTLE);
            }

            player.inventory.addItemStackToInventory(new ItemStack(Items.GLASS_BOTTLE));
        }
        
        playerIn.heal(hearts);
		if(removepoison) {
			playerIn.removePotionEffect(MobEffects.POISON);
		}
        worldIn.playSound(player, player.getPosition(), SoundEvents.ENTITY_PLAYER_BURP, SoundCategory.PLAYERS, 0.5F, worldIn.rand.nextFloat() * 0.1F + 0.9F);
        return stack;
    }
}
