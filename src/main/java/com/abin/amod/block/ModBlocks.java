package com.abin.amod.block;

import com.abin.amod.AMod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.AbstractRailBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static Block B_BLOCK = register("b_block", new Block(AbstractBlock.Settings.create().strength(3.0f,3.0f)));


    public static void registerBlocksItems(String id, Block block) {
        Item item = Registry.register(Registries.ITEM, Identifier.of(AMod.MOD_ID, id), new BlockItem(block, new Item.Settings()));
        if (item instanceof BlockItem) {
            ((BlockItem) item).appendBlocks(Item.BLOCK_ITEMS, item);
        }
    }
    public static Block register(String id, Block block) {
        registerBlocksItems(id, block);
        return Registry.register(Registries.BLOCK, Identifier.of(AMod.MOD_ID, id), block);
    }
    public static void registerModBlocks() {
        AMod.LOGGER.info("Registering ModBlocks for " + AMod.MOD_ID);
    }
}

