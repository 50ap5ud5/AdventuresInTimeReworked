package com.mdt.adventuresintime.core.init;

import com.mdt.adventuresintime.adventuresintime;
import com.mdt.adventuresintime.common.blocks.ModSlabBlock;
import com.mdt.adventuresintime.common.blocks.TransparentGrateBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class AIBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, adventuresintime.MOD_ID);


    //Blocks are registered here
    public static final RegistryObject<Block> STEEL_GRATE = BLOCKS.register(
            "steel_grate", () -> new Block(TransparentGrateBlock.Properties.of(
                    Material.METAL, MaterialColor.COLOR_BROWN).harvestTool(ToolType.PICKAXE).harvestLevel(-1).strength(3.0F, 6.0F).sound(SoundType.METAL).noOcclusion()));
    public static final RegistryObject<Block> STEEL_GRATE_SLAB = BLOCKS.register(
            "steel_grate_slab", () -> new SlabBlock(ModSlabBlock.Properties.of(
                    Material.METAL, MaterialColor.COLOR_BROWN).harvestTool(ToolType.PICKAXE).harvestLevel(-1).strength(3.0F, 6.0F).sound(SoundType.METAL).noOcclusion()));

}
