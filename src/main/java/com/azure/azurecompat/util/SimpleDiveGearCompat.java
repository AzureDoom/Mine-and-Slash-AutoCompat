package com.azure.azurecompat.util;

import com.robertx22.mine_and_slash.api.MineAndSlashAPI;
import com.robertx22.mine_and_slash.config.compatible_items.ConfigItem;
import com.robertx22.mine_and_slash.database.gearitemslots.plate.PlateBoots;
import com.robertx22.mine_and_slash.database.gearitemslots.plate.PlateChest;
import com.robertx22.mine_and_slash.database.gearitemslots.plate.PlatePants;

public class SimpleDiveGearCompat {

	public SimpleDiveGearCompat() {
		MineAndSlashAPI.addCompatibleItem("simpledivegear:divechest",
				new ConfigItem().setType(PlateChest.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem("simpledivegear:divelegs",
				new ConfigItem().setType(PlatePants.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem("simpledivegear:diveboots",
				new ConfigItem().setType(PlateBoots.INSTANCE).setSalvagable(true));
	}

}