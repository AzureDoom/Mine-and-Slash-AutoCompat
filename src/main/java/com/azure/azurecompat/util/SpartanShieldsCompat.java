package com.azure.azurecompat.util;

import java.util.List;

import com.azure.azurecompat.AzureCompat;
import com.google.common.collect.ImmutableList;
import com.robertx22.mine_and_slash.api.MineAndSlashAPI;
import com.robertx22.mine_and_slash.config.compatible_items.ConfigItem;
import com.robertx22.mine_and_slash.database.gearitemslots.offhand.Shield;

public class SpartanShieldsCompat {

	private static final List<String> TYPE = ImmutableList.of("basic_iron", "tower_platinum", "tower_nickel",
			"basic_wood", "basic_obsidian", "tower_stone", "basic_invar", "basic_electrum", "basic_gold", "basic_stone",
			"tower_iron", "tower_electrum", "tower_copper", "tower_wood", "tower_gold", "basic_steel",
			"basic_constantan", "tower_obsidian", "tower_diamond", "basic_platinum", "basic_copper", "basic_bronze",
			"tower_constantan", "basic_tin", "tower_steel", "basic_lead", "tower_tin", "tower_silver", "tower_bronze",
			"basic_nickel", "basic_diamond", "tower_lead", "tower_invar", "basic_silver");

	public String MODID = "spartanshields:shield_";

	public SpartanShieldsCompat() {

		MineAndSlashAPI.addCompatibleItem(MODID + TYPE, new ConfigItem().setType(Shield.INSTANCE));
		AzureCompat.LOGGER.info("Registered Spartan Shields Gear");
	}

}