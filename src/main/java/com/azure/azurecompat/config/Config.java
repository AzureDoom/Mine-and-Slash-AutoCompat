package com.azure.azurecompat.config;

import java.io.File;

import org.apache.commons.lang3.tuple.Pair;

import com.azure.azurecompat.AzureCompat;
import com.electronwill.nightconfig.core.file.CommentedFileConfig;
import com.electronwill.nightconfig.core.io.WritingMode;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.common.ForgeConfigSpec.BooleanValue;

public class Config {

	public static final ServerConfig SERVER;
	public static final ForgeConfigSpec SERVER_SPEC;

	static {
		final Pair<ServerConfig, ForgeConfigSpec> specPair = new ForgeConfigSpec.Builder().configure(ServerConfig::new);
		SERVER_SPEC = specPair.getRight();
		SERVER = specPair.getLeft();
	}

	public static class ServerConfig {
		public final BooleanValue USE_COMPATIBILITY_ON_WYRMROOST_ITEMS;
		public final BooleanValue USE_COMPATIBILITY_ON_ENIGMATICLEGACY_ITEMS;
		public final BooleanValue USE_COMPATIBILITY_ON_FORBIDDENARCANUS_ITEMS;
		public final BooleanValue USE_COMPATIBILITY_ON_BLUEPOWER_ITEMS;
		public final BooleanValue USE_COMPATIBILITY_ON_NETHERCRAFT_ITEMS;
		public final BooleanValue USE_COMPATIBILITY_ON_MINECOLONIES_ITEMS;
		public final BooleanValue USE_COMPATIBILITY_ON_VANILLA_ITEMS;
		public final BooleanValue USE_COMPATIBILITY_ON_PLANTTECH2_ITEMS;
		public final BooleanValue USE_COMPATIBILITY_ON_THEONEPROBE_ITEMS;
		public final BooleanValue USE_COMPATIBILITY_ON_RESTRICTIONS_ITEMS;
		public final BooleanValue USE_COMPATIBILITY_ON_SIMPLEDIVEGEAR_ITEMS;
		public final BooleanValue USE_COMPATIBILITY_ON_LONGFALLBOOTS_ITEMS;
		public final BooleanValue USE_COMPATIBILITY_ON_SOLARGENERATION_ITEMS;
		public final BooleanValue USE_COMPATIBILITY_ON_BETTERANIMALSPLUS_ITEMS;
		public final BooleanValue USE_COMPATIBILITY_ON_COMPACTED_ITEMS;
		public final BooleanValue USE_COMPATIBILITY_ON_GEMSPLUSPLUS_ITEMS;
		public final BooleanValue USE_COMPATIBILITY_ON_ORESABOVEDIAMONDS_ITEMS;
		public final BooleanValue USE_COMPATIBILITY_ON_COMBAT_ITEMS;
		public final BooleanValue USE_COMPATIBILITY_ON_MYSTICALWORLD_ITEMS;
		public final BooleanValue USE_COMPATIBILITY_ON_QUARK_ITEMS;
		public final BooleanValue USE_COMPATIBILITY_ON_GOBBER_ITEMS;
		public final BooleanValue USE_COMPATIBILITY_ON_TOFUCRAFT_ITEMS;
		public final BooleanValue USE_COMPATIBILITY_ON_POLYORES_ITEMS;
		public final BooleanValue USE_COMPATIBILITY_ON_AQUACULTURE_ITEMS;
		public final BooleanValue USE_COMPATIBILITY_ON_SPARTANSHIELDS_ITEMS;
		public final BooleanValue USE_COMPATIBILITY_ON_GOODNIGHTSLEEP_ITEMS;
		public final BooleanValue USE_COMPATIBILITY_ON_CLOUDBOOTS_ITEMS;
		public final BooleanValue USE_COMPATIBILITY_ON_FUNITEMSMOD_ITEMS;
		public final BooleanValue USE_COMPATIBILITY_ON_TETRA_ITEMS;
		public final BooleanValue USE_COMPATIBILITY_ON_EXPLORERCRAFT_ITEMS;
		public final BooleanValue USE_COMPATIBILITY_ON_CRAFTHUNT_ITEMS;
		public final BooleanValue USE_COMPATIBILITY_ON_ALIKETOOLS_ITEMS;
		public final BooleanValue USE_COMPATIBILITY_ON_ILIKEWOOD_ITEMS;
		public final BooleanValue USE_COMPATIBILITY_ON_BOUNTIFULBAUBLES_ITEMS;
		public final BooleanValue USE_COMPATIBILITY_ON_DRUIDCRAFT_ITEMS;
		public final BooleanValue USE_COMPATIBILITY_ON_WITHERSKELETONTWEAKS_ITEMS;
		public final BooleanValue USE_COMPATIBILITY_ON_XERCA_ITEMS;
		public final BooleanValue USE_COMPATIBILITY_ON_SWITCHBOW_ITEMS;
		public final BooleanValue USE_COMPATIBILITY_ON_EXTRABOWS_ITEMS;
		public final BooleanValue USE_COMPATIBILITY_ON_CYCLIC_ITEMS;
		public final BooleanValue USE_COMPATIBILITY_ON_ESSENTIALFEATURES_ITEMS;
		public final BooleanValue USE_COMPATIBILITY_ON_UNSTABLETOOLS_ITEMS;
		public final BooleanValue USE_COMPATIBILITY_ON_MIDNIGHT_ITEMS;
		public final BooleanValue USE_COMPATIBILITY_ON_FARLANDERS_ITEMS;
		public final BooleanValue USE_COMPATIBILITY_ON_MUBBLE_ITEMS;
		public final BooleanValue USE_COMPATIBILITY_ON_LUCKYORES_ITEMS;
		public final BooleanValue USE_COMPATIBILITY_ON_REDISCOVERED_ITEMS;
		public final BooleanValue USE_COMPATIBILITY_ON_EASYSTEEL_ITEMS;
		public final BooleanValue USE_COMPATIBILITY_ON_USELESSSWORD_ITEMS;
		public final BooleanValue USE_COMPATIBILITY_ON_YOYOS_ITEMS;
		public final BooleanValue USE_COMPATIBILITY_ON_UNDERWATERBIOME_ITEMS;
		public final BooleanValue USE_COMPATIBILITY_ON_PATTYSMORETOOLS_ITEMS;
		public final BooleanValue USE_COMPATIBILITY_ON_PATTYSMORESTUFF_ITEMS;
		public final BooleanValue USE_COMPATIBILITY_ON_PATTYSMOREARMOR_ITEMS;
		public final BooleanValue USE_COMPATIBILITY_ON_RAYSDONGLES_ITEMS;
		public final BooleanValue USE_COMPATIBILITY_ON_MOREPROGRESSION_ITEMS;
		public final BooleanValue USE_COMPATIBILITY_ON_MUTANTBEASTS_ITEMS;
		public final BooleanValue USE_COMPATIBILITY_ON_ENDERGETIC_ITEMS;
		public final BooleanValue USE_COMPATIBILITY_ON_SKELETONLAMPS_ITEMS;
		public final BooleanValue USE_COMPATIBILITY_ON_VANILLATWEAKS_ITEMS;
		public final BooleanValue USE_COMPATIBILITY_ON_POWDERPOWER_ITEMS;
		public final BooleanValue USE_COMPATIBILITY_ON_LYCANITESMOBS_ITEMS;
		public final BooleanValue USE_COMPATIBILITY_ON_PROJECTE_ITEMS;
		public final BooleanValue USE_COMPATIBILITY_ON_MUSKETMOD_ITEMS;
		public final BooleanValue USE_COMPATIBILITY_ON_EXTRAENRICHMENTS_ITEMS;
		public final BooleanValue USE_COMPATIBILITY_ON_MODERNITY_ITEMS;
		public final BooleanValue USE_COMPATIBILITY_ON_GAMISMOD_ITEMS;
		public final BooleanValue USE_COMPATIBILITY_ON_BOTANIA_ITEMS;
		public final BooleanValue USE_COMPATIBILITY_ON_VAMPIRIS_ITEMS;
		public final BooleanValue USE_COMPATIBILITY_ON_STATUES_ITEMS;
		public final BooleanValue USE_COMPATIBILITY_ON_GAIADIMENSION_ITEMS;

		ServerConfig(ForgeConfigSpec.Builder builder) {
			builder.push("COMPATIBLITY");

			USE_COMPATIBILITY_ON_STATUES_ITEMS = builder.comment(
					"Turns on Auto Compatibility for Statues to get Mine and Slash stats. Turn off to configure yourself")
					.translation("azurecompat.config.use_compatibility_on_statues_items")
					.define("USE_COMPATIBILITY_ON_STATUES_ITEMS", true);

			USE_COMPATIBILITY_ON_GAIADIMENSION_ITEMS = builder.comment(
					"Turns on Auto Compatibility for Gaia Dimension to get Mine and Slash stats. Turn off to configure yourself")
					.translation("azurecompat.config.use_compatibility_on_gaiadimension_items")
					.define("USE_COMPATIBILITY_ON_GAIADIMENSION_ITEMS", true);

			USE_COMPATIBILITY_ON_VAMPIRIS_ITEMS = builder.comment(
					"Turns on Auto Compatibility for Vampirism to get Mine and Slash stats. Turn off to configure yourself")
					.translation("azurecompat.config.use_compatibility_on_vampirism_items")
					.define("USE_COMPATIBILITY_ON_VAMPIRIS_ITEMS", true);

			USE_COMPATIBILITY_ON_BOTANIA_ITEMS = builder.comment(
					"Turns on Auto Compatibility for Botania to get Mine and Slash stats. Turn off to configure yourself")
					.translation("azurecompat.config.use_compatibility_on_botania_items")
					.define("USE_COMPATIBILITY_ON_BOTANIA_ITEMS", true);

			USE_COMPATIBILITY_ON_GAMISMOD_ITEMS = builder.comment(
					"Turns on Auto Compatibility for Gami's Mod to get Mine and Slash stats. Turn off to configure yourself")
					.translation("azurecompat.config.use_compatibility_on_gamismod_items")
					.define("USE_COMPATIBILITY_ON_GAMISMOD_ITEMS", true);

			USE_COMPATIBILITY_ON_MUSKETMOD_ITEMS = builder.comment(
					"Turns on Auto Compatibility for Musket Mod to get Mine and Slash stats. Turn off to configure yourself")
					.translation("azurecompat.config.use_compatibility_on_musketmod_items")
					.define("USE_COMPATIBILITY_ON_MUSKETMOD_ITEMS", true);

			USE_COMPATIBILITY_ON_EXTRAENRICHMENTS_ITEMS = builder.comment(
					"Turns on Auto Compatibility for Extra Enrichments to get Mine and Slash stats. Turn off to configure yourself")
					.translation("azurecompat.config.use_compatibility_on_extraenrichments_items")
					.define("USE_COMPATIBILITY_ON_EXTRAENRICHMENTS_ITEMS", true);

			USE_COMPATIBILITY_ON_MODERNITY_ITEMS = builder.comment(
					"Turns on Auto Compatibility for Modernity to get Mine and Slash stats. Turn off to configure yourself")
					.translation("azurecompat.config.use_compatibility_on_modernity_items")
					.define("USE_COMPATIBILITY_ON_MODERNITY_ITEMS", true);

			USE_COMPATIBILITY_ON_PROJECTE_ITEMS = builder.comment(
					"Turns on Auto Compatibility for Project E to get Mine and Slash stats. Turn off to configure yourself")
					.translation("azurecompat.config.use_compatibility_on_projecte_items")
					.define("USE_COMPATIBILITY_ON_PROJECTE_ITEMS", true);

			USE_COMPATIBILITY_ON_WYRMROOST_ITEMS = builder.comment(
					"Turns on Auto Compatibility for Wyrmroost to get Mine and Slash stats. Turn off to configure yourself")
					.translation("azurecompat.config.use_compatibility_on_wyrmroost_items")
					.define("USE_COMPATIBILITY_ON_WYRMROOST_ITEMS", true);

			USE_COMPATIBILITY_ON_LYCANITESMOBS_ITEMS = builder.comment(
					"Turns on Auto Compatibility for Lycanites Mobs to get Mine and Slash stats. Turn off to configure yourself")
					.translation("azurecompat.config.use_compatibility_on_lycanitesmobs_items")
					.define("USE_COMPATIBILITY_ON_LYCANITESMOBS_ITEMS", true);

			USE_COMPATIBILITY_ON_POWDERPOWER_ITEMS = builder.comment(
					"Turns on Auto Compatibility for Powder Power to get Mine and Slash stats. Turn off to configure yourself")
					.translation("azurecompat.config.use_compatibility_on_powderpower_items")
					.define("USE_COMPATIBILITY_ON_POWDERPOWER_ITEMS", true);

			USE_COMPATIBILITY_ON_VANILLATWEAKS_ITEMS = builder.comment(
					"Turns on Auto Compatibility for Vanilla Tweaks to get Mine and Slash stats. Turn off to configure yourself")
					.translation("azurecompat.config.use_compatibility_on_vanillatweaks_items")
					.define("USE_COMPATIBILITY_ON_VANILLATWEAKS_ITEMS", true);

			USE_COMPATIBILITY_ON_SKELETONLAMPS_ITEMS = builder.comment(
					"Turns on Auto Compatibility for Skeleton Lamps to get Mine and Slash stats. Turn off to configure yourself")
					.translation("azurecompat.config.use_compatibility_on_skeletonlamps_items")
					.define("USE_COMPATIBILITY_ON_SKELETONLAMPS_ITEMS", true);

			USE_COMPATIBILITY_ON_UNDERWATERBIOME_ITEMS = builder.comment(
					"Turns on Auto Compatibility for Underwater Biome to get Mine and Slash stats. Turn off to configure yourself")
					.translation("azurecompat.config.use_compatibility_on_yoyos_items")
					.define("USE_COMPATIBILITY_ON_UNDERWATERBIOME_ITEMS", true);

			USE_COMPATIBILITY_ON_MUTANTBEASTS_ITEMS = builder.comment(
					"Turns on Auto Compatibility for Mutant Beasts to get Mine and Slash stats. Turn off to configure yourself")
					.translation("azurecompat.config.use_compatibility_on_mutantbeasts_items")
					.define("USE_COMPATIBILITY_ON_MUTANTBEASTS_ITEMS", true);

			USE_COMPATIBILITY_ON_ENDERGETIC_ITEMS = builder.comment(
					"Turns on Auto Compatibility for Endergetic to get Mine and Slash stats. Turn off to configure yourself")
					.translation("azurecompat.config.use_compatibility_on_endergetic_items")
					.define("USE_COMPATIBILITY_ON_ENDERGETIC_ITEMS", true);

			USE_COMPATIBILITY_ON_PATTYSMORETOOLS_ITEMS = builder.comment(
					"Turns on Auto Compatibility for Patty's More Tools to get Mine and Slash stats. Turn off to configure yourself")
					.translation("azurecompat.config.use_compatibility_on_pattysmoretools_items")
					.define("USE_COMPATIBILITY_ON_PATTYSMORETOOLS_ITEMS", true);

			USE_COMPATIBILITY_ON_PATTYSMORESTUFF_ITEMS = builder.comment(
					"Turns on Auto Compatibility for Patty's More Stuff to get Mine and Slash stats. Turn off to configure yourself")
					.translation("azurecompat.config.use_compatibility_on_pattysmorestuff_items")
					.define("USE_COMPATIBILITY_ON_PATTYSMORESTUFF_ITEMS", true);

			USE_COMPATIBILITY_ON_PATTYSMOREARMOR_ITEMS = builder.comment(
					"Turns on Auto Compatibility for Patty's More Armor to get Mine and Slash stats. Turn off to configure yourself")
					.translation("azurecompat.config.use_compatibility_on_pattysmorearmor_items")
					.define("USE_COMPATIBILITY_ON_PATTYSMOREARMOR_ITEMS", true);

			USE_COMPATIBILITY_ON_RAYSDONGLES_ITEMS = builder.comment(
					"Turns on Auto Compatibility for Ray's Dongles to get Mine and Slash stats. Turn off to configure yourself")
					.translation("azurecompat.config.use_compatibility_on_raysdongles_items")
					.define("USE_COMPATIBILITY_ON_RAYSDONGLES_ITEMS", true);

			USE_COMPATIBILITY_ON_MOREPROGRESSION_ITEMS = builder.comment(
					"Turns on Auto Compatibility for More Progression to get Mine and Slash stats. Turn off to configure yourself")
					.translation("azurecompat.config.use_compatibility_on_moreprogression_items")
					.define("USE_COMPATIBILITY_ON_MOREPROGRESSION_ITEMS", true);

			USE_COMPATIBILITY_ON_YOYOS_ITEMS = builder.comment(
					"Turns on Auto Compatibility for Yoyos to get Mine and Slash stats. Turn off to configure yourself")
					.translation("azurecompat.config.use_compatibility_on_yoyos_items")
					.define("USE_COMPATIBILITY_ON_YOYOS_ITEMS", true);

			USE_COMPATIBILITY_ON_LUCKYORES_ITEMS = builder.comment(
					"Turns on Auto Compatibility for LuckyOres to get Mine and Slash stats. Turn off to configure yourself")
					.translation("azurecompat.config.use_compatibility_on_luckyores_items")
					.define("USE_COMPATIBILITY_ON_LUCKYORES_ITEMS", true);

			USE_COMPATIBILITY_ON_EASYSTEEL_ITEMS = builder.comment(
					"Turns on Auto Compatibility for Easy Steel to get Mine and Slash stats. Turn off to configure yourself")
					.translation("azurecompat.config.use_compatibility_on_easysteel_items")
					.define("USE_COMPATIBILITY_ON_EASYSTEEL_ITEMS", true);

			USE_COMPATIBILITY_ON_USELESSSWORD_ITEMS = builder.comment(
					"Turns on Auto Compatibility for Useless Sword to get Mine and Slash stats. Turn off to configure yourself")
					.translation("azurecompat.config.use_compatibility_on_uselesssword_items")
					.define("USE_COMPATIBILITY_ON_USELESSSWORD_ITEMS", true);

			USE_COMPATIBILITY_ON_REDISCOVERED_ITEMS = builder.comment(
					"Turns on Auto Compatibility for Rediscovered to get Mine and Slash stats. Turn off to configure yourself")
					.translation("azurecompat.config.use_compatibility_on_rediscovered_items")
					.define("USE_COMPATIBILITY_ON_REDISCOVERED_ITEMS", true);

			USE_COMPATIBILITY_ON_MUBBLE_ITEMS = builder.comment(
					"Turns on Auto Compatibility for Mubble to get Mine and Slash stats. Turn off to configure yourself")
					.translation("azurecompat.config.use_compatibility_on_mubble_items")
					.define("USE_COMPATIBILITY_ON_MUBBLE_ITEMS", true);

			USE_COMPATIBILITY_ON_FARLANDERS_ITEMS = builder.comment(
					"Turns on Auto Compatibility for Farlanders to get Mine and Slash stats. Turn off to configure yourself")
					.translation("azurecompat.config.use_compatibility_on_farlanders_items")
					.define("USE_COMPATIBILITY_ON_FARLANDERS_ITEMS", true);

			USE_COMPATIBILITY_ON_SWITCHBOW_ITEMS = builder.comment(
					"Turns on Auto Compatibility for Switch Bow to get Mine and Slash stats. Turn off to configure yourself")
					.translation("azurecompat.config.use_compatibility_on_switchbow_items")
					.define("USE_COMPATIBILITY_ON_SWITCHBOW_ITEMS", true);

			USE_COMPATIBILITY_ON_EXTRABOWS_ITEMS = builder.comment(
					"Turns on Auto Compatibility for Extra Bows to get Mine and Slash stats. Turn off to configure yourself")
					.translation("azurecompat.config.use_compatibility_on_extrabows_items")
					.define("USE_COMPATIBILITY_ON_EXTRABOWS_ITEMS", true);

			USE_COMPATIBILITY_ON_CYCLIC_ITEMS = builder.comment(
					"Turns on Auto Compatibility for Cyclic to get Mine and Slash stats. Turn off to configure yourself")
					.translation("azurecompat.config.use_compatibility_on_wyrmroost_items")
					.define("USE_COMPATIBILITY_ON_CYCLIC_ITEMS", true);

			USE_COMPATIBILITY_ON_ESSENTIALFEATURES_ITEMS = builder.comment(
					"Turns on Auto Compatibility for Essential Features to get Mine and Slash stats. Turn off to configure yourself")
					.translation("azurecompat.config.use_compatibility_on_essentialfeatures_items")
					.define("USE_COMPATIBILITY_ON_ESSENTIALFEATURES_ITEMS", true);

			USE_COMPATIBILITY_ON_UNSTABLETOOLS_ITEMS = builder.comment(
					"Turns on Auto Compatibility for Unstable Tools to get Mine and Slash stats. Turn off to configure yourself")
					.translation("azurecompat.config.use_compatibility_on_unstabletools_items")
					.define("USE_COMPATIBILITY_ON_UNSTABLETOOLS_ITEMS", true);

			USE_COMPATIBILITY_ON_MIDNIGHT_ITEMS = builder.comment(
					"Turns on Auto Compatibility for Midnight items to get Mine and Slash stats. Turn off to configure yourself")
					.translation("azurecompat.config.use_compatibility_on_midnight_items")
					.define("USE_COMPATIBILITY_ON_MIDNIGHT_ITEMS", true);

			USE_COMPATIBILITY_ON_ILIKEWOOD_ITEMS = builder.comment(
					"Turns on Auto Compatibility for ILikeWood Mod to get Mine and Slash stats. Turn off to configure yourself")
					.translation("azurecompat.config.use_compatibility_on_ilikewood_items")
					.define("USE_COMPATIBILITY_ON_ILIKEWOOD_ITEMS", true);

			USE_COMPATIBILITY_ON_WITHERSKELETONTWEAKS_ITEMS = builder.comment(
					"Turns on Auto Compatibility for Wither Skelton Tweaks to get Mine and Slash stats. Turn off to configure yourself")
					.translation("azurecompat.config.use_compatibility_on_witherskeletontweaks_items")
					.define("USE_COMPATIBILITY_ON_WITHERSKELETONTWEAKS_ITEMS", true);

			USE_COMPATIBILITY_ON_XERCA_ITEMS = builder.comment(
					"Turns on Auto Compatibility for XercaMod to get Mine and Slash stats. Turn off to configure yourself")
					.translation("azurecompat.config.use_compatibility_on_xercamod_items")
					.define("USE_COMPATIBILITY_ON_XERCA_ITEMS", true);

			USE_COMPATIBILITY_ON_BOUNTIFULBAUBLES_ITEMS = builder.comment(
					"Turns on Auto Compatibility for Bountiful Baubles Mod to get Mine and Slash stats. Turn off to configure yourself")
					.translation("azurecompat.config.use_compatibility_on_bountifulbaubles_items")
					.define("USE_COMPATIBILITY_ON_BOUNTIFULBAUBLES_ITEMS", true);

			USE_COMPATIBILITY_ON_DRUIDCRAFT_ITEMS = builder.comment(
					"Turns on Auto Compatibility for Druidcraft Mod to get Mine and Slash stats. Turn off to configure yourself")
					.translation("azurecompat.config.use_compatibility_on_druidcraft_items")
					.define("USE_COMPATIBILITY_ON_DRUIDCRAFT_ITEMS", true);

			USE_COMPATIBILITY_ON_FUNITEMSMOD_ITEMS = builder.comment(
					"Turns on Auto Compatibility for FunItems Mod to get Mine and Slash stats. Turn off to configure yourself")
					.translation("azurecompat.config.use_compatibility_on_funitemsmod_items")
					.define("USE_COMPATIBILITY_ON_FUNITEMSMOD_ITEMS", true);

			USE_COMPATIBILITY_ON_ALIKETOOLS_ITEMS = builder.comment(
					"Turns on Auto Compatibility for AlikeTools Mod to get Mine and Slash stats. Turn off to configure yourself")
					.translation("azurecompat.config.use_compatibility_on_aliketools_items")
					.define("USE_COMPATIBILITY_ON_ALIKETOOLS_ITEMS", true);

			USE_COMPATIBILITY_ON_CRAFTHUNT_ITEMS = builder.comment(
					"Turns on Auto Compatibility for Craft and Hunt Mod to get Mine and Slash stats. Turn off to configure yourself")
					.translation("azurecompat.config.use_compatibility_on_craftandhunt_items")
					.define("USE_COMPATIBILITY_ON_CRAFTHUNT_ITEMS", true);

			USE_COMPATIBILITY_ON_TETRA_ITEMS = builder.comment(
					"Turns on Auto Compatibility for Tetra Mod to get Mine and Slash stats. Turn off to configure yourself")
					.translation("azurecompat.config.use_compatibility_on_tetra_items")
					.define("USE_COMPATIBILITY_ON_TETRA_ITEMS", true);

			USE_COMPATIBILITY_ON_EXPLORERCRAFT_ITEMS = builder.comment(
					"Turns on Auto Explorercraft for FunItems Mod to get Mine and Slash stats. Turn off to configure yourself")
					.translation("azurecompat.config.use_compatibility_on_explorercraft_items")
					.define("USE_COMPATIBILITY_ON_EXPLORERCRAFT_ITEMS", true);

			USE_COMPATIBILITY_ON_TOFUCRAFT_ITEMS = builder.comment(
					"Turns on Auto Compatibility for TofuCraft to get Mine and Slash stats. Turn off to configure yourself")
					.translation("azurecompat.config.use_compatibility_on_tofucraft_items")
					.define("USE_COMPATIBILITY_ON_TOFUCRAFT_ITEMS", true);

			USE_COMPATIBILITY_ON_GOODNIGHTSLEEP_ITEMS = builder.comment(
					"Turns on Auto Compatibility for Good Night Sleep to get Mine and Slash stats. Turn off to configure yourself")
					.translation("azurecompat.config.use_compatibility_on_goodnightsleep_items")
					.define("USE_COMPATIBILITY_ON_GOODNIGHTSLEEP_ITEMS", true);

			USE_COMPATIBILITY_ON_CLOUDBOOTS_ITEMS = builder.comment(
					"Turns on Auto Compatibility for Cloud Boots to get Mine and Slash stats. Turn off to configure yourself")
					.translation("azurecompat.config.use_compatibility_on_cloudboots_items")
					.define("USE_COMPATIBILITY_ON_CLOUDBOOTS_ITEMS", true);

			USE_COMPATIBILITY_ON_POLYORES_ITEMS = builder.comment(
					"Turns on Auto Compatibility for Poly Ores to get Mine and Slash stats. Turn off to configure yourself")
					.translation("azurecompat.config.use_compatibility_on_polyores_items")
					.define("USE_COMPATIBILITY_ON_POLYORES_ITEMS", true);

			USE_COMPATIBILITY_ON_AQUACULTURE_ITEMS = builder.comment(
					"Turns on Auto Compatibility for Aquaculture to get Mine and Slash stats. Turn off to configure yourself")
					.translation("azurecompat.config.use_compatibility_on_aquaculture_items")
					.define("USE_COMPATIBILITY_ON_AQUACULTURE_ITEMS", true);

			USE_COMPATIBILITY_ON_SPARTANSHIELDS_ITEMS = builder.comment(
					"Turns on Auto Compatibility for Spartan Shields to get Mine and Slash stats. Turn off to configure yourself")
					.translation("azurecompat.config.use_compatibility_on_spartanshields_items")
					.define("USE_COMPATIBILITY_ON_SPARTANSHIELDS_ITEMS", true);

			USE_COMPATIBILITY_ON_MYSTICALWORLD_ITEMS = builder.comment(
					"Turns on Auto Compatibility for Mystical World to get Mine and Slash stats. Turn off to configure yourself")
					.translation("azurecompat.config.use_compatibility_on_mysticalworld_items")
					.define("USE_COMPATIBILITY_ON_MYSTICALWORLD_ITEMS", true);

			USE_COMPATIBILITY_ON_GOBBER_ITEMS = builder.comment(
					"Turns on Auto Compatibility for Gobber to get Mine and Slash stats. Turn off to configure yourself")
					.translation("azurecompat.config.use_compatibility_on_gobber_items")
					.define("USE_COMPATIBILITY_ON_GOBBER_ITEMS", true);

			USE_COMPATIBILITY_ON_QUARK_ITEMS = builder.comment(
					"Turns on Auto Compatibility for Quark to get Mine and Slash stats. Turn off to configure yourself")
					.translation("azurecompat.config.use_compatibility_on_quark_items")
					.define("USE_COMPATIBILITY_ON_QUARK_ITEMS", true);

			USE_COMPATIBILITY_ON_ENIGMATICLEGACY_ITEMS = builder.comment(
					"Turns on Auto Compatibility for Enigmatic Legacy to get Mine and Slash stats. Turn off to configure yourself")
					.translation("azurecompat.config.use_compatibility_on_enigmaticlegacy_items")
					.define("USE_COMPATIBILITY_ON_ENIGMATICLEGACY_ITEMS", true);

			USE_COMPATIBILITY_ON_FORBIDDENARCANUS_ITEMS = builder.comment(
					"Turns on Auto Compatibility for Forbidden and Arcanus to get Mine and Slash stats. Turn off to configure yourself")
					.translation("azurecompat.config.use_compatibility_on_forbiddenarcanus_items")
					.define("USE_COMPATIBILITY_ON_FORBIDDENARCANUS_ITEMS", true);

			USE_COMPATIBILITY_ON_BLUEPOWER_ITEMS = builder.comment(
					"Turns on Auto Compatibility for Blue Power to get Mine and Slash stats. Turn off to configure yourself")
					.translation("azurecompat.config.use_compatibility_on_bluepower_items")
					.define("USE_COMPATIBILITY_ON_BLUEPOWER_ITEMS", true);

			USE_COMPATIBILITY_ON_NETHERCRAFT_ITEMS = builder.comment(
					"Turns on Auto Compatibility for Nethercraft to get Mine and Slash stats. Turn off to configure yourself")
					.translation("azurecompat.config.use_compatibility_on_nethercraft_items")
					.define("USE_COMPATIBILITY_ON_NETHERCRAFT_ITEMS", true);

			USE_COMPATIBILITY_ON_MINECOLONIES_ITEMS = builder.comment(
					"Turns on Auto Compatibility for Minecolonies to get Mine and Slash stats. Turn off to configure yourself")
					.translation("azurecompat.config.use_compatibility_on_minecolonies_items")
					.define("USE_COMPATIBILITY_ON_MINECOLONIES_ITEMS", true);

			USE_COMPATIBILITY_ON_PLANTTECH2_ITEMS = builder.comment(
					"Turns on Auto Compatibility for PlantTech2 to get Mine and Slash stats. Turn off to configure yourself")
					.translation("azurecompat.config.use_compatibility_on_planttech2_items")
					.define("USE_COMPATIBILITY_ON_PLANTTECH2_ITEMS", true);

			USE_COMPATIBILITY_ON_THEONEPROBE_ITEMS = builder.comment(
					"Turns on Auto Compatibility for The One Probe to get Mine and Slash stats. Turn off to configure yourself")
					.translation("azurecompat.config.use_compatibility_on_theoneprobe_items")
					.define("USE_COMPATIBILITY_ON_THEONEPROBE_ITEMS", true);

			USE_COMPATIBILITY_ON_RESTRICTIONS_ITEMS = builder.comment(
					"Turns on Auto Compatibility for Restrictions to get Mine and Slash stats. Turn off to configure yourself")
					.translation("azurecompat.config.use_compatibility_on_restrictions_items")
					.define("USE_COMPATIBILITY_ON_RESTRICTIONS_ITEMS", true);

			USE_COMPATIBILITY_ON_SIMPLEDIVEGEAR_ITEMS = builder.comment(
					"Turns on Auto Compatibility for Simple Dive Gear to get Mine and Slash stats. Turn off to configure yourself")
					.translation("azurecompat.config.use_compatibility_on_simpledivegear_items")
					.define("USE_COMPATIBILITY_ON_SIMPLEDIVEGEAR_ITEMS", true);

			USE_COMPATIBILITY_ON_LONGFALLBOOTS_ITEMS = builder.comment(
					"Turns on Auto Compatibility for Long Fall Boots to get Mine and Slash stats. Turn off to configure yourself")
					.translation("azurecompat.config.use_compatibility_on_longfallboots_items")
					.define("USE_COMPATIBILITY_ON_LONGFALLBOOTS_ITEMS", true);

			USE_COMPATIBILITY_ON_SOLARGENERATION_ITEMS = builder.comment(
					"Turns on Auto Compatibility for Solar Generation to get Mine and Slash stats. Turn off to configure yourself")
					.translation("azurecompat.config.use_compatibility_on_solargeneration_items")
					.define("USE_COMPATIBILITY_ON_SOLARGENERATION_ITEMS", true);

			USE_COMPATIBILITY_ON_VANILLA_ITEMS = builder.comment(
					"Turns on Auto Compatibility for Vanilla Gear to get Mine and Slash stats. Turn off to configure yourself")
					.translation("azurecompat.config.use_compatibility_on_vanilla_items")
					.define("USE_COMPATIBILITY_ON_VANILLA_ITEMS", true);

			USE_COMPATIBILITY_ON_BETTERANIMALSPLUS_ITEMS = builder.comment(
					"Turns on Auto Compatibility for Better Animals Plus to get Mine and Slash stats. Turn off to configure yourself")
					.translation("azurecompat.config.use_compatibility_on_betteranimalsplus_items")
					.define("USE_COMPATIBILITY_ON_BETTERANIMALSPLUS_ITEMS", true);

			USE_COMPATIBILITY_ON_COMPACTED_ITEMS = builder.comment(
					"Turns on Auto Compatibility for Compacted to get Mine and Slash stats. Turn off to configure yourself")
					.translation("azurecompat.config.use_compatibility_on_compacted_items")
					.define("USE_COMPATIBILITY_ON_COMPACTED_ITEMS", true);

			USE_COMPATIBILITY_ON_GEMSPLUSPLUS_ITEMS = builder.comment(
					"Turns on Auto Compatibility for GemsPlusPlus to get Mine and Slash stats. Turn off to configure yourself")
					.translation("azurecompat.config.use_compatibility_on_gemsplusplus_items")
					.define("USE_COMPATIBILITY_ON_GEMSPLUSPLUS_ITEMS", true);

			USE_COMPATIBILITY_ON_ORESABOVEDIAMONDS_ITEMS = builder.comment(
					"Turns on Auto Compatibility for Ores Above Diamonds to get Mine and Slash stats. Turn off to configure yourself")
					.translation("azurecompat.config.use_compatibility_on_oresabovediamond_items")
					.define("USE_COMPATIBILITY_ON_ORESABOVEDIAMONDS_ITEMS", true);

			USE_COMPATIBILITY_ON_COMBAT_ITEMS = builder.comment(
					"Turns on Auto Compatibility for C.O.M.B.A.T to get Mine and Slash stats. Turn off to configure yourself")
					.translation("azurecompat.config.use_compatibility_on_combat_items")
					.define("USE_COMPATIBILITY_ON_COMBAT_ITEMS", true);

			builder.pop();
		}
	}

	public static void loadConfig(ForgeConfigSpec config, String path) {
		AzureCompat.LOGGER.info("Loading config: " + path);
		final CommentedFileConfig file = CommentedFileConfig.builder(new File(path)).sync().autosave()
				.writingMode(WritingMode.REPLACE).build();
		AzureCompat.LOGGER.info("Built config: " + path);
		file.load();
		AzureCompat.LOGGER.info("Loaded config: " + path);
		config.setConfig(file);
	}

}
