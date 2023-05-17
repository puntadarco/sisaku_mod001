package com.Takuhiro.SisakuMod.regi;

import com.Takuhiro.SisakuMod.main.SisakuMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;

public class SisakuModTags {

    public static class Blocks{

        public static final Tags.IOptionalNamedTag NEEDS_SISAKU_TOOL = tag("needs_sisaku_tool");

        private static final Tags.IOptionalNamedTag<Block> tag(String name){
            return BlockTags.createOptional(new ResourceLocation(SisakuMod.MOD_ID,name));
        }
    }

    public static class Items{
        private static final Tags.IOptionalNamedTag<Item> tag(String name){
            return ItemTags.createOptional(new ResourceLocation(SisakuMod.MOD_ID,name));
        }
    }
}
