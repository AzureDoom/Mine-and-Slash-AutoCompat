package com.azure.azurecompat.util;

import com.azure.azurecompat.AzureCompat;
import com.robertx22.mine_and_slash.api.MineAndSlashAPI;
import com.robertx22.mine_and_slash.config.compatible_items.ConfigItem;
import com.robertx22.mine_and_slash.database.gearitemslots.weapons.Sword;
import com.robertx22.mine_and_slash.database.gearitemslots.leather.LeatherBoots;
import com.robertx22.mine_and_slash.database.gearitemslots.leather.LeatherChest;
import com.robertx22.mine_and_slash.database.gearitemslots.leather.LeatherHelmet;
import com.robertx22.mine_and_slash.database.gearitemslots.leather.LeatherPants;
import com.robertx22.mine_and_slash.database.gearitemslots.offhand.Shield;
import com.robertx22.mine_and_slash.database.gearitemslots.plate.PlateBoots;
import com.robertx22.mine_and_slash.database.gearitemslots.plate.PlateChest;
import com.robertx22.mine_and_slash.database.gearitemslots.plate.PlateHelmet;
import com.robertx22.mine_and_slash.database.gearitemslots.plate.PlatePants;
import com.robertx22.mine_and_slash.database.gearitemslots.weapons.Bow;
import com.robertx22.mine_and_slash.database.gearitemslots.weapons.CrossBow;

public class VanillaCompat {

	public String MODID = "minecraft:";

	public VanillaCompat() {

		MineAndSlashAPI.addCompatibleItem(MODID + "bow", new ConfigItem().setType(Bow.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "crossbow", new ConfigItem().setType(CrossBow.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "trident", new ConfigItem().setType(Bow.INSTANCE).setSalvagable(true));
		AzureCompat.LOGGER.info("Registered Bows");
		MineAndSlashAPI.addCompatibleItem(MODID + "wooden_sword",
				new ConfigItem().setType(Sword.INSTANCE).setMaxRarity(0).setAlwaysNormal().setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "stone_sword",
				new ConfigItem().setType(Sword.INSTANCE).setMaxRarity(1).setAlwaysNormal().setSalvagable(true));

		MineAndSlashAPI.addCompatibleItem(MODID + "iron_sword",
				new ConfigItem().setType(Sword.INSTANCE).setMaxRarity(2).setAlwaysNormal().setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "golden_sword",
				new ConfigItem().setType(Sword.INSTANCE).setMaxRarity(2).setAlwaysNormal().setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "diamond_sword", new ConfigItem().setType(Sword.INSTANCE).setSalvagable(true));
		AzureCompat.LOGGER.info("Registered Swords");
		MineAndSlashAPI.addCompatibleItem(MODID + "shield", new ConfigItem().setType(Shield.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "leather_helmet",
				new ConfigItem().setType(LeatherHelmet.INSTANCE).setMaxRarity(0).setAlwaysNormal().setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "chainmail_helmet", new ConfigItem().setType(PlateHelmet.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "iron_helmet",
				new ConfigItem().setType(PlateHelmet.INSTANCE).setMaxRarity(2).setAlwaysNormal().setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "golden_helmet",
				new ConfigItem().setType(PlateHelmet.INSTANCE).setMaxRarity(2).setAlwaysNormal().setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "diamond_helmet", new ConfigItem().setType(PlateHelmet.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "turtle_helmet", new ConfigItem().setType(LeatherHelmet.INSTANCE).setSalvagable(true));
		AzureCompat.LOGGER.info("Registered Helmet");
		MineAndSlashAPI.addCompatibleItem(MODID + "leather_chestplate",
				new ConfigItem().setType(LeatherChest.INSTANCE).setMaxRarity(0).setAlwaysNormal().setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "chainmail_chestplate",
				new ConfigItem().setType(PlateChest.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "iron_chestplate",
				new ConfigItem().setType(PlateChest.INSTANCE).setMaxRarity(2).setAlwaysNormal().setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "golden_chestplate",
				new ConfigItem().setType(PlateChest.INSTANCE).setMaxRarity(2).setAlwaysNormal().setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "diamond_chestplate", new ConfigItem().setType(PlateChest.INSTANCE).setSalvagable(true));
		AzureCompat.LOGGER.info("Registered Chestplate");
		MineAndSlashAPI.addCompatibleItem(MODID + "leather_leggings",
				new ConfigItem().setType(LeatherPants.INSTANCE).setMaxRarity(0).setAlwaysNormal().setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "chainmail_leggings", new ConfigItem().setType(PlatePants.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "iron_leggings",
				new ConfigItem().setType(PlatePants.INSTANCE).setMaxRarity(2).setAlwaysNormal().setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "golden_leggings",
				new ConfigItem().setType(PlatePants.INSTANCE).setMaxRarity(2).setAlwaysNormal().setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "diamond_leggings", new ConfigItem().setType(PlatePants.INSTANCE).setSalvagable(true));
		AzureCompat.LOGGER.info("Registered Leggings");
		MineAndSlashAPI.addCompatibleItem(MODID + "leather_boots",
				new ConfigItem().setType(LeatherBoots.INSTANCE).setMaxRarity(0).setAlwaysNormal().setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "chainmail_boots", new ConfigItem().setType(PlateBoots.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "iron_boots",
				new ConfigItem().setType(PlateBoots.INSTANCE).setMaxRarity(2).setAlwaysNormal().setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "golden_boots",
				new ConfigItem().setType(PlateBoots.INSTANCE).setMaxRarity(2).setAlwaysNormal().setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "diamond_boots", new ConfigItem().setType(PlateBoots.INSTANCE).setSalvagable(true));
		AzureCompat.LOGGER.info("Registered Boots");
	}

}
