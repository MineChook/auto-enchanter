package dev.gxlg.autoenchanter;

import net.fabricmc.api.ClientModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AutoEnchanter implements ClientModInitializer {
	public static final String MOD_ID = "auto-enchanter";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitializeClient() {
		LOGGER.info("Hello from Auto Enchanter!");
	}
}