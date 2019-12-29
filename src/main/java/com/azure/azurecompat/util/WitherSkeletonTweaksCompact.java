package com.azure.azurecompat.util;

import com.robertx22.mine_and_slash.api.MineAndSlashAPI;
import com.robertx22.mine_and_slash.config.compatible_items.ConfigItem;
import com.robertx22.mine_and_slash.database.gearitemslots.weapons.Sword;

public class WitherSkeletonTweaksCompact {

	public WitherSkeletonTweaksCompact() {
		MineAndSlashAPI.addCompatibleItem("wstweaks:lava_blade",
				new ConfigItem().setType(Sword.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem("wstweaks:blaze_blade",
				new ConfigItem().setType(Sword.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
	}
}