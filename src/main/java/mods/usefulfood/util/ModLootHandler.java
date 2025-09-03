package mods.usefulfood.util;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.*;
import net.minecraft.world.storage.loot.conditions.LootCondition;
import net.minecraft.world.storage.loot.functions.LootFunction;
import net.minecraft.world.storage.loot.functions.SetCount;
import net.minecraft.world.storage.loot.RandomValueRange;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = "examplemod")
public class ModLootHandler {

    private static final ResourceLocation ZOMBIE_LOOT = new ResourceLocation("minecraft", "entities/zombie");

    @SubscribeEvent
    public static void onLootTableLoad(LootTableLoadEvent event) {

    }
}
