package com.mdt.adventuresintime.client.util;

import com.mdt.adventuresintime.adventuresintime;
import net.minecraft.block.Block;
import net.minecraft.client.audio.Sound;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class AISounds {

    public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, adventuresintime.MOD_ID);

    public static final RegistryObject<SoundEvent> SONIC_SOUND = SOUNDS.register("sonic_sound", () -> new SoundEvent(
            new ResourceLocation(adventuresintime.MOD_ID, "sonic_sound")));
}
