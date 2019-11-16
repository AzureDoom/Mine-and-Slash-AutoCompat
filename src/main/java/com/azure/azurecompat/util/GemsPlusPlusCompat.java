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

public class GemsPlusPlusCompat {

	private static final List<String> TYPE = ImmutableList.of("citrine", "chrysocolla", "garnet",
			"jade", "jaspser", "agate", "amethyst", "malachite", "onyx", "phoenixite", "tourmaline", "spinel",
			"sugilite", "ruby", "sapphire", "topaz");

	public String MODID = "gemsplusplus:";

	public GemsPlusPlusCompat() {

		MineAndSlashAPI.addCompatibleItem(MODID + "sword" + TYPE, new ConfigItem().setType(Sword.INSTANCE));
		MineAndSlashAPI.addCompatibleItem(MODID + "helmet" + TYPE, new ConfigItem().setType(PlateHelmet.INSTANCE));
		MineAndSlashAPI.addCompatibleItem(MODID + "chestplate" + TYPE, new ConfigItem().setType(PlateChest.INSTANCE));
		MineAndSlashAPI.addCompatibleItem(MODID + "leggings" + TYPE, new ConfigItem().setType(PlatePants.INSTANCE));
		MineAndSlashAPI.addCompatibleItem(MODID + "boots" + TYPE, new ConfigItem().setType(PlateBoots.INSTANCE));
		AzureCompat.LOGGER.info("Registered Gems Plus Plus Gear");
	}

}