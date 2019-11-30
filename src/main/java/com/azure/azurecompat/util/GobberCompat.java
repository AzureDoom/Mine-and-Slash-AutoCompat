package com.azure.azurecompat.util;

import com.robertx22.mine_and_slash.api.MineAndSlashAPI;
import com.robertx22.mine_and_slash.config.compatible_items.ConfigItem;
import com.robertx22.mine_and_slash.database.gearitemslots.curios.Ring;
import com.robertx22.mine_and_slash.database.gearitemslots.plate.PlateBoots;
import com.robertx22.mine_and_slash.database.gearitemslots.plate.PlateChest;
import com.robertx22.mine_and_slash.database.gearitemslots.plate.PlateHelmet;
import com.robertx22.mine_and_slash.database.gearitemslots.plate.PlatePants;
import com.robertx22.mine_and_slash.database.gearitemslots.weapons.Bow;
import com.robertx22.mine_and_slash.database.gearitemslots.weapons.Sword;

public class GobberCompat {

	public String MODID = "gobber2:";

	public GobberCompat() {

		MineAndSlashAPI.addCompatibleItem(MODID + "gobber2_sword",
				new ConfigItem().setType(Sword.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "gobber2_sword_traveler",
				new ConfigItem().setType(Sword.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "gobber2_sword_nether",
				new ConfigItem().setType(Sword.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "gobber2_sword_end",
				new ConfigItem().setType(Sword.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "gobber2_sword_sniper",
				new ConfigItem().setType(Bow.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "gobber2_helmet",
				new ConfigItem().setType(PlateHelmet.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "gobber2_helmet_nether",
				new ConfigItem().setType(PlateHelmet.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "gobber2_helmet_end",
				new ConfigItem().setType(PlateHelmet.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "gobber2_chestplate",
				new ConfigItem().setType(PlateChest.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "gobber2_chestplate_nether",
				new ConfigItem().setType(PlateChest.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "gobber2_chestplate_end",
				new ConfigItem().setType(PlateChest.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "gobber2_leggings",
				new ConfigItem().setType(PlatePants.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "gobber2_leggings_nether",
				new ConfigItem().setType(PlatePants.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "gobber2_leggings_end",
				new ConfigItem().setType(PlatePants.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "gobber2_boots",
				new ConfigItem().setType(PlateBoots.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "gobber2_boots_nether",
				new ConfigItem().setType(PlateBoots.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "gobber2_boots_end",
				new ConfigItem().setType(PlateBoots.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "gobber_ring",
				new ConfigItem().setType(Ring.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "gobber_ring_nether",
				new ConfigItem().setType(Ring.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "gobber_ring_end",
				new ConfigItem().setType(Ring.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "gobber_ring_attraction",
				new ConfigItem().setType(Ring.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "gobber_ring_miner",
				new ConfigItem().setType(Ring.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "gobber_ring_lumberjack",
				new ConfigItem().setType(Ring.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "gobber_ring_farmer",
				new ConfigItem().setType(Ring.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "gobber_ring_husbandry",
				new ConfigItem().setType(Ring.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "gobber_ring_swiftness",
				new ConfigItem().setType(Ring.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "gobber_ring_sunshine",
				new ConfigItem().setType(Ring.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "gobber_ring_ascent",
				new ConfigItem().setType(Ring.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "gobber_ring_acceleration",
				new ConfigItem().setType(Ring.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "gobber_ring_leaping",
				new ConfigItem().setType(Ring.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "gobber_ring_curing",
				new ConfigItem().setType(Ring.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "gobber_ring_vision",
				new ConfigItem().setType(Ring.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "gobber_ring_phoenix",
				new ConfigItem().setType(Ring.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "gobber_ring_haste",
				new ConfigItem().setType(Ring.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "gobber_ring_blaze",
				new ConfigItem().setType(Ring.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "gobber_ring_repair",
				new ConfigItem().setType(Ring.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "gobber_ring_dismissal",
				new ConfigItem().setType(Ring.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "gobber_ring_enderchest",
				new ConfigItem().setType(Ring.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "gobber_ring_traveler",
				new ConfigItem().setType(Ring.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "gobber_ring_void",
				new ConfigItem().setType(Ring.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "gobber_ring_airwalking",
				new ConfigItem().setType(Ring.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "gobber_ring_stealth",
				new ConfigItem().setType(Ring.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "gobber_ring_teleport",
				new ConfigItem().setType(Ring.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "gobber_ring_blink",
				new ConfigItem().setType(Ring.INSTANCE).setSalvagable(true));
	}

}