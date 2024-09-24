package com.abin.amod.item.custom;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class Prospector extends Item {
    public Prospector(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        BlockPos pos =context.getBlockPos();
        PlayerEntity player = context.getPlayer();
        World world = context.getWorld();

        return super.useOnBlock(context);
    }
}
