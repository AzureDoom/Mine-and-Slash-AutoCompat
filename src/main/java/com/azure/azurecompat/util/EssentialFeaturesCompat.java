package com.azure.azurecompat.util;

import com.robertx22.mine_and_slash.api.MineAndSlashAPI;
import com.robertx22.mine_and_slash.config.compatible_items.ConfigItem;
import com.robertx22.mine_and_slash.database.gearitemslots.weapons.Sword;

public class EssentialFeaturesCompat {

	public EssentialFeaturesCompat() {
		MineAndSlashAPI.addCompatibleItem("essentialfeatures:redstone_rod_sword", new ConfigItem().setType(Sword.INSTANCE).setSalvagable(true));
	}
}