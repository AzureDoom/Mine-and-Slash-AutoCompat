package com.azure.azurecompat.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.robertx22.mine_and_slash.api.MineAndSlashAPI;
import com.robertx22.mine_and_slash.config.compatible_items.ConfigItem;
import com.robertx22.mine_and_slash.database.gearitemslots.leather.LeatherChest;

public class BetterAnimalsPlusCompat {
	
private static final Logger LOGGER = LogManager.getLogger();
	
	public BetterAnimalsPlusCompat() {
		
		MineAndSlashAPI.addCompatibleItem("betteranimalsplus:bear_cape_brown", new ConfigItem().setType(LeatherChest.INSTANCE));
		MineAndSlashAPI.addCompatibleItem("betteranimalsplus:bear_cape_black", new ConfigItem().setType(LeatherChest.INSTANCE));
		MineAndSlashAPI.addCompatibleItem("betteranimalsplus:bear_cape_kermode", new ConfigItem().setType(LeatherChest.INSTANCE));
		LOGGER.debug("Registered Better Animals Plus Gear");
	}

}