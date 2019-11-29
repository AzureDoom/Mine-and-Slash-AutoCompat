package com.azure.azurecompat.util;

import com.robertx22.api.MineAndSlashAPI;
import com.robertx22.config.non_mine_items.ConfigItem;
import com.robertx22.database.gearitemslots.Axe;
import com.robertx22.database.gearitemslots.Boots;
import com.robertx22.database.gearitemslots.Bow;
import com.robertx22.database.gearitemslots.Charm;
import com.robertx22.database.gearitemslots.Chest;
import com.robertx22.database.gearitemslots.Hammer;
import com.robertx22.database.gearitemslots.Helmet;
import com.robertx22.database.gearitemslots.Necklace;
import com.robertx22.database.gearitemslots.Pants;
import com.robertx22.database.gearitemslots.Ring;
import com.robertx22.database.gearitemslots.Staff;
import com.robertx22.database.gearitemslots.Sword;

public class AetherLegacyCompat {

	public String MODID = "aether_legacy:";

	public AetherLegacyCompat() {
		MineAndSlashAPI.addCompatibleItem(MODID + "dart_shooter", new ConfigItem().setType(new Bow()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "cloud_staff", new ConfigItem().setType(new Staff()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "nature_staff", new ConfigItem().setType(new Staff()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "leather_gloves", new ConfigItem().setType(new Charm()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "iron_gloves", new ConfigItem().setType(new Charm()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "golden_gloves", new ConfigItem().setType(new Charm()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "chain_gloves", new ConfigItem().setType(new Charm()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "diamond_gloves", new ConfigItem().setType(new Charm()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "zanite_gloves", new ConfigItem().setType(new Charm()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "gravitite_gloves", new ConfigItem().setType(new Charm()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "neptune_gloves", new ConfigItem().setType(new Charm()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "phoenix_gloves", new ConfigItem().setType(new Charm()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "obsidian_gloves", new ConfigItem().setType(new Charm()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "valkyrie_gloves", new ConfigItem().setType(new Charm()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "red_cape", new ConfigItem().setType(new Charm()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "blue_cape", new ConfigItem().setType(new Charm()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "yellow_cape", new ConfigItem().setType(new Charm()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "white_cape", new ConfigItem().setType(new Charm()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "swet_cape", new ConfigItem().setType(new Charm()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "invisibility_cape", new ConfigItem().setType(new Charm()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "agility_cape", new ConfigItem().setType(new Charm()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "valkyrie_cape", new ConfigItem().setType(new Charm()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "iron_ring", new ConfigItem().setType(new Ring()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "golden_ring", new ConfigItem().setType(new Ring()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "zanite_ring", new ConfigItem().setType(new Ring()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "ice_ring", new ConfigItem().setType(new Ring()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "iron_pendant", new ConfigItem().setType(new Necklace()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "golden_pendant", new ConfigItem().setType(new Necklace()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "zanite_pendant", new ConfigItem().setType(new Necklace()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "ice_pendant", new ConfigItem().setType(new Necklace()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "phoenix_bow", new ConfigItem().setType(new Bow()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "valkyrie_lance",
				new ConfigItem().setType(new Axe()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "notch_hammer",
				new ConfigItem().setType(new Hammer()).setMaxRarity(2).setAlwaysNormal().setMaxLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "zanite_sword",
				new ConfigItem().setType(new Sword()).setMaxRarity(0).setAlwaysNormal().setMaxLevel(10).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "skyroot_sword",
				new ConfigItem().setType(new Sword()).setMaxRarity(0).setAlwaysNormal().setMaxLevel(10).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "candy_can_sword",
				new ConfigItem().setType(new Sword()).setMaxRarity(0).setAlwaysNormal().setMaxLevel(10).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "holystone_sword",
				new ConfigItem().setType(new Sword()).setMaxRarity(1).setAlwaysNormal().setMaxLevel(20).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "pig_slayer",
				new ConfigItem().setType(new Sword()).setMaxRarity(2).setAlwaysNormal().setMaxLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "lightning_sword",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "flaming_sword",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "gravitite_sword",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "holy_sword", new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "vampire_sword",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "zanite_helmet",
				new ConfigItem().setType(new Helmet()).setMaxRarity(0).setAlwaysNormal().setMaxLevel(10).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "zanite_chestplate",
				new ConfigItem().setType(new Chest()).setMaxRarity(0).setAlwaysNormal().setMaxLevel(10).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "zanite_leggings",
				new ConfigItem().setType(new Pants()).setMaxRarity(0).setAlwaysNormal().setMaxLevel(10).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "zanite_boots",
				new ConfigItem().setType(new Boots()).setMaxRarity(0).setAlwaysNormal().setMaxLevel(10).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "valkyrie_helmet",
				new ConfigItem().setType(new Helmet()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "valkyrie_chestplate",
				new ConfigItem().setType(new Chest()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "valkyrie_leggings",
				new ConfigItem().setType(new Pants()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "valkyrie_boots",
				new ConfigItem().setType(new Boots()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "gravitite_helmet",
				new ConfigItem().setType(new Helmet()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "gravitite_chestplate",
				new ConfigItem().setType(new Chest()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "gravitite_leggings",
				new ConfigItem().setType(new Pants()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "gravitite_boots",
				new ConfigItem().setType(new Boots()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "neptune_helmet",
				new ConfigItem().setType(new Helmet()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "neptune_chestplate",
				new ConfigItem().setType(new Chest()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "neptune_leggings",
				new ConfigItem().setType(new Pants()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "neptune_boots",
				new ConfigItem().setType(new Boots()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "phoenix_helmet",
				new ConfigItem().setType(new Helmet()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "phoenix_chestplate",
				new ConfigItem().setType(new Chest()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "phoenix_leggings",
				new ConfigItem().setType(new Pants()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "phoenix_boots",
				new ConfigItem().setType(new Boots()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "obsidian_helmet",
				new ConfigItem().setType(new Helmet()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "obsidian_chestplate",
				new ConfigItem().setType(new Chest()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "obsidian_leggings",
				new ConfigItem().setType(new Pants()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "obsidian_boots",
				new ConfigItem().setType(new Boots()).setMinLevel(50).setdropsAsLoot(false));
	}
}