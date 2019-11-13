package com.azure.azurecompat.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.robertx22.mine_and_slash.api.MineAndSlashAPI;
import com.robertx22.mine_and_slash.config.compatible_items.ConfigItem;
import com.robertx22.mine_and_slash.database.gearitemslots.plate.PlateBoots;

public class LongFallBootsCompat {
	
	private static final Logger LOGGER = LogManager.getLogger();

	public LongFallBootsCompat() {
		MineAndSlashAPI.addCompatibleItem("longfallboots:longfallboots", new ConfigItem().setType(PlateBoots.INSTANCE).setSalvagable(false));
		LOGGER.debug("Registered Long Fall Boots Gear");
	}

}