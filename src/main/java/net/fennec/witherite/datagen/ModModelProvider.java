package net.fennec.witherite.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.fennec.witherite.item.ModItems;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.WITHERITE_APPLE, Models.GENERATED);
        itemModelGenerator.register(ModItems.WITHERITE_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.WITHERITE_NUGGET, Models.GENERATED);

        itemModelGenerator.register(ModItems.WITHERITE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.WITHERITE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.WITHERITE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.WITHERITE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.WITHERITE_HOE, Models.HANDHELD);

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.WITHERITE_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.WITHERITE_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.WITHERITE_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.WITHERITE_BOOTS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.WEAK_WITHERITE_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.WEAK_WITHERITE_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.WEAK_WITHERITE_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.WEAK_WITHERITE_BOOTS));

    }
}