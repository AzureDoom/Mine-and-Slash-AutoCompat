package com.azure.azurecompat.util;

import java.util.List;

import com.google.common.collect.ImmutableList;
import com.robertx22.mine_and_slash.api.MineAndSlashAPI;
import com.robertx22.mine_and_slash.config.compatible_items.ConfigItem;
import com.robertx22.mine_and_slash.database.gearitemslots.weapons.Sword;

public class PolyOresCompat {

	private static final List<String> TYPE = ImmutableList.of("frosted", "toxic", "blazing");

	public String MODID = "polyores:";
	
	public PolyOresCompat() {
		MineAndSlashAPI.addCompatibleItem(MODID + TYPE + "_sword", new ConfigItem().setType(Sword.INSTANCE).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + TYPE + "_largesword", new ConfigItem().setType(Sword.INSTANCE).setdropsAsLoot(false));
	}
}