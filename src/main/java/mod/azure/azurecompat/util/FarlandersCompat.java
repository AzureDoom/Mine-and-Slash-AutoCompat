package mod.azure.azurecompat.util;

import com.robertx22.api.MineAndSlashAPI;
import com.robertx22.config.non_mine_items.ConfigItem;
import com.robertx22.database.gearitemslots.Boots;
import com.robertx22.database.gearitemslots.Chest;
import com.robertx22.database.gearitemslots.Helmet;
import com.robertx22.database.gearitemslots.Pants;
import com.robertx22.database.gearitemslots.Staff;
import com.robertx22.database.gearitemslots.Sword;

public class FarlandersCompat {

	public String MODID = "farlanders:";

	public FarlandersCompat() {
		MineAndSlashAPI.addCompatibleItem(MODID + "mystic_wand_fire_small",
				new ConfigItem().setType(new Staff()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "mystic_wand_fire_large",
				new ConfigItem().setType(new Staff()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "mystic_wand_ore",
				new ConfigItem().setType(new Staff()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "mystic_wand_teleport",
				new ConfigItem().setType(new Staff()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "mystic_wand_regen",
				new ConfigItem().setType(new Staff()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "mystic_wand_invisible",
				new ConfigItem().setType(new Staff()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "nightfall_sword",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "nightfall_helmet",
				new ConfigItem().setType(new Helmet()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "nightfall_chest",
				new ConfigItem().setType(new Chest()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "nightfall_leggings",
				new ConfigItem().setType(new Pants()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "nightfall_boots",
				new ConfigItem().setType(new Boots()).setMinLevel(50).setdropsAsLoot(false));
	}
}