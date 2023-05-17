package com.Takuhiro.SisakuMod.regi;

import com.Takuhiro.SisakuMod.block.BlockSisakuBlock;
import com.Takuhiro.SisakuMod.main.SisakuMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(SisakuMod.MOD_ID)
public class SisakuModBlocks {

    public static final BlockSisakuBlock SISAKU_BLOCK = null;

    @Mod.EventBusSubscriber(modid = SisakuMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class Register{

        @SubscribeEvent
        public static void registerBlocks(final RegistryEvent.Register<Block> event){
            final Block[] blocks = {
                    new BlockSisakuBlock()
            };
            event.getRegistry().registerAll(blocks);
        }

        @SubscribeEvent
        public static void registerBlockItems(final RegistryEvent.Register<Item> event){
            final BlockItem[] blockItems = {
                    new BlockItem(SISAKU_BLOCK,new Item.Properties().tab(SisakuMod.SISAKUMOD_TAB).fireResistant())
            };
            for (BlockItem item : blockItems){
                final Block block =item.getBlock();
                final ResourceLocation registryName = block.getRegistryName();
                event.getRegistry().register(item.setRegistryName(registryName));
            }
        }
    }
}
