package com.Takuhiro.SisakuMod.item.tool;

import com.Takuhiro.SisakuMod.main.SisakuMod;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.phys.Vec3;

public class ToolSisakuSword extends SwordItem {

    public ToolSisakuSword() {
        super(SisakuModTiers.SISAKU, 3, -2.4F, new Properties().tab(SisakuMod.SISAKUMOD_TAB).fireResistant());
        this.setRegistryName("sisaku_sword");
    }
}
