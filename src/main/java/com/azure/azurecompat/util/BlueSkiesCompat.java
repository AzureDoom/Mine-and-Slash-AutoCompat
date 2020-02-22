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

public class BlueSkiesCompat {

	public static final List<String> TYPE = ImmutableList.of("pyrope", "turquoise", "diopside", "charoite",
			"horizonite", "shadow");

	public static final List<String> SWORD = ImmutableList.of("infused_arc", "different", "bluebright", "lunar",
			"starlit", "dusk", "frostbright", "maple", "cherry", "turquoise_stone", "lunar_stone", "pyrope",
			"turquoise", "diopside", "charoite", "horizonite");

	public String MODID = "blue_skies:";

	public BlueSkiesCompat() {
		for (String s : SWORD) {
			MineAndSlashAPI.addCompatibleItem("blue_skies:" + s + "_sword",
					new ConfigItem().setType(Sword.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
		}
		for (String t : TYPE) {
			MineAndSlashAPI.addCompatibleItem("blue_skies:" + t + "_helmet",
					new ConfigItem().setType(PlateHelmet.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
			MineAndSlashAPI.addCompatibleItem("blue_skies:" + t + "_body",
					new ConfigItem().setType(PlateChest.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
			MineAndSlashAPI.addCompatibleItem("blue_skies:" + t + "_legs",
					new ConfigItem().setType(PlatePants.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
			MineAndSlashAPI.addCompatibleItem("blue_skies:" + t + "_boots",
					new ConfigItem().setType(PlateBoots.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
		}
	}
}