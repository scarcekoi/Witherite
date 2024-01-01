package net.fennec.witherite.util;

import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.fennec.witherite.item.ModItems;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;

public class ModLootTableModifiers {

    private static final Identifier ENDER_DRAGON_ID =
            new Identifier("minecraft", "entities/ender_dragon");
    private static final Identifier BASTION_TREASURE_ID =
            new Identifier("minecraft", "chests/bastion_treasure");
    private static final Identifier BASTION_OTHER_ID =
            new Identifier("minecraft", "chests/bastion_other");
    private static final Identifier BASTION_HOGLIN_STABLE_ID =
            new Identifier("minecraft", "chests/bastion_hoglin_stable");
    private static final Identifier BASTION_BRIDGE_ID =
            new Identifier("minecraft", "chests/bastion_bridge");

    public static void modifyLootTables() {
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if(ENDER_DRAGON_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(1f))
                        .with(ItemEntry.builder(ModItems.WITHERITE_INGOT))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 6.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }

            if(BASTION_TREASURE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.25f))
                        .with(ItemEntry.builder(ModItems.WITHERITE_NUGGET))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 18f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if(BASTION_OTHER_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.25f))
                        .with(ItemEntry.builder(ModItems.WITHERITE_NUGGET))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 18f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if(BASTION_HOGLIN_STABLE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.25f))
                        .with(ItemEntry.builder(ModItems.WITHERITE_NUGGET))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 18f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if(BASTION_BRIDGE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.25f))
                        .with(ItemEntry.builder(ModItems.WITHERITE_NUGGET))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 18f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
        });
    }
}
