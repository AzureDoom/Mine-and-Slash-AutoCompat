package com.azure.azurecompat.util;

import java.util.List;

import com.google.common.collect.ImmutableList;
import com.robertx22.mine_and_slash.api.MineAndSlashAPI;
import com.robertx22.mine_and_slash.config.compatible_items.ConfigItem;
import com.robertx22.mine_and_slash.database.gearitemslots.cloth.ClothHelmet;

public class StatuesCompat {

	public static final List<String> HELMET = ImmutableList.of("baby_zombie_statue", "blaze_statue", "campfire_statue",
			"chicken_jockey_statue", "chicken_statue", "cow_statue", "creeper_statue", "enderman_statue",
			"evoker_statue", "flood_statue", "ghast_statue", "guardian_statue", "husk_statue", "king_cluck_statue",
			"magma_statue", "mooshroom_statue", "pig_statue", "rabbit_br_statue", "rabbit_bs_statue",
			"rabbit_bw_statue", "rabbit_go_statue", "rabbit_wh_statue", "rabbit_ws_statue", "shulker_statue",
			"slime_statue", "snow_golem_statue", "spider_statue", "villager_br_statue", "villager_gr_statue",
			"villager_pu_statue", "villager_wh_statue", "wasteland_statue", "witch_statue", "zombie_statue",
			"cod_statue", "dolphin_statue", "drowned_statue", "pufferfish_medium_statue", "pufferfish_small_statue",
			"pufferfish_statue", "salmon_statue", "squid_statue", "tropical_fish_b", "tropical_fish_bb",
			"tropical_fish_be", "tropical_fish_bm", "tropical_fish_bmb", "tropical_fish_bms", "tropical_fish_e",
			"tropical_fish_es", "tropical_fish_hb", "tropical_fish_sb", "tropical_fish_sd", "tropical_fish_ss",
			"turtle_statue", "sheep_shaven_statue", "sheep_statue_white", "sheep_statue_orange", "sheep_statue_magenta",
			"sheep_statue_light_blue", "sheep_statue_yellow", "sheep_statue_lime", "sheep_statue_pink",
			"sheep_statue_gray", "sheep_statue_light_gray", "sheep_statue_cyan", "sheep_statue_purple",
			"sheep_statue_blue", "sheep_statue_brown", "sheep_statue_green", "sheep_statue_red", "sheep_statue_black",
			"info_statue", "player_statue", "endermite_statue", "totem_of_undying_statue", "pebble", "display_stand",
			"sombrero", "bumbo_statue");

	public StatuesCompat() {
		for (String h : HELMET) {
			MineAndSlashAPI.addCompatibleItem("statues:" + h,
					new ConfigItem().setType(ClothHelmet.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
		}
	}
}