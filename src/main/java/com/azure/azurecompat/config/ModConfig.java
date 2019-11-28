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

	@Config.Name("Enable Vanilla Items Stats")
	@Config.LangKey("azurecompat.config.")
	@Config.Comment("This enables adding stats to vanilla items")
	public static boolean AUTOCOMPATIBILITY_VANILLAITEMS = true;

	@Config.Name("Enable EB Wizadry Item Stats")
	@Config.LangKey("azurecompat.config.")
	@Config.Comment("This enables adding stats to items from EB Wizardry")
	public static boolean AUTOCOMPATIBILITY_EBWIZARDRYITEMS = true;

	@Config.Name("Enable Ice and Fire Item Stats")
	@Config.LangKey("azurecompat.config.")
	@Config.Comment("This enables adding stats to items from Ice and Fire")
	public static boolean AUTOCOMPATIBILITY_ICEFIREITEMS = true;

	@Config.Name("Enable Tech Reborn Item Stats")
	@Config.LangKey("azurecompat.config.")
	@Config.Comment("This enables adding stats to items from Tech Reborn")
	public static boolean AUTOCOMPATIBILITY_TECHREBORNITEMS = true;

	@Config.Name("Enable Thermal Foundation Item Stats")
	@Config.LangKey("azurecompat.config.")
	@Config.Comment("This enables adding stats to items from Thermal Foundation")
	public static boolean AUTOCOMPATIBILITY_THERMALITEMS = true;

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
