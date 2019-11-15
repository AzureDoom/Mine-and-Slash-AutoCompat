package com.azure.azurecompat.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.robertx22.mine_and_slash.api.MineAndSlashAPI;
import com.robertx22.mine_and_slash.config.compatible_items.ConfigItem;
import com.robertx22.mine_and_slash.database.gearitemslots.weapons.Axe;
import com.robertx22.mine_and_slash.database.gearitemslots.weapons.Sword;

public class BluePowerCompat {
	
	private static final Logger LOGGER = LogManager.getLogger();

	public BluePowerCompat() {
		MineAndSlashAPI.addCompatibleItem("bluepower:amethyst_sword", new ConfigItem().setType(Sword.INSTANCE));
		MineAndSlashAPI.addCompatibleItem("bluepower:ruby_sword", new ConfigItem().setType(Sword.INSTANCE));
		MineAndSlashAPI.addCompatibleItem("bluepower:sapphire_sword", new ConfigItem().setType(Sword.INSTANCE));
		MineAndSlashAPI.addCompatibleItem("bluepower:tungsten_sword", new ConfigItem().setType(Sword.INSTANCE));
		MineAndSlashAPI.addCompatibleItem("bluepower:malachite_sword", new ConfigItem().setType(Sword.INSTANCE));
		MineAndSlashAPI.addCompatibleItem("bluepower:amethyst_sickle", new ConfigItem().setType(Axe.INSTANCE));
		MineAndSlashAPI.addCompatibleItem("bluepower:ruby_sickle", new ConfigItem().setType(Axe.INSTANCE));
		MineAndSlashAPI.addCompatibleItem("bluepower:sapphire_sickle", new ConfigItem().setType(Axe.INSTANCE));
		MineAndSlashAPI.addCompatibleItem("bluepower:tungsten_sickle", new ConfigItem().setType(Axe.INSTANCE));
		MineAndSlashAPI.addCompatibleItem("bluepower:malachite_sickle", new ConfigItem().setType(Axe.INSTANCE));
		MineAndSlashAPI.addCompatibleItem("bluepower:stone_sickle", new ConfigItem().setType(Axe.INSTANCE));
		MineAndSlashAPI.addCompatibleItem("bluepower:wood_sickle", new ConfigItem().setType(Axe.INSTANCE));
		MineAndSlashAPI.addCompatibleItem("bluepower:iron_sickle", new ConfigItem().setType(Axe.INSTANCE));
		MineAndSlashAPI.addCompatibleItem("bluepower:gold_sickle", new ConfigItem().setType(Axe.INSTANCE));
		MineAndSlashAPI.addCompatibleItem("bluepower:diamond_sickle", new ConfigItem().setType(Axe.INSTANCE));
		LOGGER.debug("Registered Blue Power Gear");
	}
		

}