package com.azure.azurecompat.util;

import com.robertx22.mine_and_slash.api.MineAndSlashAPI;
import com.robertx22.mine_and_slash.config.compatible_items.ConfigItem;
import com.robertx22.mine_and_slash.database.gearitemslots.weapons.Hammer;

public class CompactedCompat {

	public CompactedCompat() {

		MineAndSlashAPI.addCompatibleItem("compacted:stone_hammer", new ConfigItem().setType(Hammer.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem("compacted:compacted_hammer", new ConfigItem().setType(Hammer.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem("compacted:double_compacted_hammer",
				new ConfigItem().setType(Hammer.INSTANCE).setSalvagable(true));
	}

}