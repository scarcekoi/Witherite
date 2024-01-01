package net.fennec.witherite.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fennec.witherite.Witherite;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class ModItems {

    public static final Item WITHERITE_INGOT = registerItem("witherite_ingot",
            new Item(new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item WITHERITE_NUGGET = registerItem("witherite_nugget",
            new Item(new FabricItemSettings().fireproof().rarity(Rarity.UNCOMMON)));
    public static final Item WITHERITE_SWORD = registerItem("witherite_sword",
            new SwordItem(ModToolMaterial.WITHERITE, 3, -3f, new FabricItemSettings().fireproof().rarity(Rarity.RARE)));
    public static final Item WITHERITE_PICKAXE = registerItem("witherite_pickaxe",
            new PickaxeItem(ModToolMaterial.WITHERITE, 3, -3f, new FabricItemSettings().fireproof().rarity(Rarity.RARE)));
    public static final Item WITHERITE_AXE = registerItem("witherite_axe",
            new AxeItem(ModToolMaterial.WITHERITE, 3, -3f, new FabricItemSettings().fireproof().rarity(Rarity.RARE)));
    public static final Item WITHERITE_SHOVEL = registerItem("witherite_shovel",
            new ShovelItem(ModToolMaterial.WITHERITE, 1.5f, -3f, new FabricItemSettings().fireproof().rarity(Rarity.RARE)));
    public static final Item WITHERITE_HOE = registerItem("witherite_hoe",
            new HoeItem(ModToolMaterial.WITHERITE, 1, -3f, new FabricItemSettings().fireproof().rarity(Rarity.RARE)));
    public static final Item WITHERITE_HELMET = registerItem("witherite_helmet",
            new ArmorItem(ModArmorMaterials.WITHERITE, ArmorItem.Type.HELMET, new FabricItemSettings().fireproof().rarity(Rarity.RARE)));
    public static final Item WITHERITE_CHESTPLATE = registerItem("witherite_chestplate",
            new ArmorItem(ModArmorMaterials.WITHERITE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().fireproof().rarity(Rarity.RARE)));
    public static final Item WITHERITE_LEGGINGS = registerItem("witherite_leggings",
            new ArmorItem(ModArmorMaterials.WITHERITE, ArmorItem.Type.LEGGINGS, new FabricItemSettings().fireproof().rarity(Rarity.RARE)));
    public static final Item WITHERITE_BOOTS = registerItem("witherite_boots",
            new ArmorItem(ModArmorMaterials.WITHERITE, ArmorItem.Type.BOOTS, new FabricItemSettings().fireproof().rarity(Rarity.RARE)));
    public static final Item WEAK_WITHERITE_HELMET = registerItem("weak_witherite_helmet",
            new ArmorItem(ModArmorMaterials.WEAK_WITHERITE, ArmorItem.Type.HELMET, new FabricItemSettings().fireproof().rarity(Rarity.UNCOMMON)));
    public static final Item WEAK_WITHERITE_CHESTPLATE = registerItem("weak_witherite_chestplate",
            new ArmorItem(ModArmorMaterials.WEAK_WITHERITE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().fireproof().rarity(Rarity.UNCOMMON)));
    public static final Item WEAK_WITHERITE_LEGGINGS = registerItem("weak_witherite_leggings",
            new ArmorItem(ModArmorMaterials.WEAK_WITHERITE, ArmorItem.Type.LEGGINGS, new FabricItemSettings().fireproof().rarity(Rarity.UNCOMMON)));
    public static final Item WEAK_WITHERITE_BOOTS = registerItem("weak_witherite_boots",
            new ArmorItem(ModArmorMaterials.WEAK_WITHERITE, ArmorItem.Type.BOOTS, new FabricItemSettings().fireproof().rarity(Rarity.UNCOMMON)));

    private static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries) {
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Witherite.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Witherite.LOGGER.info("Registering Mod Items for " + Witherite.MOD_ID);
    };
}
