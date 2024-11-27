package com.abin.amod.item.custom;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class Hub extends Item {
    public Hub(Settings settings) {
        super(settings);
    }
    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand){
        ItemStack itemStack = user.getStackInHand(hand);
        BlockPos pos = user.getBlockPos();
        BlockPos spawnPoint = world.getSpawnPos();

        user.teleport(spawnPoint.getX(),spawnPoint.getY(),spawnPoint.getZ(),true);

        if(world.isClient) {


        }
        return TypedActionResult.success(itemStack);
    }
}

