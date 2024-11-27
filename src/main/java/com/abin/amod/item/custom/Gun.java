package com.abin.amod.item.custom;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BowItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.ActionResult;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;


public class Gun extends Item {
    public Gun(Settings settings) {
        super(settings);
    }
    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        BlockPos pos =context.getBlockPos();
        PlayerEntity player = context.getPlayer();
        World world = context.getWorld();
        if(world.isClient) {
            world.createExplosion(null,pos.getX(),pos.getY(),pos.getZ(),10.0f, World.ExplosionSourceType.MOB);
            world.createExplosion(null,pos.getX(),pos.getY(),pos.getZ(),10.0f, World.ExplosionSourceType.MOB);
            world.createExplosion(null,pos.getX(),pos.getY(),pos.getZ(),10.0f, World.ExplosionSourceType.MOB);


        }
        return ActionResult.SUCCESS;
    }
}
