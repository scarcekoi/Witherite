package net.fennec.witherite.item;

import net.fennec.witherite.Witherite;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Witherite.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Witherite.LOGGER.info("Registering Mod Items for " + Witherite.MOD_ID);
    };
}
