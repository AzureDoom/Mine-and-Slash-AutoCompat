package mod.azure.azurecompat;

import com.robertx22.api.MineAndSlashAPI;
import com.robertx22.config.non_mine_items.ConfigItem;
import com.robertx22.database.gearitemslots.Sword;

import mod.azure.azurecompat.config.ModConfig;
import mod.azure.azurecompat.util.Aether2Compat;
import mod.azure.azurecompat.util.AetherLegacyCompat;
import mod.azure.azurecompat.util.AllTheSwordsCompat;
import mod.azure.azurecompat.util.BiomesYoullGoCompat;
import mod.azure.azurecompat.util.DalekModCompat;
import mod.azure.azurecompat.util.EBWizardryCompat;
import mod.azure.azurecompat.util.ExplorercraftCompat;
import mod.azure.azurecompat.util.FarlandersCompat;
import mod.azure.azurecompat.util.HeroicArmoryCompat;
import mod.azure.azurecompat.util.IceAndFireCompat;
import mod.azure.azurecompat.util.LastSwordCompat;
import mod.azure.azurecompat.util.LycanitesMobsCompat;
import mod.azure.azurecompat.util.MegaLootCompat;
import mod.azure.azurecompat.util.RPGInventoryCompat;
import mod.azure.azurecompat.util.RandomLootCompat;
import mod.azure.azurecompat.util.SpartanShieldsCompat;
import mod.azure.azurecompat.util.SpartanWeaponsCompat;
import mod.azure.azurecompat.util.TechRebornCompat;
import mod.azure.azurecompat.util.TheBetweenlandsCompat;
import mod.azure.azurecompat.util.TheEightFabledBladesCompat;
import mod.azure.azurecompat.util.ThermalFoundationCompat;
import mod.azure.azurecompat.util.TinkersCompat;
import mod.azure.azurecompat.util.TwilightForestCompat;
import mod.azure.azurecompat.util.VanillaCompat;
import mod.azure.azurecompat.util.WingsCompat;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;

@Mod(modid = AzureCompat.MODID, version = AzureCompat.VERSION, dependencies = AzureCompat.DEPENDENCIES)
public class AzureCompat {

	public static final String MODID = "azurecompat";
	public static final String MODNAME = "M&S Auto-Compat 1.12.2";
	public static final String VERSION = "1.0.5";
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
			MineAndSlashAPI.addCompatibleItem("skltlamp:bambooknife",
					new ConfigItem().setType(new Sword()).setMinLevel(50).setdropsAsLoot(false));
		}
		if (Loader.isModLoaded("wings") && ModConfig.AUTOCOMPATIBILITY_WINGS) {
			MinecraftForge.EVENT_BUS.register(new WingsCompat());
		}
		if (Loader.isModLoaded("byg") && ModConfig.AUTOCOMPATIBILITY_BIOMESYOULLGO) {
			MinecraftForge.EVENT_BUS.register(new BiomesYoullGoCompat());
		}
		if (Loader.isModLoaded("spartanshields") && ModConfig.AUTOCOMPATIBILITY_SPARTANSHIELDS) {
			MinecraftForge.EVENT_BUS.register(new SpartanShieldsCompat());
		}
		if (Loader.isModLoaded("spartanweaponry") && ModConfig.AUTOCOMPATIBILITY_SPARTANWEAPONRY) {
			MinecraftForge.EVENT_BUS.register(new SpartanWeaponsCompat());
		}
		if (Loader.isModLoaded("lycanitesmobs") && ModConfig.AUTOCOMPATIBILITY_LYCANITESMOBS) {
			MinecraftForge.EVENT_BUS.register(new LycanitesMobsCompat());
		}
		if (ModConfig.AUTOCOMPATIBILITY_VANILLAITEMS) {
			MinecraftForge.EVENT_BUS.register(new VanillaCompat());
		}
	}
}
