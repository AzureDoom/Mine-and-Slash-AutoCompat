package com.azure.azurecompat.util;

import com.robertx22.mine_and_slash.api.MineAndSlashAPI;
import com.robertx22.mine_and_slash.config.compatible_items.ConfigItem;
import com.robertx22.mine_and_slash.database.gearitemslots.weapons.Bow;

public class YoyosCompat {

	public String MODID = "yoyos:";

	public YoyosCompat() {
		MineAndSlashAPI.addCompatibleItem(MODID + "wooden_yoyo",
				new ConfigItem().setType(Bow.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "stone_yoyo",
				new ConfigItem().setType(Bow.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "iron_yoyo",
				new ConfigItem().setType(Bow.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "gold_yoyo",
				new ConfigItem().setType(Bow.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "diamond_yoyo",
				new ConfigItem().setType(Bow.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "creative_yoyo",
				new ConfigItem().setType(Bow.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "sticky_yoyo",
				new ConfigItem().setType(Bow.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "shear_yoyo",
				new ConfigItem().setType(Bow.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "hoe_yoyo",
				new ConfigItem().setType(Bow.INSTANCE).setSalvagable(true));
	}

}