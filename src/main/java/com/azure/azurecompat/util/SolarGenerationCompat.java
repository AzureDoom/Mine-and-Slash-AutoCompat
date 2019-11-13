package com.azure.azurecompat.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.robertx22.mine_and_slash.api.MineAndSlashAPI;
import com.robertx22.mine_and_slash.config.compatible_items.ConfigItem;
import com.robertx22.mine_and_slash.database.gearitemslots.plate.PlateHelmet;

public class SolarGenerationCompat {
	
private static final Logger LOGGER = LogManager.getLogger();
	
	public SolarGenerationCompat() {
		
		MineAndSlashAPI.addCompatibleItem("solargeneration:solar_helmet_leadstone", new ConfigItem().setType(PlateHelmet.INSTANCE).setSalvagable(false));
		MineAndSlashAPI.addCompatibleItem("solargeneration:solar_helmet_hardended", new ConfigItem().setType(PlateHelmet.INSTANCE).setSalvagable(false));
		MineAndSlashAPI.addCompatibleItem("solargeneration:solar_helmet_redstone", new ConfigItem().setType(PlateHelmet.INSTANCE).setSalvagable(false));
		MineAndSlashAPI.addCompatibleItem("solargeneration:solar_helmet_signalum", new ConfigItem().setType(PlateHelmet.INSTANCE).setSalvagable(false));
		MineAndSlashAPI.addCompatibleItem("solargeneration:solar_helmet_resonant", new ConfigItem().setType(PlateHelmet.INSTANCE).setSalvagable(false));
		MineAndSlashAPI.addCompatibleItem("solargeneration:solar_helmet_advanced", new ConfigItem().setType(PlateHelmet.INSTANCE).setSalvagable(false));
		MineAndSlashAPI.addCompatibleItem("solargeneration:solar_helmet_ultimate", new ConfigItem().setType(PlateHelmet.INSTANCE).setSalvagable(false));
		LOGGER.debug("Registered Solar Generation Gear");
	}

}