package mods.usefulfood.blocks.init;

import mods.usefulfood.UsefulFood;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class SpecialCake extends BlockCakeUF {

	int foodlevel;
	float saturation;
	String name;
	
	public SpecialCake(String name, int foodlevel, float saturation) {
		super();
		this.foodlevel = foodlevel / 6;
		this.saturation = saturation;
		this.setTickRandomly(true);
		this.setHardness(0.5F);
		this.setSoundType(SoundType.CLOTH);
        this.setCreativeTab(UsefulFood.tabUsefulFood);
		this.setUnlocalizedName(name);
        //this.setRegistryName(name);
		//GameRegistry.register(this, resourceLocation);
	}

	/**
	 * Heals the player and removes a slice from the cake.
	 */


	@Override
	public boolean eatCake(World worldIn, BlockPos pos, IBlockState state, EntityPlayer player)
    {
        if (player.canEat(false))
        {
            player.getFoodStats().addStats(foodlevel, saturation);
            int i = ((Integer)state.getValue(BITES)).intValue();

            player.getFoodStats().addStats(foodlevel, saturation);
            worldIn.playSound(player, player.getPosition(), SoundEvents.ENTITY_PLAYER_BURP, SoundCategory.PLAYERS, 0.5F, worldIn.rand.nextFloat() * 0.1F + 0.9F);
            if (i < 6)
            {
                worldIn.setBlockState(pos, state.withProperty(BITES, Integer.valueOf(i + 1)), 3);
            }
            else
            {
                worldIn.setBlockToAir(pos);
            }
        }
        return true;
    }
	
    @SideOnly(Side.CLIENT)
    public Item getItem()
    {
        String itemName = name.replace("Block", "");
        ResourceLocation resourceLocation = new ResourceLocation("UsefulFood", itemName);

        return ForgeRegistries.ITEMS.getValue(resourceLocation);
    }
}
