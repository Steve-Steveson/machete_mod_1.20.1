package net.steveson.machetedelight.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.steveson.machetedelight.MacheteDelightMod;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MacheteDelightMod.MOD_ID);

    public static final RegistryObject<Item> GOLDEN_MACHETE = ITEMS.register("golden_machete",
            ()-> new SwordItem(Tiers.GOLD, 2, -2.6f, new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
