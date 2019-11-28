package com.azure.azurecompat;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.azure.azurecompat.config.ModConfig;
import com.azure.azurecompat.util.ebwizardry;
import com.azure.azurecompat.util.fireice;
import com.azure.azurecompat.util.techreborn;
import com.azure.azurecompat.util.thermalfoundation;
import com.azure.azurecompat.util.Vanilla;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;

@Mod(modid = AzureCompat.MODID, version = AzureCompat.VERSION, dependencies = AzureCompat.DEPENDENCIES)
public class AzureCompat {

	public static final String MODID = "azurecompat";
	public static final String MODNAME = "Mine and Slash AutoCompat 1.12.2";
	public static final String VERSION = "1.0.0";
	public static final String DEPENDENCIES = "required:mmorpg;required:baubles";
	public static final Logger LOGGER = LogManager.getLogger();

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent e) {
		if (Loader.isModLoaded("iceandfire") && ModConfig.AUTOCOMPATIBILITY_ICEFIREITEMS) {
			MinecraftForge.EVENT_BUS.register(new fireice());
		}
		if (Loader.isModLoaded("ebwizardry") && ModConfig.AUTOCOMPATIBILITY_EBWIZARDRYITEMS) {
			MinecraftForge.EVENT_BUS.register(new ebwizardry());
		}
		if (Loader.isModLoaded("techreborn") && ModConfig.AUTOCOMPATIBILITY_TECHREBORNITEMS) {
			MinecraftForge.EVENT_BUS.register(new techreborn());
		}
		if (Loader.isModLoaded("thermalfoundation") && ModConfig.AUTOCOMPATIBILITY_THERMALITEMS) {
			MinecraftForge.EVENT_BUS.register(new thermalfoundation());
		}
		if (ModConfig.AUTOCOMPATIBILITY_VANILLAITEMS) {
			MinecraftForge.EVENT_BUS.register(new Vanilla());
		}
	}
}
