package mods.usefulfood;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class UFClient extends UFServer {
	
	public void preInit(FMLPreInitializationEvent event) {}
	
	public void init(FMLInitializationEvent event) 
	{
		ItemModelMesher imm = Minecraft.getMinecraft().getRenderItem().getItemModelMesher();
		
		for (UFItem2Model o : UF.getItem2Models()) {
			imm.register(o.item, 0, new ModelResourceLocation("usefulfood:" + o.name, "inventory"));
		}
	}
	
	@Override
	public void generateParticles(BlockPos pos, World world)
	{
	    double motionX = 1.0D;
	    double motionY = 1.0D;
	    double motionZ = 1.0D;
/*	    EntityFX MagicCakeFX = new MagicCakeParticle(world, pos, motionX, motionY, motionZ);
	    Minecraft.getMinecraft().effectRenderer.addEffect(MagicCakeFX);    */
	}
}
