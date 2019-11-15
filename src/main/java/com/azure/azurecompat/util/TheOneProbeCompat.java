package com.azure.azurecompat.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.robertx22.mine_and_slash.api.MineAndSlashAPI;
import com.robertx22.mine_and_slash.config.compatible_items.ConfigItem;
import com.robertx22.mine_and_slash.database.gearitemslots.plate.PlateHelmet;

public class TheOneProbeCompat {
	
private static final Logger LOGGER = LogManager.getLogger();
	
	public TheOneProbeCompat() {
		
		MineAndSlashAPI.addCompatibleItem("theoneprobe:iron_helmet_probe", new ConfigItem().setType(PlateHelmet.INSTANCE));
		MineAndSlashAPI.addCompatibleItem("theoneprobe:gold_helmet_probe", new ConfigItem().setType(PlateHelmet.INSTANCE));
		MineAndSlashAPI.addCompatibleItem("theoneprobe:diamond_helmet_probe", new ConfigItem().setType(PlateHelmet.INSTANCE));
		LOGGER.debug("Registered The One Probe Gear");
	}

}