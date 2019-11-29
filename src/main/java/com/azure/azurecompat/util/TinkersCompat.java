package com.azure.azurecompat.util;

import com.robertx22.api.MineAndSlashAPI;
import com.robertx22.config.non_mine_items.ConfigItem;
import com.robertx22.database.gearitemslots.Axe;
import com.robertx22.database.gearitemslots.Bow;
import com.robertx22.database.gearitemslots.Hammer;
import com.robertx22.database.gearitemslots.Sword;

public class TinkersCompat {

	public String MODID = "tconstruct:";

	public TinkersCompat() {
		MineAndSlashAPI.addCompatibleItem(MODID + "shortbow", new ConfigItem().setType(new Bow()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "longbow", new ConfigItem().setType(new Bow()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "crossbow", new ConfigItem().setType(new Bow()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "skuriken", new ConfigItem().setType(new Bow()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "scythe", new ConfigItem().setType(new Axe()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "cleaver", new ConfigItem().setType(new Hammer()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "rapier", new ConfigItem().setType(new Sword()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "broadsword", new ConfigItem().setType(new Sword()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "longsword", new ConfigItem().setType(new Sword()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "frypan", new ConfigItem().setType(new Sword()).setdropsAsLoot(false));
	}
}