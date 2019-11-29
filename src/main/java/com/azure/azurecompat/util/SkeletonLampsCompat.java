package com.azure.azurecompat.util;

import com.robertx22.api.MineAndSlashAPI;
import com.robertx22.config.non_mine_items.ConfigItem;
import com.robertx22.database.gearitemslots.Sword;

public class SkeletonLampsCompat {

	public SkeletonLampsCompat() {
		MineAndSlashAPI.addCompatibleItem("skltlamp:bambooknife", new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
	}
}