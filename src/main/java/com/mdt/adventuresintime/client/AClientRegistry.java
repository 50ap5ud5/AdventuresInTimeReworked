package com.mdt.adventuresintime.client;


import com.mdt.adventuresintime.adventuresintime;
import com.mdt.adventuresintime.core.init.AIBlocks;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

import javax.swing.border.EmptyBorder;

@Mod.EventBusSubscriber(value = Dist.CLIENT, modid = adventuresintime.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class AClientRegistry {

    @SubscribeEvent
    public static void register(FMLClientSetupEvent event) {

        event.enqueueWork(() -> {
            RenderTypeLookup.setRenderLayer(AIBlocks.STEEL_GRATE.get(), RenderType.translucent());
        });
    }
}
