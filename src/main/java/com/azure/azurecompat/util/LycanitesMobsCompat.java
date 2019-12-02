package com.azure.azurecompat.util;

import com.robertx22.mine_and_slash.api.MineAndSlashAPI;
import com.robertx22.mine_and_slash.config.compatible_items.ConfigItem;
import com.robertx22.mine_and_slash.database.gearitemslots.weapons.Bow;
import com.robertx22.mine_and_slash.database.gearitemslots.weapons.Staff;

public class LycanitesMobsCompat {

	public String MODID = "lycanitesmobs:";

	public LycanitesMobsCompat() {
		MineAndSlashAPI.addCompatibleItem(MODID + "sturdysummoningstaff",
				new ConfigItem().setType(Staff.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "stablesummoningstaff",
				new ConfigItem().setType(Staff.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "savagesummoningstaff",
				new ConfigItem().setType(Staff.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "bloodsummoningstaff",
				new ConfigItem().setType(Staff.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "quillcharge",
				new ConfigItem().setType(Bow.INSTANCE).setSalvagable(true));
	}
}