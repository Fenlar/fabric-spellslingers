package net.exxude.spellslingers.item;

import net.exxude.spellslingers.Spellslingers;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item HANDGUN_BASIC = registerItem("handgun_basic",
            new Item(new FabricItemSettings().group(ModItemGroup.SPELLSLINGERS_WEAPONS)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Spellslingers.MOD_ID, name), item);
    }
    public static void registerModItems() {
        Spellslingers.LOGGER.info("Registering Mod Items for " + Spellslingers.MOD_ID);
    }


}
