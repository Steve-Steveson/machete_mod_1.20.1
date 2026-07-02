package net.steveson.machetedelight.item.custom;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraftforge.fml.ModList;
import vectorwing.farmersdelight.common.registry.ModEnchantments;

public class MacheteItem extends SwordItem {
    public MacheteItem(Tier pTier, int pAttackDamageModifier, float pAttackSpeedModifier, Properties pProperties) {
        super(pTier, pAttackDamageModifier, pAttackSpeedModifier, pProperties);
    }

    @Override
    public boolean canApplyAtEnchantingTable(ItemStack stack, Enchantment enchantment) {
        boolean isBaseModEnabled = ModList.get().isLoaded("farmersdelight");
        if (isBaseModEnabled) {
            if (ModEnchantments.BACKSTABBING.get().equals(enchantment)) {
                return true;
            }

        }
        return super.canApplyAtEnchantingTable(stack, enchantment);
    }
}
