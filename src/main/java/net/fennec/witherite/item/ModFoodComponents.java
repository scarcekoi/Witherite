package net.fennec.witherite.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent WITHERITE_APPLE = new FoodComponent.Builder()
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 1, 400), 0.50f)
            .alwaysEdible()
            .hunger(10)
            .build();

}
