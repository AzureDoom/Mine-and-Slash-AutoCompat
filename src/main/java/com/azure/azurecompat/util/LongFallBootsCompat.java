package com.azure.azurecompat.util;

import com.azure.azurecompat.AzureCompat;
import com.robertx22.mine_and_slash.api.MineAndSlashAPI;
import com.robertx22.mine_and_slash.config.compatible_items.ConfigItem;
import com.robertx22.mine_and_slash.database.gearitemslots.plate.PlateBoots;

public class LongFallBootsCompat {

	public LongFallBootsCompat() {
		MineAndSlashAPI.addCompatibleItem("longfallboots:longfallboots", new ConfigItem().setType(PlateBoots.INSTANCE).setdropsAsLoot(false));
		AzureCompat.LOGGER.info("Registered Long Fall Boots Gear");
	}

}