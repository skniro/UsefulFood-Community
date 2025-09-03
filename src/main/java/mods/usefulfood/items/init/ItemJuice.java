package mods.usefulfood.items.init;

import mods.usefulfood.UsefulFood;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Items;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.potion.PotionUtils;
import net.minecraft.stats.StatList;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemJuice extends ItemBottle {

	public ItemJuice(String name, int var2, float var3) {
		super(name, var2, var3);
	}

    @Override
    public ItemStack onItemUseFinish(ItemStack stack, World worldIn, EntityLivingBase playerIn) {
        if (!(playerIn instanceof EntityPlayer)) {
            return stack;
        }
        EntityPlayer player = (EntityPlayer) playerIn;

        if (!player.capabilities.isCreativeMode) {
            stack.shrink(1);
        }

        player.addStat(StatList.getObjectUseStats(this));
        playerIn.addPotionEffect(new PotionEffect(MobEffects.SPEED, 30 * 20, 0));
        player.getFoodStats().addStats(this.foodlevel, this.saturation);
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
    public boolean hasEffect(ItemStack stack)
    {
        return super.hasEffect(stack) || !PotionUtils.getEffectsFromStack(stack).isEmpty();
    }

    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand hand)
    {
        ItemStack itemStackIn = playerIn.getHeldItem(hand);
        if (playerIn.canEat(true))
        {
            playerIn.setActiveHand(hand);
            return new ActionResult(EnumActionResult.SUCCESS, itemStackIn);
        }
        return new ActionResult(EnumActionResult.FAIL, itemStackIn);
    }
}
