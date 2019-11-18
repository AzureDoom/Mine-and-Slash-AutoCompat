package com.azure.azurecompat.util;

import com.azure.azurecompat.AzureCompat;
import com.robertx22.mine_and_slash.api.MineAndSlashAPI;
import com.robertx22.mine_and_slash.config.compatible_items.ConfigItem;
import com.robertx22.mine_and_slash.database.gearitemslots.leather.LeatherChest;

public class BetterAnimalsPlusCompat {
	
	public String MODID = "betteranimalsplus:";

	public BetterAnimalsPlusCompat() {

		MineAndSlashAPI.addCompatibleItem(MODID + "bear_cape_brown",
				new ConfigItem().setType(LeatherChest.INSTANCE).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "bear_cape_black",
				new ConfigItem().setType(LeatherChest.INSTANCE).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "bear_cape_kermode",
				new ConfigItem().setType(LeatherChest.INSTANCE).setdropsAsLoot(false));
		AzureCompat.LOGGER.info("Registered Better Animals Plus Gear");
	}

}