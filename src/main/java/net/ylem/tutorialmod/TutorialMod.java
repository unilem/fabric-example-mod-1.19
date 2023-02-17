package net.ylem.tutorialmod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "tutorialmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public static final Item RAW_TANZANITE = Registry.register(Registries.ITEM, new Identifier(MOD_ID, "raw_tanzanite"), new Item(new FabricItemSettings()));
	public static final Item TANZANITE = Registry.register(Registries.ITEM, new Identifier(MOD_ID, "tanzanite"), new Item(new FabricItemSettings()));

	@Override
	public void onInitialize() {

	}
}
