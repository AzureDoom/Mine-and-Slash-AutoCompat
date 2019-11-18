package com.azure.azurecompat.util;

import com.azure.azurecompat.AzureCompat;
import com.robertx22.mine_and_slash.api.MineAndSlashAPI;
import com.robertx22.mine_and_slash.config.compatible_items.ConfigItem;
import com.robertx22.mine_and_slash.database.gearitemslots.plate.PlateBoots;
import com.robertx22.mine_and_slash.database.gearitemslots.plate.PlateChest;
import com.robertx22.mine_and_slash.database.gearitemslots.plate.PlateHelmet;
import com.robertx22.mine_and_slash.database.gearitemslots.plate.PlatePants;
import com.robertx22.mine_and_slash.database.gearitemslots.weapons.Axe;
import com.robertx22.mine_and_slash.database.gearitemslots.weapons.Bow;
import com.robertx22.mine_and_slash.database.gearitemslots.weapons.Sword;

public class AquacultureCompat {

	public String MODID = "aquaculture:neptunium_";

	public AquacultureCompat() {

		MineAndSlashAPI.addCompatibleItem(MODID + "sword", new ConfigItem().setType(Sword.INSTANCE).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "bow", new ConfigItem().setType(Bow.INSTANCE).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "axe", new ConfigItem().setType(Axe.INSTANCE).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "helmet", new ConfigItem().setType(PlateHelmet.INSTANCE).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "chestplate", new ConfigItem().setType(PlateChest.INSTANCE).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "leggings", new ConfigItem().setType(PlatePants.INSTANCE).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "boots", new ConfigItem().setType(PlateBoots.INSTANCE).setdropsAsLoot(false));
		AzureCompat.LOGGER.info("Registered Aquaculture Gear");
	}

}