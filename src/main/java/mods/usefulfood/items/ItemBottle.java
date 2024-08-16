package mods.usefulfood.items;

import mods.usefulfood.UsefulFood;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;

public class ItemBottle extends ItemFoodUF {

	int foodlevel;
	float saturation;
	boolean removepoison = false;
	
	public ItemBottle(String name, int foodlevel, float saturation, boolean removepoison) {
		super(name, foodlevel, saturation, false);
		this.setMaxStackSize(16);
		this.setCreativeTab(UsefulFood.tabUsefulFood);
		this.foodlevel = foodlevel;
		this.saturation = saturation;
		this.removepoison = removepoison;
	}
	
	public ItemBottle(String name, int foodlevel, float saturation) {
		super(name, foodlevel, saturation, false);
		this.setMaxStackSize(16);
		this.setCreativeTab(UsefulFood.tabUsefulFood);
		this.foodlevel = foodlevel;
		this.saturation = saturation;
	}

	/**
	 * How long it takes to use or consume an item
	 */
	
	@Override
    public int getMaxItemUseDuration(ItemStack par1ItemStack)
    {
        return 16;
    }

	/**
	 * returns the action that specifies what animation to play when the items
	 * is being used
	 */
    
    @Override
	public EnumAction getItemUseAction(ItemStack par1ItemStack)
    {
        return EnumAction.DRINK;
    }
	
	@Override
	public ItemStack onItemUseFinish(ItemStack stack, World worldIn, EntityLivingBase playerIn)
    {
		EntityPlayer player = (EntityPlayer) playerIn;
		if (!player.capabilities.isCreativeMode)
        {
            stack.shrink(1);
        }

		player.addStat(StatList.getObjectUseStats(this));

        if (!player.capabilities.isCreativeMode)
        {
            if (stack.getCount() <= 0)
            {
                return new ItemStack(Items.GLASS_BOTTLE);
            }

            player.inventory.addItemStackToInventory(new ItemStack(Items.GLASS_BOTTLE));
        }
        
        if(this.removepoison) {
        	player.removePotionEffect(MobEffects.POISON);
        }
        
        player.getFoodStats().addStats(this, stack);
        worldIn.playSound(player, player.getPosition(), SoundEvents.ENTITY_PLAYER_BURP, SoundCategory.PLAYERS, 0.5F, worldIn.rand.nextFloat() * 0.1F + 0.9F);
        this.onFoodEaten(stack, worldIn, player);
        return stack;
    }

	/**
	 * Called whenever this item is equipped and the right mouse button is
	 * pressed. Args: itemStack, world, entityPlayer
	 */
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
