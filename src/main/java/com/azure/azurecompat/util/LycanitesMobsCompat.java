package com.azure.azurecompat.util;

import com.robertx22.api.MineAndSlashAPI;
import com.robertx22.config.non_mine_items.ConfigItem;
import com.robertx22.database.gearitemslots.Bow;
import com.robertx22.database.gearitemslots.Staff;

public class LycanitesMobsCompat {

	public String MODID = "lycanitesmobs:";

	public LycanitesMobsCompat() {
		MineAndSlashAPI.addCompatibleItem(MODID + "sturdysummoningstaff",
				new ConfigItem().setType(new Staff()).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "stablesummoningstaff",
				new ConfigItem().setType(new Staff()).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "savagesummoningstaff",
				new ConfigItem().setType(new Staff()).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "bloodsummoningstaff",
				new ConfigItem().setType(new Staff()).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "quillcharge",
				new ConfigItem().setType(new Bow()).setSalvagable(true));
	}
}