package com.azure.azurecompat.util;

import com.azure.azurecompat.AzureCompat;
import com.robertx22.mine_and_slash.api.MineAndSlashAPI;
import com.robertx22.mine_and_slash.config.compatible_items.ConfigItem;
import com.robertx22.mine_and_slash.database.gearitemslots.plate.PlateHelmet;

public class TheOneProbeCompat {

	public TheOneProbeCompat() {

		MineAndSlashAPI.addCompatibleItem("theoneprobe:iron_helmet_probe",
				new ConfigItem().setType(PlateHelmet.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem("theoneprobe:gold_helmet_probe",
				new ConfigItem().setType(PlateHelmet.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem("theoneprobe:diamond_helmet_probe",
				new ConfigItem().setType(PlateHelmet.INSTANCE).setSalvagable(true));
		AzureCompat.LOGGER.info("Registered The One Probe Gear");
	}

}