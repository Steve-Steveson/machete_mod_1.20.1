package net.steveson.machetedelight.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.minecraftforge.registries.RegistryObject;
import net.steveson.machetedelight.item.ModItems;
import net.steveson.machetedelight.util.ModTags;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {

        registerMacheteCraftingRecipe(Items.GOLD_INGOT, ModItems.GOLDEN_MACHETE, consumer);
        registerMacheteCraftingRecipe(Items.IRON_INGOT, ModItems.IRON_MACHETE, consumer);
        registerMacheteCraftingRecipe(Items.DIAMOND, ModItems.DIAMOND_MACHETE, consumer);


    }

    private static void registerMacheteCraftingRecipe(ItemLike input, RegistryObject<Item> output, Consumer<FinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, output.get())
                .pattern("  #")
                .pattern(" # ")
                .pattern("S  ")
                .define('#', input)
                .define('S', ModTags.Items.STICKS)
                .unlockedBy(getHasName(input), has(input))
                .save(consumer);
    }

}
