package com.azure.azurecompat.util;

import com.robertx22.mine_and_slash.api.MineAndSlashAPI;
import com.robertx22.mine_and_slash.config.compatible_items.ConfigItem;
import com.robertx22.mine_and_slash.database.gearitemslots.curios.Bracelet;
import com.robertx22.mine_and_slash.database.gearitemslots.curios.Necklace;
import com.robertx22.mine_and_slash.database.gearitemslots.curios.Ring;
import com.robertx22.mine_and_slash.database.gearitemslots.plate.PlateBoots;
import com.robertx22.mine_and_slash.database.gearitemslots.plate.PlateChest;
import com.robertx22.mine_and_slash.database.gearitemslots.plate.PlateHelmet;
import com.robertx22.mine_and_slash.database.gearitemslots.plate.PlatePants;
import com.robertx22.mine_and_slash.database.gearitemslots.weapons.Hammer;
import com.robertx22.mine_and_slash.database.gearitemslots.weapons.Sword;

public class ProjectECompat {

	public String MODID = "projecte:";

	public ProjectECompat() {
		MineAndSlashAPI.addCompatibleItem(MODID + "dm_hammer",
				new ConfigItem().setType(Hammer.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "rm_hammer",
				new ConfigItem().setType(Hammer.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "rm_morning_star",
				new ConfigItem().setType(Hammer.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "dm_sword",
				new ConfigItem().setType(Sword.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "rm_sword",
				new ConfigItem().setType(Sword.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "rm_katar",
				new ConfigItem().setType(Sword.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "dm_helmet",
				new ConfigItem().setType(PlateHelmet.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "dm_chestplate",
				new ConfigItem().setType(PlateChest.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "dm_leggings",
				new ConfigItem().setType(PlatePants.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "dm_boots",
				new ConfigItem().setType(PlateBoots.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "rm_helmet",
				new ConfigItem().setType(PlateHelmet.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "rm_chestplate",
				new ConfigItem().setType(PlateChest.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "rm_leggings",
				new ConfigItem().setType(PlatePants.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "rm_boots",
				new ConfigItem().setType(PlateBoots.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "gem_helmet",
				new ConfigItem().setType(PlateHelmet.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "gem_chestplate",
				new ConfigItem().setType(PlateChest.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "gem_leggings",
				new ConfigItem().setType(PlatePants.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "gem_boots",
				new ConfigItem().setType(PlateBoots.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "black_hole_band",
				new ConfigItem().setType(Ring.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "ignition_ring",
				new ConfigItem().setType(Ring.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "zero_ring",
				new ConfigItem().setType(Ring.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "swiftwolf_rending_gale",
				new ConfigItem().setType(Ring.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "gem_of_eternal_density",
				new ConfigItem().setType(Ring.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "void_ring",
				new ConfigItem().setType(Ring.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "arcana_ring",
				new ConfigItem().setType(Ring.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "watch_of_flowing_time",
				new ConfigItem().setType(Bracelet.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "body_stone",
				new ConfigItem().setType(Necklace.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "soul_stone",
				new ConfigItem().setType(Necklace.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "life_stone",
				new ConfigItem().setType(Necklace.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "evertide_amulet",
				new ConfigItem().setType(Necklace.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "volcanite_amulet",
				new ConfigItem().setType(Necklace.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
	}
}