package com.azure.azurecompat.util;

import java.util.List;

import com.azure.azurecompat.AzureCompat;
import com.google.common.collect.ImmutableList;
import com.robertx22.mine_and_slash.api.MineAndSlashAPI;
import com.robertx22.mine_and_slash.config.compatible_items.ConfigItem;
import com.robertx22.mine_and_slash.database.gearitemslots.cloth.ClothHelmet;
import com.robertx22.mine_and_slash.database.gearitemslots.offhand.Shield;
import com.robertx22.mine_and_slash.database.gearitemslots.plate.PlateBoots;
import com.robertx22.mine_and_slash.database.gearitemslots.plate.PlateChest;
import com.robertx22.mine_and_slash.database.gearitemslots.plate.PlateHelmet;
import com.robertx22.mine_and_slash.database.gearitemslots.plate.PlatePants;
import com.robertx22.mine_and_slash.database.gearitemslots.weapons.Axe;
import com.robertx22.mine_and_slash.database.gearitemslots.weapons.Bow;
import com.robertx22.mine_and_slash.database.gearitemslots.weapons.Hammer;
import com.robertx22.mine_and_slash.database.gearitemslots.weapons.Staff;
import com.robertx22.mine_and_slash.database.gearitemslots.weapons.Sword;
import com.robertx22.mine_and_slash.database.gearitemslots.weapons.Wand;

public class CombatCompat {
	private static final List<String> TYPE = ImmutableList.of("steel", "lozyne", "copper", "pasquem", "pelgan");

	private static final List<String> TYPE2 = ImmutableList.of("steel", "lozyne", "copper", "pasquem", "pelgan",
			"stone", "golden", "iron", "wooden", "diamond");

	private static final List<String> TYPE_GUN = ImmutableList.of("sig_sauer_p320", "glock_17", "beretta_92");

	private static final List<String> TYPE_MAGIC = ImmutableList.of("basic", "novice", "apprentice", "advanced",
			"master", "god");

	public String MODID = "combat:";

	public CombatCompat() {

		MineAndSlashAPI.addCompatibleItem(MODID + TYPE + "_sword", new ConfigItem().setType(Sword.INSTANCE));
		MineAndSlashAPI.addCompatibleItem(MODID + TYPE2 + "_dagger", new ConfigItem().setType(Sword.INSTANCE));
		MineAndSlashAPI.addCompatibleItem(MODID + "katana", new ConfigItem().setType(Sword.INSTANCE));
		MineAndSlashAPI.addCompatibleItem(MODID + "shield", new ConfigItem().setType(Shield.INSTANCE));
		MineAndSlashAPI.addCompatibleItem(MODID + "wooden_hammer", new ConfigItem().setType(Hammer.INSTANCE));
		MineAndSlashAPI.addCompatibleItem(MODID + "iron_hammer", new ConfigItem().setType(Hammer.INSTANCE));
		MineAndSlashAPI.addCompatibleItem(MODID + "spear", new ConfigItem().setType(Axe.INSTANCE));
		MineAndSlashAPI.addCompatibleItem(MODID + TYPE_GUN, new ConfigItem().setType(Bow.INSTANCE));
		MineAndSlashAPI.addCompatibleItem(MODID + TYPE_MAGIC + "_wand", new ConfigItem().setType(Wand.INSTANCE));
		MineAndSlashAPI.addCompatibleItem(MODID + "basic_staff", new ConfigItem().setType(Staff.INSTANCE));
		MineAndSlashAPI.addCompatibleItem(MODID + TYPE + "_helmet", new ConfigItem().setType(PlateHelmet.INSTANCE));
		MineAndSlashAPI.addCompatibleItem(MODID + "wool_hat", new ConfigItem().setType(ClothHelmet.INSTANCE));
		MineAndSlashAPI.addCompatibleItem(MODID + TYPE + "_chestplate", new ConfigItem().setType(PlateChest.INSTANCE));
		MineAndSlashAPI.addCompatibleItem(MODID + TYPE + "_leggings", new ConfigItem().setType(PlatePants.INSTANCE));
		MineAndSlashAPI.addCompatibleItem(MODID + TYPE + "_boots", new ConfigItem().setType(PlateBoots.INSTANCE));
		AzureCompat.LOGGER.info("Registered Combat Gear");
	}

}