package com.abin.amod.item;

import com.abin.amod.AMod;
import com.abin.amod.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup A_Group = Registry.register(Registries.ITEM_GROUP, Identifier.of(AMod.MOD_ID, "a_group"),
            ItemGroup.create(null,-1).displayName(Text.translatable("itemGroup.a_group"))
                    .icon(() -> new ItemStack(ModItems.A))
                    .entries((displayContext, entries) -> {
                            entries.add(ModItems.A);
                            entries.add(ModItems.CHEESE);
                            entries.add(ModItems.STRAWBERY);
                            entries.add(ModBlocks.B_BLOCK);
                    }).build());
    public static void registerModItemGroups() {
        AMod.LOGGER.info("Registering Mod Item Groups");
    }

}
