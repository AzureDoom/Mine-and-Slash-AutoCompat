package com.azure.azurecompat.util;

import com.azure.azurecompat.AzureCompat;
import com.robertx22.mine_and_slash.api.MineAndSlashAPI;
import com.robertx22.mine_and_slash.config.compatible_items.ConfigItem;
import com.robertx22.mine_and_slash.database.gearitemslots.weapons.Axe;
import com.robertx22.mine_and_slash.database.gearitemslots.weapons.Sword;

public class BluePowerCompat {

	public String MODID = "bluepower:";

	public BluePowerCompat() {
		MineAndSlashAPI.addCompatibleItem(MODID + "amethyst_sword", new ConfigItem().setType(Sword.INSTANCE));
		MineAndSlashAPI.addCompatibleItem(MODID + "ruby_sword", new ConfigItem().setType(Sword.INSTANCE));
		MineAndSlashAPI.addCompatibleItem(MODID + "sapphire_sword", new ConfigItem().setType(Sword.INSTANCE));
		MineAndSlashAPI.addCompatibleItem(MODID + "tungsten_sword", new ConfigItem().setType(Sword.INSTANCE));
		MineAndSlashAPI.addCompatibleItem(MODID + "malachite_sword", new ConfigItem().setType(Sword.INSTANCE));
		MineAndSlashAPI.addCompatibleItem(MODID + "amethyst_sickle", new ConfigItem().setType(Axe.INSTANCE));
		MineAndSlashAPI.addCompatibleItem(MODID + "ruby_sickle", new ConfigItem().setType(Axe.INSTANCE));
		MineAndSlashAPI.addCompatibleItem(MODID + "sapphire_sickle", new ConfigItem().setType(Axe.INSTANCE));
		MineAndSlashAPI.addCompatibleItem(MODID + "tungsten_sickle", new ConfigItem().setType(Axe.INSTANCE));
		MineAndSlashAPI.addCompatibleItem(MODID + "malachite_sickle", new ConfigItem().setType(Axe.INSTANCE));
		MineAndSlashAPI.addCompatibleItem(MODID + "stone_sickle", new ConfigItem().setType(Axe.INSTANCE));
		MineAndSlashAPI.addCompatibleItem(MODID + "wood_sickle", new ConfigItem().setType(Axe.INSTANCE));
		MineAndSlashAPI.addCompatibleItem(MODID + "iron_sickle", new ConfigItem().setType(Axe.INSTANCE));
		MineAndSlashAPI.addCompatibleItem(MODID + "gold_sickle", new ConfigItem().setType(Axe.INSTANCE));
		MineAndSlashAPI.addCompatibleItem(MODID + "diamond_sickle", new ConfigItem().setType(Axe.INSTANCE));
		AzureCompat.LOGGER.info("Registered Blue Power Gear");
	}

}