package net.fennec.witherite.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.fennec.witherite.item.ModItems;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.WITHERITE_HELMET, ModItems.WITHERITE_CHESTPLATE, ModItems.WITHERITE_LEGGINGS, ModItems.WITHERITE_BOOTS,
                        ModItems.WEAK_WITHERITE_HELMET, ModItems.WEAK_WITHERITE_CHESTPLATE, ModItems.WEAK_WITHERITE_LEGGINGS, ModItems.WEAK_WITHERITE_BOOTS);
    }
}