package com.Takuhiro.SisakuMod.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.Material;

public class BlockSisakuBlock extends Block {
    public BlockSisakuBlock() {
        super(Properties.of(Material.METAL).strength(7.0F,150F)
                .requiresCorrectToolForDrops());

        this.setRegistryName("sisaku_block");
    }
}
