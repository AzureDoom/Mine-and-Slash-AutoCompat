package com.azure.azurecompat.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.robertx22.mine_and_slash.api.MineAndSlashAPI;
import com.robertx22.mine_and_slash.config.compatible_items.ConfigItem;
import com.robertx22.mine_and_slash.database.gearitemslots.plate.PlateBoots;
import com.robertx22.mine_and_slash.database.gearitemslots.plate.PlateChest;
import com.robertx22.mine_and_slash.database.gearitemslots.plate.PlateHelmet;
import com.robertx22.mine_and_slash.database.gearitemslots.plate.PlatePants;
import com.robertx22.mine_and_slash.database.gearitemslots.weapons.Axe;
import com.robertx22.mine_and_slash.database.gearitemslots.weapons.Hammer;
import com.robertx22.mine_and_slash.database.gearitemslots.weapons.Staff;
import com.robertx22.mine_and_slash.database.gearitemslots.weapons.Sword;

public class ForbiddenandArcanusCompat {
	
	private static final Logger LOGGER = LogManager.getLogger();
	
	public ForbiddenandArcanusCompat() {
		MineAndSlashAPI.addCompatibleItem("forbidden_arcanus:obsidian_sword", new ConfigItem().setType(Sword.INSTANCE));
		MineAndSlashAPI.addCompatibleItem("forbidden_arcanus:draco_arcanus_sword", new ConfigItem().setType(Sword.INSTANCE));
		MineAndSlashAPI.addCompatibleItem("forbidden_arcanus:arcane_golden_sword", new ConfigItem().setType(Sword.INSTANCE));
		MineAndSlashAPI.addCompatibleItem("forbidden_arcanus:reinforced_arcane_golden_sword", new ConfigItem().setType(Sword.INSTANCE));
		MineAndSlashAPI.addCompatibleItem("forbidden_arcanus:bone_sword", new ConfigItem().setType(Sword.INSTANCE));
		MineAndSlashAPI.addCompatibleItem("forbidden_arcanus:sacred_scepter", new ConfigItem().setType(Staff.INSTANCE));
		MineAndSlashAPI.addCompatibleItem("forbidden_arcanus:draco_arcanus_scepter", new ConfigItem().setType(Staff.INSTANCE));
		MineAndSlashAPI.addCompatibleItem("forbidden_arcanus:draco_arcanus_staff", new ConfigItem().setType(Staff.INSTANCE));
		MineAndSlashAPI.addCompatibleItem("forbidden_arcanus:mystical_dagger", new ConfigItem().setType(Sword.INSTANCE));
		MineAndSlashAPI.addCompatibleItem("forbidden_arcanus:runic_battleaxe", new ConfigItem().setType(Axe.INSTANCE));
		MineAndSlashAPI.addCompatibleItem("forbidden_arcanus:battle_skull", new ConfigItem().setType(Hammer.INSTANCE));
		LOGGER.debug("Registered Forbidden and Arcanus Weapons");
		MineAndSlashAPI.addCompatibleItem("forbidden_arcanus:draco_arcanus_helmet", new ConfigItem().setType(PlateHelmet.INSTANCE));
		MineAndSlashAPI.addCompatibleItem("forbidden_arcanus:draco_arcanus_chestplate", new ConfigItem().setType(PlateChest.INSTANCE));
		MineAndSlashAPI.addCompatibleItem("forbidden_arcanus:draco_arcanus_leggings", new ConfigItem().setType(PlatePants.INSTANCE));
		MineAndSlashAPI.addCompatibleItem("forbidden_arcanus:draco_arcanus_boots", new ConfigItem().setType(PlateBoots.INSTANCE));
		MineAndSlashAPI.addCompatibleItem("forbidden_arcanus:arcance_gold_helmet", new ConfigItem().setType(PlateHelmet.INSTANCE));
		MineAndSlashAPI.addCompatibleItem("forbidden_arcanus:arcance_gold_chestplate", new ConfigItem().setType(PlateChest.INSTANCE));
		MineAndSlashAPI.addCompatibleItem("forbidden_arcanus:arcance_gold_leggings", new ConfigItem().setType(PlatePants.INSTANCE));
		MineAndSlashAPI.addCompatibleItem("forbidden_arcanus:arcance_gold_boots", new ConfigItem().setType(PlateBoots.INSTANCE));
		MineAndSlashAPI.addCompatibleItem("forbidden_arcanus:tyr_helmet", new ConfigItem().setType(PlateHelmet.INSTANCE));
		MineAndSlashAPI.addCompatibleItem("forbidden_arcanus:tyr_chestplate", new ConfigItem().setType(PlateChest.INSTANCE));
		MineAndSlashAPI.addCompatibleItem("forbidden_arcanus:tyr_leggings", new ConfigItem().setType(PlatePants.INSTANCE));
		MineAndSlashAPI.addCompatibleItem("forbidden_arcanus:tyr_boots", new ConfigItem().setType(PlateBoots.INSTANCE));
		MineAndSlashAPI.addCompatibleItem("forbidden_arcanus:obsidian_helmet", new ConfigItem().setType(PlateHelmet.INSTANCE));
		MineAndSlashAPI.addCompatibleItem("forbidden_arcanus:obsidian_chestplate", new ConfigItem().setType(PlateChest.INSTANCE));
		MineAndSlashAPI.addCompatibleItem("forbidden_arcanus:obsidian_leggings", new ConfigItem().setType(PlatePants.INSTANCE));
		MineAndSlashAPI.addCompatibleItem("forbidden_arcanus:obsidian_boots", new ConfigItem().setType(PlateBoots.INSTANCE));
		MineAndSlashAPI.addCompatibleItem("forbidden_arcanus:mortem_helmet", new ConfigItem().setType(PlateHelmet.INSTANCE));
		MineAndSlashAPI.addCompatibleItem("forbidden_arcanus:mortem_chestplate", new ConfigItem().setType(PlateChest.INSTANCE));
		MineAndSlashAPI.addCompatibleItem("forbidden_arcanus:mortem_leggings", new ConfigItem().setType(PlatePants.INSTANCE));
		MineAndSlashAPI.addCompatibleItem("forbidden_arcanus:mortem_boots", new ConfigItem().setType(PlateBoots.INSTANCE));
		LOGGER.debug("Registered Forbidden and Arcanus Gear");
	}

}
