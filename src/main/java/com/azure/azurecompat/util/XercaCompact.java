package com.azure.azurecompat.util;

import com.robertx22.mine_and_slash.api.MineAndSlashAPI;
import com.robertx22.mine_and_slash.config.compatible_items.ConfigItem;
import com.robertx22.mine_and_slash.database.gearitemslots.weapons.Hammer;

public class XercaCompact {

	public String MODID = "xercamod:";

	public XercaCompact() {
		MineAndSlashAPI.addCompatibleItem(MODID + "item_stone_warhammer",
				new ConfigItem().setType(Hammer.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "item_iron_warhammer",
				new ConfigItem().setType(Hammer.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "item_gold_warhammer",
				new ConfigItem().setType(Hammer.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "item_diamond_warhammer",
				new ConfigItem().setType(Hammer.INSTANCE).setSalvagable(true));
	}
}