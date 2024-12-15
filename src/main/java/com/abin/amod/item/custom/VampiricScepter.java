package com.abin.amod.item.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;

public class VampiricScepter extends Item {
    public VampiricScepter(Settings settings) {
        super(settings);
    }
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        StatusEffectInstance effect = new StatusEffectInstance(StatusEffects.INSTANT_HEALTH,1, 0);
        attacker.addStatusEffect(effect);
        return false;
    }
}
