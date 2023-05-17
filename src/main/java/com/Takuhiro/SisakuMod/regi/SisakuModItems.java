package com.Takuhiro.SisakuMod.regi;

import com.Takuhiro.SisakuMod.item.ItemSisakuIngot;
import com.Takuhiro.SisakuMod.item.tool.ToolSisakuSword;
import com.Takuhiro.SisakuMod.main.SisakuMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(SisakuMod.MOD_ID)
public class SisakuModItems {

    public static final ItemSisakuIngot SISAKU_INGOT =new ItemSisakuIngot();
    public static final ToolSisakuSword SISAKU_SWORD = new ToolSisakuSword();

    @Mod.EventBusSubscriber(modid = SisakuMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class Register{

        @SubscribeEvent
        public static void registerItems(final RegistryEvent.Register<Item> event){

            final Item[] items = {
                    SISAKU_INGOT,
                    SISAKU_SWORD
            };
            event.getRegistry().registerAll(items);
        }
    }
}
