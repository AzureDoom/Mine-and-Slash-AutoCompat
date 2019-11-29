package com.azure.azurecompat.util;

import java.util.List;

import com.google.common.collect.ImmutableList;
import com.robertx22.api.MineAndSlashAPI;
import com.robertx22.config.non_mine_items.ConfigItem;
import com.robertx22.database.gearitemslots.Axe;
import com.robertx22.database.gearitemslots.Boots;
import com.robertx22.database.gearitemslots.Bow;
import com.robertx22.database.gearitemslots.Chest;
import com.robertx22.database.gearitemslots.Helmet;
import com.robertx22.database.gearitemslots.Pants;
import com.robertx22.database.gearitemslots.Shield;
import com.robertx22.database.gearitemslots.Sword;

public class TheBetweenlandsCompat {

	private static final List<String> TYPE = ImmutableList.of("", "lurker_skin", "", "", "", "", "");

	public String MODID = "thebetweenlands:";

	public TheBetweenlandsCompat() {
		MineAndSlashAPI.addCompatibleItem(MODID + "ancient_greatsword",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "shockwave_sword",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "weedwood_sword",
				new ConfigItem().setType(new Sword()).setMaxRarity(0).setAlwaysNormal().setMaxLevel(10).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "bone_sword",
				new ConfigItem().setType(new Sword()).setMaxRarity(1).setAlwaysNormal().setMaxLevel(20).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "octine_sword",
				new ConfigItem().setType(new Sword()).setMaxRarity(2).setAlwaysNormal().setMaxLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "valonite_sword",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "dentrothyst_shield_orange_polished",
				new ConfigItem().setType(new Shield()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "dentrothyst_shield_orange", new ConfigItem().setType(new Shield()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "dentrothyst_shield_green_polished",
				new ConfigItem().setType(new Shield()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "dentrothyst_shield_green", new ConfigItem().setType(new Shield()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "ancient_battle_axe",
				new ConfigItem().setType(new Axe()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "weedwood_bow", new ConfigItem().setType(new Bow()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "predator_bow", new ConfigItem().setType(new Bow()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "bone_helmet",
				new ConfigItem().setType(new Helmet()).setMaxRarity(1).setAlwaysNormal().setMaxLevel(20).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "bone_chestplate",
				new ConfigItem().setType(new Chest()).setMaxRarity(1).setAlwaysNormal().setMaxLevel(20).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "bone_leggings",
				new ConfigItem().setType(new Pants()).setMaxRarity(1).setAlwaysNormal().setMaxLevel(20).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "bone_boots",
				new ConfigItem().setType(new Boots()).setMaxRarity(1).setAlwaysNormal().setMaxLevel(20).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "valonite_helmet",
				new ConfigItem().setType(new Helmet()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "valonite_chestplate",
				new ConfigItem().setType(new Chest()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "valonite_leggings",
				new ConfigItem().setType(new Pants()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "valonite_boots",
				new ConfigItem().setType(new Boots()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "lurker_skin_helmet",
				new ConfigItem().setType(new Helmet()).setMaxRarity(0).setAlwaysNormal().setMaxLevel(10).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "lurker_skin_chestplate",
				new ConfigItem().setType(new Chest()).setMaxRarity(0).setAlwaysNormal().setMaxLevel(10).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "lurker_skin_leggings",
				new ConfigItem().setType(new Pants()).setMaxRarity(0).setAlwaysNormal().setMaxLevel(10).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "lurker_skin_boots",
				new ConfigItem().setType(new Boots()).setMaxRarity(0).setAlwaysNormal().setMaxLevel(10).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "rubber_boots",
				new ConfigItem().setType(new Boots()).setMaxRarity(1).setAlwaysNormal().setMaxLevel(20).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "marsh_runner_boots",
				new ConfigItem().setType(new Boots()).setMaxRarity(1).setAlwaysNormal().setMaxLevel(20).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "syrmorite_helmet",
				new ConfigItem().setType(new Helmet()).setMaxRarity(2).setAlwaysNormal().setMaxLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "syrmorite_chestplate",
				new ConfigItem().setType(new Chest()).setMaxRarity(2).setAlwaysNormal().setMaxLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "syrmorite_leggings",
				new ConfigItem().setType(new Pants()).setMaxRarity(2).setAlwaysNormal().setMaxLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "syrmorite_boots",
				new ConfigItem().setType(new Boots()).setMaxRarity(2).setAlwaysNormal().setMaxLevel(30).setdropsAsLoot(false));
	}
}