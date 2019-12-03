package com.azure.azurecompat.util;

import com.robertx22.api.MineAndSlashAPI;
import com.robertx22.config.non_mine_items.ConfigItem;
import com.robertx22.database.gearitemslots.Axe;
import com.robertx22.database.gearitemslots.Hammer;
import com.robertx22.database.gearitemslots.Staff;
import com.robertx22.database.gearitemslots.Sword;

public class HeroicArmoryCompat {

	public String MODID = "heroicarmory:";

	public HeroicArmoryCompat() {
		MineAndSlashAPI.addCompatibleItem(MODID + "terrariapalmwoodsword",
				new ConfigItem().setType(new Sword()).setMaxLevel(10).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "terrariaborealwoodsword",
				new ConfigItem().setType(new Sword()).setMaxLevel(10).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "terrariashadewoodsword",
				new ConfigItem().setType(new Sword()).setMinLevel(20).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "terrariaebonwoodsword",
				new ConfigItem().setType(new Sword()).setMinLevel(20).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "terrariacoppershortsword",
				new ConfigItem().setType(new Sword()).setMinLevel(20).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "terrariacopperbroadsword",
				new ConfigItem().setType(new Sword()).setMinLevel(20).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "terrariatinshortsword",
				new ConfigItem().setType(new Sword()).setMinLevel(20).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "terrariatinbroadsword",
				new ConfigItem().setType(new Sword()).setMinLevel(20).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "terrarialeadshortsword",
				new ConfigItem().setType(new Sword()).setMinLevel(20).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "terrarialeadbroadsword",
				new ConfigItem().setType(new Sword()).setMinLevel(20).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "terrariaspear", new ConfigItem().setType(new Axe()).setMinLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "terrariaironshortsword",
				new ConfigItem().setType(new Sword()).setMinLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "terrariaironbroadsword",
				new ConfigItem().setType(new Sword()).setMinLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "terrariasilverbroadsword",
				new ConfigItem().setType(new Sword()).setMinLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "terrariasilvershortsword",
				new ConfigItem().setType(new Sword()).setMinLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "terrariagoldshortsword",
				new ConfigItem().setType(new Sword()).setMinLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "terrariagoldbroadsword",
				new ConfigItem().setType(new Sword()).setMinLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "terrariatungstenbroadsword",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "terrariatungstenshortsword",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "terrariaplatinumshortsword",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "terrariaplatinumbroadsword",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "terrariamandibleblade",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "terrariakatana",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "terrariaexoticschimtar",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "terrariamuramasa",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "terrariafalconblade",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "terrariabladeofgrass",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "terrariafierygreatsword",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "terrariabonesword",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "terrariabloodbutcherer",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "terrariaenchantedsword",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "terrariastarfury",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "terrariabeekeeper",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "terrariaiceblade",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "terrarianightedge",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "terrariaarkhalis",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "terrariatrident",
				new ConfigItem().setType(new Axe()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "terrariatherottedfork",
				new ConfigItem().setType(new Axe()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "terrariawhitephaseblade",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "terrariayellowphaseblade",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "terrariapurplephaseblade",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "terrariagreenphaseblade",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "terrariaredphaseblade",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "terrariabluephaseblade",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "terrarialightbane",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "terrariadarklance",
				new ConfigItem().setType(new Axe()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "terrariapurpleclubberfish",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "terrariacactussword",
				new ConfigItem().setType(new Sword()).setMinLevel(20).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "terrariaswordfish",
				new ConfigItem().setType(new Sword()).setMinLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "mhchickendecapitator",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "mhgolemblade",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "mhdefender", new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "mhblackbeltblade",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "mhwailingcleaver",
				new ConfigItem().setType(new Hammer()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "mhgaelicflame",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "mhbonekatana",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "mhhellishslasher",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "mhcentenariandagger",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "mhwyvernbladeblood",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "mhwyvernbladeholly",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "mhwyvernbladepale",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "mhwyvernbladeazure",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "mhwyvernbladeleaf",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "mhrathalosflamesword",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "swyellowlightsaber",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "swgreenlightsaber",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "swbluelightsaber",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "swredlightsaber",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "swmacewindulightsaber",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "swtheinquisitorlightsaber",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "swdarthmaullightsaber",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "swquigonjinnlightsaber",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "skyloren_lightsaber",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "swcountdookulightsaber",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "internetdemonoidpitchfork",
				new ConfigItem().setType(new Axe()).setMinLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "nhmagicbane", new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "nhathame", new ConfigItem().setType(new Sword()).setMinLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "nhgraywandir",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "nhsilversaber",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "abcexcalibur",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "mythdeathscythe",
				new ConfigItem().setType(new Axe()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "bayonettashuraba",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "bayonettaangelslayer",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "gowleviathanupgraded",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "gowleviathan",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "gowbladeofolympus",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "gowbladeofchaos",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "myththedevilpitchfork",
				new ConfigItem().setType(new Hammer()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "skyrimironsword",
				new ConfigItem().setType(new Sword()).setMinLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "skyrimsteelsword",
				new ConfigItem().setType(new Sword()).setMinLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "skyrimorcishsword",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "skyrimdwarvensword",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "skyrimelvensword",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "skyrimglasssword",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "skyrimebonysword",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "skyrimdaedricsword",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "skyrimdragonbonesword",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "skyrimimperialsword",
				new ConfigItem().setType(new Sword()).setMinLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "skyrimdawnbreaker",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "skyrimancientnordsword",
				new ConfigItem().setType(new Sword()).setMinLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "skyrimchillrend",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "skyrimebonyblade",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "fechromfalchion",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "fefalchion", new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "khkeyblade", new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "bleachzabimaru",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "bleachzangestsu",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "dsgreatswordofartorias",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "dsgreatlordgreatsword",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "dsastoragreatsword",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "dszweilhander",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "kirbykirbyultrasword",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "kirbykirbysword",
				new ConfigItem().setType(new Sword()).setMinLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "pkmnhonedgeshiny",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "pkmnhonedge", new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "dmcredqueen", new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "dmcrebellion",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "dmcyamato", new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "lotrmorgulblade",
				new ConfigItem().setType(new Sword()).setMinLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "lotrsting", new ConfigItem().setType(new Sword()).setMinLevel(20).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "lotrglamdring",
				new ConfigItem().setType(new Sword()).setMinLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "lotranduril", new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "lotrnarsil", new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "lotrsauronmace",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "lotrwitchkingsword",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "scbluecrystalrod", new ConfigItem().setType(new Staff()).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "lozmastersword",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "lozmasterswordii",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "loztemperedsword",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "lozmasterswordiii",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "lozgoldensword",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "lozflameblade",
				new ConfigItem().setType(new Sword()).setMinLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "lozdarknutsword",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "lozghirahimsword",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "lozfiercedietysword",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "lozphantomganonsword",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "lozultimatesword",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "lozroyalguardsword",
				new ConfigItem().setType(new Sword()).setMinLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "lozmagicswordconcept",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "lozmagicsword",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "lozwhitesword",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "lozwhiteswordconcept",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "lozpicoriblade",
				new ConfigItem().setType(new Sword()).setMinLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "lozrazorsword",
				new ConfigItem().setType(new Sword()).setMinLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "lozzeldasword",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "lozbokostick",
				new ConfigItem().setType(new Sword()).setMinLevel(10).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "lozcaneofbyrna",
				new ConfigItem().setType(new Sword()).setMinLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "lozkokiriswordmm",
				new ConfigItem().setType(new Sword()).setMinLevel(20).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "lozkokiriswordott",
				new ConfigItem().setType(new Sword()).setMinLevel(20).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "lozdemisesword",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "lozgaintknife",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "lozbiggoronsword",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "lozgreatfairysword",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "lozgoddesswhitesword",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "lozgoddesssword",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "lozgildedsword",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "lozspikedbokoclub",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "lozbokoclub", new ConfigItem().setType(new Sword()).setMinLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "atjakesword", new ConfigItem().setType(new Sword()).setMinLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "atcrystalsword",
				new ConfigItem().setType(new Sword()).setMinLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "atnothung", new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "atfinnsword", new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "atswordofthedead",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "atwishstarsword",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "atfightkingsword",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "atrootsword", new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "atscarlet", new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "atgrasssword",
				new ConfigItem().setType(new Sword()).setMinLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "atdemonbloodsword",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "ffcaladbolg", new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "ffbustersword",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "ffthemasamune",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "scfirange", new ConfigItem().setType(new Sword()).setMinLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "scerlangblade",
				new ConfigItem().setType(new Sword()).setMinLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "scestoc", new ConfigItem().setType(new Sword()).setMinLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "scphlegathon",
				new ConfigItem().setType(new Sword()).setMinLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "scacheron", new ConfigItem().setType(new Sword()).setMinLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "scepee", new ConfigItem().setType(new Sword()).setMinLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "scestoc", new ConfigItem().setType(new Sword()).setMinLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "scflambert2p",
				new ConfigItem().setType(new Sword()).setMinLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "sccocytus", new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "scsouledgenightmare",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "scphlegathon",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "sclethe", new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "scqueenguard",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "scholyantler",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "screiterpallasch",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "scflambert", new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "scfireblade", new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "scxisword", new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "scomegasword2p",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "scomegasword",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "scorichalcum",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "scstiletto", new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "screquiem", new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "scfaust", new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "scflamberge", new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "scsteelpaddle",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "scglam", new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "scgreatblade",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "rotmgswordofthecolossus",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "rotmgcrystalsword",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "rotmgpixieenchantedsword",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "rotmgswordofacclaim",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "rotmgdemonblade",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "rotmgswordofthemadgod",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "rotmgindomptable",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "rotmgpiratekingcutlass",
				new ConfigItem().setType(new Sword()).setMinLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "rotmgswordofsplendor",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "rotmgskysplittersword",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "rotmgarchonsword",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "rotmganicentstonesword",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "rotmgdragonsoulsword",
				new ConfigItem().setType(new Sword()).setMinLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "rotmgravenheartsword",
				new ConfigItem().setType(new Sword()).setMinLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "rsgranitelongsword",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "rsgranitemaul",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "rseldermaul", new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "rstoktzxilak",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "rszamorakgodsword",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "rsbandosgodsword",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "rsarmadylgodsword",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "rssaradomingodsword",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "rswolfsbane", new ConfigItem().setType(new Sword()).setMinLevel(20).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "rsbarrelchestanchor",
				new ConfigItem().setType(new Axe()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "rsbronzesword",
				new ConfigItem().setType(new Sword()).setMinLevel(20).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "rsironsword", new ConfigItem().setType(new Sword()).setMinLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "rssteelsword",
				new ConfigItem().setType(new Sword()).setMinLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "rsblacksword",
				new ConfigItem().setType(new Sword()).setMinLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "rswhitesword",
				new ConfigItem().setType(new Sword()).setMinLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "rsmithrilsword",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "rsadamantsword",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "rsrunesword", new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "rsdragonsword",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "rsbronzemace",
				new ConfigItem().setType(new Sword()).setMinLevel(20).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "rsironmace", new ConfigItem().setType(new Sword()).setMinLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "rssteelmace", new ConfigItem().setType(new Sword()).setMinLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "rsblackmace", new ConfigItem().setType(new Sword()).setMinLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "rswhitemace", new ConfigItem().setType(new Sword()).setMinLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "rsmithrilmace",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "rsadamantmace",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "rsrunemace", new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "rsbronzescimitar",
				new ConfigItem().setType(new Sword()).setMinLevel(20).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "rsironscimitar",
				new ConfigItem().setType(new Sword()).setMinLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "rssteelscimitar",
				new ConfigItem().setType(new Sword()).setMinLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "rsblackscimitar",
				new ConfigItem().setType(new Sword()).setMinLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "rswhitescimitar",
				new ConfigItem().setType(new Sword()).setMinLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "rsmithrilscimitar",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "rsadamantscimitar",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "rsrunescimitar",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "rsdragonscimitar",
				new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "lotrgimlibattleaxe",
				new ConfigItem().setType(new Axe()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "lotrgimlilongaxe",
				new ConfigItem().setType(new Axe()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "ataxebass", new ConfigItem().setType(new Axe()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "rsbronzebattleaxe",
				new ConfigItem().setType(new Axe()).setMinLevel(20).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "rsironbattleaxe",
				new ConfigItem().setType(new Axe()).setMinLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "rssteelbattleaxe",
				new ConfigItem().setType(new Axe()).setMinLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "rsblackbattleaxe",
				new ConfigItem().setType(new Axe()).setMinLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "rswhitebattleaxe",
				new ConfigItem().setType(new Axe()).setMinLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "rsmithrilbattleaxe",
				new ConfigItem().setType(new Axe()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "rsadamantbattleaxe",
				new ConfigItem().setType(new Axe()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "rsrunebattleaxe",
				new ConfigItem().setType(new Axe()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "rsdragonbattleaxe",
				new ConfigItem().setType(new Axe()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "lozmegatonhammer",
				new ConfigItem().setType(new Hammer()).setMinLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "scwarhammer",
				new ConfigItem().setType(new Hammer()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "sckalutues", new ConfigItem().setType(new Axe()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "rsbronzewarhammer",
				new ConfigItem().setType(new Hammer()).setMinLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "rsironwarhammer",
				new ConfigItem().setType(new Hammer()).setMinLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "rssteelwarhammer",
				new ConfigItem().setType(new Hammer()).setMinLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "rsblackwarhammer",
				new ConfigItem().setType(new Hammer()).setMinLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "rswhitewarhammer",
				new ConfigItem().setType(new Hammer()).setMinLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "rsmithrilwarhammer",
				new ConfigItem().setType(new Hammer()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "rsadamantwarhammer",
				new ConfigItem().setType(new Hammer()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "rsrunewarhammer",
				new ConfigItem().setType(new Hammer()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "rsgranitehammer",
				new ConfigItem().setType(new Hammer()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "skyrimironhammer",
				new ConfigItem().setType(new Hammer()).setMinLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "skyrimsteelwarhammer",
				new ConfigItem().setType(new Hammer()).setMinLevel(30).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "skyrimorcishwarhammer",
				new ConfigItem().setType(new Hammer()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "skyrimdwarvenwarhammer",
				new ConfigItem().setType(new Hammer()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "skyrimelvenwarhammer",
				new ConfigItem().setType(new Hammer()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "skyrimglasswarhammer",
				new ConfigItem().setType(new Hammer()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "skyrimebonywarhammer",
				new ConfigItem().setType(new Hammer()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "skyrimdaedricwarhammer",
				new ConfigItem().setType(new Hammer()).setMinLevel(50).setdropsAsLoot(false));
		MineAndSlashAPI.addCompatibleItem(MODID + "skyrimdragonbonewarhammer",
				new ConfigItem().setType(new Hammer()).setMinLevel(50).setdropsAsLoot(false));
	}
}