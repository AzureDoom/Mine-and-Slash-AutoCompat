package com.azure.azurecompat.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.robertx22.mine_and_slash.api.MineAndSlashAPI;
import com.robertx22.mine_and_slash.config.compatible_items.ConfigItem;
import com.robertx22.mine_and_slash.database.gearitemslots.plate.PlateBoots;
import com.robertx22.mine_and_slash.database.gearitemslots.plate.PlateChest;
import com.robertx22.mine_and_slash.database.gearitemslots.plate.PlatePants;

public class SimpleDiveGearCompat {
	
	private static final Logger LOGGER = LogManager.getLogger();

	public SimpleDiveGearCompat() {
		MineAndSlashAPI.addCompatibleItem("simpledivegear:divechest", new ConfigItem().setType(PlateChest.INSTANCE));
		MineAndSlashAPI.addCompatibleItem("simpledivegear:divelegs", new ConfigItem().setType(PlatePants.INSTANCE));
		MineAndSlashAPI.addCompatibleItem("simpledivegear:diveboots", new ConfigItem().setType(PlateBoots.INSTANCE));
		LOGGER.debug("Registered Long Fall Boots Gear");
	}

}