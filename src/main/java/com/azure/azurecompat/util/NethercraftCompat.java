package com.azure.azurecompat.util;

import com.azure.azurecompat.AzureCompat;
import com.robertx22.mine_and_slash.api.MineAndSlashAPI;
import com.robertx22.mine_and_slash.config.compatible_items.ConfigItem;
import com.robertx22.mine_and_slash.database.gearitemslots.plate.PlateBoots;
import com.robertx22.mine_and_slash.database.gearitemslots.plate.PlateChest;
import com.robertx22.mine_and_slash.database.gearitemslots.plate.PlateHelmet;
import com.robertx22.mine_and_slash.database.gearitemslots.plate.PlatePants;
import com.robertx22.mine_and_slash.database.gearitemslots.weapons.Bow;
import com.robertx22.mine_and_slash.database.gearitemslots.weapons.Sword;

public class NethercraftCompat {

	public NethercraftCompat() {
		MineAndSlashAPI.addCompatibleItem("nethercraft:imp_helmet", new ConfigItem().setType(PlateHelmet.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem("nethercraft:imp_chestplate", new ConfigItem().setType(PlateChest.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem("nethercraft:imp_leggings", new ConfigItem().setType(PlatePants.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem("nethercraft:imp_boots", new ConfigItem().setType(PlateBoots.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem("nethercraft:w_obsidian_helmet",
				new ConfigItem().setType(PlateHelmet.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem("nethercraft:w_obsidian_chestplate",
				new ConfigItem().setType(PlateChest.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem("nethercraft:w_obsidian_leggings",
				new ConfigItem().setType(PlatePants.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem("nethercraft:w_obsidian_boots",
				new ConfigItem().setType(PlateBoots.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem("nethercraft:neridium_sword", new ConfigItem().setType(Sword.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem("nethercraft:neridium_bow", new ConfigItem().setType(Bow.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem("nethercraft:neridium_helmet",
				new ConfigItem().setType(PlateHelmet.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem("nethercraft:neridium_chestplate",
				new ConfigItem().setType(PlateChest.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem("nethercraft:neridium_leggings",
				new ConfigItem().setType(PlatePants.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem("nethercraft:neridium_boots", new ConfigItem().setType(PlateBoots.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem("nethercraft:netherrack_sword", new ConfigItem().setType(Sword.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem("nethercraft:netherrack_bow", new ConfigItem().setType(Bow.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem("nethercraft:linium_sword", new ConfigItem().setType(Sword.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem("nethercraft:linium_bow", new ConfigItem().setType(Bow.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem("nethercraft:pyridium_sword", new ConfigItem().setType(Sword.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem("nethercraft:pyridium_bow", new ConfigItem().setType(Bow.INSTANCE).setSalvagable(true));
		AzureCompat.LOGGER.info("Registered Nethercraft Gear");
	}

}