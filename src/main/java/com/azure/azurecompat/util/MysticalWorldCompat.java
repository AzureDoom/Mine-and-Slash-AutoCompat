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

public class MysticalWorldCompat {
	private static final List<String> TYPE = ImmutableList.of("amethyst", "lead", "copper", "quicksilver", "silver",
			"tin");

	private static final List<String> TYPE2 = ImmutableList.of("stone", "gold", "iron", "wood", "diamond");

	public String MODID = "mysticalworld:";

	public MysticalWorldCompat() {

		MineAndSlashAPI.addCompatibleItem(MODID + TYPE + "_sword", new ConfigItem().setType(Sword.INSTANCE).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "cactus_sword", new ConfigItem().setType(Sword.INSTANCE).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + TYPE + "_knife", new ConfigItem().setType(Sword.INSTANCE).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + TYPE2 + "_knife", new ConfigItem().setType(Sword.INSTANCE).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "cactus_knife", new ConfigItem().setType(Sword.INSTANCE).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + TYPE + "_helmet", new ConfigItem().setType(PlateHelmet.INSTANCE).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + TYPE + "_chestplate", new ConfigItem().setType(PlateChest.INSTANCE).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + TYPE + "_leggings", new ConfigItem().setType(PlatePants.INSTANCE).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + TYPE + "_boots", new ConfigItem().setType(PlateBoots.INSTANCE).setdropsAsLoot(false));
		AzureCompat.LOGGER.info("Registered Combat Gear");
	}

}