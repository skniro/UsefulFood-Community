package mods.usefulfood.items;

import mods.usefulfood.UsefulFood;
import mods.usefulfood.items.init.ItemBottle;
import mods.usefulfood.items.init.ItemBowl;
import mods.usefulfood.items.init.ItemCheese;
import mods.usefulfood.items.init.ItemFoodDebug;
import mods.usefulfood.items.init.ItemFoodStick;
import mods.usefulfood.items.init.ItemFoodUF;
import mods.usefulfood.items.init.ItemJuice;
import mods.usefulfood.items.init.ItemMagicAppleJuice;
import mods.usefulfood.items.init.ItemMagicFruitSalad;
import mods.usefulfood.items.init.ItemMagicIceCream;
import mods.usefulfood.items.init.ItemSoupUF;
import mods.usefulfood.items.init.ItemTea;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

public class UFItems {
	public static Item AppleJamBiscuit;
	public static Item AppleCake;
	public static Item AppleIceCream;
	public static Item applejuice;
	public static Item biscuit;
	public static Item breadslice;
	public static Item CactusJuice;
	public static Item caramel;
	public static Item caramelapple;
	public static Item CaramelBiscuit;
	public static Item CaramelCake;
	public static Item CaramelIceCream;
	public static Item carrotjuice;
	public static Item carrotpie;
	public static Item carrotsoup;
	public static Item Cheese;
	public static Item CheeseSandwich;
	public static Item chickenwich;
	public static Item chocobiscuit;
	public static Item ChocolateApple;
	public static Item chocolatebottle;
	public static Item ChocolateCake;
	public static Item chocolatecandy;
	public static Item chocolateicecream;
	public static Item cmarshmallow;
	public static Item debugfood;
	public static Item eggwich;
	public static Item fishnchips;
	public static Item FishSoup;
	public static Item fishwich;
	public static Item friedegg;
	public static Item fruitsalad;
	public static Item hotchocolatebottle;
	public static Item HotMilkBottle;
	public static Item icecream;
	public static Item jelly;
	public static Item magicapplejuice;
	public static Item MagicCake;
	public static Item magicfruitsalad;
	public static Item MagicIceCream;
	public static Item marshmallow;
	public static Item MelonIceCream;
	public static Item melonjuice;
	public static Item milkbottle;
	public static Item MuttonCooked;
	public static Item MuttonRaw;
	public static Item MuttonSandwich;
	public static Item porkwich;
	public static Item pumpkinbread;
	public static Item pumpkinsoup;
	public static Item RoastedSeeds;
	public static Item salad;
	public static Item Oatmeal;
	public static Item Spaghetti;
	public static Item SquidSandwich;
	public static Item SquidSushi;
	public static Item SquidTentacleCooked;
	public static Item SquidTentacleRaw;
	public static Item steakwich;
	public static Item sugarbiscuit;
	public static Item sugarcube;
	public static Item sushi;
	public static Item Tea;
	public static Item trailmix;
	public static Item Cereal;
	public static Item ChocolateCereal;
	public static Item FrenchFries;
	public static Item AppleJelly;
	public static Item MelonJelly;
	public static Item Donut;
	public static Item Oreo;
	public static Item CaramelToast;
	public static Item ChocolateToast;
	public static Item SugarToast;
	public static Item SugarPancake;
	public static Item AppleJamPanCake;
	public static Item AppleJamToast;
	public static Item AppleJam;
	public static Item Waffle;
	public static Item CaramelPanCake;
	public static Item ChocolatePanCake;
	public static Item MelonJamPanCake;
	public static Item MelonJamToast;
	public static Item MelonJamBiscuit;
	public static Item MelonJam;
	public static Item PanCakeDough;
	public static Item PanCake;

	@SubscribeEvent
	public static void register(RegistryEvent.Register<Item> event) {
		IForgeRegistry<Item> registry = event.getRegistry();
		milkbottle = registerItem(registry, new ItemBottle("MilkBottle", 0, 0.0F, true).setContainerItem(Items.GLASS_BOTTLE),"milkbottle", UsefulFood.tabUsefulFood);
		chocolatebottle = registerItem(registry, new ItemBottle("chocolatemilkbottle", 3, 0.8F, true),"chocolatemilkbottle", UsefulFood.tabUsefulFood);
		Cheese = registerItem(registry, new ItemCheese("Cheese", 2, 0.6F, true),"cheese", UsefulFood.tabUsefulFood);
		chocolatecandy = registerItem(registry, new ItemFoodUF("ChocolateBar", 6, 1.0F, false),"chocolatebar", UsefulFood.tabUsefulFood);
		fruitsalad = registerItem(registry, new ItemBowl("FruitSalad", 7, 0.6F, false),"fruitsalad", UsefulFood.tabUsefulFood);
		magicfruitsalad = registerItem(registry, new ItemMagicFruitSalad("MagicFruitSalad", 6, 0.6F, false).setPotionEffect(new PotionEffect(MobEffects.REGENERATION, 5, 0), 1.0F).setPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 10, 0), 1.0F),"magicfruitsalad", UsefulFood.tabUsefulFood);
		sugarcube = registerItem(registry, new ItemFoodUF("SugarCube", 4, 0.1F, false).setPotionEffect(new PotionEffect(MobEffects.SPEED, 10, 0), 1.0F),"sugarcube", UsefulFood.tabUsefulFood);
		caramel = registerItem(registry, new ItemFoodUF("Caramel", 5, 0.2F, false).setPotionEffect(new PotionEffect(MobEffects.SPEED, 10, 0), 1.0F),"caramel", UsefulFood.tabUsefulFood);
		caramelapple = registerItem(registry, new ItemFoodStick("CaramelApple", 10, 0.5F, false).setPotionEffect(new PotionEffect(MobEffects.SPEED, 10, 0), 1.0F),"caramelapple", UsefulFood.tabUsefulFood);
		RoastedSeeds = registerItem(registry, new ItemFoodUF("RoastedSeeds", 1, 0.5F, false),"roastedseeds", UsefulFood.tabUsefulFood);
		friedegg = registerItem(registry, new ItemFoodUF("FriedEgg", 3, 0.4F, true),"friedegg", UsefulFood.tabUsefulFood);
		pumpkinsoup = registerItem(registry, new ItemSoupUF("PumpkinSoup", 5, 0.8F),"pumpkinsoup", UsefulFood.tabUsefulFood);
		salad = registerItem(registry, new ItemBowl("Salad", 3, 0.6F, false),"salad", UsefulFood.tabUsefulFood);
		Oatmeal = registerItem(registry, new ItemBowl("Oatmeal", 4, 0.6F, false),"oatmeal", UsefulFood.tabUsefulFood);
		jelly = registerItem(registry, new ItemBowl("Jelly", 5, 0.3F, false).setPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 30, 0), 1.0F),"jelly", UsefulFood.tabUsefulFood);
		marshmallow = registerItem(registry, new ItemFoodStick("RawMarshmallow", 3, 0.3F, false),"rawmarshmallow", UsefulFood.tabUsefulFood);
		cmarshmallow = registerItem(registry, new ItemFoodStick("CookedMarshmallow", 4, 0.3F, false),"cookedmarshmallow", UsefulFood.tabUsefulFood);
		icecream = registerItem(registry, new ItemBowl("VanillaIceCream", 2, 0.3F, true),"vanillaicecream", UsefulFood.tabUsefulFood);
		breadslice = registerItem(registry, new ItemFoodUF("BreadSlice", 1, 0.3F, false),"breadslice", UsefulFood.tabUsefulFood);
		porkwich = registerItem(registry, new ItemFoodUF("PorkChopSandwich", 11, 1.0F, true),"porkchopsandwich", UsefulFood.tabUsefulFood);
		steakwich = registerItem(registry, new ItemFoodUF("SteakSandwich", 11, 1.0F, true),"steaksandwich", UsefulFood.tabUsefulFood);
		fishwich = registerItem(registry, new ItemFoodUF("FishSandwich", 8, 1.0F, true),"fishsandwich", UsefulFood.tabUsefulFood);
		chickenwich = registerItem(registry, new ItemFoodUF("ChickenSandwich", 9, 1.0F, true),"chickensandwich", UsefulFood.tabUsefulFood);
		eggwich = registerItem(registry, new ItemFoodUF("EggSandwich", 6, 1.0F, true),"eggsandwich", UsefulFood.tabUsefulFood);
		biscuit = registerItem(registry, new ItemFoodUF("Biscuit", 1, 0.3F, true),"biscuit", UsefulFood.tabUsefulFood);
		trailmix = registerItem(registry, new ItemBowl("Trailmix", 4, 0.5F, false),"trailmix", UsefulFood.tabUsefulFood);




		// 1.0
		MuttonSandwich = registerItem(registry, new ItemFoodUF("MuttonSandwich", 8, 1.0F, true),"muttonsandwich", UsefulFood.tabUsefulFood);

		// 1.1
		debugfood = registerItem(registry, new ItemFoodDebug("Hungrz"),"hungrz", UsefulFood.tabUsefulFood);

		// 1.2
		sushi = registerItem(registry, new ItemFoodUF("Sushi", 5, 0.3F, true),"sushi", UsefulFood.tabUsefulFood);
		SquidTentacleRaw = registerItem(registry, new ItemFoodUF("SquidTentacle", 2, 0.3F, true),"squidtentacle", UsefulFood.tabUsefulFood);
		SquidTentacleCooked = registerItem(registry, new ItemFoodUF("CookedSquidTentacle", 5, 0.8F, true),"cookedsquidtentacle", UsefulFood.tabUsefulFood);
		SquidSandwich = registerItem(registry, new ItemFoodUF("SquidSandwich", 8, 0.8F, true),"squidsandwich", UsefulFood.tabUsefulFood);
		magicapplejuice = registerItem(registry, new ItemMagicAppleJuice("MagicAppleJuice", 13, 1.2F),"magicapplejuice", UsefulFood.tabUsefulFood);
		melonjuice = registerItem(registry, new ItemJuice("MelonJuice", 6, 0.9F),"melonjuice", UsefulFood.tabUsefulFood);
		applejuice = registerItem(registry, new ItemJuice("AppleJuice", 12, 0.9F),"applejuice", UsefulFood.tabUsefulFood);
		carrotjuice = registerItem(registry, new ItemJuice("CarrotJuice", 12, 0.9F),"carrotjuice", UsefulFood.tabUsefulFood);
		carrotsoup = registerItem(registry, new ItemSoupUF("CarrotSoup", 9, 0.8F),"carrotsoup", UsefulFood.tabUsefulFood);
		pumpkinbread = registerItem(registry, new ItemFoodUF("PumpkinBread", 10, 0.6F, true),"pumpkinbread", UsefulFood.tabUsefulFood);
		fishnchips = registerItem(registry, new ItemFoodUF("FishnChips", 12, 1.2F, true),"fishnchips", UsefulFood.tabUsefulFood);
		sugarbiscuit = registerItem(registry, new ItemFoodUF("SugarBiscuit", 3, 0.3F, false),"sugarbiscuit", UsefulFood.tabUsefulFood);
		AppleJamBiscuit = registerItem(registry, new ItemFoodUF("AppleJamBiscuit", 10, 0.3F, false),"applejambiscuit", UsefulFood.tabUsefulFood);
		chocobiscuit = registerItem(registry, new ItemFoodUF("ChocolateBiscuit", 3, 1.0F, false),"chocolatebiscuit", UsefulFood.tabUsefulFood);
		carrotpie = registerItem(registry, new ItemFoodUF("CarrotPie", 9, 0.8F, true),"carrotpie", UsefulFood.tabUsefulFood);
		hotchocolatebottle = registerItem(registry, new ItemBottle("HotChocolateMilkBottle", 4, 1.0F, true).setContainerItem(Items.GLASS_BOTTLE),"hotchocolatemilkbottle", UsefulFood.tabUsefulFood);
		chocolateicecream = registerItem(registry, new ItemBowl("ChocolateIceCream", 9, 0.8F, true),"chocolateicecream", UsefulFood.tabUsefulFood);

		// 1.4
		MagicIceCream = registerItem(registry, new ItemMagicIceCream("MagicIceCream", 9, 0.6F, true).setPotionEffect(new PotionEffect(MobEffects.REGENERATION, 5, 0), 1.0F).setPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 10, 0), 1.0F),"magicicecream", UsefulFood.tabUsefulFood);
		SquidSushi = registerItem(registry, new ItemFoodUF("SquidSushi", 5, 0.3F, true),"squidsushi", UsefulFood.tabUsefulFood);
		CactusJuice = registerItem(registry, new ItemJuice("CactusJuice", 5, 0.6F),"cactusjuice", UsefulFood.tabUsefulFood);
		Spaghetti = registerItem(registry, new ItemBowl("Spaghetti", 5, 0.6F, false),"spaghetti", UsefulFood.tabUsefulFood);
		AppleIceCream = registerItem(registry, new ItemBowl("AppleIceCream", 5, 0.6F, true),"appleicecream", UsefulFood.tabUsefulFood);
		MelonIceCream = registerItem(registry, new ItemBowl("MelonIceCream", 7, 0.6F, true),"melonicecream", UsefulFood.tabUsefulFood);
		ChocolateApple = registerItem(registry, new ItemFoodStick("ChocolateApple", 11, 0.6F, false),"chocolateapple", UsefulFood.tabUsefulFood);
		CaramelBiscuit = registerItem(registry, new ItemFoodUF("CaramelBiscuit", 7, 0.6F, false).setPotionEffect(new PotionEffect(MobEffects.SPEED, 10, 0), 1.0F),"caramelbiscuit", UsefulFood.tabUsefulFood);
		FishSoup = registerItem(registry, new ItemSoupUF("FishSoup", 12, 0.6F),"fishsoup", UsefulFood.tabUsefulFood);
		Tea = registerItem(registry, new ItemTea("Tea", 2),"tea", UsefulFood.tabUsefulFood);
		HotMilkBottle = registerItem(registry, new ItemBottle("HotMilkBottle", 1, 0.3F, true).setContainerItem(Items.GLASS_BOTTLE),"hotmilkbottle", UsefulFood.tabUsefulFood);
		CheeseSandwich = registerItem(registry, new ItemFoodUF("cheesesandwich", 5, 1.0F, false),"cheesesandwich", UsefulFood.tabUsefulFood);
		CaramelIceCream = registerItem(registry, new ItemBowl("CaramelIceCream", 8, 0.6F, true).setPotionEffect(new PotionEffect(MobEffects.SPEED, 10, 0), 1.0F),"caramelicecream", UsefulFood.tabUsefulFood);
		Cereal = registerItem(registry, new ItemBowl("Cereal", 4, 0.5F, true),"cereal", UsefulFood.tabUsefulFood);
		ChocolateCereal = registerItem(registry, new ItemBowl("ChocolateCereal", 6, 0.5F, true),"chocolatecereal", UsefulFood.tabUsefulFood);
		FrenchFries = registerItem(registry, new ItemFoodUF("FrenchFries", 7, 0.6F, false),"frenchfries", UsefulFood.tabUsefulFood);
		AppleJelly = registerItem(registry, new ItemBowl("AppleJelly", 9, 0.4F, false).setPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 30, 0), 1.0F),"applejelly", UsefulFood.tabUsefulFood);
		MelonJelly = registerItem(registry, new ItemBowl("MelonJelly", 7, 0.4F, false).setPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 30, 0), 1.0F),"melonjelly", UsefulFood.tabUsefulFood);
		Donut = registerItem(registry, new ItemFoodUF("Donut", 7, 0.6F, false),"donut", UsefulFood.tabUsefulFood);
		Oreo = registerItem(registry, new ItemFoodUF("Oreo", 9, 1.0F, false),"oreo", UsefulFood.tabUsefulFood);
		CaramelToast = registerItem(registry, new ItemFoodUF("CaramelToast", 7, 0.6F, false).setPotionEffect(new PotionEffect(MobEffects.SPEED, 10, 0), 1.0F),"carameltoast", UsefulFood.tabUsefulFood);
		ChocolateToast = registerItem(registry, new ItemFoodUF("ChocolateToast", 8, 0.6F, false),"chocolatetoast", UsefulFood.tabUsefulFood);
		SugarToast = registerItem(registry, new ItemFoodUF("SugarToast", 3, 0.2F, false).setPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 0), 1.0F),"sugartoast", UsefulFood.tabUsefulFood);
		SugarPancake = registerItem(registry, new ItemFoodUF("SugarPancake", 8, 0.6F, false).setPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 0), 1.0F),"sugarpancake", UsefulFood.tabUsefulFood);
		AppleJamPanCake = registerItem(registry, new ItemFoodUF("AppleJamPancake", 15, 0.7F, false),"applejampancake", UsefulFood.tabUsefulFood);
		AppleJamToast = registerItem(registry, new ItemFoodUF("AppleJamToast", 10, 0.7F, false),"applejamtoast", UsefulFood.tabUsefulFood);
		AppleJam = registerItem(registry, new ItemBowl("AppleJam", 8, 0.4F, false).setContainerItem(Items.BOWL),"applejam", UsefulFood.tabUsefulFood);
		CaramelPanCake = registerItem(registry, new ItemFoodUF("CaramelPancake", 12, 0.6F, false).setPotionEffect(new PotionEffect(MobEffects.SPEED, 10, 0), 1.0F),"caramelpancake", UsefulFood.tabUsefulFood);
		ChocolatePanCake = registerItem(registry, new ItemFoodUF("ChocolatePancake", 13, 0.6F, false),"chocolatepancake", UsefulFood.tabUsefulFood);
		MelonJamPanCake = registerItem(registry, new ItemFoodUF("MelonJamPancake", 13, 0.4F, false),"melonjampancake", UsefulFood.tabUsefulFood);
		MelonJamToast = registerItem(registry, new ItemFoodUF("MelonJamToast", 8, 0.4F, false),"melonjamtoast", UsefulFood.tabUsefulFood);
		MelonJamBiscuit = registerItem(registry, new ItemFoodUF("MelonJamBiscuit", 8, 0.4F, false),"melonjambiscuit", UsefulFood.tabUsefulFood);
		MelonJam = registerItem(registry, new ItemBowl("MelonJam", 6, 0.4F, false).setContainerItem(Items.BOWL),"melonjam", UsefulFood.tabUsefulFood);
		PanCakeDough = registerItem(registry, new ItemFoodUF("PancakeDough", 5, 0.3F, false),"pancakedough", UsefulFood.tabUsefulFood);
		PanCake = registerItem(registry, new ItemFoodUF("Pancake", 6, 0.6F, false),"pancake", UsefulFood.tabUsefulFood);
    }

	public static Item registerItem(IForgeRegistry<Item> reg, Item item, String name, CreativeTabs tab) {
		item.setRegistryName(name);
		item.setUnlocalizedName(UsefulFood.MOD_ID + "." + name);
		if (tab != null) item.setCreativeTab(tab);

		reg.register(item);

		return item;
	}
}
