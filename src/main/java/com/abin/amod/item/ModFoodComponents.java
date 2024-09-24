package com.abin.amod.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ModFoodComponents {
    public static final FoodComponent CHEESE = new FoodComponent.Builder().nutrition(8).saturationModifier(0.8f).alwaysEdible().build();
    public static final FoodComponent STRAWBERRY = new FoodComponent.Builder().nutrition(4).saturationModifier(0.6f).alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION,60),0.5f).build();
}
