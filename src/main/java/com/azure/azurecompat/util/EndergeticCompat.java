package com.azure.azurecompat.util;

import com.robertx22.mine_and_slash.api.MineAndSlashAPI;
import com.robertx22.mine_and_slash.config.compatible_items.ConfigItem;
import com.robertx22.mine_and_slash.database.gearitemslots.cloth.ClothChest;

public class EndergeticCompat {

	public EndergeticCompat() {
		MineAndSlashAPI.addCompatibleItem("endergetic:booflo_vest",
				new ConfigItem().setType(ClothChest.INSTANCE).setSalvagable(true));
	}
}