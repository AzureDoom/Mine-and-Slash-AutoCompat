package com.azure.azurecompat.util;

import com.robertx22.mine_and_slash.api.MineAndSlashAPI;
import com.robertx22.mine_and_slash.config.compatible_items.ConfigItem;
import com.robertx22.mine_and_slash.database.gearitemslots.curios.Charm;
import com.robertx22.mine_and_slash.database.gearitemslots.curios.Necklace;
import com.robertx22.mine_and_slash.database.gearitemslots.curios.Ring;
import com.robertx22.mine_and_slash.database.gearitemslots.offhand.Shield;

public class BountifulBaublesCompact {

	public String MODID = "bountifulbaubles:";

	public BountifulBaublesCompact() {
		MineAndSlashAPI.addCompatibleItem(MODID + "shield_cobalt", new ConfigItem().setType(Shield.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "shield_obsidian", new ConfigItem().setType(Shield.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "shield_ankh", new ConfigItem().setType(Shield.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "ballon", new ConfigItem().setType(Charm.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "apple", new ConfigItem().setType(Charm.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "vitamins", new ConfigItem().setType(Charm.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "shulker_heart", new ConfigItem().setType(Charm.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "bezoar", new ConfigItem().setType(Charm.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "black_dragon_scale", new ConfigItem().setType(Charm.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "mixed_dragon_scale", new ConfigItem().setType(Charm.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "ankh_charm", new ConfigItem().setType(Charm.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "obsidian_skull", new ConfigItem().setType(Charm.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "lucky_horseshoe", new ConfigItem().setType(Charm.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "broken_heart", new ConfigItem().setType(Charm.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "phylactery_charm", new ConfigItem().setType(Charm.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "sunglasses", new ConfigItem().setType(Charm.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "amulet_cross", new ConfigItem().setType(Necklace.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "amulet_sin_wrath", new ConfigItem().setType(Necklace.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "amulet_sin_pride", new ConfigItem().setType(Necklace.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "amulet_sin_gluttony", new ConfigItem().setType(Necklace.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "ring_free_action", new ConfigItem().setType(Ring.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "ring_overclocking", new ConfigItem().setType(Ring.INSTANCE).setSalvagable(true).setdropsAsLoot(false));
	}
}