package com.azure.azurecompat.util;

import com.robertx22.api.MineAndSlashAPI;
import com.robertx22.config.non_mine_items.ConfigItem;
import com.robertx22.database.gearitemslots.Boots;
import com.robertx22.database.gearitemslots.Chest;
import com.robertx22.database.gearitemslots.Helmet;
import com.robertx22.database.gearitemslots.Pants;

public class RandomLootCompat {

	public RandomLootCompat() {
		MineAndSlashAPI.addCompatibleItem("randomloot:sword", new ConfigItem().setType(new Helmet()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem("randomloot:heavy_helmet", new ConfigItem().setType(new Helmet()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem("randomloot:heavy_chest", new ConfigItem().setType(new Chest()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem("randomloot:heavy_legs", new ConfigItem().setType(new Pants()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem("randomloot:heavy_boots", new ConfigItem().setType(new Boots()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem("randomloot:titanium_helmet", new ConfigItem().setType(new Helmet()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem("randomloot:titanium_chest", new ConfigItem().setType(new Chest()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem("randomloot:titanium_legs", new ConfigItem().setType(new Pants()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem("randomloot:titanium_boots", new ConfigItem().setType(new Boots()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem("randomloot:rl_bow", new ConfigItem().setType(new Helmet()).setdropsAsLoot(false));
	}
}