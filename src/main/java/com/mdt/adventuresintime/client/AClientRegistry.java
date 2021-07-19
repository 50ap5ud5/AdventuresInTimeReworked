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
            RenderTypeLookup.setRenderLayer(AIBlocks.STEEL_GRATE_SLAB.get(), RenderType.translucent());
            RenderTypeLookup.setRenderLayer(AIBlocks.NEWBURY_PLAIN.get(), RenderType.solid());
            RenderTypeLookup.setRenderLayer(AIBlocks.NEWBURY_GLASS_A.get(), RenderType.solid());
            RenderTypeLookup.setRenderLayer(AIBlocks.HARTNELL_MINT_A.get(), RenderType.solid());
            RenderTypeLookup.setRenderLayer(AIBlocks.HARTNELL_MINT_B.get(), RenderType.solid());
            RenderTypeLookup.setRenderLayer(AIBlocks.TBAKER_ROUNDEL_A.get(), RenderType.solid());
            RenderTypeLookup.setRenderLayer(AIBlocks.TBAKER_ROUNDEL_B.get(), RenderType.solid());
            RenderTypeLookup.setRenderLayer(AIBlocks.MASTER_ROUNDEL_A.get(), RenderType.solid());
            RenderTypeLookup.setRenderLayer(AIBlocks.MASTER_ROUNDEL_B.get(), RenderType.solid());
            RenderTypeLookup.setRenderLayer(AIBlocks.HARTNELL_BLOWUP_A.get(), RenderType.solid());
            RenderTypeLookup.setRenderLayer(AIBlocks.HARTNELL_BLOWUP_B.get(), RenderType.solid());
            RenderTypeLookup.setRenderLayer(AIBlocks.CORAL_WALL_BLOCK.get(), RenderType.solid());
            RenderTypeLookup.setRenderLayer(AIBlocks.CORAL_ROUNDEL.get(), RenderType.solid());
            RenderTypeLookup.setRenderLayer(AIBlocks.TOYOTA_FLASHING_LIGHT.get(), RenderType.solid());
            RenderTypeLookup.setRenderLayer(AIBlocks.TOYOTA_FLASHING_LIGHT1.get(), RenderType.solid());
            RenderTypeLookup.setRenderLayer(AIBlocks.TOYOTA_FLASHING_LIGHTA.get(), RenderType.solid());
            RenderTypeLookup.setRenderLayer(AIBlocks.TOYOTA_FLASHING_LIGHT1A.get(), RenderType.solid());
            RenderTypeLookup.setRenderLayer(AIBlocks.RESTLESS_OVERGROW.get(), RenderType.solid());
            RenderTypeLookup.setRenderLayer(AIBlocks.RESTLESS_OVERGROW2.get(), RenderType.solid());
            RenderTypeLookup.setRenderLayer(AIBlocks.DDF_ROUNDEL_1.get(), RenderType.solid());
            RenderTypeLookup.setRenderLayer(AIBlocks.DDF_ROUNDEL_1OFFSET.get(), RenderType.solid());
            RenderTypeLookup.setRenderLayer(AIBlocks.VALEYARD_ROUNDEL.get(), RenderType.solid());
            RenderTypeLookup.setRenderLayer(AIBlocks.VALEYARD_ROUNDEL1.get(), RenderType.solid());
            RenderTypeLookup.setRenderLayer(AIBlocks.MYSTAL_ROUNDEL.get(), RenderType.solid());
            RenderTypeLookup.setRenderLayer(AIBlocks.MYSTAL_ROUNDEL1.get(), RenderType.solid());
            RenderTypeLookup.setRenderLayer(AIBlocks.TBAKER_SOLID.get(), RenderType.solid());
            RenderTypeLookup.setRenderLayer(AIBlocks.MASTER_SOLID.get(), RenderType.solid());
            RenderTypeLookup.setRenderLayer(AIBlocks.MINT_SOLID.get(), RenderType.solid());
            RenderTypeLookup.setRenderLayer(AIBlocks.HARTNELL_BLOWUP_SOLID.get(), RenderType.solid());
            RenderTypeLookup.setRenderLayer(AIBlocks.NEWBURY_SOLID.get(), RenderType.solid());
            RenderTypeLookup.setRenderLayer(AIBlocks.OVERGROW_SOLID.get(), RenderType.solid());
        });
    }
}
