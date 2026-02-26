package net.fonzy.rubymod;

import net.fabricmc.api.ModInitializer;
import net.fonzy.rubymod.block.ModBlocks;
import net.fonzy.rubymod.item.ModItems;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RubyMod implements ModInitializer {
	public static final String MOD_ID = "rubymod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}