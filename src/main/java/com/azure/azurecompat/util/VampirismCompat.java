package com.azure.azurecompat.util;

import java.util.List;

import com.google.common.collect.ImmutableList;
import com.robertx22.mine_and_slash.api.MineAndSlashAPI;
import com.robertx22.mine_and_slash.config.compatible_items.ConfigItem;
import com.robertx22.mine_and_slash.database.gearitemslots.cloth.ClothBoots;
import com.robertx22.mine_and_slash.database.gearitemslots.cloth.ClothChest;
import com.robertx22.mine_and_slash.database.gearitemslots.cloth.ClothHelmet;
import com.robertx22.mine_and_slash.database.gearitemslots.cloth.ClothPants;
import com.robertx22.mine_and_slash.database.gearitemslots.weapons.CrossBow;
import com.robertx22.mine_and_slash.database.gearitemslots.weapons.Sword;

public class VampirismCompat {

	private static final List<String> ARMOR = ImmutableList.of("hunter_coat_", "obsidian_armor_",
			"armor_of_swiftness_");

	private static final List<String> CROSSBOW = ImmutableList.of("basic", "basic_double", "enhanced",
			"enhanced_double", "basic_tech", "enhanced_tech");

	private static final List<String> WEAPONS = ImmutableList.of("heart_seeker_", "heart_striker_");

	public String MODID = "vampirism:";

	public VampirismCompat() {
		for (String s : ARMOR) {
			MineAndSlashAPI.addCompatibleItem(MODID + "hunter_hat_head_1",
					new ConfigItem().setType(ClothHelmet.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
			MineAndSlashAPI.addCompatibleItem(MODID + "hunter_hat_head_0",
					new ConfigItem().setType(ClothHelmet.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
			MineAndSlashAPI.addCompatibleItem(MODID + s + "head_normal",
					new ConfigItem().setType(ClothHelmet.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
			MineAndSlashAPI.addCompatibleItem(MODID + s + "head_enhanced",
					new ConfigItem().setType(ClothHelmet.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
			MineAndSlashAPI.addCompatibleItem(MODID + s + "head_ultimate",
					new ConfigItem().setType(ClothHelmet.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
			MineAndSlashAPI.addCompatibleItem(MODID + "vampire_cloak_black_red",
					new ConfigItem().setType(ClothChest.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
			MineAndSlashAPI.addCompatibleItem(MODID + "vampire_cloak_white_black",
					new ConfigItem().setType(ClothChest.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
			MineAndSlashAPI.addCompatibleItem(MODID + "vampire_cloak_black_white",
					new ConfigItem().setType(ClothChest.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
			MineAndSlashAPI.addCompatibleItem(MODID + "vampire_cloak_red_black",
					new ConfigItem().setType(ClothChest.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
			MineAndSlashAPI.addCompatibleItem(MODID + "vampire_cloak_black_blue",
					new ConfigItem().setType(ClothChest.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
			MineAndSlashAPI.addCompatibleItem(MODID + s + "chest_normal",
					new ConfigItem().setType(ClothChest.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
			MineAndSlashAPI.addCompatibleItem(MODID + s + "chest_enhanced",
					new ConfigItem().setType(ClothChest.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
			MineAndSlashAPI.addCompatibleItem(MODID + s + "chest_ultimate",
					new ConfigItem().setType(ClothChest.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
			MineAndSlashAPI.addCompatibleItem(MODID + s + "legs_normal",
					new ConfigItem().setType(ClothPants.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
			MineAndSlashAPI.addCompatibleItem(MODID + s + "legs_enhanced",
					new ConfigItem().setType(ClothPants.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
			MineAndSlashAPI.addCompatibleItem(MODID + s + "legs_ultimate",
					new ConfigItem().setType(ClothPants.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
			MineAndSlashAPI.addCompatibleItem(MODID + s + "feet_normal",
					new ConfigItem().setType(ClothBoots.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
			MineAndSlashAPI.addCompatibleItem(MODID + s + "feet_enhanced",
					new ConfigItem().setType(ClothBoots.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
			MineAndSlashAPI.addCompatibleItem(MODID + s + "feet_ultimate",
					new ConfigItem().setType(ClothBoots.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
		}
		for (String c : CROSSBOW) {
			MineAndSlashAPI.addCompatibleItem(MODID + c + "_crossbow",
					new ConfigItem().setType(CrossBow.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
		}
		for (String w : WEAPONS) {
			MineAndSlashAPI.addCompatibleItem(MODID + w + "_normal",
					new ConfigItem().setType(Sword.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
			MineAndSlashAPI.addCompatibleItem(MODID + w + "_enhanced",
					new ConfigItem().setType(Sword.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
			MineAndSlashAPI.addCompatibleItem(MODID + w + "_ultimate",
					new ConfigItem().setType(Sword.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
			MineAndSlashAPI.addCompatibleItem(MODID + "stake",
					new ConfigItem().setType(Sword.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
		}
	}
}