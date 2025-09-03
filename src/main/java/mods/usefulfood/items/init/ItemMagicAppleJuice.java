package mods.usefulfood.items.init;

import java.util.List;

import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Items;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.potion.PotionUtils;
import net.minecraft.stats.StatList;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemMagicAppleJuice extends ItemJuice {

	
	public ItemMagicAppleJuice(String name, int var2, float var3) {
		super(name, var2, var3);
	}

    @Override
    public ItemStack onItemUseFinish(ItemStack stack, World worldIn, EntityLivingBase entityLiving) {
        if (!(entityLiving instanceof EntityPlayer)) {
            return stack;
        }
        EntityPlayer player = (EntityPlayer) entityLiving;

        if (!player.capabilities.isCreativeMode) {
            stack.shrink(1);
        }

        player.addStat(StatList.getObjectUseStats(this));
        if (player instanceof EntityPlayerMP) {
            CriteriaTriggers.CONSUME_ITEM.trigger((EntityPlayerMP) player, stack);
        }

        player.getFoodStats().addStats(this.foodlevel, this.saturation);
        player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 600, 3));
        player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 6000, 0));
        player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 6000, 0));
        player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 400, 0));
        player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 600, 0));
        worldIn.playSound(player, player.getPosition(), SoundEvents.ENTITY_PLAYER_BURP,
                SoundCategory.PLAYERS, 0.5F, worldIn.rand.nextFloat() * 0.1F + 0.9F);

        this.onFoodEaten(stack, worldIn, player);

        if (!player.capabilities.isCreativeMode) {
            if (stack.isEmpty()) {
                return new ItemStack(Items.GLASS_BOTTLE);
            } else {
                player.inventory.addItemStackToInventory(new ItemStack(Items.GLASS_BOTTLE));
            }
        }

        return stack;
    }

	@SideOnly(Side.CLIENT)
	public EnumRarity getRarity(ItemStack var1) {
		return EnumRarity.EPIC;
	}

	@SideOnly(Side.CLIENT)
	public boolean hasEffect(ItemStack var1) {
		return true;
	}
	
	public void addInformation(ItemStack is, EntityPlayer player, List l, boolean B)
	{
		l.add("Makes you feel leg... wait for it.... endary!");
	}
}
