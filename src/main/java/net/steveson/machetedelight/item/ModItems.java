package net.steveson.machetedelight.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.steveson.machetedelight.MacheteDelightMod;
import net.steveson.machetedelight.item.custom.MacheteItem;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MacheteDelightMod.MOD_ID);

    public static final RegistryObject<Item> GOLDEN_MACHETE = ITEMS.register("golden_machete",
            ()-> new MacheteItem(Tiers.GOLD, 2, -2.6f, new Item.Properties()));
    public static final RegistryObject<Item> IRON_MACHETE = ITEMS.register("iron_machete",
            ()-> new MacheteItem(Tiers.IRON, 2, -2.6f, new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_MACHETE = ITEMS.register("diamond_machete",
            ()-> new MacheteItem(Tiers.DIAMOND, 2, -2.6f, new Item.Properties()));
    public static final RegistryObject<Item> NETHERITE_MACHETE = ITEMS.register("netherite_machete",
            ()-> new MacheteItem(Tiers.NETHERITE, 2, -2.6f, new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
