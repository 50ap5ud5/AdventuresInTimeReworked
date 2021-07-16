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
    public static final RegistryObject<Block> NEWBURY_PLAIN = BLOCKS.register(
            "newbury_roundel_plain", () -> new Block(Block.Properties.of(
                    Material.WOOD, MaterialColor.COLOR_BROWN).harvestTool(ToolType.AXE).harvestLevel(-1).strength(3.0F, 6.0F).sound(SoundType.WOOD).noOcclusion()));

    //Newbury
    public static final RegistryObject<Block> NEWBURY_GLASS_A = BLOCKS.register(
            "newbury_roundel_glass_a", () -> new Block(Block.Properties.of(
                    Material.WOOD, MaterialColor.COLOR_BROWN).harvestTool(ToolType.AXE).harvestLevel(-1).strength(3.0F, 6.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<Block> HARTNELL_MINT_A = BLOCKS.register(
            "hartnell_mint_a", () -> new Block(Block.Properties.of(
                    Material.STONE, MaterialColor.COLOR_LIGHT_GREEN).harvestTool(ToolType.PICKAXE).harvestLevel(-1).strength(3.0F, 6.0F).sound(SoundType.STONE).noOcclusion()));
    public static final RegistryObject<Block> HARTNELL_MINT_B = BLOCKS.register(
            "hartnell_mint_b", () -> new Block(Block.Properties.of(
                    Material.STONE, MaterialColor.COLOR_LIGHT_GREEN).harvestTool(ToolType.PICKAXE).harvestLevel(-1).strength(3.0F, 6.0F).sound(SoundType.STONE).noOcclusion()));
    public static final RegistryObject<Block> TBAKER_ROUNDEL_A = BLOCKS.register(
            "tbaker_roundel_a", () -> new Block(Block.Properties.of(
                    Material.STONE, MaterialColor.COLOR_GRAY).harvestTool(ToolType.PICKAXE).harvestLevel(-1).strength(3.0F, 6.0F).sound(SoundType.STONE).noOcclusion()));
    public static final RegistryObject<Block> TBAKER_ROUNDEL_B = BLOCKS.register(
            "tbaker_roundel_b", () -> new Block(Block.Properties.of(
                    Material.STONE, MaterialColor.COLOR_GRAY).harvestTool(ToolType.PICKAXE).harvestLevel(-1).strength(3.0F, 6.0F).sound(SoundType.STONE).noOcclusion()));
    public static final RegistryObject<Block> MASTER_ROUNDEL_A = BLOCKS.register(
            "master_roundel_a", () -> new Block(Block.Properties.of(
                    Material.STONE, MaterialColor.COLOR_BLACK).harvestTool(ToolType.PICKAXE).harvestLevel(-1).strength(3.0F, 6.0F).sound(SoundType.STONE).noOcclusion()));
    public static final RegistryObject<Block> MASTER_ROUNDEL_B = BLOCKS.register(
            "master_roundel_b", () -> new Block(Block.Properties.of(
                    Material.STONE, MaterialColor.COLOR_BLACK).harvestTool(ToolType.PICKAXE).harvestLevel(-1).strength(3.0F, 6.0F).sound(SoundType.STONE).noOcclusion()));
    public static final RegistryObject<Block> HARTNELL_BLOWUP_A = BLOCKS.register(
            "hartnell_blowup_a", () -> new Block(Block.Properties.of(
                    Material.STONE, MaterialColor.COLOR_GRAY).harvestTool(ToolType.PICKAXE).harvestLevel(-1).strength(3.0F, 6.0F).sound(SoundType.STONE).noOcclusion()));
    public static final RegistryObject<Block> HARTNELL_BLOWUP_B = BLOCKS.register(
            "hartnell_blowup_b", () -> new Block(Block.Properties.of(
                    Material.STONE, MaterialColor.COLOR_GRAY).harvestTool(ToolType.PICKAXE).harvestLevel(-1).strength(3.0F, 6.0F).sound(SoundType.STONE).noOcclusion()));

}
