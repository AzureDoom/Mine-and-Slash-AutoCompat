package com.azure.azurecompat.util;

import java.util.List;

import com.google.common.collect.ImmutableList;
import com.robertx22.mine_and_slash.api.MineAndSlashAPI;
import com.robertx22.mine_and_slash.config.compatible_items.ConfigItem;
import com.robertx22.mine_and_slash.database.gearitemslots.plate.PlateBoots;
import com.robertx22.mine_and_slash.database.gearitemslots.plate.PlateChest;
import com.robertx22.mine_and_slash.database.gearitemslots.plate.PlateHelmet;
import com.robertx22.mine_and_slash.database.gearitemslots.plate.PlatePants;
import com.robertx22.mine_and_slash.database.gearitemslots.weapons.Sword;

public class PomarfDimOresCompat {
	public static final List<String> TYPE = ImmutableList.of("hypabyssal", "exocite", "ascendant", "gildediron",
			"gildeddiamond", "gildedhyp", "gildedasc", "gildedexo");

	public String MODID = "dimensionalores:";

	public PomarfDimOresCompat() {
		MineAndSlashAPI.addCompatibleItem(MODID + "dimensionalores:hypsword",
				new ConfigItem().setType(Sword.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "dimensionalores:exosword",
				new ConfigItem().setType(Sword.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "dimensionalores:ascsword",
				new ConfigItem().setType(Sword.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
		for (String t : TYPE) {
			MineAndSlashAPI.addCompatibleItem("dimensionalores:" + t + "armorhelmet",
					new ConfigItem().setType(PlateHelmet.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
			MineAndSlashAPI.addCompatibleItem("dimensionalores:" + t + "armorbody",
					new ConfigItem().setType(PlateChest.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
			MineAndSlashAPI.addCompatibleItem("dimensionalores:" + t + "armorlegs",
					new ConfigItem().setType(PlatePants.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
			MineAndSlashAPI.addCompatibleItem("dimensionalores:" + t + "armorboots",
					new ConfigItem().setType(PlateBoots.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
		}
	}
}