package com.azure.azurecompat;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;

import com.azure.azurecompat.config.Config;
import com.azure.azurecompat.util.BetterAnimalsPlusCompat;
import com.azure.azurecompat.util.BluePowerCompat;
import com.azure.azurecompat.util.CompactedCompat;
import com.azure.azurecompat.util.EnigmaticLegacyCompat;
import com.azure.azurecompat.util.ForbiddenandArcanusCompat;
import com.azure.azurecompat.util.LongFallBootsCompat;
import com.azure.azurecompat.util.MinecoloniesCompat;
import com.azure.azurecompat.util.NethercraftCompat;
import com.azure.azurecompat.util.PlantTech2Compat;
import com.azure.azurecompat.util.RestrictionsCompat;
import com.azure.azurecompat.util.SimpleDiveGearCompat;
import com.azure.azurecompat.util.SolarGenerationCompat;
import com.azure.azurecompat.util.TheOneProbeCompat;
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
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::processIMC);
        
        instance = this;
		ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, Config.spec, "mine-and-slash-autocompat-config.toml");
		
		Config.loadConfig(Config.spec, FMLPaths.CONFIGDIR.get().resolve("mine-and-slash-autocompat-config.toml").toString());

        MinecraftForge.EVENT_BUS.register(this);
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
    	if (ModList.get().isLoaded("bluepower") && Config.INSTANCE.USE_COMPATIBILITY_ON_BLUEPOWER_ITEMS.get()) {
    		MinecraftForge.EVENT_BUS.register(new BluePowerCompat());
        }
    	if (ModList.get().isLoaded("nethercraft") && Config.INSTANCE.USE_COMPATIBILITY_ON_NETHERCRAFT_ITEMS.get()) {
    		MinecraftForge.EVENT_BUS.register(new NethercraftCompat());
        }
    	if (ModList.get().isLoaded("minecolonies") && Config.INSTANCE.USE_COMPATIBILITY_ON_MINECOLONIES_ITEMS.get()) {
    		MinecraftForge.EVENT_BUS.register(new MinecoloniesCompat());
        }
    	if (ModList.get().isLoaded("planttech2") && Config.INSTANCE.USE_COMPATIBILITY_ON_PLANTTECH2_ITEMS.get()) {
    		MinecraftForge.EVENT_BUS.register(new PlantTech2Compat());
        }
    	if (ModList.get().isLoaded("theoneprobe") && Config.INSTANCE.USE_COMPATIBILITY_ON_THEONEPROBE_ITEMS.get()) {
    		MinecraftForge.EVENT_BUS.register(new TheOneProbeCompat());
        }
    	if (ModList.get().isLoaded("restrictions") && Config.INSTANCE.USE_COMPATIBILITY_ON_RESTRICTIONS_ITEMS.get()) {
    		MinecraftForge.EVENT_BUS.register(new RestrictionsCompat());
        }
    	if (ModList.get().isLoaded("simpledivegear") && Config.INSTANCE.USE_COMPATIBILITY_ON_SIMPLEDIVEGEAR_ITEMS.get()) {
    		MinecraftForge.EVENT_BUS.register(new SimpleDiveGearCompat());
        }
    	if (ModList.get().isLoaded("longfallboots") && Config.INSTANCE.USE_COMPATIBILITY_ON_LONGFALLBOOTS_ITEMS.get()) {
    		MinecraftForge.EVENT_BUS.register(new LongFallBootsCompat());
        }
    	if (ModList.get().isLoaded("solargeneration") && Config.INSTANCE.USE_COMPATIBILITY_ON_SOLARGENERATION_ITEMS.get()) {
    		MinecraftForge.EVENT_BUS.register(new SolarGenerationCompat());
        }
    	if (ModList.get().isLoaded("betteranimalsplus") && Config.INSTANCE.USE_COMPATIBILITY_ON_BETTERANIMALSPLUS_ITEMS.get()) {
    		MinecraftForge.EVENT_BUS.register(new BetterAnimalsPlusCompat());
        }
    	if (ModList.get().isLoaded("compacted") && Config.INSTANCE.USE_COMPATIBILITY_ON_COMPACTED_ITEMS.get()) {
    		MinecraftForge.EVENT_BUS.register(new CompactedCompat());
        }
    }
}
