package com.abin.amod.item;

import com.abin.amod.AMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;



public class ModItems {

    public static final Item A = registerItems("a", new Item(new Item.Settings()));




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
