package mods.usefulfood.util;

import com.mrcrayfish.furniture.api.FurnitureRegister;

import mods.usefulfood.items.UFItems;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class UFRecipes
{
	public UFRecipes()
	{
		AddSmeltingRecipes();
	}

    private void AddSmeltingRecipes() {
    	AddSmeltingRecipe(UFItems.chocolatebottle, new ItemStack(UFItems.hotchocolatebottle));
    	AddSmeltingRecipe(UFItems.sugarcube, new ItemStack(UFItems.caramel));
    	AddSmeltingRecipe(Items.WHEAT_SEEDS, new ItemStack(UFItems.RoastedSeeds));
    	AddSmeltingRecipe(Items.PUMPKIN_SEEDS, new ItemStack(UFItems.RoastedSeeds));
    	AddSmeltingRecipe(Items.MELON_SEEDS, new ItemStack(UFItems.RoastedSeeds));
    	AddSmeltingRecipe(Items.EGG , new ItemStack(UFItems.friedegg));
    	AddSmeltingRecipe(UFItems.marshmallow, new ItemStack(UFItems.cmarshmallow));
		
		// 1.2
    	AddSmeltingRecipe(UFItems.SquidTentacleRaw, new ItemStack(UFItems.SquidTentacleCooked));
		
		// 1.4
    	AddSmeltingRecipe(UFItems.milkbottle, new ItemStack(UFItems.HotMilkBottle));
    	AddSmeltingRecipe(UFItems.PanCakeDough, new ItemStack(UFItems.PanCake));
	}
    
    private void AddSmeltingRecipe(Item input, ItemStack output, float xp) {
    	GameRegistry.addSmelting(input, output, xp);
    	FurnitureRegister.getInstance().registerOvenRecipe(new ItemStack(input), output);
    }
    
    private void AddSmeltingRecipe(Item input, ItemStack output) {
    	GameRegistry.addSmelting(input, output, 0.3F);
    	FurnitureRegister.getInstance().registerOvenRecipe(new ItemStack(input), output);
    }
}
