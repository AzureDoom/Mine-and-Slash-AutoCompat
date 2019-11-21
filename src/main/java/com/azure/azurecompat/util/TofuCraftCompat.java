package com.azure.azurecompat.util;

import com.azure.azurecompat.AzureCompat;
import com.robertx22.mine_and_slash.api.MineAndSlashAPI;
import com.robertx22.mine_and_slash.config.compatible_items.ConfigItem;
import com.robertx22.mine_and_slash.database.gearitemslots.plate.PlateBoots;
import com.robertx22.mine_and_slash.database.gearitemslots.plate.PlateChest;
import com.robertx22.mine_and_slash.database.gearitemslots.plate.PlateHelmet;
import com.robertx22.mine_and_slash.database.gearitemslots.plate.PlatePants;
import com.robertx22.mine_and_slash.database.gearitemslots.weapons.Sword;
import com.robertx22.mine_and_slash.database.gearitemslots.weapons.Wand;

public class TofuCraftCompat {

	public String MODID = "tofucraft:";

	public TofuCraftCompat() {

		MineAndSlashAPI.addCompatibleItem(MODID + "swordkinu", new ConfigItem().setType(Sword.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "swordmomen", new ConfigItem().setType(Sword.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "swordsolid", new ConfigItem().setType(Sword.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "swordmetal", new ConfigItem().setType(Sword.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "sworddiamond", new ConfigItem().setType(Sword.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "tofustick", new ConfigItem().setType(Wand.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "armorkinuhelmet", new ConfigItem().setType(PlateHelmet.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "armormomenhelmet", new ConfigItem().setType(PlateHelmet.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "armorsolidhelmet", new ConfigItem().setType(PlateHelmet.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "armormetalhelmet", new ConfigItem().setType(PlateHelmet.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "armordiamondhelmet", new ConfigItem().setType(PlateHelmet.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "armorkinuchestplate", new ConfigItem().setType(PlateChest.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "armormomenchestplate", new ConfigItem().setType(PlateChest.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "armorsolidchestplate", new ConfigItem().setType(PlateChest.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "armormetalchestplate", new ConfigItem().setType(PlateChest.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "armordiamondchestplate", new ConfigItem().setType(PlateChest.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "armorkinuleggins", new ConfigItem().setType(PlatePants.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "armormomenleggins", new ConfigItem().setType(PlatePants.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "armorsolidleggins", new ConfigItem().setType(PlatePants.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "armormetalleggins", new ConfigItem().setType(PlatePants.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "armordiamondleggins", new ConfigItem().setType(PlatePants.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "armorkinuboots", new ConfigItem().setType(PlateBoots.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "armormomenboots", new ConfigItem().setType(PlateBoots.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "armorsolidboots", new ConfigItem().setType(PlateBoots.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "armormetalboots", new ConfigItem().setType(PlateBoots.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "armordiamondboots", new ConfigItem().setType(PlateBoots.INSTANCE).setSalvagable(true));
		AzureCompat.LOGGER.info("Registered TofuCraft Gear");
	}

}