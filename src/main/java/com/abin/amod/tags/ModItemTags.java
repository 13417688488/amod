package com.abin.amod.tags;

import com.abin.amod.AMod;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModItemTags {
    public static final TagKey<Item> SUGAR_TAG = of("sugar_tag");
    private static TagKey<Item> of(String id) {
        return TagKey.of(RegistryKeys.ITEM, Identifier.of(AMod.MOD_ID, id));
    }
    public static void registerModItemTags() {
        AMod.LOGGER.info("Registering Item Tags");
    }
}
