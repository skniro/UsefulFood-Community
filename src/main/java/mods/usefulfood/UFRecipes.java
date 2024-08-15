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
		AddRecipes();
		AddShapelessRecipes();
	}

	private void AddRecipes() 
	{
		GameRegistry.addRecipe(new ItemStack(UF.items.porkwich), new Object[] { "#", "%", "#", '#', UF.items.breadslice, '%', Items.COOKED_PORKCHOP });
		GameRegistry.addRecipe(new ItemStack(UF.items.steakwich), new Object[] { "#", "%", "#", '#', UF.items.breadslice, '%', Items.COOKED_BEEF });
		GameRegistry.addRecipe(new ItemStack(UF.items.fishwich), new Object[] { "#", "%", "#", '#', UF.items.breadslice, '%', Items.COOKED_FISH });
		GameRegistry.addRecipe(new ItemStack(UF.items.chickenwich), new Object[] { "#", "%", "#", '#', UF.items.breadslice, '%', Items.COOKED_CHICKEN });
		GameRegistry.addRecipe(new ItemStack(UF.items.eggwich), new Object[] { "#", "%", "#", '#', UF.items.breadslice, '%', UF.items.friedegg });
		GameRegistry.addRecipe(new ItemStack(UF.items.AppleCake), new Object[] { "AAA", "BEB", "CCC", 'A', UF.items.milkbottle, 'B', Items.APPLE, 'C', Items.WHEAT, 'E', Items.EGG  });
		GameRegistry.addRecipe(new ItemStack(UF.items.ChocolateCake), new Object[] { "AAA", "BEB", "CCC", 'A', UF.items.milkbottle, 'B', new ItemStack(Items.DYE, 1, 3), 'C', Items.WHEAT, 'E', Items.EGG  });
		GameRegistry.addRecipe(new ItemStack(UF.items.MagicCake), new Object[] { "AAA", "BEB", "CCC", 'A', UF.items.milkbottle, 'B', new ItemStack(Items.GOLDEN_APPLE, 1, 1), 'C', Items.WHEAT, 'E', Items.EGG  });
		GameRegistry.addRecipe(new ItemStack(UF.items.MuttonSandwich), new Object[] { "#", "%", "#", '#', UF.items.breadslice, '%', UF.items.MuttonCooked });

		// 1.2
		GameRegistry.addRecipe(new ItemStack(UF.items.SquidSandwich), new Object[] { "#", "%", "#", '#', UF.items.breadslice, '%', UF.items.SquidTentacleCooked });
		
		// 1.4
		GameRegistry.addRecipe(new ItemStack(UF.items.CaramelCake), new Object[] { "AAA", "BEB", "CCC", 'A', UF.items.milkbottle, 'B', UF.items.caramel, 'C', Items.WHEAT, 'E', Items.EGG  });
		GameRegistry.addRecipe(new ItemStack(UF.items.CaramelCake), new Object[] { "AAA", "BEB", "CCC", 'A', Items.MILK_BUCKET, 'B', UF.items.caramel, 'C', Items.WHEAT, 'E', Items.EGG  });
		GameRegistry.addRecipe(new ItemStack(UF.items.AppleCake), new Object[] { "AAA", "BEB", "CCC", 'A', Items.MILK_BUCKET, 'B', Items.APPLE, 'C', Items.WHEAT, 'E', Items.EGG  });
		GameRegistry.addRecipe(new ItemStack(UF.items.ChocolateCake), new Object[] { "AAA", "BEB", "CCC", 'A', Items.MILK_BUCKET, 'B', new ItemStack(Items.DYE, 1, 3), 'C', Items.WHEAT, 'E', Items.EGG  });
		GameRegistry.addRecipe(new ItemStack(UF.items.MagicCake), new Object[] { "AAA", "BEB", "CCC", 'A', Items.MILK_BUCKET, 'B', new ItemStack(Items.GOLDEN_APPLE, 1, 1), 'C', Items.WHEAT, 'E', Items.EGG  });
		GameRegistry.addRecipe(new ItemStack(UF.items.CheeseSandwich), new Object[] { "#", "%", "#", '#', UF.items.breadslice, '%', UF.items.Cheese });
	
		// 1.5
		GameRegistry.addRecipe(new ItemStack(UF.items.MuttonSandwich), new Object[] { "#", "%", "#", '#', UF.items.breadslice, '%', Items.COOKED_MUTTON });
	}

	private void AddShapelessRecipes() 
	{
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.milkbottle, 2), new Object[] { Items.GLASS_BOTTLE, Items.GLASS_BOTTLE, Items.MILK_BUCKET });
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.magicfruitsalad), new Object[] {Items.BOWL, Items.SPECKLED_MELON, Items.GOLDEN_APPLE });
		
		if(UF.MoCreatures) 
		{
			GameRegistry.addShapelessRecipe(new ItemStack(UF.items.sugarcube), new Object[] { Items.SUGAR, Items.SUGAR, Items.SUGAR, Items.SUGAR, Items.SUGAR});
		}
		else 
		{
			GameRegistry.addShapelessRecipe(new ItemStack(UF.items.sugarcube), new Object[] { Items.SUGAR, Items.SUGAR, Items.SUGAR, Items.SUGAR});
		}
		
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.caramelapple), new Object[] { Items.STICK, UF.items.caramel, Items.APPLE });
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.pumpkinsoup), new Object[] {Items.BOWL, Blocks.PUMPKIN });
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.salad), new Object[] { Blocks.RED_FLOWER, Blocks.YELLOW_FLOWER, Items.BOWL, Items.WHEAT_SEEDS });
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.fruitsalad), new Object[] {Items.BOWL, Items.MELON, Items.APPLE });
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.Oatmeal), new Object[] { Items.BOWL, Items.WHEAT_SEEDS, Items.WHEAT_SEEDS, Items.WHEAT_SEEDS, Items.WHEAT_SEEDS, Items.WHEAT_SEEDS, Items.WHEAT_SEEDS });
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.jelly), new Object[] { Items.BOWL, Items.SLIME_BALL,Items.SUGAR });
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.marshmallow), new Object[] { Items.STICK, Items.WATER_BUCKET, Items.SUGAR, Items.SUGAR, Items.SUGAR });
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.icecream), new Object[] { Items.BOWL,Items.SNOWBALL, Items.SUGAR, UF.items.milkbottle });
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.breadslice, 5), new Object[] { Items.BREAD });
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.biscuit, 3), new Object[] { Items.WHEAT, Items.WHEAT });
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.trailmix), new Object[] { Items.BOWL, Items.PUMPKIN_SEEDS, Items.WHEAT_SEEDS, Items.MELON_SEEDS });
		
		// 1.2
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.chocolatecandy), new Object[] { new ItemStack(Items.DYE, 1, 3), Items.SUGAR, UF.items.milkbottle });
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.chocolateicecream), new Object[] {UF.items.chocolatecandy, UF.items.icecream });
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.sushi), new Object[] { Items.FISH, Blocks.WATERLILY });
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.melonjuice), new Object[] {Items.MELON, Items.MELON, Items.MELON, Items.GLASS_BOTTLE });
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.applejuice), new Object[] {Items.APPLE, Items.APPLE, Items.APPLE, Items.GLASS_BOTTLE });
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.carrotjuice), new Object[] {Items.CARROT, Items.CARROT, Items.CARROT, Items.GLASS_BOTTLE });
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.magicapplejuice), new Object[] {new ItemStack(Items.GOLDEN_APPLE, 1, 1), new ItemStack(Items.GOLDEN_APPLE, 1, 0), new ItemStack(Items.GOLDEN_APPLE, 1, 0), Items.GLASS_BOTTLE });
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.carrotsoup), new Object[] {Items.CARROT, Items.CARROT, Items.BOWL });
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.pumpkinbread), new Object[] {Items.WHEAT, Items.WHEAT, Blocks.PUMPKIN });
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.fishnchips), new Object[] {UF.items.FrenchFries, Items.COOKED_FISH });
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.carrotpie), new Object[] { Items.CARROT, Items.EGG , Items.SUGAR, Items.WHEAT });
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.AppleJamBiscuit), new Object[] {UF.items.AppleJam, UF.items.biscuit });
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.sugarbiscuit), new Object[] {Items.SUGAR, UF.items.biscuit });
		
		// 1.4
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.SquidSushi), new Object[] {UF.items.SquidTentacleRaw, Blocks.WATERLILY });
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.CactusJuice), new Object[] {Items.GLASS_BOTTLE, Blocks.CACTUS, Blocks.CACTUS, Blocks.CACTUS });
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.Spaghetti), new Object[] {Items.WHEAT, Items.WATER_BUCKET, Items.EGG , Items.BOWL });
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.AppleIceCream), new Object[] {UF.items.icecream, Items.APPLE });
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.MagicIceCream), new Object[] {new ItemStack(Items.GOLDEN_APPLE, 1, 0), Items.SPECKLED_MELON, Items.SPECKLED_MELON, UF.items.icecream});
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.ChocolateApple), new Object[] {Items.STICK, Items.APPLE, UF.items.hotchocolatebottle });
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.CaramelBiscuit), new Object[] {UF.items.biscuit, UF.items.caramel});
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.FishSoup), new Object[] {Items.BOWL, Items.COOKED_FISH, Items.CARROT, Items.POTATO, Items.WATER_BUCKET });
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.Tea), new Object[] {Items.GLASS_BOTTLE, Blocks.WATERLILY });
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.chocolatecandy), new Object[] { new ItemStack(Items.DYE, 1, 3), Items.SUGAR, Items.MILK_BUCKET });
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.Cheese), new Object[] { UF.items.HotMilkBottle });
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.MelonIceCream), new Object[] {UF.items.icecream, Items.MELON, Items.MELON, Items.MELON });
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.hotchocolatebottle), new Object[] { new ItemStack(Items.DYE, 1, 3), Items.GLASS_BOTTLE, UF.items.HotMilkBottle });
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.chocolatebottle), new Object[] { new ItemStack(Items.DYE, 1, 3), Items.GLASS_BOTTLE, UF.items.milkbottle });
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.chocobiscuit, 2), new Object[] {UF.items.biscuit, UF.items.biscuit, UF.items.hotchocolatebottle});
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.CaramelIceCream), new Object[] {UF.items.icecream, UF.items.caramel});
		
		// 1.4.3
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.AppleJelly), new Object[] {Items.SUGAR, Items.APPLE, Items.SLIME_BALL, Items.BOWL});
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.MelonJelly), new Object[] {Items.SUGAR, Items.MELON, Items.SLIME_BALL, Items.BOWL});
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.AppleJelly), new Object[] {UF.items.jelly, Items.APPLE});
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.MelonJelly), new Object[] {UF.items.jelly, Items.MELON});
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.Cereal), new Object[] {UF.items.milkbottle, Items.WHEAT, Items.SUGAR, Items.BOWL});
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.ChocolateCereal), new Object[] {UF.items.milkbottle, Items.WHEAT, Items.SUGAR, new ItemStack(Items.DYE, 1, 3), Items.BOWL});
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.FrenchFries), new Object[] {Items.BAKED_POTATO});
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.PanCakeDough), new Object[] {Items.SUGAR, Items.MILK_BUCKET, Items.WHEAT, Items.EGG });
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.PanCakeDough), new Object[] {Items.SUGAR, UF.items.milkbottle, Items.WHEAT, Items.EGG });
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.AppleJam),  new Object[] {Items.SUGAR, Items.BOWL, Items.APPLE});
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.MelonJam),  new Object[] {Items.SUGAR, Items.BOWL, Items.MELON});
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.AppleJamBiscuit),  new Object[] {UF.items.biscuit, UF.items.AppleJam});
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.AppleJamPanCake),  new Object[] {UF.items.PanCake, UF.items.AppleJam});
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.AppleJamToast),  new Object[] {UF.items.breadslice, UF.items.AppleJam});
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.CaramelPanCake),  new Object[] {UF.items.PanCake, UF.items.caramel});
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.CaramelToast),  new Object[] {UF.items.breadslice, UF.items.caramel});
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.ChocolatePanCake),  new Object[] {UF.items.PanCake, UF.items.chocolatecandy});
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.ChocolateToast),  new Object[] {UF.items.chocolatecandy, UF.items.breadslice});
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.MelonJamBiscuit),  new Object[] {UF.items.MelonJam, UF.items.biscuit});
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.MelonJamToast),  new Object[] {UF.items.MelonJam, UF.items.breadslice});
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.MelonJamPanCake),  new Object[] {UF.items.PanCake, UF.items.MelonJam});
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.SugarToast),  new Object[] {Items.SUGAR, UF.items.breadslice});
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.SugarPancake),  new Object[] {Items.SUGAR, UF.items.PanCake});
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.Donut),  new Object[] {Items.WHEAT, Items.WHEAT, Items.SUGAR, UF.items.milkbottle, new ItemStack(Items.DYE, 1, 3)});
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.Oreo),  new Object[] {UF.items.chocobiscuit, UF.items.chocobiscuit, Items.SUGAR, Items.SUGAR, UF.items.milkbottle});
	}

    private void AddSmeltingRecipes() {
    	AddSmeltingRecipe(UF.items.chocolatebottle, new ItemStack(UF.items.hotchocolatebottle));
    	AddSmeltingRecipe(UF.items.sugarcube, new ItemStack(UF.items.caramel));
    	AddSmeltingRecipe(Items.WHEAT_SEEDS, new ItemStack(UF.items.RoastedSeeds));
    	AddSmeltingRecipe(Items.PUMPKIN_SEEDS, new ItemStack(UF.items.RoastedSeeds));
    	AddSmeltingRecipe(Items.MELON_SEEDS, new ItemStack(UF.items.RoastedSeeds));
    	AddSmeltingRecipe(Items.EGG , new ItemStack(UF.items.friedegg));
    	AddSmeltingRecipe(UF.items.marshmallow, new ItemStack(UF.items.cmarshmallow));
    	AddSmeltingRecipe(UF.items.MuttonRaw, new ItemStack(UF.items.MuttonCooked));
		
		// 1.2
    	AddSmeltingRecipe(UF.items.SquidTentacleRaw, new ItemStack(UF.items.SquidTentacleCooked));
		
		// 1.4
    	AddSmeltingRecipe(UF.items.milkbottle, new ItemStack(UF.items.HotMilkBottle));
    	AddSmeltingRecipe(UF.items.PanCakeDough, new ItemStack(UF.items.PanCake));
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
