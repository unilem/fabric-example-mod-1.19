package net.ylem.tutorialmod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "tutorialmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static final RAW_TANZANITE RAW_TANZANITE = Registry.register(Registries.ITEM, new Identifier(MOD_ID, "raw_tanzanite"), new RAW_TANZANITE(new FabricItemSettings()));
	public static final TANZANITE TANZANITE = Registry.register(Registries.ITEM, new Identifier(MOD_ID, "tanzanite"), new TANZANITE(new FabricItemSettings()));
	private static final ItemGroup ITEM_GROUP = FabricItemGroup.builder(new Identifier(MOD_ID, "tutorial_group")).icon(() -> new ItemStack(RAW_TANZANITE)).build();

	@Override
	public void onInitialize() {
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(content -> {content.addAfter(Items.RAW_GOLD, RAW_TANZANITE);});
		ItemGroupEvents.modifyEntriesEvent(ITEM_GROUP).register(content -> {content.add(RAW_TANZANITE);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(content -> {content.addAfter(Items.DIAMOND, TANZANITE);});
		ItemGroupEvents.modifyEntriesEvent(ITEM_GROUP).register(content -> {content.add(TANZANITE);});
	}
}
