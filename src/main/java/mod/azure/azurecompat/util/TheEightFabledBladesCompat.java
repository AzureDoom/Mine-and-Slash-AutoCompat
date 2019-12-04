package mod.azure.azurecompat.util;

import com.robertx22.api.MineAndSlashAPI;
import com.robertx22.config.non_mine_items.ConfigItem;
import com.robertx22.database.gearitemslots.Sword;

public class TheEightFabledBladesCompat {

	public String MODID = "theeightfabledblades:";

	public TheEightFabledBladesCompat() {
		MineAndSlashAPI.addCompatibleItem(MODID + "sword_of_the_great_end",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "sword_slicer",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "heart_piercer",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "shield_breaker",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "disenchanting_saber",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "arrow_slasher",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "hay_maker",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "lunar_edge",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
	}
}