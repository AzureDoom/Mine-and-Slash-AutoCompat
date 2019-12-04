package mod.azure.azurecompat.util;

import java.util.List;

import com.google.common.collect.ImmutableList;
import com.robertx22.api.MineAndSlashAPI;
import com.robertx22.config.non_mine_items.ConfigItem;
import com.robertx22.database.gearitemslots.Boots;
import com.robertx22.database.gearitemslots.Chest;
import com.robertx22.database.gearitemslots.Helmet;
import com.robertx22.database.gearitemslots.Pants;
import com.robertx22.database.gearitemslots.Sword;

public class LastSwordCompat {

	private static final List<String> SWORD = ImmutableList.of("dragon_sword0", "dragon_sword1", "dragon_sword2",
			"dragon_sword3", "dragon_sword4", "dragon_sword5", "dragon_sword6", "dragon_sword7", "dragon_sword8",
			"dragon_sword9", "dragon_sworda");

	public String MODID = "tlsywen:";

	public LastSwordCompat() {
		MineAndSlashAPI.addCompatibleItem(MODID + "dragon_helmet",
				new ConfigItem().setType(new Helmet()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "dragon_chestplate",
				new ConfigItem().setType(new Chest()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "dragon_leggings",
				new ConfigItem().setType(new Pants()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "dragon_boots",
				new ConfigItem().setType(new Boots()).setMinLevel(50).setdropsAsLoot(false));
		for (String w : SWORD) {
			MineAndSlashAPI.addCompatibleItem("tlsywen:" + w,
					new ConfigItem().setType(new Sword()).setMinLevel(90).setdropsAsLoot(false));
		}
	}
}