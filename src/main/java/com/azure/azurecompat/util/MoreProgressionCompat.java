package com.azure.azurecompat.util;

import com.robertx22.mine_and_slash.api.MineAndSlashAPI;
import com.robertx22.mine_and_slash.config.compatible_items.ConfigItem;
import com.robertx22.mine_and_slash.database.gearitemslots.plate.PlateBoots;
import com.robertx22.mine_and_slash.database.gearitemslots.plate.PlateChest;
import com.robertx22.mine_and_slash.database.gearitemslots.plate.PlateHelmet;
import com.robertx22.mine_and_slash.database.gearitemslots.plate.PlatePants;
import com.robertx22.mine_and_slash.database.gearitemslots.weapons.Sword;

public class MoreProgressionCompat {

	public String MODID = "moreprogression:";

	public MoreProgressionCompat() {
		MineAndSlashAPI.addCompatibleItem(MODID + "star_sword",
				new ConfigItem().setType(Sword.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "bone_sword",
				new ConfigItem().setType(Sword.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "enderanium_sword",
				new ConfigItem().setType(Sword.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "ianite_sword",
				new ConfigItem().setType(Sword.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "tritanium_sword",
				new ConfigItem().setType(Sword.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "bone_helmet",
				new ConfigItem().setType(PlateHelmet.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "enderanium_helmet",
				new ConfigItem().setType(PlateHelmet.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "ianite_helmet",
				new ConfigItem().setType(PlateHelmet.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "tritanium_helmet",
				new ConfigItem().setType(PlateHelmet.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "bone_chestplate",
				new ConfigItem().setType(PlateChest.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "enderanium_chestplate",
				new ConfigItem().setType(PlateChest.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "ianite_chestplate",
				new ConfigItem().setType(PlateChest.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "tritanium_chestplate",
				new ConfigItem().setType(PlateChest.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "bone_leggings",
				new ConfigItem().setType(PlatePants.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "enderanium_leggings",
				new ConfigItem().setType(PlatePants.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "ianite_leggings",
				new ConfigItem().setType(PlatePants.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "tritanium_leggings",
				new ConfigItem().setType(PlatePants.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "bone_boots",
				new ConfigItem().setType(PlateBoots.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "enderanium_boots",
				new ConfigItem().setType(PlateBoots.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "ianite_boots",
				new ConfigItem().setType(PlateBoots.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "tritanium_boots",
				new ConfigItem().setType(PlateBoots.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "dragon_helmet",
				new ConfigItem().setType(PlateHelmet.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "dragon_chestplate",
				new ConfigItem().setType(PlateChest.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "dragon_leggings",
				new ConfigItem().setType(PlatePants.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "dragon_boots",
				new ConfigItem().setType(PlateBoots.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
	}
}