package com.azure.azurecompat.util;

import java.util.List;

import com.azure.azurecompat.AzureCompat;
import com.google.common.collect.ImmutableList;
import com.robertx22.mine_and_slash.api.MineAndSlashAPI;
import com.robertx22.mine_and_slash.config.compatible_items.ConfigItem;
import com.robertx22.mine_and_slash.database.gearitemslots.curios.Ring;
import com.robertx22.mine_and_slash.database.gearitemslots.plate.PlateBoots;
import com.robertx22.mine_and_slash.database.gearitemslots.plate.PlateChest;
import com.robertx22.mine_and_slash.database.gearitemslots.plate.PlateHelmet;
import com.robertx22.mine_and_slash.database.gearitemslots.plate.PlatePants;
import com.robertx22.mine_and_slash.database.gearitemslots.weapons.Bow;
import com.robertx22.mine_and_slash.database.gearitemslots.weapons.Sword;

public class GobberCompat {

	private static final List<String> TYPE = ImmutableList.of("nether", "end");

	private static final List<String> TYPE2 = ImmutableList.of("nether", "end", "attraction", "miner", "lumberjack",
			"farmer", "husbandry", "swiftness", "sunshine", "ascent", "acceleration", "leaping", "curing", "vision",
			"phoenix", "haste", "blaze", "repair", "dismissal", "enderchest", "traveler", "void", "airwalking",
			"stealth", "teleport", "blink");

	public String MODID = "gobber2:";

	public GobberCompat() {

		MineAndSlashAPI.addCompatibleItem(MODID + "gobber2_sword", new ConfigItem().setType(Sword.INSTANCE));
		MineAndSlashAPI.addCompatibleItem(MODID + "gobber2_sword_traveler", new ConfigItem().setType(Sword.INSTANCE));
		MineAndSlashAPI.addCompatibleItem(MODID + "gobber2_sword_" + TYPE, new ConfigItem().setType(Sword.INSTANCE));
		MineAndSlashAPI.addCompatibleItem(MODID + "gobber2_sword_sniper", new ConfigItem().setType(Bow.INSTANCE));
		MineAndSlashAPI.addCompatibleItem(MODID + "gobber2_helmet", new ConfigItem().setType(PlateHelmet.INSTANCE));
		MineAndSlashAPI.addCompatibleItem(MODID + "gobber2_helmet_" + TYPE,
				new ConfigItem().setType(PlateHelmet.INSTANCE));
		MineAndSlashAPI.addCompatibleItem(MODID + "gobber2_chestplate", new ConfigItem().setType(PlateChest.INSTANCE));
		MineAndSlashAPI.addCompatibleItem(MODID + "gobber2_chestplate_" + TYPE,
				new ConfigItem().setType(PlateChest.INSTANCE));
		MineAndSlashAPI.addCompatibleItem(MODID + "gobber2_leggings", new ConfigItem().setType(PlatePants.INSTANCE));
		MineAndSlashAPI.addCompatibleItem(MODID + "gobber2_leggings_" + TYPE,
				new ConfigItem().setType(PlatePants.INSTANCE));
		MineAndSlashAPI.addCompatibleItem(MODID + "gobber2_boots", new ConfigItem().setType(PlateBoots.INSTANCE));
		MineAndSlashAPI.addCompatibleItem(MODID + "gobber2_boots_" + TYPE,
				new ConfigItem().setType(PlateBoots.INSTANCE));
		MineAndSlashAPI.addCompatibleItem(MODID + "gobber_ring" + TYPE, new ConfigItem().setType(Ring.INSTANCE));
		MineAndSlashAPI.addCompatibleItem(MODID + "gobber_ring_" + TYPE2, new ConfigItem().setType(Ring.INSTANCE));
		AzureCompat.LOGGER.info("Registered Gobber Gear");
	}

}