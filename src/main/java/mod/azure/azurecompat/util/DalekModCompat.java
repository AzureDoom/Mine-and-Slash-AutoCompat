package mod.azure.azurecompat.util;

import java.util.List;

import com.google.common.collect.ImmutableList;
import com.robertx22.api.MineAndSlashAPI;
import com.robertx22.config.non_mine_items.ConfigItem;
import com.robertx22.database.gearitemslots.Axe;
import com.robertx22.database.gearitemslots.Boots;
import com.robertx22.database.gearitemslots.Bow;
import com.robertx22.database.gearitemslots.Chest;
import com.robertx22.database.gearitemslots.Helmet;
import com.robertx22.database.gearitemslots.Pants;
import com.robertx22.database.gearitemslots.Staff;
import com.robertx22.database.gearitemslots.Sword;

public class DalekModCompat {

	private static final List<String> GUN = ImmutableList.of("i50aplauncher", "gun_vector", "alphameson",
			"timelord_rifle", "dalek_weapon", "railgun", "cyborg_hand", "iunit_gun", "iunit_pistol", "10s_water_pistol",
			"cyber_gun", "fob_gun", "river_song_revolver", "unit_rpg", "taser", "ak_47", "gauss_rifle", "gun_m16");

	public String MODID = "thedalekmod:";

	public DalekModCompat() {
		MineAndSlashAPI.addCompatibleItem(MODID + "adric_star",
				new ConfigItem().setType(new Chest()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "unit_badge",
				new ConfigItem().setType(new Chest()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "unit_badge_2",
				new ConfigItem().setType(new Chest()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "bowtie",
				new ConfigItem().setType(new Chest()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "sonicshades",
				new ConfigItem().setType(new Helmet()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "isantahat",
				new ConfigItem().setType(new Helmet()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "blackglasses",
				new ConfigItem().setType(new Helmet()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "3dglasses",
				new ConfigItem().setType(new Helmet()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "fez_alt",
				new ConfigItem().setType(new Helmet()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "fez", new ConfigItem().setType(new Helmet()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "gasmask",
				new ConfigItem().setType(new Helmet()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "hat7th",
				new ConfigItem().setType(new Helmet()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "drark",
				new ConfigItem().setType(new Helmet()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "tophat",
				new ConfigItem().setType(new Helmet()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "stetson",
				new ConfigItem().setType(new Helmet()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "drspace_0",
				new ConfigItem().setType(new Helmet()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "hat4th",
				new ConfigItem().setType(new Helmet()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "nasasuit_0",
				new ConfigItem().setType(new Helmet()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "orangesuit_0",
				new ConfigItem().setType(new Helmet()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "swdsuit_0",
				new ConfigItem().setType(new Helmet()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "ihatbase",
				new ConfigItem().setType(new Helmet()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "nasasuit_1",
				new ConfigItem().setType(new Chest()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "orangesuit_1",
				new ConfigItem().setType(new Chest()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "swdsuit_1",
				new ConfigItem().setType(new Chest()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "nasasuit_2",
				new ConfigItem().setType(new Boots()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "orangesuit_2",
				new ConfigItem().setType(new Boots()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "swdsuit_2",
				new ConfigItem().setType(new Boots()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "nasasuit_3",
				new ConfigItem().setType(new Pants()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "orangesuit_3",
				new ConfigItem().setType(new Pants()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "swdsuit_3",
				new ConfigItem().setType(new Pants()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "drspace_1",
				new ConfigItem().setType(new Chest()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "drspace_2",
				new ConfigItem().setType(new Boots()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "drspace_3",
				new ConfigItem().setType(new Pants()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "4thscarf",
				new ConfigItem().setType(new Chest()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "drcloak",
				new ConfigItem().setType(new Chest()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "colin_coat",
				new ConfigItem().setType(new Chest()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "acejacket",
				new ConfigItem().setType(new Chest()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "fur_coat",
				new ConfigItem().setType(new Chest()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "dalekaniumarmor_0", new ConfigItem().setType(new Helmet())
				.setMaxRarity(2).setAlwaysNormal().setMaxLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "dalekaniumarmor_1", new ConfigItem().setType(new Chest())
				.setMaxRarity(2).setAlwaysNormal().setMaxLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "dalekaniumarmor_2", new ConfigItem().setType(new Boots())
				.setMaxRarity(2).setAlwaysNormal().setMaxLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "dalekaniumarmor_3", new ConfigItem().setType(new Pants())
				.setMaxRarity(2).setAlwaysNormal().setMaxLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "steelarmor_0", new ConfigItem().setType(new Helmet()).setMaxRarity(2)
				.setAlwaysNormal().setMaxLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "steelarmor_1", new ConfigItem().setType(new Chest()).setMaxRarity(2)
				.setAlwaysNormal().setMaxLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "steelarmor_2", new ConfigItem().setType(new Boots()).setMaxRarity(2)
				.setAlwaysNormal().setMaxLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "steelarmor_3", new ConfigItem().setType(new Pants()).setMaxRarity(2)
				.setAlwaysNormal().setMaxLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "doctorspoon", new ConfigItem().setType(new Sword()).setMaxRarity(1)
				.setAlwaysNormal().setMaxLevel(20).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "brasssword", new ConfigItem().setType(new Sword()).setMaxRarity(2)
				.setAlwaysNormal().setMaxLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "dalekaniumsword", new ConfigItem().setType(new Sword())
				.setMaxRarity(2).setAlwaysNormal().setMaxLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "steelsword", new ConfigItem().setType(new Sword()).setMaxRarity(2)
				.setAlwaysNormal().setMaxLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "dalekaniumbattleaxe", new ConfigItem().setType(new Axe())
				.setMaxRarity(2).setAlwaysNormal().setMaxLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "seraph_blade",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "rosalina_wand",
				new ConfigItem().setType(new Staff()).setdropsAsLoot(false));
		for (String w : GUN) {
			MineAndSlashAPI.addCompatibleItem("thedalekmod:" + w,
					new ConfigItem().setType(new Bow()).setdropsAsLoot(false));
		}
	}
}