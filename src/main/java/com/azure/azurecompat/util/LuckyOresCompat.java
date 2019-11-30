package com.azure.azurecompat.util;

import com.robertx22.mine_and_slash.api.MineAndSlashAPI;
import com.robertx22.mine_and_slash.config.compatible_items.ConfigItem;
import com.robertx22.mine_and_slash.database.gearitemslots.weapons.Sword;

public class LuckyOresCompat {

	public LuckyOresCompat() {
		MineAndSlashAPI.addCompatibleItem("luckyores:hatesword",
				new ConfigItem().setType(Sword.INSTANCE).setSalvagable(true));
	}
}