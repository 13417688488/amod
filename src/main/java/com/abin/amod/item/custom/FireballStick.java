package com.abin.amod.item.custom;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LightningEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.FireballEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.explosion.Explosion;

public class FireballStick extends Item {
    public FireballStick(Settings settings) {
        super(settings);
    }
    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {

        // Ensure we don't spawn the lightning only on the client.
        // This is to prevent desync.
        if (world.isClient) {
            return TypedActionResult.pass(user.getStackInHand(hand));
        }

        BlockPos frontOfPlayer = user.getBlockPos().offset(user.getHorizontalFacing(), 2);

        // Spawn the lightning bolt.

        FireballEntity fireballEntity = new FireballEntity(EntityType.FIREBALL, world);

        fireballEntity.setPosition(frontOfPlayer.toCenterPos());
        world.spawnEntity(fireballEntity);

        // Nothing has changed to the item stack,
        // so we just return it how it was.
        return TypedActionResult.success(user.getStackInHand(hand));
    }
}
