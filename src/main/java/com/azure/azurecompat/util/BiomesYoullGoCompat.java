package com.azure.azurecompat.util;

import com.robertx22.api.MineAndSlashAPI;
import com.robertx22.config.non_mine_items.ConfigItem;
import com.robertx22.database.gearitemslots.Axe;
import com.robertx22.database.gearitemslots.Boots;
import com.robertx22.database.gearitemslots.Chest;
import com.robertx22.database.gearitemslots.Helmet;
import com.robertx22.database.gearitemslots.Pants;
import com.robertx22.database.gearitemslots.Sword;

public class BiomesYoullGoCompat {

	public String MODID = "byg:";

	public BiomesYoullGoCompat() {
		MineAndSlashAPI.addCompatibleItem(MODID + "tamrelitesword",
				new ConfigItem().setType(new Sword()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "pendoritesword",
				new ConfigItem().setType(new Sword()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "kasaiasword",
				new ConfigItem().setType(new Sword()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "lathariumsword",
				new ConfigItem().setType(new Sword()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "tamrelitebattleaxe",
				new ConfigItem().setType(new Axe()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "pendoritebattleaxe",
				new ConfigItem().setType(new Axe()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "lathariumbattleaxe",
				new ConfigItem().setType(new Axe()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "tamrelitearmourhelmet",
				new ConfigItem().setType(new Helmet()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "tamrelitearmourbody",
				new ConfigItem().setType(new Chest()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "tamrelitearmourlegs",
				new ConfigItem().setType(new Pants()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "tamrelitearmourboots",
				new ConfigItem().setType(new Boots()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "pendoritearmourhelmet",
				new ConfigItem().setType(new Helmet()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "pendoritearmourbody",
				new ConfigItem().setType(new Chest()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "pendoritearmourlegs",
				new ConfigItem().setType(new Pants()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "pendoritearmourboots",
				new ConfigItem().setType(new Boots()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "kasaiarmourhelmet",
				new ConfigItem().setType(new Helmet()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "kasaiarmourbody",
				new ConfigItem().setType(new Chest()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "kasaiarmourlegs",
				new ConfigItem().setType(new Pants()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "kasaiarmourboots",
				new ConfigItem().setType(new Boots()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "lathariumarmourhelmet",
				new ConfigItem().setType(new Helmet()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "lathariumarmourbody",
				new ConfigItem().setType(new Chest()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "lathariumarmourlegs",
				new ConfigItem().setType(new Pants()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "lathariumarmourboots",
				new ConfigItem().setType(new Boots()).setdropsAsLoot(false));
	}
}