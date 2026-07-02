package net.steveson.machetedelight.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.steveson.machetedelight.MacheteDelightMod;
import vectorwing.farmersdelight.FarmersDelight;

public class ModTags {
    public static class Blocks {


        private static TagKey<Block> commonTag(String name) {
            return BlockTags.create(new ResourceLocation("forge", name));
        }
    }

    public static class Items {
        public static final TagKey<Item> C_TOOLS = commonTag("tools");

        public static final TagKey<Item> C_MACHETE = commonTag("tools/machete");
        public static final TagKey<Item> MY_MACHETE = customTag("tools/machete");

        public static final TagKey<Item> FD_KNIFE = baseModTag("tools/knives");


        public static final TagKey<Item> STICKS = commonTag("rods/wooden");



        private static TagKey<Item> commonTag(String name) {
            return ItemTags.create(new ResourceLocation("forge", name));
        }

        private static TagKey<Item> customTag(String name) {
            return ItemTags.create(new ResourceLocation(MacheteDelightMod.MOD_ID, name));
        }

        private static TagKey<Item> baseModTag(String name) {
            return ItemTags.create(new ResourceLocation(FarmersDelight.MODID, name));

        }
    }
}
