package mods.usefulfood;

import com.mrcrayfish.furniture.api.FurnitureRegister;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class UFRecipes
{
	public UFRecipes()
	{
		AddSmeltingRecipes();
/*		AddRecipes();
		AddShapelessRecipes();*/
	}

/*	private void AddRecipes()
	{
		GameRegistry.addRecipe(new ItemStack(UsefulFood.items.porkwich), new Object[] { "#", "%", "#", '#', UsefulFood.items.breadslice, '%', Items.COOKED_PORKCHOP });
		GameRegistry.addRecipe(new ItemStack(UsefulFood.items.steakwich), new Object[] { "#", "%", "#", '#', UsefulFood.items.breadslice, '%', Items.COOKED_BEEF });
		GameRegistry.addRecipe(new ItemStack(UsefulFood.items.fishwich), new Object[] { "#", "%", "#", '#', UsefulFood.items.breadslice, '%', Items.COOKED_FISH });
		GameRegistry.addRecipe(new ItemStack(UsefulFood.items.chickenwich), new Object[] { "#", "%", "#", '#', UsefulFood.items.breadslice, '%', Items.COOKED_CHICKEN });
		GameRegistry.addRecipe(new ItemStack(UsefulFood.items.eggwich), new Object[] { "#", "%", "#", '#', UsefulFood.items.breadslice, '%', UsefulFood.items.friedegg });
		GameRegistry.addRecipe(new ItemStack(UsefulFood.items.AppleCake), new Object[] { "AAA", "BEB", "CCC", 'A', UsefulFood.items.milkbottle, 'B', Items.APPLE, 'C', Items.WHEAT, 'E', Items.EGG  });
		GameRegistry.addRecipe(new ItemStack(UsefulFood.items.ChocolateCake), new Object[] { "AAA", "BEB", "CCC", 'A', UsefulFood.items.milkbottle, 'B', new ItemStack(Items.DYE, 1, 3), 'C', Items.WHEAT, 'E', Items.EGG  });
		GameRegistry.addRecipe(new ItemStack(UsefulFood.items.MagicCake), new Object[] { "AAA", "BEB", "CCC", 'A', UsefulFood.items.milkbottle, 'B', new ItemStack(Items.GOLDEN_APPLE, 1, 1), 'C', Items.WHEAT, 'E', Items.EGG  });
		GameRegistry.addRecipe(new ItemStack(UsefulFood.items.MuttonSandwich), new Object[] { "#", "%", "#", '#', UsefulFood.items.breadslice, '%', UsefulFood.items.MuttonCooked });

		// 1.2
		GameRegistry.addRecipe(new ItemStack(UsefulFood.items.SquidSandwich), new Object[] { "#", "%", "#", '#', UsefulFood.items.breadslice, '%', UsefulFood.items.SquidTentacleCooked });
		
		// 1.4
		GameRegistry.addRecipe(new ItemStack(UsefulFood.items.CaramelCake), new Object[] { "AAA", "BEB", "CCC", 'A', UsefulFood.items.milkbottle, 'B', UsefulFood.items.caramel, 'C', Items.WHEAT, 'E', Items.EGG  });
		GameRegistry.addRecipe(new ItemStack(UsefulFood.items.CaramelCake), new Object[] { "AAA", "BEB", "CCC", 'A', Items.MILK_BUCKET, 'B', UsefulFood.items.caramel, 'C', Items.WHEAT, 'E', Items.EGG  });
		GameRegistry.addRecipe(new ItemStack(UsefulFood.items.AppleCake), new Object[] { "AAA", "BEB", "CCC", 'A', Items.MILK_BUCKET, 'B', Items.APPLE, 'C', Items.WHEAT, 'E', Items.EGG  });
		GameRegistry.addRecipe(new ItemStack(UsefulFood.items.ChocolateCake), new Object[] { "AAA", "BEB", "CCC", 'A', Items.MILK_BUCKET, 'B', new ItemStack(Items.DYE, 1, 3), 'C', Items.WHEAT, 'E', Items.EGG  });
		GameRegistry.addRecipe(new ItemStack(UsefulFood.items.MagicCake), new Object[] { "AAA", "BEB", "CCC", 'A', Items.MILK_BUCKET, 'B', new ItemStack(Items.GOLDEN_APPLE, 1, 1), 'C', Items.WHEAT, 'E', Items.EGG  });
		GameRegistry.addRecipe(new ItemStack(UsefulFood.items.CheeseSandwich), new Object[] { "#", "%", "#", '#', UsefulFood.items.breadslice, '%', UsefulFood.items.Cheese });
	
		// 1.5
		GameRegistry.addRecipe(new ItemStack(UsefulFood.items.MuttonSandwich), new Object[] { "#", "%", "#", '#', UsefulFood.items.breadslice, '%', Items.COOKED_MUTTON });
	}

	private void AddShapelessRecipes() 
	{
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFood.items.milkbottle, 2), new Object[] { Items.GLASS_BOTTLE, Items.GLASS_BOTTLE, Items.MILK_BUCKET });
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFood.items.magicfruitsalad), new Object[] {Items.BOWL, Items.SPECKLED_MELON, Items.GOLDEN_APPLE });
		
		if(UsefulFood.MoCreatures)
		{
			GameRegistry.addShapelessRecipe(new ItemStack(UsefulFood.items.sugarcube), new Object[] { Items.SUGAR, Items.SUGAR, Items.SUGAR, Items.SUGAR, Items.SUGAR});
		}
		else 
		{
			GameRegistry.addShapelessRecipe(new ItemStack(UsefulFood.items.sugarcube), new Object[] { Items.SUGAR, Items.SUGAR, Items.SUGAR, Items.SUGAR});
		}
		
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFood.items.caramelapple), new Object[] { Items.STICK, UsefulFood.items.caramel, Items.APPLE });
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFood.items.pumpkinsoup), new Object[] {Items.BOWL, Blocks.PUMPKIN });
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFood.items.salad), new Object[] { Blocks.RED_FLOWER, Blocks.YELLOW_FLOWER, Items.BOWL, Items.WHEAT_SEEDS });
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFood.items.fruitsalad), new Object[] {Items.BOWL, Items.MELON, Items.APPLE });
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFood.items.Oatmeal), new Object[] { Items.BOWL, Items.WHEAT_SEEDS, Items.WHEAT_SEEDS, Items.WHEAT_SEEDS, Items.WHEAT_SEEDS, Items.WHEAT_SEEDS, Items.WHEAT_SEEDS });
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFood.items.jelly), new Object[] { Items.BOWL, Items.SLIME_BALL,Items.SUGAR });
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFood.items.marshmallow), new Object[] { Items.STICK, Items.WATER_BUCKET, Items.SUGAR, Items.SUGAR, Items.SUGAR });
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFood.items.icecream), new Object[] { Items.BOWL,Items.SNOWBALL, Items.SUGAR, UsefulFood.items.milkbottle });
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFood.items.breadslice, 5), new Object[] { Items.BREAD });
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFood.items.biscuit, 3), new Object[] { Items.WHEAT, Items.WHEAT });
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFood.items.trailmix), new Object[] { Items.BOWL, Items.PUMPKIN_SEEDS, Items.WHEAT_SEEDS, Items.MELON_SEEDS });
		
		// 1.2
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFood.items.chocolatecandy), new Object[] { new ItemStack(Items.DYE, 1, 3), Items.SUGAR, UsefulFood.items.milkbottle });
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFood.items.chocolateicecream), new Object[] {UsefulFood.items.chocolatecandy, UsefulFood.items.icecream });
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFood.items.sushi), new Object[] { Items.FISH, Blocks.WATERLILY });
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFood.items.melonjuice), new Object[] {Items.MELON, Items.MELON, Items.MELON, Items.GLASS_BOTTLE });
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFood.items.applejuice), new Object[] {Items.APPLE, Items.APPLE, Items.APPLE, Items.GLASS_BOTTLE });
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFood.items.carrotjuice), new Object[] {Items.CARROT, Items.CARROT, Items.CARROT, Items.GLASS_BOTTLE });
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFood.items.magicapplejuice), new Object[] {new ItemStack(Items.GOLDEN_APPLE, 1, 1), new ItemStack(Items.GOLDEN_APPLE, 1, 0), new ItemStack(Items.GOLDEN_APPLE, 1, 0), Items.GLASS_BOTTLE });
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFood.items.carrotsoup), new Object[] {Items.CARROT, Items.CARROT, Items.BOWL });
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFood.items.pumpkinbread), new Object[] {Items.WHEAT, Items.WHEAT, Blocks.PUMPKIN });
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFood.items.fishnchips), new Object[] {UsefulFood.items.FrenchFries, Items.COOKED_FISH });
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFood.items.carrotpie), new Object[] { Items.CARROT, Items.EGG , Items.SUGAR, Items.WHEAT });
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFood.items.AppleJamBiscuit), new Object[] {UsefulFood.items.AppleJam, UsefulFood.items.biscuit });
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFood.items.sugarbiscuit), new Object[] {Items.SUGAR, UsefulFood.items.biscuit });
		
		// 1.4
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFood.items.SquidSushi), new Object[] {UsefulFood.items.SquidTentacleRaw, Blocks.WATERLILY });
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFood.items.CactusJuice), new Object[] {Items.GLASS_BOTTLE, Blocks.CACTUS, Blocks.CACTUS, Blocks.CACTUS });
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFood.items.Spaghetti), new Object[] {Items.WHEAT, Items.WATER_BUCKET, Items.EGG , Items.BOWL });
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFood.items.AppleIceCream), new Object[] {UsefulFood.items.icecream, Items.APPLE });
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFood.items.MagicIceCream), new Object[] {new ItemStack(Items.GOLDEN_APPLE, 1, 0), Items.SPECKLED_MELON, Items.SPECKLED_MELON, UsefulFood.items.icecream});
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFood.items.ChocolateApple), new Object[] {Items.STICK, Items.APPLE, UsefulFood.items.hotchocolatebottle });
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFood.items.CaramelBiscuit), new Object[] {UsefulFood.items.biscuit, UsefulFood.items.caramel});
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFood.items.FishSoup), new Object[] {Items.BOWL, Items.COOKED_FISH, Items.CARROT, Items.POTATO, Items.WATER_BUCKET });
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFood.items.Tea), new Object[] {Items.GLASS_BOTTLE, Blocks.WATERLILY });
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFood.items.chocolatecandy), new Object[] { new ItemStack(Items.DYE, 1, 3), Items.SUGAR, Items.MILK_BUCKET });
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFood.items.Cheese), new Object[] { UsefulFood.items.HotMilkBottle });
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFood.items.MelonIceCream), new Object[] {UsefulFood.items.icecream, Items.MELON, Items.MELON, Items.MELON });
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFood.items.hotchocolatebottle), new Object[] { new ItemStack(Items.DYE, 1, 3), Items.GLASS_BOTTLE, UsefulFood.items.HotMilkBottle });
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFood.items.chocolatebottle), new Object[] { new ItemStack(Items.DYE, 1, 3), Items.GLASS_BOTTLE, UsefulFood.items.milkbottle });
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFood.items.chocobiscuit, 2), new Object[] {UsefulFood.items.biscuit, UsefulFood.items.biscuit, UsefulFood.items.hotchocolatebottle});
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFood.items.CaramelIceCream), new Object[] {UsefulFood.items.icecream, UsefulFood.items.caramel});
		
		// 1.4.3
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFood.items.AppleJelly), new Object[] {Items.SUGAR, Items.APPLE, Items.SLIME_BALL, Items.BOWL});
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFood.items.MelonJelly), new Object[] {Items.SUGAR, Items.MELON, Items.SLIME_BALL, Items.BOWL});
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFood.items.AppleJelly), new Object[] {UsefulFood.items.jelly, Items.APPLE});
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFood.items.MelonJelly), new Object[] {UsefulFood.items.jelly, Items.MELON});
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFood.items.Cereal), new Object[] {UsefulFood.items.milkbottle, Items.WHEAT, Items.SUGAR, Items.BOWL});
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFood.items.ChocolateCereal), new Object[] {UsefulFood.items.milkbottle, Items.WHEAT, Items.SUGAR, new ItemStack(Items.DYE, 1, 3), Items.BOWL});
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFood.items.FrenchFries), new Object[] {Items.BAKED_POTATO});
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFood.items.PanCakeDough), new Object[] {Items.SUGAR, Items.MILK_BUCKET, Items.WHEAT, Items.EGG });
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFood.items.PanCakeDough), new Object[] {Items.SUGAR, UsefulFood.items.milkbottle, Items.WHEAT, Items.EGG });
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFood.items.AppleJam),  new Object[] {Items.SUGAR, Items.BOWL, Items.APPLE});
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFood.items.MelonJam),  new Object[] {Items.SUGAR, Items.BOWL, Items.MELON});
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFood.items.AppleJamBiscuit),  new Object[] {UsefulFood.items.biscuit, UsefulFood.items.AppleJam});
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFood.items.AppleJamPanCake),  new Object[] {UsefulFood.items.PanCake, UsefulFood.items.AppleJam});
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFood.items.AppleJamToast),  new Object[] {UsefulFood.items.breadslice, UsefulFood.items.AppleJam});
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFood.items.CaramelPanCake),  new Object[] {UsefulFood.items.PanCake, UsefulFood.items.caramel});
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFood.items.CaramelToast),  new Object[] {UsefulFood.items.breadslice, UsefulFood.items.caramel});
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFood.items.ChocolatePanCake),  new Object[] {UsefulFood.items.PanCake, UsefulFood.items.chocolatecandy});
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFood.items.ChocolateToast),  new Object[] {UsefulFood.items.chocolatecandy, UsefulFood.items.breadslice});
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFood.items.MelonJamBiscuit),  new Object[] {UsefulFood.items.MelonJam, UsefulFood.items.biscuit});
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFood.items.MelonJamToast),  new Object[] {UsefulFood.items.MelonJam, UsefulFood.items.breadslice});
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFood.items.MelonJamPanCake),  new Object[] {UsefulFood.items.PanCake, UsefulFood.items.MelonJam});
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFood.items.SugarToast),  new Object[] {Items.SUGAR, UsefulFood.items.breadslice});
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFood.items.SugarPancake),  new Object[] {Items.SUGAR, UsefulFood.items.PanCake});
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFood.items.Donut),  new Object[] {Items.WHEAT, Items.WHEAT, Items.SUGAR, UsefulFood.items.milkbottle, new ItemStack(Items.DYE, 1, 3)});
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFood.items.Oreo),  new Object[] {UsefulFood.items.chocobiscuit, UsefulFood.items.chocobiscuit, Items.SUGAR, Items.SUGAR, UsefulFood.items.milkbottle});
	}*/

    private void AddSmeltingRecipes() {
    	AddSmeltingRecipe(UFItems.chocolatebottle, new ItemStack(UFItems.hotchocolatebottle));
    	AddSmeltingRecipe(UFItems.sugarcube, new ItemStack(UFItems.caramel));
    	AddSmeltingRecipe(Items.WHEAT_SEEDS, new ItemStack(UFItems.RoastedSeeds));
    	AddSmeltingRecipe(Items.PUMPKIN_SEEDS, new ItemStack(UFItems.RoastedSeeds));
    	AddSmeltingRecipe(Items.MELON_SEEDS, new ItemStack(UFItems.RoastedSeeds));
    	AddSmeltingRecipe(Items.EGG , new ItemStack(UFItems.friedegg));
    	AddSmeltingRecipe(UFItems.marshmallow, new ItemStack(UFItems.cmarshmallow));
    	AddSmeltingRecipe(UFItems.MuttonRaw, new ItemStack(UFItems.MuttonCooked));
		
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
