package net.fennec.witherite;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fennec.witherite.item.ModItemGroups;
import net.fennec.witherite.item.ModItems;
import net.fennec.witherite.util.ModLootTableModifiers;
import net.minecraft.item.ItemGroups;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Witherite implements ModInitializer {
	public static final String MOD_ID = "witherite";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();

		ModLootTableModifiers.modifyLootTables();
	}
}