package com.azure.azurecompat.util;

import com.azure.azurecompat.AzureCompat;
import com.robertx22.mine_and_slash.api.MineAndSlashAPI;
import com.robertx22.mine_and_slash.config.compatible_items.ConfigItem;
import com.robertx22.mine_and_slash.database.gearitemslots.plate.PlateBoots;
import com.robertx22.mine_and_slash.database.gearitemslots.plate.PlateChest;
import com.robertx22.mine_and_slash.database.gearitemslots.plate.PlateHelmet;
import com.robertx22.mine_and_slash.database.gearitemslots.plate.PlatePants;
import com.robertx22.mine_and_slash.database.gearitemslots.weapons.Sword;

public class WyrmroostCompat {

	public String MODID = "gemsplusplus:";
	
	public WyrmroostCompat() {
		MineAndSlashAPI.addCompatibleItem(MODID + "geode_sword", new ConfigItem().setType(Sword.INSTANCE));
		MineAndSlashAPI.addCompatibleItem(MODID + "geode_helmet", new ConfigItem().setType(PlateHelmet.INSTANCE));
		MineAndSlashAPI.addCompatibleItem(MODID + "geode_chestplate", new ConfigItem().setType(PlateChest.INSTANCE));
		MineAndSlashAPI.addCompatibleItem(MODID + "geode_leggings", new ConfigItem().setType(PlatePants.INSTANCE));
		MineAndSlashAPI.addCompatibleItem(MODID + "geode_boots", new ConfigItem().setType(PlateBoots.INSTANCE));
		AzureCompat.LOGGER.info("Registered Geode Gear");
		MineAndSlashAPI.addCompatibleItem(MODID + "platinum_sword", new ConfigItem().setType(Sword.INSTANCE));
		MineAndSlashAPI.addCompatibleItem(MODID + "platinum_helmet", new ConfigItem().setType(PlateHelmet.INSTANCE));
		MineAndSlashAPI.addCompatibleItem(MODID + "platinum_chestplate",
				new ConfigItem().setType(PlateChest.INSTANCE));
		MineAndSlashAPI.addCompatibleItem(MODID + "platinum_leggings", new ConfigItem().setType(PlatePants.INSTANCE));
		MineAndSlashAPI.addCompatibleItem(MODID + "platinum_boots", new ConfigItem().setType(PlateBoots.INSTANCE));
		AzureCompat.LOGGER.info("Registered Platinum Gear");
	}

}
