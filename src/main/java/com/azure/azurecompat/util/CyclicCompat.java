package com.azure.azurecompat.util;

import com.robertx22.mine_and_slash.api.MineAndSlashAPI;
import com.robertx22.mine_and_slash.config.compatible_items.ConfigItem;
import com.robertx22.mine_and_slash.database.gearitemslots.weapons.Wand;

public class CyclicCompat {

	public CyclicCompat() {
		MineAndSlashAPI.addCompatibleItem("cyclic:evoker_fang", new ConfigItem().setType(Wand.INSTANCE).setSalvagable(true));
	}
}