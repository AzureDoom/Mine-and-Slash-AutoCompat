package com.azure.azurecompat.util;

import com.robertx22.api.MineAndSlashAPI;
import com.robertx22.config.non_mine_items.ConfigItem;
import com.robertx22.database.gearitemslots.Boots;
import com.robertx22.database.gearitemslots.Chest;
import com.robertx22.database.gearitemslots.Helmet;
import com.robertx22.database.gearitemslots.Pants;

public class MegaLootCompat {

	public MegaLootCompat() {
		MineAndSlashAPI.addCompatibleItem("megaloot:weaponsword", new ConfigItem().setType(new Helmet()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem("megaloot:armor_helmet", new ConfigItem().setType(new Helmet()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem("megaloot:armor_chestplate", new ConfigItem().setType(new Chest()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem("megaloot:armor_leggings", new ConfigItem().setType(new Pants()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem("megaloot:armor_boots", new ConfigItem().setType(new Boots()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem("megaloot:weaponbow", new ConfigItem().setType(new Helmet()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem("megaloot:baublering", new ConfigItem().setType(new Helmet()).setdropsAsLoot(false));
	}
}