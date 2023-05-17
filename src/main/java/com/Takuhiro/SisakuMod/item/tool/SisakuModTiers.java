package com.Takuhiro.SisakuMod.item.tool;

import com.Takuhiro.SisakuMod.main.SisakuMod;
import com.Takuhiro.SisakuMod.regi.SisakuModItems;
import com.Takuhiro.SisakuMod.regi.SisakuModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class SisakuModTiers {

    public static final ForgeTier SISAKU = new ForgeTier(4,2000,30F,4F,40,SisakuModTags.Blocks.NEEDS_SISAKU_TOOL,()-> Ingredient.of(SisakuModItems.SISAKU_INGOT));

    static {
        TierSortingRegistry.registerTier(SISAKU,new ResourceLocation(SisakuMod.MOD_ID,"sisaku"), List.of(TierSortingRegistry.getName(Tiers.NETHERITE)),List.of());

    }
}
