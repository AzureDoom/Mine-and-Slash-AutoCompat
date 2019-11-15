package com.azure.azurecompat.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.robertx22.mine_and_slash.api.MineAndSlashAPI;
import com.robertx22.mine_and_slash.config.compatible_items.ConfigItem;
import com.robertx22.mine_and_slash.database.gearitemslots.plate.PlateBoots;
import com.robertx22.mine_and_slash.database.gearitemslots.plate.PlateChest;
import com.robertx22.mine_and_slash.database.gearitemslots.plate.PlateHelmet;
import com.robertx22.mine_and_slash.database.gearitemslots.plate.PlatePants;
import com.robertx22.mine_and_slash.database.gearitemslots.weapons.Sword;

public class WyrmroostCompat {
	
	private static final Logger LOGGER = LogManager.getLogger();

	public WyrmroostCompat() {
		MineAndSlashAPI.addCompatibleItem("wyrmroost:geode_sword", new ConfigItem().setType(Sword.INSTANCE));
		MineAndSlashAPI.addCompatibleItem("wyrmroost:geode_helmet", new ConfigItem().setType(PlateHelmet.INSTANCE));
		MineAndSlashAPI.addCompatibleItem("wyrmroost:geode_chestplate", new ConfigItem().setType(PlateChest.INSTANCE));
		MineAndSlashAPI.addCompatibleItem("wyrmroost:geode_leggings", new ConfigItem().setType(PlatePants.INSTANCE));
		MineAndSlashAPI.addCompatibleItem("wyrmroost:geode_boots", new ConfigItem().setType(PlateBoots.INSTANCE));
		LOGGER.debug("Registered Geode Gear");
		MineAndSlashAPI.addCompatibleItem("wyrmroost:platinum_sword", new ConfigItem().setType(Sword.INSTANCE));
		MineAndSlashAPI.addCompatibleItem("wyrmroost:platinum_helmet", new ConfigItem().setType(PlateHelmet.INSTANCE));
		MineAndSlashAPI.addCompatibleItem("wyrmroost:platinum_chestplate", new ConfigItem().setType(PlateChest.INSTANCE));
		MineAndSlashAPI.addCompatibleItem("wyrmroost:platinum_leggings", new ConfigItem().setType(PlatePants.INSTANCE));
		MineAndSlashAPI.addCompatibleItem("wyrmroost:platinum_boots", new ConfigItem().setType(PlateBoots.INSTANCE));
		LOGGER.debug("Registered Platinum Gear");
	}

}
