package com.azure.azurecompat.util;

import com.robertx22.mine_and_slash.api.MineAndSlashAPI;
import com.robertx22.mine_and_slash.config.compatible_items.ConfigItem;
import com.robertx22.mine_and_slash.database.gearitemslots.plate.PlateBoots;
import com.robertx22.mine_and_slash.database.gearitemslots.plate.PlateChest;
import com.robertx22.mine_and_slash.database.gearitemslots.plate.PlateHelmet;
import com.robertx22.mine_and_slash.database.gearitemslots.plate.PlatePants;
import com.robertx22.mine_and_slash.database.gearitemslots.weapons.Sword;
import com.robertx22.mine_and_slash.database.gearitemslots.weapons.Wand;

public class FarlandersCompat {

	public String MODID = "farlanders:";

	public FarlandersCompat() {
		MineAndSlashAPI.addCompatibleItem(MODID + "mystic_wand_fire_small",
				new ConfigItem().setType(Wand.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "mystic_wand_fire_large",
				new ConfigItem().setType(Wand.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "mystic_wand_ore",
				new ConfigItem().setType(Wand.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "mystic_wand_teleport",
				new ConfigItem().setType(Wand.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "mystic_wand_regen",
				new ConfigItem().setType(Wand.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "mystic_wand_invisible",
				new ConfigItem().setType(Wand.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "nightfall_sword",
				new ConfigItem().setType(Sword.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "nightfall_helmet",
				new ConfigItem().setType(PlateHelmet.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "nightfall_chestplate",
				new ConfigItem().setType(PlateChest.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "nightfall_leggings",
				new ConfigItem().setType(PlatePants.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "nightfall_boots",
				new ConfigItem().setType(PlateBoots.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
	}
}