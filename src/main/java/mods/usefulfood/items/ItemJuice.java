package mods.usefulfood.items;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.stats.StatList;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;

public class ItemJuice extends ItemBottle {

	public ItemJuice(String name, int var2, float var3) {
		super(name, var2, var3);
	}
	
	public ItemStack onItemUseFinish(ItemStack stack, World worldIn, EntityLivingBase playerIn)
    {
        EntityPlayer player = (EntityPlayer) playerIn;
		if (!player.capabilities.isCreativeMode)
        {
            --stack.stackSize;
        }

        player.addStat(StatList.getObjectUseStats(this));

        if (!player.capabilities.isCreativeMode)
        {
            if (stack.stackSize <= 0)
            {
                return new ItemStack(Items.GLASS_BOTTLE);
            }

            player.inventory.addItemStackToInventory(new ItemStack(Items.GLASS_BOTTLE));
        }
        
        playerIn.addPotionEffect(new PotionEffect(MobEffects.SPEED, 30*20, 0));
        player.getFoodStats().addStats(this, stack);
        worldIn.playSound(player, player.getPosition(), SoundEvents.ENTITY_PLAYER_BURP, SoundCategory.PLAYERS, 0.5F, worldIn.rand.nextFloat() * 0.1F + 0.9F);
        this.onFoodEaten(stack, worldIn, player);
        return stack;
    }
}
