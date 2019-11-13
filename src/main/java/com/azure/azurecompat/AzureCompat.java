package com.azure.azurecompat;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;

import com.azure.azurecompat.config.Config;
import com.azure.azurecompat.util.EnigmaticLegacyCompat;
import com.azure.azurecompat.util.ForbiddenandArcanusCompat;
import com.azure.azurecompat.util.VanillaCompat;
import com.azure.azurecompat.util.WyrmroostCompat;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("azurecompat")
public class AzureCompat{
	
	public static AzureCompat instance;
	public static final String MODID = "azurecompat";
	public static final Logger LOGGER = LogManager.getLogger(MODID);

    public AzureCompat() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::enqueueIMC);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::processIMC);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);
        
        instance = this;
		ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, Config.spec, "mine-and-slash-autocompat-config.toml");
		
		Config.loadConfig(Config.spec, FMLPaths.CONFIGDIR.get().resolve("mine-and-slash-autocompat-config.toml").toString());

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
    }

    private void enqueueIMC(final InterModEnqueueEvent event) {
    }

    private void processIMC(final InterModProcessEvent event){
    	if (Config.INSTANCE.USE_COMPATIBILITY_ON_VANILLA_ITEMS.get()) {
    		MinecraftForge.EVENT_BUS.register(new VanillaCompat());
    	}
    	if (ModList.get().isLoaded("wyrmroost") && Config.INSTANCE.USE_COMPATIBILITY_ON_WYRMROOST_ITEMS.get()) {
    		MinecraftForge.EVENT_BUS.register(new WyrmroostCompat());
        }
    	if (ModList.get().isLoaded("enigmaticlegacy") && Config.INSTANCE.USE_COMPATIBILITY_ON_ENIGMATICLEGACY_ITEMS.get()) {
    		MinecraftForge.EVENT_BUS.register(new EnigmaticLegacyCompat());
        }
    	if (ModList.get().isLoaded("forbidden_arcanus") && Config.INSTANCE.USE_COMPATIBILITY_ON_FORBIDDENARCANUS_ITEMS.get()) {
    		MinecraftForge.EVENT_BUS.register(new ForbiddenandArcanusCompat());
        }
    }
}
