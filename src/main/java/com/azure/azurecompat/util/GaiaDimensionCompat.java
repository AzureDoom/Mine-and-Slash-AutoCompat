package com.azure.azurecompat.util;

import java.util.List;

import com.google.common.collect.ImmutableList;
import com.robertx22.mine_and_slash.api.MineAndSlashAPI;
import com.robertx22.mine_and_slash.config.compatible_items.ConfigItem;
import com.robertx22.mine_and_slash.database.gearitemslots.cloth.ClothBoots;
import com.robertx22.mine_and_slash.database.gearitemslots.cloth.ClothChest;
import com.robertx22.mine_and_slash.database.gearitemslots.cloth.ClothHelmet;
import com.robertx22.mine_and_slash.database.gearitemslots.cloth.ClothPants;
import com.robertx22.mine_and_slash.database.gearitemslots.plate.PlateBoots;
import com.robertx22.mine_and_slash.database.gearitemslots.plate.PlateChest;
import com.robertx22.mine_and_slash.database.gearitemslots.plate.PlateHelmet;
import com.robertx22.mine_and_slash.database.gearitemslots.plate.PlatePants;
import com.robertx22.mine_and_slash.database.gearitemslots.weapons.Axe;
import com.robertx22.mine_and_slash.database.gearitemslots.weapons.Bow;
import com.robertx22.mine_and_slash.database.gearitemslots.weapons.Sword;

public class GaiaDimensionCompat {

	public static final List<String> HELMET = ImmutableList.of("sugilite_helmet", "proustite_helmet", "leucite_helmet",
			"carnelian_helmet", "diopside_helmet", "chalcedony_helmet", "malachite_guard_headgear",
			"corrupt_warrior_helm", "gaia_duchess_helm", "gaia_duke_helm", "gaia_champion_helm");
	public static final List<String> CHEST = ImmutableList.of("sugilite_chestplate", "proustite_chestplate",
			"leucite_chestplate", "carnelian_chestplate", "diopside_chestplate", "chalcedony_chestplate",
			"malachite_guard_brace", "corrupt_warrior_guard", "gaia_duchess_guard", "gaia_duke_guard",
			"gaia_champion_guard");
	public static final List<String> PANTS = ImmutableList.of("sugilite_legs", "proustite_legs", "leucite_legs",
			"carnelian_legs", "diopside_legs", "chalcedony_legs", "malachite_guard_gear", "corrupt_warrior_greaves",
			"gaia_duchess_greaves", "gaia_duke_greaves", "gaia_champion_greaves");
	public static final List<String> BOOTS = ImmutableList.of("sugilite_boots", "proustite_boots", "leucite_boots",
			"carnelian_boots", "diopside_boots", "chalcedony_boots", "malachite_guard_boots", "corrupt_warrior_boots",
			"gaia_duchess_boots", "gaia_duke_boots", "gaia_champion_boots");
	public static final List<String> CLOTHHELMET = ImmutableList.of("spinel_princess_cowl", "zircon_prince_crown",
			"apex_predator_hood", "gaia_baron_mask");
	public static final List<String> CLOTHCHEST = ImmutableList.of("spinel_princess_cloak", "zircon_prince_chestpiece",
			"apex_predator_jacket", "gaia_baron_tuxedo");
	public static final List<String> CLOTHPANTS = ImmutableList.of("spinel_princess_dress", "zircon_prince_gear",
			"gaia_baron_pants", "apex_predator_trousers");
	public static final List<String> CLOTHBOOTS = ImmutableList.of("spinel_princess_heels", "zircon_prince_boots",
			"apex_predator_boots", "gaia_baron_shoes");
	public static final List<String> SWORD = ImmutableList.of("agate_sword", "sugilite_sword", "ixiolite_sword",
			"euclase_sword", "carnelian_sword", "benitoite_sword", "chalcedony_sword", "malachite_guard_baton",
			"spinel_princess_flamberge", "zircon_prince_razor", "corrupt_warrior_sword", "gaia_duchess_khopesh",
			"gaia_baron_dagger", "gaia_duke_blade", "gaia_champion_sword");

	public GaiaDimensionCompat() {
		for (String ph : HELMET) {
			MineAndSlashAPI.addCompatibleItem("gaiadimension:" + ph,
					new ConfigItem().setType(PlateHelmet.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
		}
		for (String pc : CHEST) {
			MineAndSlashAPI.addCompatibleItem("gaiadimension:" + pc,
					new ConfigItem().setType(PlateChest.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
		}
		for (String pp : PANTS) {
			MineAndSlashAPI.addCompatibleItem("gaiadimension:" + pp,
					new ConfigItem().setType(PlatePants.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
		}
		for (String pb : BOOTS) {
			MineAndSlashAPI.addCompatibleItem("gaiadimension:" + pb,
					new ConfigItem().setType(PlateBoots.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
		}
		for (String ch : CLOTHHELMET) {
			MineAndSlashAPI.addCompatibleItem("gaiadimension:" + ch,
					new ConfigItem().setType(ClothHelmet.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
		}
		for (String cc : CLOTHCHEST) {
			MineAndSlashAPI.addCompatibleItem("gaiadimension:" + cc,
					new ConfigItem().setType(ClothChest.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
		}
		for (String cp : CLOTHPANTS) {
			MineAndSlashAPI.addCompatibleItem("gaiadimension:" + cp,
					new ConfigItem().setType(ClothPants.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
		}
		for (String cb : CLOTHBOOTS) {
			MineAndSlashAPI.addCompatibleItem("gaiadimension:" + cb,
					new ConfigItem().setType(ClothBoots.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
		}
		for (String s : SWORD) {
			MineAndSlashAPI.addCompatibleItem("gaiadimension:" + s,
					new ConfigItem().setType(Sword.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
		}
		MineAndSlashAPI.addCompatibleItem("gaiadimension:apex_predator_mace",
				new ConfigItem().setType(Axe.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem("gaiadimension:old_bow",
				new ConfigItem().setType(Bow.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
	}
}