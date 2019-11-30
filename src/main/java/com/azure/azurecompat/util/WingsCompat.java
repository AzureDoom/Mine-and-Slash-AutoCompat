package com.azure.azurecompat.util;

import com.robertx22.api.MineAndSlashAPI;
import com.robertx22.config.non_mine_items.ConfigItem;
import com.robertx22.database.gearitemslots.Charm;

public class WingsCompat {

	public String MODID = "wings:";

	public WingsCompat() {
		MineAndSlashAPI.addCompatibleItem(MODID + "angel_wings",
				new ConfigItem().setType(new Charm()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "slime_wings",
				new ConfigItem().setType(new Charm()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "blue_butterfly_wings",
				new ConfigItem().setType(new Charm()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "monarch_butterfly_wings",
				new ConfigItem().setType(new Charm()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "fire_wings",
				new ConfigItem().setType(new Charm()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "bat_wings",
				new ConfigItem().setType(new Charm()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "fairy_wings",
				new ConfigItem().setType(new Charm()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "evil_wings",
				new ConfigItem().setType(new Charm()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "dragon_wings",
				new ConfigItem().setType(new Charm()).setdropsAsLoot(false));
	}
}