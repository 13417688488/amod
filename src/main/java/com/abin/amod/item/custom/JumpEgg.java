package com.abin.amod.item.custom;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class JumpEgg extends Item{
    public JumpEgg(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand){
        ItemStack itemStack = user.getStackInHand(hand);
        BlockPos pos = user.getBlockPos();
        if(world.isClient) {
            world.createExplosion(null,pos.getX(),pos.getY(),pos.getZ(),10.0f, World.ExplosionSourceType.TNT);

        }
        return TypedActionResult.success(itemStack);
    }
}
