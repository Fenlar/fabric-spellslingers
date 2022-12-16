package net.exxude.spellslingers.item;

import net.exxude.spellslingers.Spellslingers;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup SPELLSLINGERS_WEAPONS = FabricItemGroupBuilder.build(new Identifier(Spellslingers.MOD_ID, "spellslingers_weapons"),
        () -> new ItemStack(ModItems.HANDGUN_BASIC));
}
