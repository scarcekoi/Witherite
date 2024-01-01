package net.fennec.witherite.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fennec.witherite.Witherite;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup WITHERITE = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Witherite.MOD_ID, "witherite"), FabricItemGroup.builder().displayName(Text.translatable("itemgroup.witherite"))
                    .icon(() -> new ItemStack(ModItems.WITHERITE_INGOT)).entries((displayContext, entries) -> {
                        entries.add(ModItems.WITHERITE_APPLE);
                        entries.add(ModItems.WITHERITE_INGOT);
                        entries.add(ModItems.WITHERITE_NUGGET);
                        entries.add(ModItems.WITHERITE_SWORD);
                        entries.add(ModItems.WITHERITE_PICKAXE);
                        entries.add(ModItems.WITHERITE_AXE);
                        entries.add(ModItems.WITHERITE_SHOVEL);
                        entries.add(ModItems.WITHERITE_HOE);
                        entries.add(ModItems.WITHERITE_HELMET);
                        entries.add(ModItems.WITHERITE_CHESTPLATE);
                        entries.add(ModItems.WITHERITE_LEGGINGS);
                        entries.add(ModItems.WITHERITE_BOOTS);
                        entries.add(ModItems.WEAK_WITHERITE_HELMET);
                        entries.add(ModItems.WEAK_WITHERITE_CHESTPLATE);
                        entries.add(ModItems.WEAK_WITHERITE_LEGGINGS);
                        entries.add(ModItems.WEAK_WITHERITE_BOOTS);
                    }).build());

    public static void registerItemGroups() {
        Witherite.LOGGER.info("Registering Item Groups for " + Witherite.MOD_ID);
    }
}
