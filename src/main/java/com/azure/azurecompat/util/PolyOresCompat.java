package com.azure.azurecompat.util;

import com.robertx22.mine_and_slash.api.MineAndSlashAPI;
import com.robertx22.mine_and_slash.config.compatible_items.ConfigItem;
import com.robertx22.mine_and_slash.database.gearitemslots.weapons.Sword;

public class PolyOresCompat {

	public String MODID = "polyores:";
	
	public PolyOresCompat() {
		MineAndSlashAPI.addCompatibleItem(MODID + "frosted_sword", new ConfigItem().setType(Sword.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "toxic_sword", new ConfigItem().setType(Sword.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "blazing_sword", new ConfigItem().setType(Sword.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "frosted_largesword", new ConfigItem().setType(Sword.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "toxic_largesword", new ConfigItem().setType(Sword.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "blazing_largesword", new ConfigItem().setType(Sword.INSTANCE).setSalvagable(true));
	}
}