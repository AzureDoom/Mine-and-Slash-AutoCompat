package com.azure.azurecompat;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.azure.azurecompat.config.Config;
import com.azure.azurecompat.util.VanillaCompat;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;

@Mod("azurecompat")
public class AzureCompat {

	public static AzureCompat instance;
	public static final String MODID = "azurecompat";
	public static final Logger LOGGER = LogManager.getLogger(MODID);

	public AzureCompat() {
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::processIMC);
		instance = this;
		ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, Config.spec, "m&s-autocompat-config.toml");
		Config.loadConfig(Config.spec, FMLPaths.CONFIGDIR.get().resolve("m&s-autocompat-config.toml").toString());
		MinecraftForge.EVENT_BUS.register(this);
	}

	private void processIMC(final InterModProcessEvent event) {
		if (Config.INSTANCE.USE_COMPATIBILITY_ON_VANILLA_ITEMS.get()) {
			MinecraftForge.EVENT_BUS.register(new VanillaCompat());
		}
	}
}
