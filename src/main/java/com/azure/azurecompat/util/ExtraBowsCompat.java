package com.azure.azurecompat.util;

import com.robertx22.mine_and_slash.api.MineAndSlashAPI;
import com.robertx22.mine_and_slash.config.compatible_items.ConfigItem;
import com.robertx22.mine_and_slash.database.gearitemslots.weapons.Bow;

public class ExtraBowsCompat {

	public ExtraBowsCompat() {
		MineAndSlashAPI.addCompatibleItem("extrabows:stone_bow", new ConfigItem().setType(Bow.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem("extrabows:iron_bow", new ConfigItem().setType(Bow.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem("extrabows:golden_bow", new ConfigItem().setType(Bow.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem("extrabows:diamond_bow", new ConfigItem().setType(Bow.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem("extrabows:emerald_bow", new ConfigItem().setType(Bow.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
	}
}