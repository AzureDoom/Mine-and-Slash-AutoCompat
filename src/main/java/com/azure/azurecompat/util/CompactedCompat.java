package com.azure.azurecompat.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.robertx22.mine_and_slash.api.MineAndSlashAPI;
import com.robertx22.mine_and_slash.config.compatible_items.ConfigItem;
import com.robertx22.mine_and_slash.database.gearitemslots.weapons.Hammer;

public class CompactedCompat {
	
private static final Logger LOGGER = LogManager.getLogger();
	
	public CompactedCompat() {
		
		MineAndSlashAPI.addCompatibleItem("compacted:stone_hammer", new ConfigItem().setType(Hammer.INSTANCE));
		MineAndSlashAPI.addCompatibleItem("compacted:compacted_hammer", new ConfigItem().setType(Hammer.INSTANCE));
		MineAndSlashAPI.addCompatibleItem("compacted:double_compacted_hammer", new ConfigItem().setType(Hammer.INSTANCE));
		LOGGER.debug("Registered Better Animals Plus Gear");
	}

}