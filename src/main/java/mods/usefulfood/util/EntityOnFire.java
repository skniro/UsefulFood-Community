package mods.usefulfood.util;

import com.google.gson.*;
import mods.usefulfood.UsefulFood;
import net.minecraft.entity.Entity;
import net.minecraft.util.JsonUtils;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootContext;
import net.minecraft.world.storage.loot.conditions.LootCondition;
import net.minecraft.world.storage.loot.properties.EntityProperty;

import java.util.Random;

public class EntityOnFire implements LootCondition
{
    private final boolean onFire;

    public EntityOnFire(boolean onFireIn)
    {
        this.onFire = onFireIn;
    }



    @Override
    public boolean testCondition(Random rand, LootContext context) {
        Entity entity = context.getLootedEntity();
        return entity.isBurning() == this.onFire;
    }

    public static class Serializer extends LootCondition.Serializer<EntityOnFire>
        {
            public Serializer()
            {
                super(new ResourceLocation( UsefulFood.MOD_ID,"on_fire"), EntityOnFire.class);
            }

            @Override
            public void serialize(JsonObject json, EntityOnFire property, JsonSerializationContext context) {
            }

            @Override
            public EntityOnFire deserialize(JsonObject element, JsonDeserializationContext context) {
                return new EntityOnFire(JsonUtils.getBoolean(element, "on_fire"));
            }
        }
}