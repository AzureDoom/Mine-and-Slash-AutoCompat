package com.azure.azurecompat.util;

import com.robertx22.mine_and_slash.api.MineAndSlashAPI;
import com.robertx22.mine_and_slash.config.compatible_items.ConfigItem;
import com.robertx22.mine_and_slash.database.gearitemslots.plate.PlateBoots;
import com.robertx22.mine_and_slash.database.gearitemslots.plate.PlateChest;
import com.robertx22.mine_and_slash.database.gearitemslots.plate.PlateHelmet;
import com.robertx22.mine_and_slash.database.gearitemslots.plate.PlatePants;
import com.robertx22.mine_and_slash.database.gearitemslots.weapons.Bow;
import com.robertx22.mine_and_slash.database.gearitemslots.weapons.Staff;
import com.robertx22.mine_and_slash.database.gearitemslots.weapons.Sword;

public class ExplorercraftCompat {
	
	public String MODID = "explorercraft:";

	public ExplorercraftCompat() {
		MineAndSlashAPI.addCompatibleItem(MODID + "jade_sword", new ConfigItem().setType(Sword.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "amethyst_sword", new ConfigItem().setType(Sword.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "ruby_sword", new ConfigItem().setType(Sword.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "wizard_staff", new ConfigItem().setType(Staff.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "jade_bow", new ConfigItem().setType(Bow.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "jade_helmet", new ConfigItem().setType(PlateHelmet.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "amethyst_helmet", new ConfigItem().setType(PlateHelmet.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "ruby_helmet", new ConfigItem().setType(PlateHelmet.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "jade_chestplate", new ConfigItem().setType(PlateChest.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "amethyst_chestplate", new ConfigItem().setType(PlateChest.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "ruby_chestplate", new ConfigItem().setType(PlateChest.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "jade_leggings", new ConfigItem().setType(PlatePants.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "amethyst_leggings", new ConfigItem().setType(PlatePants.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "ruby_leggings", new ConfigItem().setType(PlatePants.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "jade_boots", new ConfigItem().setType(PlateBoots.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "amethyst_boots", new ConfigItem().setType(PlateBoots.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "ruby_boots", new ConfigItem().setType(PlateBoots.INSTANCE).setSalvagable(true));
	}
	
}