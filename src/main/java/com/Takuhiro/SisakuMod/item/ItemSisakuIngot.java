package com.Takuhiro.SisakuMod.item;

import com.Takuhiro.SisakuMod.main.SisakuMod;
import net.minecraft.world.item.Item;

public class ItemSisakuIngot extends Item {
    public ItemSisakuIngot() {
        super(new Properties().tab(SisakuMod.SISAKUMOD_TAB).fireResistant());
        this.setRegistryName("sisaku_ingot");
    }
}
