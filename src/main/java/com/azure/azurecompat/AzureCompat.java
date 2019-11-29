package com.azure.azurecompat;

import com.azure.azurecompat.config.ModConfig;
import com.azure.azurecompat.util.Aether2Compat;
import com.azure.azurecompat.util.AetherLegacyCompat;
import com.azure.azurecompat.util.AllTheSwordsCompat;
import com.azure.azurecompat.util.DalekModCompat;
import com.azure.azurecompat.util.EBWizardryCompat;
import com.azure.azurecompat.util.ExplorercraftCompat;
import com.azure.azurecompat.util.FarlandersCompat;
import com.azure.azurecompat.util.HeroicArmoryCompat;
import com.azure.azurecompat.util.IceAndFireCompat;
import com.azure.azurecompat.util.LastSwordCompat;
import com.azure.azurecompat.util.MegaLootCompat;
import com.azure.azurecompat.util.RPGInventoryCompat;
import com.azure.azurecompat.util.RandomLootCompat;
import com.azure.azurecompat.util.SkeletonLampsCompat;
import com.azure.azurecompat.util.TechRebornCompat;
import com.azure.azurecompat.util.TheBetweenlandsCompat;
import com.azure.azurecompat.util.TheEightFabledBladesCompat;
import com.azure.azurecompat.util.ThermalFoundationCompat;
import com.azure.azurecompat.util.TinkersCompat;
import com.azure.azurecompat.util.TwilightForestCompat;
import com.azure.azurecompat.util.VanillaCompat;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;

@Mod(modid = AzureCompat.MODID, version = AzureCompat.VERSION, dependencies = AzureCompat.DEPENDENCIES)
public class AzureCompat {

	public static final String MODID = "azurecompat";
	public static final String MODNAME = "Mine and Slash AutoCompat 1.12.2";
	public static final String VERSION = "1.0.1";
	public static final String DEPENDENCIES = "required:mmorpg;required:baubles";

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent e) {
		if (Loader.isModLoaded("iceandfire") && ModConfig.AUTOCOMPATIBILITY_ICEFIREITEMS) {
			MinecraftForge.EVENT_BUS.register(new IceAndFireCompat());
		}
		if (Loader.isModLoaded("ebwizardry") && ModConfig.AUTOCOMPATIBILITY_EBWIZARDRYITEMS) {
			MinecraftForge.EVENT_BUS.register(new EBWizardryCompat());
		}
		if (Loader.isModLoaded("techreborn") && ModConfig.AUTOCOMPATIBILITY_TECHREBORNITEMS) {
			MinecraftForge.EVENT_BUS.register(new TechRebornCompat());
		}
		if (Loader.isModLoaded("thermalfoundation") && ModConfig.AUTOCOMPATIBILITY_THERMALITEMS) {
			MinecraftForge.EVENT_BUS.register(new ThermalFoundationCompat());
		}
		if (Loader.isModLoaded("thedalekmod") && ModConfig.AUTOCOMPATIBILITY_DALEKMOD) {
			MinecraftForge.EVENT_BUS.register(new DalekModCompat());
		}
		if (Loader.isModLoaded("twilightforest") && ModConfig.AUTOCOMPATIBILITY_TWILIGHTFOREST) {
			MinecraftForge.EVENT_BUS.register(new TwilightForestCompat());
		}
		if (Loader.isModLoaded("farlanders") && ModConfig.AUTOCOMPATIBILITY_FARLANDERS) {
			MinecraftForge.EVENT_BUS.register(new FarlandersCompat());
		}
		if (Loader.isModLoaded("aether") && ModConfig.AUTOCOMPATIBILITY_AETHER2) {
			MinecraftForge.EVENT_BUS.register(new Aether2Compat());
		}
		if (Loader.isModLoaded("aether_legacy") && ModConfig.AUTOCOMPATIBILITY_AETHERLEGACY) {
			MinecraftForge.EVENT_BUS.register(new AetherLegacyCompat());
		}
		if (Loader.isModLoaded("thebetweenlands") && ModConfig.AUTOCOMPATIBILITY_BETWEENLANDS) {
			MinecraftForge.EVENT_BUS.register(new TheBetweenlandsCompat());
		}
		if (Loader.isModLoaded("theeightfabledblades") && ModConfig.AUTOCOMPATIBILITY_EIGHTFABLEDBLADES) {
			MinecraftForge.EVENT_BUS.register(new TheEightFabledBladesCompat());
		}
		if (Loader.isModLoaded("tconstruct") && ModConfig.AUTOCOMPATIBILITY_TINKERS) {
			MinecraftForge.EVENT_BUS.register(new TinkersCompat());
		}
		if (Loader.isModLoaded("rpginventory") && ModConfig.AUTOCOMPATIBILITY_RPGINVENTORY) {
			MinecraftForge.EVENT_BUS.register(new RPGInventoryCompat());
		}
		if (Loader.isModLoaded("explorercraft") && ModConfig.AUTOCOMPATIBILITY_EXPLORERCRAFT) {
			MinecraftForge.EVENT_BUS.register(new ExplorercraftCompat());
		}
		if (Loader.isModLoaded("alltheswords") && ModConfig.AUTOCOMPATIBILITY_ALLTHESWORDS) {
			MinecraftForge.EVENT_BUS.register(new AllTheSwordsCompat());
		}
		if (Loader.isModLoaded("tlsywen") && ModConfig.AUTOCOMPATIBILITY_LASTSWORD) {
			MinecraftForge.EVENT_BUS.register(new LastSwordCompat());
		}
		if (Loader.isModLoaded("megaloot") && ModConfig.AUTOCOMPATIBILITY_MEGALOOT) {
			MinecraftForge.EVENT_BUS.register(new MegaLootCompat());
		}
		if (Loader.isModLoaded("randomloot") && ModConfig.AUTOCOMPATIBILITY_RANDOMLOOT) {
			MinecraftForge.EVENT_BUS.register(new RandomLootCompat());
		}
		if (Loader.isModLoaded("heroicarmory") && ModConfig.AUTOCOMPATIBILITY_HEROICARMORY) {
			MinecraftForge.EVENT_BUS.register(new HeroicArmoryCompat());
		}
		if (Loader.isModLoaded("skltlamp") && ModConfig.AUTOCOMPATIBILITY_SKELETONLAMPS) {
			MinecraftForge.EVENT_BUS.register(new SkeletonLampsCompat());
		}
		if (ModConfig.AUTOCOMPATIBILITY_VANILLAITEMS) {
			MinecraftForge.EVENT_BUS.register(new VanillaCompat());
		}
	}
}
