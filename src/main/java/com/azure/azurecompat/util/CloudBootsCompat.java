package com.azure.azurecompat.util;

import com.robertx22.mine_and_slash.api.MineAndSlashAPI;
import com.robertx22.mine_and_slash.config.compatible_items.ConfigItem;
import com.robertx22.mine_and_slash.database.gearitemslots.cloth.ClothBoots;

public class CloudBootsCompat {

	public CloudBootsCompat() {
		MineAndSlashAPI.addCompatibleItem("cloudboots:cloud_boots", new ConfigItem().setType(ClothBoots.INSTANCE).setdropsAsLoot(false));
	}

}