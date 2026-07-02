package net.steveson.machetedelight.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.steveson.machetedelight.MacheteDelightMod;
import net.steveson.machetedelight.item.ModItems;
import net.steveson.machetedelight.util.ModTags;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {
    public ModItemTagGenerator(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pLookupProvider, CompletableFuture<TagLookup<Block>> pBlockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(pOutput, pLookupProvider, pBlockTags, MacheteDelightMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(ItemTags.PIGLIN_LOVED).add(
                ModItems.GOLDEN_MACHETE.get()
        );


        this.tag(ModTags.Items.MY_MACHETE).add(
                ModItems.GOLDEN_MACHETE.get(),
                ModItems.IRON_MACHETE.get(),
                ModItems.DIAMOND_MACHETE.get(),
                ModItems.NETHERITE_MACHETE.get()
        );
        this.tag(ModTags.Items.C_MACHETE).add(
                ModItems.GOLDEN_MACHETE.get(),
                ModItems.IRON_MACHETE.get(),
                ModItems.DIAMOND_MACHETE.get(),
                ModItems.NETHERITE_MACHETE.get()
        );

        this.tag(ModTags.Items.C_TOOLS).addTag(
                ModTags.Items.MY_MACHETE
        );

        this.tag(ModTags.Items.FD_KNIFE).addTag(
                ModTags.Items.MY_MACHETE
        );


    }
}
