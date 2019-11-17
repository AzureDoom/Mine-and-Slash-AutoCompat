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

public class OresAboveDiamondsCompat {
	private static final List<String> TYPE = ImmutableList.of("black_opal", "amethyst");

	public String MODID = "oresabovediamonds:";

	public OresAboveDiamondsCompat() {

		MineAndSlashAPI.addCompatibleItem(MODID + TYPE + "_sword", new ConfigItem().setType(Sword.INSTANCE));
		MineAndSlashAPI.addCompatibleItem(MODID + TYPE + "_helmet", new ConfigItem().setType(PlateHelmet.INSTANCE));
		MineAndSlashAPI.addCompatibleItem(MODID + TYPE + "_chestplate", new ConfigItem().setType(PlateChest.INSTANCE));
		MineAndSlashAPI.addCompatibleItem(MODID + TYPE + "_leggings", new ConfigItem().setType(PlatePants.INSTANCE));
		MineAndSlashAPI.addCompatibleItem(MODID + TYPE + "_boots", new ConfigItem().setType(PlateBoots.INSTANCE));
		AzureCompat.LOGGER.info("Registered Ores Above Diamonds Gear");
	}

}