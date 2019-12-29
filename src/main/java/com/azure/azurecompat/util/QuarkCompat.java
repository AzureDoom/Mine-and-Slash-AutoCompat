package com.azure.azurecompat.util;

import com.robertx22.mine_and_slash.api.MineAndSlashAPI;
import com.robertx22.mine_and_slash.config.compatible_items.ConfigItem;
import com.robertx22.mine_and_slash.database.gearitemslots.weapons.Bow;

public class QuarkCompat {
	
	public String MODID = "quark:";

	public QuarkCompat() {

		MineAndSlashAPI.addCompatibleItem(MODID + "pickarang", new ConfigItem().setType(Bow.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
	}
}
