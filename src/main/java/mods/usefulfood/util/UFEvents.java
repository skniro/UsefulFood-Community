package mods.usefulfood.util;

import mods.usefulfood.items.UFItems;
import net.minecraft.world.storage.loot.*;
import net.minecraft.world.storage.loot.conditions.LootCondition;
import net.minecraft.world.storage.loot.functions.LootFunction;
import net.minecraft.world.storage.loot.functions.SetCount;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class UFEvents {

	@SubscribeEvent
	public static void onLootTableLoad(LootTableLoadEvent event) {
		if (event.getName().equals(LootTableList.ENTITIES_SQUID)) {
			LootEntryItem rawTentacle = new LootEntryItem(
                    UFItems.SquidTentacleRaw,
					1,
					0,
					new LootFunction[]{
							new SetCount(new LootCondition[0], new RandomValueRange(1, 1))
					},
					new LootCondition[0],
					"usefulfood:squid_drop"
			);

			LootEntryItem cookedTentacle = new LootEntryItem(
					UFItems.SquidTentacleCooked,
					1,
					0,
					new LootFunction[]{
							new SetCount(new LootCondition[0], new RandomValueRange(1, 2))
					},
					new LootCondition[]{ new EntityOnFire(true) },
					"usefulfood:squid_cooked"
			);

			LootPool pool = new LootPool(
					new LootEntry[]{rawTentacle, cookedTentacle},
					new LootCondition[0],
					new RandomValueRange(1),
					new RandomValueRange(0),
					"usefulfood:squid_pool"
			);

			event.getTable().addPool(pool);
		}
	}
}
