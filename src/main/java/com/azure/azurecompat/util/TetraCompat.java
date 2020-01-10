package com.azure.azurecompat.util;

import com.robertx22.mine_and_slash.api.MineAndSlashAPI;
import com.robertx22.mine_and_slash.config.compatible_items.ConfigItem;
import com.robertx22.mine_and_slash.database.gearitemslots.weapons.Sword;

public class TetraCompat {
	
	public TetraCompat() {
		MineAndSlashAPI.addCompatibleItem("tetra:sword_modular", new ConfigItem().setType(Sword.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
	}

}