package com.azure.azurecompat.config;

import com.azure.azurecompat.AzureCompat;

import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Config(modid = AzureCompat.MODID)
@Config.LangKey("azurecompat.config.title")
public class ModConfig {

	@Config.Name("Vanilla")
	@Config.LangKey("azurecompat.config.")
	@Config.Comment("This enables adding stats to vanilla items")
	public static boolean AUTOCOMPATIBILITY_VANILLAITEMS = true;

	@Config.Name("EB Wizadry")
	@Config.LangKey("azurecompat.config.")
	@Config.Comment("This enables adding stats to items from EB Wizardry")
	public static boolean AUTOCOMPATIBILITY_EBWIZARDRYITEMS = true;

	@Config.Name("Ice and Fire")
	@Config.LangKey("azurecompat.config.")
	@Config.Comment("This enables adding stats to items from Ice and Fire")
	public static boolean AUTOCOMPATIBILITY_ICEFIREITEMS = true;

	@Config.Name("Tech Reborn")
	@Config.LangKey("azurecompat.config.")
	@Config.Comment("This enables adding stats to items from Tech Reborn")
	public static boolean AUTOCOMPATIBILITY_TECHREBORNITEMS = true;

	@Config.Name("Thermal Foundation")
	@Config.LangKey("azurecompat.config.")
	@Config.Comment("This enables adding stats to items from Thermal Foundation")
	public static boolean AUTOCOMPATIBILITY_THERMALITEMS = true;

	@Config.Name("The Dalek Mod")
	@Config.LangKey("azurecompat.config.")
	@Config.Comment("This enables adding stats to items from The Dalek Mod")
	public static boolean AUTOCOMPATIBILITY_DALEKMOD = true;

	@Config.Name("Twilight Forest")
	@Config.LangKey("azurecompat.config.")
	@Config.Comment("This enables adding stats to items from Twilight Forest")
	public static boolean AUTOCOMPATIBILITY_TWILIGHTFOREST = true;

	@Config.Name("Farlanders")
	@Config.LangKey("azurecompat.config.")
	@Config.Comment("This enables adding stats to items from The Farlanders")
	public static boolean AUTOCOMPATIBILITY_FARLANDERS = true;

	@Config.Name("Aether 2")
	@Config.LangKey("azurecompat.config.")
	@Config.Comment("This enables adding stats to items from Aether 2")
	public static boolean AUTOCOMPATIBILITY_AETHER2 = true;

	@Config.Name("Aether Legacy")
	@Config.LangKey("azurecompat.config.")
	@Config.Comment("This enables adding stats to items from Aether Legacy")
	public static boolean AUTOCOMPATIBILITY_AETHERLEGACY = true;

	@Config.Name("The Betweenlands")
	@Config.LangKey("azurecompat.config.")
	@Config.Comment("This enables adding stats to items from The Betweenlands")
	public static boolean AUTOCOMPATIBILITY_BETWEENLANDS = true;

	@Config.Name("The Eight Fabled Blades")
	@Config.LangKey("azurecompat.config.")
	@Config.Comment("This enables adding stats to items from The Eight Fabled Blades")
	public static boolean AUTOCOMPATIBILITY_EIGHTFABLEDBLADES = true;

	@Config.Name("Tinkers")
	@Config.LangKey("azurecompat.config.")
	@Config.Comment("This enables adding stats to items from Tinkers")
	public static boolean AUTOCOMPATIBILITY_TINKERS = true;

	@Config.Name("RPG Inventory")
	@Config.LangKey("azurecompat.config.")
	@Config.Comment("This enables adding stats to items from RPG Inventory")
	public static boolean AUTOCOMPATIBILITY_RPGINVENTORY = true;

	@Config.Name("Explorercraft")
	@Config.LangKey("azurecompat.config.")
	@Config.Comment("This enables adding stats to items from Explorercraft")
	public static boolean AUTOCOMPATIBILITY_EXPLORERCRAFT = true;

	@Config.Name("All The Swords")
	@Config.LangKey("azurecompat.config.")
	@Config.Comment("This enables adding stats to items from All The Swords")
	public static boolean AUTOCOMPATIBILITY_ALLTHESWORDS = true;

	@Config.Name("Last Sword")
	@Config.LangKey("azurecompat.config.")
	@Config.Comment("This enables adding stats to items from The Last Sword You Will Ever Need Reboot")
	public static boolean AUTOCOMPATIBILITY_LASTSWORD = true;

	@Config.Name("Mega Loot")
	@Config.LangKey("azurecompat.config.")
	@Config.Comment("This enables adding stats to items from Mega Loot")
	public static boolean AUTOCOMPATIBILITY_MEGALOOT = true;

	@Config.Name("Random Loot Mod")
	@Config.LangKey("azurecompat.config.")
	@Config.Comment("This enables adding stats to items from Random Loot Mod")
	public static boolean AUTOCOMPATIBILITY_RANDOMLOOT = true;

	@Config.Name("Heroic Armory")
	@Config.LangKey("azurecompat.config.")
	@Config.Comment("This enables adding stats to items from Heroic Armory")
	public static boolean AUTOCOMPATIBILITY_HEROICARMORY = true;

	@Config.Name("Skeleton Lamps")
	@Config.LangKey("azurecompat.config.")
	@Config.Comment("This enables adding stats to items from Skeleton Lamps")
	public static boolean AUTOCOMPATIBILITY_SKELETONLAMPS = true;

	@Config.Name("Wings")
	@Config.LangKey("azurecompat.config.")
	@Config.Comment("This enables adding stats to items from Wings")
	public static boolean AUTOCOMPATIBILITY_WINGS = true;

	@Config.Name("Oh The Biomes Youll Go")
	@Config.LangKey("azurecompat.config.")
	@Config.Comment("This enables adding stats to items from Oh The Biomes Youll Go")
	public static boolean AUTOCOMPATIBILITY_BIOMESYOULLGO = true;

	@Config.Name("Spartan Shields")
	@Config.LangKey("azurecompat.config.")
	@Config.Comment("This enables adding stats to items from Spartan Shields")
	public static boolean AUTOCOMPATIBILITY_SPARTANSHIELDS = true;

	@Config.Name("Spartan Weaponry")
	@Config.LangKey("azurecompat.config.")
	@Config.Comment("This enables adding stats to items from Spartan Weaponry")
	public static boolean AUTOCOMPATIBILITY_SPARTANWEAPONRY = true;

	@Config.Name("Lycanites Mobs")
	@Config.LangKey("azurecompat.config.")
	@Config.Comment("This enables adding stats to items from Lycanites Mobs")
	public static boolean AUTOCOMPATIBILITY_LYCANITESMOBS = true;

	@Mod.EventBusSubscriber(modid = AzureCompat.MODID)
	private static class EventHandler {

		@SubscribeEvent
		public static void onConfigChanged(final ConfigChangedEvent.OnConfigChangedEvent event) {
			if (event.getModID().equals(AzureCompat.MODID)) {
				ConfigManager.sync(AzureCompat.MODID, Config.Type.INSTANCE);
			}
		}
	}
}
