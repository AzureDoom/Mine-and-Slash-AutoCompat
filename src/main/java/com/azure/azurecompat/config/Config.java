package com.azure.azurecompat.config;

import java.io.File;

import org.apache.commons.lang3.tuple.Pair;

import com.azure.azurecompat.AzureCompat;
import com.electronwill.nightconfig.core.file.CommentedFileConfig;
import com.electronwill.nightconfig.core.io.WritingMode;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.common.ForgeConfigSpec.BooleanValue;

public class Config {
	
	public static final String NAME = "CLIENT";
    public static final ForgeConfigSpec spec;
    public static final Config INSTANCE;

    static {
        final Pair<Config, ForgeConfigSpec> specPair = new ForgeConfigSpec.Builder()
                .configure(Config::new);
        spec = specPair.getRight();
        INSTANCE = specPair.getLeft();

    }

    public BooleanValue USE_COMPATIBILITY_ON_WYRMROOST_ITEMS;
    public BooleanValue USE_COMPATIBILITY_ON_ENIGMATICLEGACY_ITEMS;
    public BooleanValue USE_COMPATIBILITY_ON_FORBIDDENARCANUS_ITEMS;
    public BooleanValue USE_COMPATIBILITY_ON_BLUEPOWER_ITEMS;
    public BooleanValue USE_COMPATIBILITY_ON_NETHERCRAFT_ITEMS;
    public BooleanValue USE_COMPATIBILITY_ON_MINECOLONIES_ITEMS;
    public BooleanValue USE_COMPATIBILITY_ON_VANILLA_ITEMS;
    public BooleanValue USE_COMPATIBILITY_ON_PLANTTECH2_ITEMS;
    public BooleanValue USE_COMPATIBILITY_ON_THEONEPROBE_ITEMS;
    public BooleanValue USE_COMPATIBILITY_ON_RESTRICTIONS_ITEMS;
    public BooleanValue USE_COMPATIBILITY_ON_SIMPLEDIVEGEAR_ITEMS;
    public BooleanValue USE_COMPATIBILITY_ON_LONGFALLBOOTS_ITEMS;
    public BooleanValue USE_COMPATIBILITY_ON_SOLARGENERATION_ITEMS;
    public BooleanValue USE_COMPATIBILITY_ON_BETTERANIMALSPLUS_ITEMS;
    public BooleanValue USE_COMPATIBILITY_ON_COMPACTED_ITEMS;
    
    Config(ForgeConfigSpec.Builder builder) {
        builder.comment("Client Settings").push(NAME);

        USE_COMPATIBILITY_ON_WYRMROOST_ITEMS = builder.comment("Turns on Auto Compatibility for Wyrmroost to get Mine and Slash stats. Turn off to configure yourself")
                .translation("azurecompat.config.use_compatibility_on_wyrmroost_items")
                .define("USE_COMPATIBILITY_ON_WYRMROOST_ITEMS", true);
        
        USE_COMPATIBILITY_ON_ENIGMATICLEGACY_ITEMS = builder.comment("Turns on Auto Compatibility for Enigmatic Legacy to get Mine and Slash stats. Turn off to configure yourself")
                .translation("azurecompat.config.use_compatibility_on_enigmaticlegacy_items")
                .define("USE_COMPATIBILITY_ON_ENIGMATICLEGACY_ITEMS", true);
        
        USE_COMPATIBILITY_ON_FORBIDDENARCANUS_ITEMS = builder.comment("Turns on Auto Compatibility for Forbidden and Arcanus to get Mine and Slash stats. Turn off to configure yourself")
                .translation("azurecompat.config.use_compatibility_on_forbiddenarcanus_items")
                .define("USE_COMPATIBILITY_ON_FORBIDDENARCANUS_ITEMS", true);
        
        USE_COMPATIBILITY_ON_BLUEPOWER_ITEMS = builder.comment("Turns on Auto Compatibility for Blue Power to get Mine and Slash stats. Turn off to configure yourself")
                .translation("azurecompat.config.use_compatibility_on_bluepower_items")
                .define("USE_COMPATIBILITY_ON_BLUEPOWER_ITEMS", true);
        
        USE_COMPATIBILITY_ON_NETHERCRAFT_ITEMS = builder.comment("Turns on Auto Compatibility for Nethercraft to get Mine and Slash stats. Turn off to configure yourself")
                .translation("azurecompat.config.use_compatibility_on_nethercraft_items")
                .define("USE_COMPATIBILITY_ON_NETHERCRAFT_ITEMS", true);
        
        USE_COMPATIBILITY_ON_MINECOLONIES_ITEMS = builder.comment("Turns on Auto Compatibility for Minecolonies to get Mine and Slash stats. Turn off to configure yourself")
                .translation("azurecompat.config.use_compatibility_on_minecolonies_items")
                .define("USE_COMPATIBILITY_ON_MINECOLONIES_ITEMS", true);
        
        USE_COMPATIBILITY_ON_PLANTTECH2_ITEMS = builder.comment("Turns on Auto Compatibility for PlantTech2 to get Mine and Slash stats. Turn off to configure yourself")
                .translation("azurecompat.config.use_compatibility_on_planttech2_items")
                .define("USE_COMPATIBILITY_ON_PLANTTECH2_ITEMS", true);
        
        USE_COMPATIBILITY_ON_THEONEPROBE_ITEMS = builder.comment("Turns on Auto Compatibility for The One Probe to get Mine and Slash stats. Turn off to configure yourself")
                .translation("azurecompat.config.use_compatibility_on_theoneprobe_items")
                .define("USE_COMPATIBILITY_ON_THEONEPROBE_ITEMS", true);
        
        USE_COMPATIBILITY_ON_RESTRICTIONS_ITEMS = builder.comment("Turns on Auto Compatibility for Restrictions to get Mine and Slash stats. Turn off to configure yourself")
                .translation("azurecompat.config.use_compatibility_on_restrictions_items")
                .define("USE_COMPATIBILITY_ON_RESTRICTIONS_ITEMS", true);
        
        USE_COMPATIBILITY_ON_SIMPLEDIVEGEAR_ITEMS = builder.comment("Turns on Auto Compatibility for Simple Dive Gear to get Mine and Slash stats. Turn off to configure yourself")
                .translation("azurecompat.config.use_compatibility_on_simpledivegear_items")
                .define("USE_COMPATIBILITY_ON_SIMPLEDIVEGEAR_ITEMS", true);
        
        USE_COMPATIBILITY_ON_LONGFALLBOOTS_ITEMS = builder.comment("Turns on Auto Compatibility for Long Fall Boots to get Mine and Slash stats. Turn off to configure yourself")
                .translation("azurecompat.config.use_compatibility_on_longfallboots_items")
                .define("USE_COMPATIBILITY_ON_LONGFALLBOOTS_ITEMS", true);
        
        USE_COMPATIBILITY_ON_SOLARGENERATION_ITEMS = builder.comment("Turns on Auto Compatibility for Solar Generation to get Mine and Slash stats. Turn off to configure yourself")
                .translation("azurecompat.config.use_compatibility_on_solargeneration_items")
                .define("USE_COMPATIBILITY_ON_SOLARGENERATION_ITEMS", true);
        
        USE_COMPATIBILITY_ON_VANILLA_ITEMS = builder.comment("Turns on Auto Compatibility for Vanilla Gear to get Mine and Slash stats. Turn off to configure yourself")
                .translation("azurecompat.config.use_compatibility_on_vanilla_items")
                .define("USE_COMPATIBILITY_ON_VANILLA_ITEMS", true);
        
        USE_COMPATIBILITY_ON_BETTERANIMALSPLUS_ITEMS = builder.comment("Turns on Auto Compatibility for Better Animals Plus to get Mine and Slash stats. Turn off to configure yourself")
                .translation("azurecompat.config.use_compatibility_on_betteranimalsplus_items")
                .define("USE_COMPATIBILITY_ON_BETTERANIMALSPLUS_ITEMS", true);
        
        USE_COMPATIBILITY_ON_COMPACTED_ITEMS = builder.comment("Turns on Auto Compatibility for Compacted to get Mine and Slash stats. Turn off to configure yourself")
                .translation("azurecompat.config.use_compatibility_on_compacted_items")
                .define("USE_COMPATIBILITY_ON_COMPACTED_ITEMS", true);

        builder.pop();
    }
    
    public static void loadConfig(ForgeConfigSpec config, String path)
	{
    	AzureCompat.LOGGER.info("Loading config: " + path);
		final CommentedFileConfig file = CommentedFileConfig.builder(new File(path)).sync().autosave().writingMode(WritingMode.REPLACE).build();
		AzureCompat.LOGGER.info("Built config: " + path);
		file.load();
		AzureCompat.LOGGER.info("Loaded config: " + path);
		config.setConfig(file);
	}

}
