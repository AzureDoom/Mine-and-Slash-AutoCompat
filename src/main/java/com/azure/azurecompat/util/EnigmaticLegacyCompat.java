package com.azure.azurecompat.util;

import com.robertx22.mine_and_slash.api.MineAndSlashAPI;
import com.robertx22.mine_and_slash.config.compatible_items.ConfigItem;
import com.robertx22.mine_and_slash.database.gearitemslots.curios.Charm;
import com.robertx22.mine_and_slash.database.gearitemslots.curios.Ring;
import com.robertx22.mine_and_slash.database.gearitemslots.plate.PlateBoots;
import com.robertx22.mine_and_slash.database.gearitemslots.plate.PlateChest;
import com.robertx22.mine_and_slash.database.gearitemslots.plate.PlateHelmet;
import com.robertx22.mine_and_slash.database.gearitemslots.plate.PlatePants;
import com.robertx22.mine_and_slash.database.gearitemslots.weapons.Axe;
import com.robertx22.mine_and_slash.database.gearitemslots.weapons.Hammer;
import com.robertx22.mine_and_slash.database.gearitemslots.weapons.Sword;

public class EnigmaticLegacyCompat {

	public EnigmaticLegacyCompat() {
		MineAndSlashAPI.addCompatibleItem("enigmaticlegacy:etherium_sword",
				new ConfigItem().setType(Sword.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem("enigmaticlegacy:etherium_axe",
				new ConfigItem().setType(Axe.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem("enigmaticlegacy:etherium_scythe",
				new ConfigItem().setType(Hammer.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem("enigmaticlegacy:forbidden_axe",
				new ConfigItem().setType(Axe.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem("enigmaticlegacy:astral_breaker",
				new ConfigItem().setType(Hammer.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem("enigmaticlegacy:etherium_helmet",
				new ConfigItem().setType(PlateHelmet.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem("enigmaticlegacy:etherium_chestplate",
				new ConfigItem().setType(PlateChest.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem("enigmaticlegacy:etherium_leggings",
				new ConfigItem().setType(PlatePants.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem("enigmaticlegacy:etherium_boots",
				new ConfigItem().setType(PlateBoots.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem("enigmaticlegacy:monster_charm",
				new ConfigItem().setType(Charm.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem("enigmaticlegacy:mega_sponge",
				new ConfigItem().setType(Charm.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem("enigmaticlegacy:enigmatic_amulet",
				new ConfigItem().setType(Charm.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem("enigmaticlegacy:mining_charm",
				new ConfigItem().setType(Charm.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem("enigmaticlegacy:super_magnet_ring",
				new ConfigItem().setType(Ring.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem("enigmaticlegacy:iron_ring",
				new ConfigItem().setType(Ring.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem("enigmaticlegacy:ender_ring",
				new ConfigItem().setType(Ring.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem("enigmaticlegacy:magnet_ring",
				new ConfigItem().setType(Ring.INSTANCE).setSalvagable(true));
	}

}