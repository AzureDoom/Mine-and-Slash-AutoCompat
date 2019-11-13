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
    public BooleanValue USE_COMPATIBILITY_ON_VANILLA_ITEMS;
    
    Config(ForgeConfigSpec.Builder builder) {
        builder.comment("Client Settings").push(NAME);

        USE_COMPATIBILITY_ON_WYRMROOST_ITEMS = builder.comment("Turns on Auto Compatibility for Wyrmroost to get Mine and Slash stats. Turn off to configure yourself")
                .translation("azurecompat.config.use_compatibility_on_wyrmroost_items")
                .define("USE_COMPATIBILITY_ON_WYRMROOST_ITEMS", true);
        
        USE_COMPATIBILITY_ON_VANILLA_ITEMS = builder.comment("Turns on Auto Compatibility for Vanilla Gear to get Mine and Slash stats. Turn off to configure yourself")
                .translation("azurecompat.config.use_compatibility_on_vanilla_items")
                .define("USE_COMPATIBILITY_ON_VANILLA_ITEMS", true);

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
