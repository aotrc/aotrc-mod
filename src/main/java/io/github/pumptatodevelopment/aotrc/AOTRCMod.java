package io.github.pumptatodevelopment.aotrc;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = "aotrcm", name = "Attack of The Red Creepers Mod", version = "1.0")
public class AOTRCMod {
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		//Item/Block init and registering
		//Config handling
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		//Proxy, TileEntity, entity, GUI and Packet Registering
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		//Post init stuff
	}
}
