package mod.azure.azurecompat.util;

import com.robertx22.api.MineAndSlashAPI;
import com.robertx22.config.non_mine_items.ConfigItem;
import com.robertx22.database.gearitemslots.Boots;
import com.robertx22.database.gearitemslots.Chest;
import com.robertx22.database.gearitemslots.Helmet;
import com.robertx22.database.gearitemslots.Pants;
import com.robertx22.database.gearitemslots.Shield;
import com.robertx22.database.gearitemslots.Staff;
import com.robertx22.database.gearitemslots.Sword;

public class ExplorercraftCompat {

	public String MODID = "explorercraft:";

	public ExplorercraftCompat() {
		MineAndSlashAPI.addCompatibleItem(MODID + "jade_sword",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "amethyst_sword",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "ruby_sword", new ConfigItem().setType(new Sword()).setMaxRarity(2)
				.setAlwaysNormal().setMaxLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "wizard_staff",
				new ConfigItem().setType(new Staff()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "jade_helmet",
				new ConfigItem().setType(new Helmet()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "amethyst_helmet",
				new ConfigItem().setType(new Helmet()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "ruby_helmet", new ConfigItem().setType(new Helmet()).setMaxRarity(2)
				.setAlwaysNormal().setMaxLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "jade_chest",
				new ConfigItem().setType(new Chest()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "amethyst_chest",
				new ConfigItem().setType(new Chest()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "ruby_chest", new ConfigItem().setType(new Chest()).setMaxRarity(2)
				.setAlwaysNormal().setMaxLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "jade_leggings",
				new ConfigItem().setType(new Pants()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "amethyst_leggings",
				new ConfigItem().setType(new Pants()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "ruby_leggings", new ConfigItem().setType(new Pants()).setMaxRarity(2)
				.setAlwaysNormal().setMaxLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "jade_boots",
				new ConfigItem().setType(new Boots()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "amethyst_boots",
				new ConfigItem().setType(new Boots()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "ruby_boots", new ConfigItem().setType(new Boots()).setMaxRarity(2)
				.setAlwaysNormal().setMaxLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "welsh_shield",
				new ConfigItem().setType(new Shield()).setdropsAsLoot(false));
	}
}