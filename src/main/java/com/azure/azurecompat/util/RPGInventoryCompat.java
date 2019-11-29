package com.azure.azurecompat.util;

import com.robertx22.api.MineAndSlashAPI;
import com.robertx22.config.non_mine_items.ConfigItem;
import com.robertx22.database.gearitemslots.Charm;
import com.robertx22.database.gearitemslots.Necklace;
import com.robertx22.database.gearitemslots.Ring;

public class RPGInventoryCompat {

	public String MODID = "rpginventory:";

	public RPGInventoryCompat() {
		MineAndSlashAPI.addCompatibleItem(MODID + "gold_glove", new ConfigItem().setType(new Charm()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "diamond_glove", new ConfigItem().setType(new Charm()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "buffed_glove", new ConfigItem().setType(new Charm()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "lapis_glove", new ConfigItem().setType(new Charm()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "cloak", new ConfigItem().setType(new Charm()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "gold_ring", new ConfigItem().setType(new Ring()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "diamond_ring", new ConfigItem().setType(new Ring()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "emerald_ring", new ConfigItem().setType(new Ring()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "lapis_ring", new ConfigItem().setType(new Ring()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "gold_necklace", new ConfigItem().setType(new Necklace()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "diamond_necklace", new ConfigItem().setType(new Necklace()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "emerald_necklace", new ConfigItem().setType(new Necklace()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "lapis_necklace", new ConfigItem().setType(new Necklace()).setdropsAsLoot(false));
	}
}