package mods.usefulfood;

import java.util.Random;

import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.passive.EntitySquid;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class UFEvents {
	
	@SubscribeEvent
	public void LivingDropsEvent(LivingDropsEvent event) 
	{
		/*
		if (event.entity instanceof EntitySheep) 
		{
			if (!event.entityLiving.isChild()) 
			{
				Random random = new Random();
				
				int var3 = random.nextInt(2) + 1 + random.nextInt(1 + event.lootingLevel);
				int var4;
				
				for (var4 = 0; var4 < var3; ++var4)
		        {
					if (event.entityLiving.isBurning()) 
					{
						event.entity.dropItem(UF.items.MuttonCooked, 1);
					} 
					else 
					{
						event.entity.dropItem(UF.items.MuttonRaw, 1);
					}
				}
			}
		}
		*/
		
		if (event.getEntity() instanceof EntitySquid)
		{
			Random random = new Random();
			
			int var3 = random.nextInt(4) + 1 + random.nextInt(1 + event.getLootingLevel());
			int var4;
			
	        for (var4 = 0; var4 < var3; ++var4)
	        {
	        	if (event.getEntityLiving().isBurning())
				{
					event.getEntity().dropItem(UF.items.SquidTentacleCooked, 1);
				} 
				else 
				{
					event.getEntity().dropItem(UF.items.SquidTentacleRaw, 1);
				}
	        }
		}
	}
}
