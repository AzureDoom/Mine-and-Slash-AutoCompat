package com.azure.azurecompat.util;

import com.robertx22.mine_and_slash.api.MineAndSlashAPI;
import com.robertx22.mine_and_slash.config.compatible_items.ConfigItem;
import com.robertx22.mine_and_slash.database.gearitemslots.plate.PlateBoots;
import com.robertx22.mine_and_slash.database.gearitemslots.plate.PlateChest;
import com.robertx22.mine_and_slash.database.gearitemslots.plate.PlateHelmet;
import com.robertx22.mine_and_slash.database.gearitemslots.plate.PlatePants;
import com.robertx22.mine_and_slash.database.gearitemslots.weapons.Sword;

public class AlikeToolsCompact {

	public String MODID = "aliketools:";

	public AlikeToolsCompact() {
		MineAndSlashAPI.addCompatibleItem(MODID + "redstonesword",
				new ConfigItem().setType(Sword.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "netherbricksword",
				new ConfigItem().setType(Sword.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "obsidiansword",
				new ConfigItem().setType(Sword.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "emeraldsword",
				new ConfigItem().setType(Sword.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "quartzsword",
				new ConfigItem().setType(Sword.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "lapissword",
				new ConfigItem().setType(Sword.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "redstonehelmet",
				new ConfigItem().setType(PlateHelmet.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "netherbrickhelmet",
				new ConfigItem().setType(PlateHelmet.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "obsidianhelmet",
				new ConfigItem().setType(PlateHelmet.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "emeraldhelmet",
				new ConfigItem().setType(PlateHelmet.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "quartzhelmet",
				new ConfigItem().setType(PlateHelmet.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "lapishelmet",
				new ConfigItem().setType(PlateHelmet.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "redstonechestplate",
				new ConfigItem().setType(PlateChest.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "netherbrickchestplate",
				new ConfigItem().setType(PlateChest.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "obsidianchestplate",
				new ConfigItem().setType(PlateChest.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "emeraldchestplate",
				new ConfigItem().setType(PlateChest.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "quartzchestplate",
				new ConfigItem().setType(PlateChest.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "lapischestplate",
				new ConfigItem().setType(PlateChest.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "redstoneleggings",
				new ConfigItem().setType(PlatePants.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "netherbrickleggings",
				new ConfigItem().setType(PlatePants.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "obsidianleggings",
				new ConfigItem().setType(PlatePants.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "emeraldleggings",
				new ConfigItem().setType(PlatePants.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "quartzleggings",
				new ConfigItem().setType(PlatePants.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "lapisleggings",
				new ConfigItem().setType(PlatePants.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "redstoneboots",
				new ConfigItem().setType(PlateBoots.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "netherbrickboots",
				new ConfigItem().setType(PlateBoots.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "obsidianboots",
				new ConfigItem().setType(PlateBoots.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "emeraldboots",
				new ConfigItem().setType(PlateBoots.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "quartzboots",
				new ConfigItem().setType(PlateBoots.INSTANCE).setSalvagable(true));
		MineAndSlashAPI.addCompatibleItem(MODID + "lapisboots",
				new ConfigItem().setType(PlateBoots.INSTANCE).setSalvagable(true));
	}

}