package mod.azure.azurecompat.util;

import java.util.List;

import com.google.common.collect.ImmutableList;
import com.robertx22.api.MineAndSlashAPI;
import com.robertx22.config.non_mine_items.ConfigItem;
import com.robertx22.database.gearitemslots.Axe;
import com.robertx22.database.gearitemslots.Bow;
import com.robertx22.database.gearitemslots.Hammer;
import com.robertx22.database.gearitemslots.Necklace;
import com.robertx22.database.gearitemslots.Staff;
import com.robertx22.database.gearitemslots.Sword;
import com.robertx22.database.gearitemslots.Helmet;
import com.robertx22.database.gearitemslots.Chest;
import com.robertx22.database.gearitemslots.Pants;
import com.robertx22.database.gearitemslots.Boots;

public class IceAndFireCompat {

	private static final List<String> HAMMER = ImmutableList.of("troll_weapon.trunk_frost", "troll_weapon.trunk",
			"troll_weapon.hammer", "troll_weapon.column", "troll_weapon.column_frost", "troll_weapon.column_forest");

	public IceAndFireCompat() {
		String modID = "iceandfire:";

		MineAndSlashAPI.addCompatibleItem(modID + "myrmex_desert_staff", new ConfigItem().setType(new Staff())
				.setMaxRarity(0).setAlwaysNormal().setMaxLevel(10).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(modID + "myrmex_jungle_staff", new ConfigItem().setType(new Staff())
				.setMaxRarity(0).setAlwaysNormal().setMaxLevel(10).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(modID + "dragon_stick",
				new ConfigItem().setType(new Sword()).setMinLevel(60).setdropsAsLoot(false));
		for (String s : HAMMER) {
			MineAndSlashAPI.addCompatibleItem(modID + s,
					new ConfigItem().setType(new Hammer()).setMinLevel(80).setdropsAsLoot(false));
		}
		MineAndSlashAPI.addCompatibleItem(modID + "dragonbone_bow",
				new ConfigItem().setType(new Bow()).setMinLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(modID + "stymphalian_feather_bundle",
				new ConfigItem().setType(new Bow()).setMinLevel(5).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(modID + "myrmex_desert_sword", new ConfigItem().setType(new Sword())
				.setMaxRarity(0).setAlwaysNormal().setMaxLevel(10).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(modID + "myrmex_jungle_sword_venom", new ConfigItem().setType(new Sword())
				.setMaxRarity(0).setAlwaysNormal().setMaxLevel(10).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(modID + "myrmex_jungle_sword", new ConfigItem().setType(new Sword())
				.setMaxRarity(0).setAlwaysNormal().setMaxLevel(10).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(modID + "myrmex_desert_sword_venom", new ConfigItem().setType(new Sword())
				.setMaxRarity(0).setAlwaysNormal().setMaxLevel(10).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(modID + "silver_sword", new ConfigItem().setType(new Sword()).setMaxRarity(1)
				.setAlwaysNormal().setMaxLevel(20).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(modID + "stymphalian_bird_dagger", new ConfigItem().setType(new Sword())
				.setMaxRarity(2).setAlwaysNormal().setMaxLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(modID + "hippogryph_sword", new ConfigItem().setType(new Sword())
				.setMaxRarity(2).setAlwaysNormal().setMaxLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(modID + "dragonbone_sword",
				new ConfigItem().setType(new Sword()).setMinLevel(60).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(modID + "dragonsteel_ice_sword",
				new ConfigItem().setType(new Sword()).setMinLevel(90).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(modID + "dragonsteel_fire_sword",
				new ConfigItem().setType(new Sword()).setMinLevel(90).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(modID + "sheep_helmet", new ConfigItem().setType(new Helmet()).setMaxRarity(0)
				.setAlwaysNormal().setMaxLevel(10).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(modID + "myrmex_desert_helmet", new ConfigItem().setType(new Helmet())
				.setMaxRarity(0).setAlwaysNormal().setMaxLevel(10).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(modID + "myrmex_jungle_helmet", new ConfigItem().setType(new Helmet())
				.setMaxRarity(0).setAlwaysNormal().setMaxLevel(10).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(modID + "armor_silver_metal_helmet",
				new ConfigItem().setType(new Helmet()).setAlwaysNormal().setMaxLevel(20).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(modID + "armor_red_helmet", new ConfigItem().setType(new Helmet())
				.setMaxRarity(2).setAlwaysNormal().setMaxLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(modID + "armor_bronze_helmet", new ConfigItem().setType(new Helmet())
				.setMaxRarity(2).setAlwaysNormal().setMaxLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(modID + "armor_green_helmet", new ConfigItem().setType(new Helmet())
				.setMaxRarity(2).setAlwaysNormal().setMaxLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(modID + "armor_gray_helmet", new ConfigItem().setType(new Helmet())
				.setMaxRarity(2).setAlwaysNormal().setMaxLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(modID + "armor_blue_helmet", new ConfigItem().setType(new Helmet())
				.setMaxRarity(2).setAlwaysNormal().setMaxLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(modID + "armor_white_helmet", new ConfigItem().setType(new Helmet())
				.setMaxRarity(2).setAlwaysNormal().setMaxLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(modID + "armor_sapphire_helmet", new ConfigItem().setType(new Helmet())
				.setMaxRarity(2).setAlwaysNormal().setMaxLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(modID + "armor_silver_helmet", new ConfigItem().setType(new Helmet())
				.setMaxRarity(2).setAlwaysNormal().setMaxLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(modID + "tide_blue_helmet", new ConfigItem().setType(new Helmet())
				.setMaxRarity(2).setAlwaysNormal().setMaxLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(modID + "tide_bronze_helmet", new ConfigItem().setType(new Helmet())
				.setMaxRarity(2).setAlwaysNormal().setMaxLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(modID + "tide_deepblue_helmet", new ConfigItem().setType(new Helmet())
				.setMaxRarity(2).setAlwaysNormal().setMaxLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(modID + "tide_purple_helmet", new ConfigItem().setType(new Helmet())
				.setMaxRarity(2).setAlwaysNormal().setMaxLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(modID + "tide_red_helmet", new ConfigItem().setType(new Helmet())
				.setMaxRarity(2).setAlwaysNormal().setMaxLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(modID + "tide_teal_helmet", new ConfigItem().setType(new Helmet())
				.setMaxRarity(2).setAlwaysNormal().setMaxLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(modID + "deathworm_yellow_helmet", new ConfigItem().setType(new Helmet())
				.setMaxRarity(2).setAlwaysNormal().setMaxLevel(40).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(modID + "deathworm_white_helmet", new ConfigItem().setType(new Helmet())
				.setMaxRarity(2).setAlwaysNormal().setMaxLevel(40).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(modID + "deathworm_red_helmet", new ConfigItem().setType(new Helmet())
				.setMaxRarity(2).setAlwaysNormal().setMaxLevel(40).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(modID + "minecraft:diamond_helmet",
				new ConfigItem().setType(new Helmet()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(modID + "forest_troll_leather_helmet",
				new ConfigItem().setType(new Helmet()).setMinLevel(80).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(modID + "frost_troll_leather_helmet",
				new ConfigItem().setType(new Helmet()).setMinLevel(80).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(modID + "mountain_troll_leather_helmet",
				new ConfigItem().setType(new Helmet()).setMinLevel(80).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(modID + "dragonsteel_ice_helmet",
				new ConfigItem().setType(new Helmet()).setMinLevel(90).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(modID + "dragonsteel_fire_helmet",
				new ConfigItem().setType(new Helmet()).setMinLevel(90).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(modID + "sheep_boots", new ConfigItem().setType(new Boots()).setMaxRarity(0)
				.setAlwaysNormal().setMaxLevel(10).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(modID + "myrmex_desert_boots", new ConfigItem().setType(new Boots())
				.setMaxRarity(0).setAlwaysNormal().setMaxLevel(10).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(modID + "myrmex_jungle_boots", new ConfigItem().setType(new Boots())
				.setMaxRarity(0).setAlwaysNormal().setMaxLevel(10).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(modID + "armor_silver_metal_boots",
				new ConfigItem().setType(new Boots()).setAlwaysNormal().setMaxLevel(20).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(modID + "armor_red_boots", new ConfigItem().setType(new Boots())
				.setMaxRarity(2).setAlwaysNormal().setMaxLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(modID + "armor_bronze_boots", new ConfigItem().setType(new Boots())
				.setMaxRarity(2).setAlwaysNormal().setMaxLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(modID + "armor_green_boots", new ConfigItem().setType(new Boots())
				.setMaxRarity(2).setAlwaysNormal().setMaxLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(modID + "armor_gray_boots", new ConfigItem().setType(new Boots())
				.setMaxRarity(2).setAlwaysNormal().setMaxLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(modID + "armor_blue_boots", new ConfigItem().setType(new Boots())
				.setMaxRarity(2).setAlwaysNormal().setMaxLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(modID + "armor_white_boots", new ConfigItem().setType(new Boots())
				.setMaxRarity(2).setAlwaysNormal().setMaxLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(modID + "sheep_chestplate", new ConfigItem().setType(new Chest())
				.setMaxRarity(0).setAlwaysNormal().setMaxLevel(10).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(modID + "myrmex_desert_chestplate", new ConfigItem().setType(new Chest())
				.setMaxRarity(0).setAlwaysNormal().setMaxLevel(10).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(modID + "myrmex_jungle_chestplate", new ConfigItem().setType(new Chest())
				.setMaxRarity(0).setAlwaysNormal().setMaxLevel(10).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(modID + "armor_silver_metal_chestplate",
				new ConfigItem().setType(new Boots()).setAlwaysNormal().setMaxLevel(20).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(modID + "armor_red_chestplate", new ConfigItem().setType(new Chest())
				.setMaxRarity(2).setAlwaysNormal().setMaxLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(modID + "armor_bronze_chestplate", new ConfigItem().setType(new Chest())
				.setMaxRarity(2).setAlwaysNormal().setMaxLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(modID + "armor_green_chestplate", new ConfigItem().setType(new Chest())
				.setMaxRarity(2).setAlwaysNormal().setMaxLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(modID + "armor_gray_chestplate", new ConfigItem().setType(new Chest())
				.setMaxRarity(2).setAlwaysNormal().setMaxLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(modID + "armor_blue_chestplate", new ConfigItem().setType(new Chest())
				.setMaxRarity(2).setAlwaysNormal().setMaxLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(modID + "armor_white_chestplate", new ConfigItem().setType(new Chest())
				.setMaxRarity(2).setAlwaysNormal().setMaxLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(modID + "armor_sapphire_chestplate", new ConfigItem().setType(new Chest())
				.setMaxRarity(2).setAlwaysNormal().setMaxLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(modID + "armor_silver_chestplate", new ConfigItem().setType(new Chest())
				.setMaxRarity(2).setAlwaysNormal().setMaxLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(modID + "tide_blue_chestplate", new ConfigItem().setType(new Chest())
				.setMaxRarity(2).setAlwaysNormal().setMaxLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(modID + "tide_bronze_chestplate", new ConfigItem().setType(new Chest())
				.setMaxRarity(2).setAlwaysNormal().setMaxLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(modID + "tide_deepblue_chestplate", new ConfigItem().setType(new Chest())
				.setMaxRarity(2).setAlwaysNormal().setMaxLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(modID + "tide_purple_chestplate", new ConfigItem().setType(new Chest())
				.setMaxRarity(2).setAlwaysNormal().setMaxLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(modID + "tide_red_chestplate", new ConfigItem().setType(new Chest())
				.setMaxRarity(2).setAlwaysNormal().setMaxLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(modID + "tide_teal_chestplate", new ConfigItem().setType(new Chest())
				.setMaxRarity(2).setAlwaysNormal().setMaxLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(modID + "deathworm_yellow_chestplate", new ConfigItem().setType(new Chest())
				.setMaxRarity(2).setAlwaysNormal().setMaxLevel(40).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(modID + "deathworm_white_chestplate", new ConfigItem().setType(new Chest())
				.setMaxRarity(2).setAlwaysNormal().setMaxLevel(40).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(modID + "deathworm_red_chestplate", new ConfigItem().setType(new Chest())
				.setMaxRarity(2).setAlwaysNormal().setMaxLevel(40).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(modID + "minecraft:diamond_chestplate",
				new ConfigItem().setType(new Chest()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(modID + "forest_troll_leather_chestplate",
				new ConfigItem().setType(new Chest()).setMinLevel(80).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(modID + "frost_troll_leather_chestplate",
				new ConfigItem().setType(new Chest()).setMinLevel(80).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(modID + "mountain_troll_leather_chestplate",
				new ConfigItem().setType(new Chest()).setMinLevel(80).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(modID + "dragonsteel_ice_chestplate",
				new ConfigItem().setType(new Chest()).setMinLevel(90).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(modID + "dragonsteel_fire_chestplate",
				new ConfigItem().setType(new Chest()).setMinLevel(90).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(modID + "sheep_leggings", new ConfigItem().setType(new Pants())
				.setMaxRarity(0).setAlwaysNormal().setMaxLevel(10).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(modID + "myrmex_desert_leggings", new ConfigItem().setType(new Pants())
				.setMaxRarity(0).setAlwaysNormal().setMaxLevel(10).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(modID + "myrmex_jungle_leggings", new ConfigItem().setType(new Pants())
				.setMaxRarity(0).setAlwaysNormal().setMaxLevel(10).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(modID + "armor_silver_metal_leggings",
				new ConfigItem().setType(new Pants()).setAlwaysNormal().setMaxLevel(20).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(modID + "armor_red_leggings", new ConfigItem().setType(new Pants())
				.setMaxRarity(2).setAlwaysNormal().setMaxLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(modID + "armor_bronze_leggings", new ConfigItem().setType(new Pants())
				.setMaxRarity(2).setAlwaysNormal().setMaxLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(modID + "armor_green_leggings", new ConfigItem().setType(new Pants())
				.setMaxRarity(2).setAlwaysNormal().setMaxLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(modID + "armor_gray_leggings", new ConfigItem().setType(new Pants())
				.setMaxRarity(2).setAlwaysNormal().setMaxLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(modID + "armor_blue_leggings", new ConfigItem().setType(new Pants())
				.setMaxRarity(2).setAlwaysNormal().setMaxLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(modID + "armor_white_leggings", new ConfigItem().setType(new Pants())
				.setMaxRarity(2).setAlwaysNormal().setMaxLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(modID + "armor_sapphire_leggings", new ConfigItem().setType(new Pants())
				.setMaxRarity(2).setAlwaysNormal().setMaxLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(modID + "armor_silver_leggings", new ConfigItem().setType(new Pants())
				.setMaxRarity(2).setAlwaysNormal().setMaxLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(modID + "tide_blue_leggings", new ConfigItem().setType(new Pants())
				.setMaxRarity(2).setAlwaysNormal().setMaxLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(modID + "tide_bronze_leggings", new ConfigItem().setType(new Pants())
				.setMaxRarity(2).setAlwaysNormal().setMaxLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(modID + "tide_deepblue_leggings", new ConfigItem().setType(new Pants())
				.setMaxRarity(2).setAlwaysNormal().setMaxLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(modID + "tide_purple_leggings", new ConfigItem().setType(new Pants())
				.setMaxRarity(2).setAlwaysNormal().setMaxLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(modID + "tide_red_leggings", new ConfigItem().setType(new Pants())
				.setMaxRarity(2).setAlwaysNormal().setMaxLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(modID + "tide_teal_leggings", new ConfigItem().setType(new Pants())
				.setMaxRarity(2).setAlwaysNormal().setMaxLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(modID + "deathworm_yellow_leggings", new ConfigItem().setType(new Pants())
				.setMaxRarity(2).setAlwaysNormal().setMaxLevel(40).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(modID + "deathworm_white_leggings", new ConfigItem().setType(new Pants())
				.setMaxRarity(2).setAlwaysNormal().setMaxLevel(40).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(modID + "deathworm_red_leggings", new ConfigItem().setType(new Pants())
				.setMaxRarity(2).setAlwaysNormal().setMaxLevel(40).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(modID + "minecraft:diamond_leggings",
				new ConfigItem().setType(new Pants()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(modID + "forest_troll_leather_leggings",
				new ConfigItem().setType(new Pants()).setMinLevel(80).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(modID + "frost_troll_leather_leggings",
				new ConfigItem().setType(new Pants()).setMinLevel(80).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(modID + "mountain_troll_leather_leggings",
				new ConfigItem().setType(new Pants()).setMinLevel(80).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(modID + "dragonsteel_ice_leggings",
				new ConfigItem().setType(new Pants()).setMinLevel(90).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(modID + "dragonsteel_fire_leggings",
				new ConfigItem().setType(new Pants()).setMinLevel(90).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(modID + "armor_sapphire_boots", new ConfigItem().setType(new Boots())
				.setMaxRarity(2).setAlwaysNormal().setMaxLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(modID + "armor_silver_boots", new ConfigItem().setType(new Boots())
				.setMaxRarity(2).setAlwaysNormal().setMaxLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(modID + "tide_blue_boots", new ConfigItem().setType(new Boots())
				.setMaxRarity(2).setAlwaysNormal().setMaxLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(modID + "tide_bronze_boots", new ConfigItem().setType(new Boots())
				.setMaxRarity(2).setAlwaysNormal().setMaxLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(modID + "tide_deepblue_boots", new ConfigItem().setType(new Boots())
				.setMaxRarity(2).setAlwaysNormal().setMaxLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(modID + "tide_purple_boots", new ConfigItem().setType(new Boots())
				.setMaxRarity(2).setAlwaysNormal().setMaxLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(modID + "tide_red_boots", new ConfigItem().setType(new Boots())
				.setMaxRarity(2).setAlwaysNormal().setMaxLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(modID + "tide_teal_boots", new ConfigItem().setType(new Boots())
				.setMaxRarity(2).setAlwaysNormal().setMaxLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(modID + "deathworm_yellow_boots", new ConfigItem().setType(new Boots())
				.setMaxRarity(2).setAlwaysNormal().setMaxLevel(40).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(modID + "deathworm_white_boots", new ConfigItem().setType(new Boots())
				.setMaxRarity(2).setAlwaysNormal().setMaxLevel(40).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(modID + "deathworm_red_boots", new ConfigItem().setType(new Boots())
				.setMaxRarity(2).setAlwaysNormal().setMaxLevel(40).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(modID + "minecraft:diamond_boots",
				new ConfigItem().setType(new Boots()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(modID + "forest_troll_leather_boots",
				new ConfigItem().setType(new Boots()).setMinLevel(80).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(modID + "frost_troll_leather_boots",
				new ConfigItem().setType(new Boots()).setMinLevel(80).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(modID + "mountain_troll_leather_boots",
				new ConfigItem().setType(new Boots()).setMinLevel(80).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(modID + "dragonsteel_ice_boots",
				new ConfigItem().setType(new Boots()).setMinLevel(90).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(modID + "dragonsteel_fire_boots",
				new ConfigItem().setType(new Boots()).setMinLevel(90).setdropsAsLoot(false));
	}

}
