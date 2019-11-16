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

public class PlantTech2Compat {

	public PlantTech2Compat() {
		MineAndSlashAPI.addCompatibleItem("planttech2:cyberrapier", new ConfigItem().setType(Sword.INSTANCE));
		MineAndSlashAPI.addCompatibleItem("planttech2:cyberdagger", new ConfigItem().setType(Sword.INSTANCE));
		MineAndSlashAPI.addCompatibleItem("planttech2:cyberkatana", new ConfigItem().setType(Sword.INSTANCE));
		MineAndSlashAPI.addCompatibleItem("planttech2:cyberbow", new ConfigItem().setType(Bow.INSTANCE));
		MineAndSlashAPI.addCompatibleItem("planttech2:cyberarmor_helmet",
				new ConfigItem().setType(PlateHelmet.INSTANCE));
		MineAndSlashAPI.addCompatibleItem("planttech2:cyberarmor_chest", new ConfigItem().setType(PlateChest.INSTANCE));
		MineAndSlashAPI.addCompatibleItem("planttech2:cyberarmor_leggings",
				new ConfigItem().setType(PlatePants.INSTANCE));
		MineAndSlashAPI.addCompatibleItem("planttech2:cyberarmor_boots", new ConfigItem().setType(PlateBoots.INSTANCE));
		AzureCompat.LOGGER.info("Registered PlantTech2 Gear");
	}
}