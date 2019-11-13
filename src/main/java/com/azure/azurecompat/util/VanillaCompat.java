package com.azure.azurecompat.util;

import com.robertx22.mine_and_slash.api.MineAndSlashAPI;
import com.robertx22.mine_and_slash.config.compatible_items.ConfigItem;
import com.robertx22.mine_and_slash.database.gearitemslots.weapons.Sword;
import com.robertx22.mine_and_slash.database.gearitemslots.leather.LeatherBoots;
import com.robertx22.mine_and_slash.database.gearitemslots.leather.LeatherChest;
import com.robertx22.mine_and_slash.database.gearitemslots.leather.LeatherHelmet;
import com.robertx22.mine_and_slash.database.gearitemslots.leather.LeatherPants;
import com.robertx22.mine_and_slash.database.gearitemslots.plate.PlateBoots;
import com.robertx22.mine_and_slash.database.gearitemslots.plate.PlateChest;
import com.robertx22.mine_and_slash.database.gearitemslots.plate.PlateHelmet;
import com.robertx22.mine_and_slash.database.gearitemslots.plate.PlatePants;
import com.robertx22.mine_and_slash.database.gearitemslots.weapons.Bow;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class VanillaCompat {
	private static final Logger LOGGER = LogManager.getLogger();

	public VanillaCompat() {

		MineAndSlashAPI.addCompatibleItem("minecraft:bow", new ConfigItem().setType(Bow.INSTANCE).setSalvagable(false));
		LOGGER.debug("Registered Bow");
		MineAndSlashAPI.addCompatibleItem("minecraft:wooden_sword", new ConfigItem().setType(Sword.INSTANCE)
				.setMaxRarity(0).setSalvagable(false).setAlwaysNormal());
		MineAndSlashAPI.addCompatibleItem("minecraft:stone_sword", new ConfigItem().setType(Sword.INSTANCE)
				.setMaxRarity(1).setSalvagable(false).setAlwaysNormal());

		MineAndSlashAPI.addCompatibleItem("minecraft:iron_sword", new ConfigItem().setType(Sword.INSTANCE)
				.setMaxRarity(2).setSalvagable(false).setAlwaysNormal());
		MineAndSlashAPI.addCompatibleItem("minecraft:golden_sword", new ConfigItem().setType(Sword.INSTANCE)
				.setMaxRarity(2).setSalvagable(false).setAlwaysNormal());
		MineAndSlashAPI.addCompatibleItem("minecraft:diamond_sword",
				new ConfigItem().setType(Sword.INSTANCE).setSalvagable(false));
		LOGGER.debug("Registered Swords");
		MineAndSlashAPI.addCompatibleItem("minecraft:leather_helmet", new ConfigItem().setType(LeatherHelmet.INSTANCE)
				.setMaxRarity(0).setSalvagable(false).setAlwaysNormal());
		MineAndSlashAPI.addCompatibleItem("minecraft:chainmail_helmet",
				new ConfigItem().setType(PlateHelmet.INSTANCE));
		MineAndSlashAPI.addCompatibleItem("minecraft:iron_helmet", new ConfigItem().setType(PlateHelmet.INSTANCE)
				.setMaxRarity(2).setSalvagable(false).setAlwaysNormal());
		MineAndSlashAPI.addCompatibleItem("minecraft:golden_helmet", new ConfigItem().setType(PlateHelmet.INSTANCE)
				.setMaxRarity(2).setSalvagable(false).setAlwaysNormal());
		MineAndSlashAPI.addCompatibleItem("minecraft:diamond_helmet",
				new ConfigItem().setType(PlateHelmet.INSTANCE).setSalvagable(false));
		LOGGER.debug("Registered Helmet");
		MineAndSlashAPI.addCompatibleItem("minecraft:leather_chestplate",
				new ConfigItem().setType(LeatherChest.INSTANCE).setMaxRarity(0).setSalvagable(false).setAlwaysNormal()
						);
		MineAndSlashAPI.addCompatibleItem("minecraft:chainmail_chestplate",
				new ConfigItem().setType(PlateChest.INSTANCE));
		MineAndSlashAPI.addCompatibleItem("minecraft:iron_chestplate", new ConfigItem().setType(PlateChest.INSTANCE)
				.setMaxRarity(2).setSalvagable(false).setAlwaysNormal());
		MineAndSlashAPI.addCompatibleItem("minecraft:golden_chestplate", new ConfigItem().setType(PlateChest.INSTANCE)
				.setMaxRarity(2).setSalvagable(false).setAlwaysNormal());
		MineAndSlashAPI.addCompatibleItem("minecraft:diamond_chestplate",
				new ConfigItem().setType(PlateChest.INSTANCE).setSalvagable(false));
		LOGGER.debug("Registered Chestplate");
		MineAndSlashAPI.addCompatibleItem("minecraft:leather_leggings", new ConfigItem().setType(LeatherPants.INSTANCE)
				.setMaxRarity(0).setSalvagable(false).setAlwaysNormal());
		MineAndSlashAPI.addCompatibleItem("minecraft:chainmail_leggings",
				new ConfigItem().setType(PlatePants.INSTANCE));
		MineAndSlashAPI.addCompatibleItem("minecraft:iron_leggings", new ConfigItem().setType(PlatePants.INSTANCE)
				.setMaxRarity(2).setSalvagable(false).setAlwaysNormal());
		MineAndSlashAPI.addCompatibleItem("minecraft:golden_leggings", new ConfigItem().setType(PlatePants.INSTANCE)
				.setMaxRarity(2).setSalvagable(false).setAlwaysNormal());
		MineAndSlashAPI.addCompatibleItem("minecraft:diamond_leggings",
				new ConfigItem().setType(PlatePants.INSTANCE).setSalvagable(false));
		LOGGER.debug("Registered Leggings");
		MineAndSlashAPI.addCompatibleItem("minecraft:leather_boots", new ConfigItem().setType(LeatherBoots.INSTANCE)
				.setMaxRarity(0).setSalvagable(false).setAlwaysNormal());
		MineAndSlashAPI.addCompatibleItem("minecraft:chainmail_boots",
				new ConfigItem().setType(PlateBoots.INSTANCE));
		MineAndSlashAPI.addCompatibleItem("minecraft:iron_boots", new ConfigItem().setType(PlateBoots.INSTANCE)
				.setMaxRarity(2).setSalvagable(false).setAlwaysNormal());
		MineAndSlashAPI.addCompatibleItem("minecraft:golden_boots", new ConfigItem().setType(PlateBoots.INSTANCE)
				.setMaxRarity(2).setSalvagable(false).setAlwaysNormal());
		MineAndSlashAPI.addCompatibleItem("minecraft:diamond_boots",
				new ConfigItem().setType(PlateBoots.INSTANCE).setSalvagable(false));
		LOGGER.debug("Registered Boots");
	}

}
