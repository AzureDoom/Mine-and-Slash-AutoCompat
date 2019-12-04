package mod.azure.azurecompat.util;

import java.util.List;

import com.google.common.collect.ImmutableList;
import com.robertx22.api.MineAndSlashAPI;
import com.robertx22.config.non_mine_items.ConfigItem;
import com.robertx22.database.gearitemslots.Boots;
import com.robertx22.database.gearitemslots.Bow;
import com.robertx22.database.gearitemslots.Chest;
import com.robertx22.database.gearitemslots.Helmet;
import com.robertx22.database.gearitemslots.Pants;
import com.robertx22.database.gearitemslots.Sword;

public class AllTheSwordsCompat {

	private static final List<String> SWORD = ImmutableList.of("rottenfleshsword", "plasmasword", "tntsword",
			"ultimatesword", "slimesword", "doublediamondsword", "disguseddiamondsword", "cactussword", "emeraldsword",
			"suicidesword", "carrotsword");

	private static final List<String> BOW = ImmutableList.of("shuriken", "shurikenthrower", "bowsword");

	public String MODID = "alltheswords:";

	public AllTheSwordsCompat() {
		MineAndSlashAPI.addCompatibleItem(MODID + "dirtsword", new ConfigItem().setType(new Sword()).setMaxRarity(2)
				.setAlwaysNormal().setMaxLevel(30).setdropsAsLoot(false));
		for (String w : SWORD) {
			MineAndSlashAPI.addCompatibleItem("alltheswords:" + w,
					new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		}
		for (String a : BOW) {
			MineAndSlashAPI.addCompatibleItem("alltheswords:" + a,
					new ConfigItem().setType(new Bow()).setMinLevel(5).setdropsAsLoot(false));
		}
		MineAndSlashAPI.addCompatibleItem(MODID + "electrumarmorhelmet",
				new ConfigItem().setType(new Helmet()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "electrumarmorbody",
				new ConfigItem().setType(new Chest()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "electrumarmorlegs",
				new ConfigItem().setType(new Pants()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "electrumarmorboots",
				new ConfigItem().setType(new Boots()).setMinLevel(50).setdropsAsLoot(false));
	}
}