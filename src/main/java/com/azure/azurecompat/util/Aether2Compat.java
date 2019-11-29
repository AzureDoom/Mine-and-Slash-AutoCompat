package com.azure.azurecompat.util;

import com.robertx22.api.MineAndSlashAPI;
import com.robertx22.config.non_mine_items.ConfigItem;
import com.robertx22.database.gearitemslots.Boots;
import com.robertx22.database.gearitemslots.Bow;
import com.robertx22.database.gearitemslots.Charm;
import com.robertx22.database.gearitemslots.Chest;
import com.robertx22.database.gearitemslots.Helmet;
import com.robertx22.database.gearitemslots.Pants;
import com.robertx22.database.gearitemslots.Shield;
import com.robertx22.database.gearitemslots.Sword;

public class Aether2Compat {

	public String MODID = "aether:";

	public Aether2Compat() {
		MineAndSlashAPI.addCompatibleItem(MODID + "winter_hat", new ConfigItem().setType(new Helmet()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "arkenium_helmet",
				new ConfigItem().setType(new Helmet()).setMaxLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "arkenium_chestplate",
				new ConfigItem().setType(new Chest()).setMaxLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "arkenium_leggings",
				new ConfigItem().setType(new Pants()).setMaxLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "arkenium_boots",
				new ConfigItem().setType(new Boots()).setMaxLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "arkenium_shield",
				new ConfigItem().setType(new Shield()).setMaxLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "arkenium_gloves",
				new ConfigItem().setType(new Charm()).setMaxLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "gravitite_helmet",
				new ConfigItem().setType(new Helmet()).setMaxLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "gravitite_chestplate",
				new ConfigItem().setType(new Chest()).setMaxLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "gravitite_leggings",
				new ConfigItem().setType(new Pants()).setMaxLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "gravitite_boots",
				new ConfigItem().setType(new Boots()).setMaxLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "gravitite_shield",
				new ConfigItem().setType(new Shield()).setMaxLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "gravitite_gloves",
				new ConfigItem().setType(new Charm()).setMaxLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "zanite_helmet",
				new ConfigItem().setType(new Helmet()).setMaxLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "zanite_chestplate",
				new ConfigItem().setType(new Chest()).setMaxLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "zanite_leggings",
				new ConfigItem().setType(new Pants()).setMaxLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "zanite_boots",
				new ConfigItem().setType(new Boots()).setMaxLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "zanite_shield",
				new ConfigItem().setType(new Shield()).setMaxLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "zanite_gloves",
				new ConfigItem().setType(new Charm()).setMaxLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "taegore_hide_helmet",
				new ConfigItem().setType(new Helmet()).setMaxLevel(10).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "taegore_hide_chestplate",
				new ConfigItem().setType(new Chest()).setMaxLevel(10).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "taegore_hide_leggings",
				new ConfigItem().setType(new Pants()).setMaxLevel(10).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "taegore_hide_boots",
				new ConfigItem().setType(new Boots()).setMaxLevel(10).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "holystone_sword",
				new ConfigItem().setType(new Sword()).setMaxLevel(20).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "holystone_shield",
				new ConfigItem().setType(new Shield()).setMaxLevel(20).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "holystone_crossbow",
				new ConfigItem().setType(new Bow()).setMaxLevel(20).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "arkenium_sword",
				new ConfigItem().setType(new Sword()).setMaxLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "arkenium_crossbow",
				new ConfigItem().setType(new Bow()).setMaxLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "zanite_sword",
				new ConfigItem().setType(new Sword()).setMaxLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "zanite_crossbow",
				new ConfigItem().setType(new Bow()).setMaxLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "gravitite_crossbow",
				new ConfigItem().setType(new Bow()).setMaxLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "skyroot_sword",
				new ConfigItem().setType(new Sword()).setMaxLevel(10).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "skyroot_shield",
				new ConfigItem().setType(new Shield()).setMaxLevel(10).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "skyroot_crossbow",
				new ConfigItem().setType(new Bow()).setMaxLevel(10).setdropsAsLoot(false));
	}
}