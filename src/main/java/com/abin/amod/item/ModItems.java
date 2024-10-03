package com.abin.amod.item;

import com.abin.amod.AMod;
import com.abin.amod.item.custom.JumpEgg;
import com.abin.amod.item.custom.LightningStick;
import com.abin.amod.item.custom.Prospector;
import com.abin.amod.item.custom.Tnt;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;



public class ModItems {

    public static final Item A = registerItems("a", new Item(new Item.Settings()));

    public static final Item CHEESE = registerItems("cheese", new Item(new Item.Settings().food(ModFoodComponents.CHEESE)));

    public static final Item STRAWBERY = registerItems("strawberry", new Item(new Item.Settings().food(ModFoodComponents.STRAWBERRY)));

    public static final Item PROSPECTOR = registerItems("prospector", new Prospector(new Item.Settings().maxDamage(127)));

    public static final Item LIGHTNINGSTICK = registerItems("lightningstick", new LightningStick(new Item.Settings()));

    public static final Item TNT = registerItems("tnt", new Tnt(new Item.Settings()));

    public static final Item JUMPEGG = registerItems("jump_egg", new JumpEgg(new Item.Settings()));

    public static Item registerItems(String id,Item item){
        return Registry.register(Registries.ITEM, Identifier.of(AMod.MOD_ID,id),item);
    }

    private static void addItemToIG(FabricItemGroupEntries fabricItemGroupEntries){
        fabricItemGroupEntries.add(A);
    }

    public static void registerModItems() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemToIG);
        AMod.LOGGER.info("Registering Mod Items for " + AMod.MOD_ID);
    }
}
