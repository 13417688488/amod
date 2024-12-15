package com.abin.amod.item.custom;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.TntEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.ArrowEntity;
import net.minecraft.entity.projectile.DragonFireballEntity;
import net.minecraft.entity.projectile.FireballEntity;
import net.minecraft.entity.projectile.thrown.EggEntity;
import net.minecraft.entity.projectile.thrown.SnowballEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.item.Items;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class MagicStick extends Item {
    public MagicStick(Settings settings) {
        super(settings);
    }
    static int x=0;

    @Override
    public ActionResult useOnBlock(ItemUsageContext context){
        BlockPos pos =context.getBlockPos();
        PlayerEntity player = context.getPlayer();
        World world = context.getWorld();
        if(Screen.hasShiftDown()){
            x++;
        }
        if(x==12){
            x = 0;
        }
        player.sendMessage(Text.of("x is " + x), true);
        return super.useOnBlock(context);
    }
    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand){
        BlockPos frontOfPlayer = user.getBlockPos().offset(user.getHorizontalFacing(), 2);
        if(x == 0){
            FireballEntity fireballEntity = new FireballEntity(EntityType.FIREBALL, world);
            fireballEntity.setPosition(frontOfPlayer.toCenterPos());
            world.spawnEntity(fireballEntity);
            fireballEntity.setVelocity(user, user.getPitch(), user.getYaw(), 0, 1.5F, 1);
        }else if(x == 2){
            SnowballEntity snowballEntity = new SnowballEntity(world, user);
            snowballEntity.setPosition(frontOfPlayer.toCenterPos());
            world.spawnEntity(snowballEntity);
            snowballEntity.setVelocity(user, user.getPitch(), user.getYaw(), 0, 1.5F, 1);
        }else if(x == 4){
            EggEntity eggEntity = new EggEntity(world, user);
            eggEntity.setPosition(frontOfPlayer.toCenterPos());
            world.spawnEntity(eggEntity);
            eggEntity.setVelocity(user, user.getPitch(), user.getYaw(), 0, 1.5F, 1);
        }else if(x == 6){
            ArrowEntity arrowEntity = new ArrowEntity(EntityType.ARROW, world);
            arrowEntity.setPosition(frontOfPlayer.toCenterPos());
            world.spawnEntity(arrowEntity);
            arrowEntity.setVelocity(user, user.getPitch(), user.getYaw(), 0, 1.5F, 1);
        }else if(x == 8){
            DragonFireballEntity dragonFireballEntity = new DragonFireballEntity(EntityType.DRAGON_FIREBALL, world);
            dragonFireballEntity.setPosition(frontOfPlayer.toCenterPos());
            world.spawnEntity(dragonFireballEntity);
            dragonFireballEntity.setVelocity(user, user.getPitch(), user.getYaw(), 0, 1.5F, 1);
        }else if(x == 10){
            TntEntity tntEntity = new TntEntity(EntityType.TNT, world);
            tntEntity.setPosition(frontOfPlayer.toCenterPos());
            world.spawnEntity(tntEntity);
            tntEntity.setVelocity(user.getVelocity());
        }
    return TypedActionResult.success(user.getStackInHand(hand));
    }

}
