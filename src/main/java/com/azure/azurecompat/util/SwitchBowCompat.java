package com.azure.azurecompat.util;

import com.robertx22.mine_and_slash.api.MineAndSlashAPI;
import com.robertx22.mine_and_slash.config.compatible_items.ConfigItem;
import com.robertx22.mine_and_slash.database.gearitemslots.weapons.Bow;
import com.robertx22.mine_and_slash.database.gearitemslots.weapons.CrossBow;

public class SwitchBowCompat {

	public SwitchBowCompat() {
		MineAndSlashAPI.addCompatibleItem("switchbow:switchbow", new ConfigItem().setType(Bow.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem("switchbow:switchcrossbow", new ConfigItem().setType(CrossBow.INSTANCE).setSalvagable(true));
	}
}