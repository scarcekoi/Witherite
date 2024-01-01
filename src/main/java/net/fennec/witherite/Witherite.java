package net.fennec.witherite;

import net.fabricmc.api.ModInitializer;

import net.fennec.witherite.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Witherite implements ModInitializer {
	public static final String MOD_ID = "witherite";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}