package com.azure.azurecompat.util;

import com.robertx22.mine_and_slash.api.MineAndSlashAPI;
import com.robertx22.mine_and_slash.config.compatible_items.ConfigItem;
import com.robertx22.mine_and_slash.database.gearitemslots.plate.PlateBoots;
import com.robertx22.mine_and_slash.database.gearitemslots.plate.PlateChest;
import com.robertx22.mine_and_slash.database.gearitemslots.plate.PlateHelmet;
import com.robertx22.mine_and_slash.database.gearitemslots.plate.PlatePants;
import com.robertx22.mine_and_slash.database.gearitemslots.weapons.Sword;

public class GoodNightSleepCompat {

	public String MODID = "goodnightsleep:";

	public GoodNightSleepCompat() {

		MineAndSlashAPI.addCompatibleItem(MODID + "candy_sword",
				new ConfigItem().setType(Sword.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "positite_sword",
				new ConfigItem().setType(Sword.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "negatite_sword",
				new ConfigItem().setType(Sword.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "rainbow_sword",
				new ConfigItem().setType(Sword.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "zitrite_sword",
				new ConfigItem().setType(Sword.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "necrum_sword",
				new ConfigItem().setType(Sword.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "candy_helmet",
				new ConfigItem().setType(PlateHelmet.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "positite_helmet",
				new ConfigItem().setType(PlateHelmet.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "negatite_helmet",
				new ConfigItem().setType(PlateHelmet.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "zitrite_helmet",
				new ConfigItem().setType(PlateHelmet.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "rainbow_helmet",
				new ConfigItem().setType(PlateHelmet.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "candy_chestplate",
				new ConfigItem().setType(PlateChest.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "positite_chestplate",
				new ConfigItem().setType(PlateChest.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "negatite_chestplate",
				new ConfigItem().setType(PlateChest.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "rainbow_chestplate",
				new ConfigItem().setType(PlateChest.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "zitrite_chestplate",
				new ConfigItem().setType(PlateChest.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "candy_leggings",
				new ConfigItem().setType(PlatePants.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "positite_leggings",
				new ConfigItem().setType(PlatePants.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "negatite_leggings",
				new ConfigItem().setType(PlatePants.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "rainbow_leggings",
				new ConfigItem().setType(PlatePants.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "zitrite_leggings",
				new ConfigItem().setType(PlatePants.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "candy_boots",
				new ConfigItem().setType(PlateBoots.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "positite_boots",
				new ConfigItem().setType(PlateBoots.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "negatite_boots",
				new ConfigItem().setType(PlateBoots.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "rainbow_boots",
				new ConfigItem().setType(PlateBoots.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "zitrite_boots",
				new ConfigItem().setType(PlateBoots.INSTANCE).setSalvagable(true));
	}

}