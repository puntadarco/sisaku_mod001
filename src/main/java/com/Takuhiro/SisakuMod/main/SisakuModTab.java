package com.Takuhiro.SisakuMod.main;

import com.Takuhiro.SisakuMod.item.ItemSisakuIngot;
import com.Takuhiro.SisakuMod.regi.SisakuModBlocks;
import com.Takuhiro.SisakuMod.regi.SisakuModItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class SisakuModTab extends CreativeModeTab {
    public SisakuModTab() {
        super("sisakumod_tab");
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(SisakuModItems.SISAKU_INGOT);
    }
}
