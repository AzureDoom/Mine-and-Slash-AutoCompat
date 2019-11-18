package com.azure.azurecompat.util;

import java.util.List;

import com.azure.azurecompat.AzureCompat;
import com.google.common.collect.ImmutableList;
import com.robertx22.mine_and_slash.api.MineAndSlashAPI;
import com.robertx22.mine_and_slash.config.compatible_items.ConfigItem;
import com.robertx22.mine_and_slash.database.gearitemslots.plate.PlateBoots;
import com.robertx22.mine_and_slash.database.gearitemslots.plate.PlateChest;
import com.robertx22.mine_and_slash.database.gearitemslots.plate.PlateHelmet;
import com.robertx22.mine_and_slash.database.gearitemslots.plate.PlatePants;
import com.robertx22.mine_and_slash.database.gearitemslots.weapons.Sword;
import com.robertx22.mine_and_slash.database.gearitemslots.weapons.Wand;

public class TofuCraftCompat {

	private static final List<String> TYPE = ImmutableList.of("kinu", "momen", "solid", "metal", "diamond");

	public String MODID = "tofucraft:";

	public TofuCraftCompat() {

		MineAndSlashAPI.addCompatibleItem(MODID + "sword" + TYPE, new ConfigItem().setType(Sword.INSTANCE));
		MineAndSlashAPI.addCompatibleItem(MODID + "tofustick", new ConfigItem().setType(Wand.INSTANCE));
		MineAndSlashAPI.addCompatibleItem(MODID + "armor" + TYPE + "helmet",
				new ConfigItem().setType(PlateHelmet.INSTANCE));
		MineAndSlashAPI.addCompatibleItem(MODID + "armor" + TYPE + "chestplate",
				new ConfigItem().setType(PlateChest.INSTANCE));
		MineAndSlashAPI.addCompatibleItem(MODID + "armor" + TYPE + "leggins",
				new ConfigItem().setType(PlatePants.INSTANCE));
		MineAndSlashAPI.addCompatibleItem(MODID + "armor" + TYPE + "boots",
				new ConfigItem().setType(PlateBoots.INSTANCE));
		AzureCompat.LOGGER.info("Registered Gems Plus Plus Gear");
	}

}