package com.abin.amod.datagen;

import com.abin.amod.AMod;
import com.abin.amod.block.ModBlocks;
import com.abin.amod.item.ModItems;
import com.abin.amod.tags.ModItemTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.RecipeProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.item.MinecartItem;
import net.minecraft.recipe.CampfireCookingRecipe;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipesProvider extends FabricRecipeProvider {

    private static final List<ItemConvertible> ICE_ETHER = List.of(ModItems.A, Items.ICE);

    public ModRecipesProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        offerSmelting(exporter, ICE_ETHER, RecipeCategory.MISC, Items.GOLDEN_APPLE,
                0.7f, 200, "a_group");
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.B_BLOCK,3)
                .pattern(" # ")
                .pattern("###")
                .pattern(" # ")
                .input('#', Ingredient.ofItems(Items.DIRT))
                .criterion("has_item", RecipeProvider.conditionsFromItem(Items.DIRT))
                .offerTo(exporter, Identifier.of(AMod.MOD_ID, "b_block"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.A, 3)
                .input(Items.SUGAR)
                .input(Items.REDSTONE)
                .criterion("has_item", RecipeProvider.conditionsFromItem(Items.SUGAR))
                .criterion("has_item", RecipeProvider.conditionsFromItem(Items.REDSTONE))
                .offerTo(exporter, Identifier.of(AMod.MOD_ID, "a"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Items.SUGAR,3)
                .pattern("###")
                .input('#', ModItemTags.SUGAR_TAG)
                .criterion("has_item", RecipeProvider.conditionsFromItem(Items.BEETROOT))
                .offerTo(exporter, Identifier.of(AMod.MOD_ID, "beetroot_to_sugar"));
    }
}
