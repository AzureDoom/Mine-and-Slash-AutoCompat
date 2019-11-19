package com.azure.azurecompat.util;

import java.util.List;

import com.google.common.collect.ImmutableList;
import com.robertx22.mine_and_slash.api.MineAndSlashAPI;
import com.robertx22.mine_and_slash.config.compatible_items.ConfigItem;
import com.robertx22.mine_and_slash.database.gearitemslots.plate.PlateBoots;
import com.robertx22.mine_and_slash.database.gearitemslots.plate.PlateChest;
import com.robertx22.mine_and_slash.database.gearitemslots.plate.PlateHelmet;
import com.robertx22.mine_and_slash.database.gearitemslots.plate.PlatePants;
import com.robertx22.mine_and_slash.database.gearitemslots.weapons.Axe;
import com.robertx22.mine_and_slash.database.gearitemslots.weapons.Bow;
import com.robertx22.mine_and_slash.database.gearitemslots.weapons.Hammer;
import com.robertx22.mine_and_slash.database.gearitemslots.weapons.Sword;

public class FunItemsModCompat {
	private static final List<String> SWORD = ImmutableList.of("sword_of_insanity", "cloaked_wrath", "sword_of_joy",
			"energy_blade", "dark_sword", "essence_shrieker", "planet_eater", "voidf", "sword_of_hell",
			"energy_blade_c", "god_of_rs", "laser_sword", "blaze_sword", "dragon_blade", "starf", "glutton_sword",
			"sword_of_unending_fire", "emerald_sword", "divine_sword", "obsidian_sword", "lead_sword", "cyanite_sword",
			"sapphire_sword", "tin_sword", "amethyst_sword", "uranium_sword", "ruby_sword", "crimsonite_sword",
			"hellsteel_sword", "onyx_sword", "mithril_sword", "leafium_sword", "demonite_sword", "silver_sword",
			"aluminum_sword", "quartz_sword", "copper_sword", "topaz_sword", "adamantium_sword");

	private static final List<String> AXE = ImmutableList.of("battle_axe", "powered_battle_axe");

	private static final List<String> BOW = ImmutableList.of("divine_bow", "predator", "bow_of_unendingfire",
			"dragon_bow");

	private static final List<String> SCYTHE = ImmutableList.of("battle_scythe", "powered_battle_scythe",
			"death_scythe", "great_sword", "soul_eater");

	private static final List<String> TYPE = ImmutableList.of("emerald", "glutton", "divine", "obsidian", "lead",
			"voidf", "cyanite", "sapphire", "tin", "amethyst", "uranium", "ruby", "crimsonite", "ghost", "hellsteel",
			"onyx", "starf", "mithril", "leafium", "demonite", "dark", "silver", "aluminum", "quartz", "copper",
			"death", "topaz", "adamantium");

	public String MODID = "funmod:";

	public FunItemsModCompat() {
		MineAndSlashAPI.addCompatibleItem(MODID + SWORD, new ConfigItem().setType(Sword.INSTANCE));
		MineAndSlashAPI.addCompatibleItem(MODID + AXE, new ConfigItem().setType(Axe.INSTANCE));
		MineAndSlashAPI.addCompatibleItem(MODID + BOW, new ConfigItem().setType(Bow.INSTANCE));
		MineAndSlashAPI.addCompatibleItem(MODID + SCYTHE, new ConfigItem().setType(Hammer.INSTANCE));
		MineAndSlashAPI.addCompatibleItem(MODID + TYPE + "_helmet", new ConfigItem().setType(PlateHelmet.INSTANCE));
		MineAndSlashAPI.addCompatibleItem(MODID + TYPE + "_chestplate", new ConfigItem().setType(PlateChest.INSTANCE));
		MineAndSlashAPI.addCompatibleItem(MODID + TYPE + "_leggings", new ConfigItem().setType(PlatePants.INSTANCE));
		MineAndSlashAPI.addCompatibleItem(MODID + TYPE + "_boots", new ConfigItem().setType(PlateBoots.INSTANCE));
	}

}
