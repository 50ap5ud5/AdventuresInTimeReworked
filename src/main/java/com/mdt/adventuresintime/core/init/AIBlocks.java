package com.mdt.adventuresintime.core.init;

import com.mdt.adventuresintime.adventuresintime;
import com.mdt.adventuresintime.common.blocks.ModSlabBlock;
import com.mdt.adventuresintime.common.blocks.TransparentGrateBlock;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class AIBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, adventuresintime.MOD_ID);

    //Blocks are registered here

    //Steel Grates
    public static final RegistryObject<Block> STEEL_GRATE = BLOCKS.register(
            "steel_grate", () -> new Block(TransparentGrateBlock.Properties.of(
                    Material.METAL, MaterialColor.COLOR_BROWN).harvestTool(ToolType.PICKAXE).harvestLevel(-1).strength(3.0F, 6.0F).sound(SoundType.METAL).noOcclusion()));
    public static final RegistryObject<Block> STEEL_GRATE_BLOCK = BLOCKS.register(
            "steel_grate_block", () -> new Block(TransparentGrateBlock.Properties.of(
                    Material.METAL, MaterialColor.COLOR_BROWN).harvestTool(ToolType.PICKAXE).harvestLevel(-1).strength(3.0F, 6.0F).sound(SoundType.METAL).noOcclusion()));
    public static final RegistryObject<Block> STEEL_GRATE_SLAB = BLOCKS.register(
            "steel_grate_slab", () -> new SlabBlock(ModSlabBlock.Properties.of(
                    Material.METAL, MaterialColor.COLOR_BROWN).harvestTool(ToolType.PICKAXE).harvestLevel(-1).strength(3.0F, 6.0F).sound(SoundType.METAL).noOcclusion()));
    public static final RegistryObject<Block> STEEL_GRATE_BLOCK_SLAB = BLOCKS.register(
            "steel_grate_block_slab", () -> new SlabBlock(ModSlabBlock.Properties.of(
                    Material.METAL, MaterialColor.COLOR_BROWN).harvestTool(ToolType.PICKAXE).harvestLevel(-1).strength(3.0F, 6.0F).sound(SoundType.METAL).noOcclusion()));

    //Newbury
    public static final RegistryObject<Block> NEWBURY_PLAIN = BLOCKS.register(
            "newbury_roundel_plain", () -> new Block(Block.Properties.of(
                    Material.WOOD, MaterialColor.COLOR_BROWN).harvestTool(ToolType.AXE).harvestLevel(-1).strength(3.0F, 6.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<Block> NEWBURY_GLASS_A = BLOCKS.register(
            "newbury_roundel_glass_a", () -> new Block(Block.Properties.of(
                    Material.WOOD, MaterialColor.COLOR_BROWN).harvestTool(ToolType.AXE).harvestLevel(-1).strength(3.0F, 6.0F).sound(SoundType.WOOD).noOcclusion()));

    //Hartnell Mints
    public static final RegistryObject<Block> HARTNELL_MINT_A = BLOCKS.register(
            "hartnell_mint_a", () -> new Block(Block.Properties.of(
                    Material.STONE, MaterialColor.COLOR_LIGHT_GREEN).harvestTool(ToolType.PICKAXE).harvestLevel(-1).strength(3.0F, 6.0F).sound(SoundType.STONE).noOcclusion()));
    public static final RegistryObject<Block> HARTNELL_MINT_B = BLOCKS.register(
            "hartnell_mint_b", () -> new Block(Block.Properties.of(
                    Material.STONE, MaterialColor.COLOR_LIGHT_GREEN).harvestTool(ToolType.PICKAXE).harvestLevel(-1).strength(3.0F, 6.0F).sound(SoundType.STONE).noOcclusion()));

    //Tom Baker Roundels
    public static final RegistryObject<Block> TBAKER_ROUNDEL_A = BLOCKS.register(
            "tbaker_roundel_a", () -> new Block(Block.Properties.of(
                    Material.STONE, MaterialColor.COLOR_GRAY).harvestTool(ToolType.PICKAXE).harvestLevel(-1).strength(3.0F, 6.0F).sound(SoundType.STONE).noOcclusion()));
    public static final RegistryObject<Block> TBAKER_ROUNDEL_B = BLOCKS.register(
            "tbaker_roundel_b", () -> new Block(Block.Properties.of(
                    Material.STONE, MaterialColor.COLOR_GRAY).harvestTool(ToolType.PICKAXE).harvestLevel(-1).strength(3.0F, 6.0F).sound(SoundType.STONE).noOcclusion()));

    //Master Roundel
    public static final RegistryObject<Block> MASTER_ROUNDEL_A = BLOCKS.register(
            "master_roundel_a", () -> new Block(Block.Properties.of(
                    Material.STONE, MaterialColor.COLOR_BLACK).harvestTool(ToolType.PICKAXE).harvestLevel(-1).strength(3.0F, 6.0F).sound(SoundType.STONE).noOcclusion()));
    public static final RegistryObject<Block> MASTER_ROUNDEL_B = BLOCKS.register(
            "master_roundel_b", () -> new Block(Block.Properties.of(
                    Material.STONE, MaterialColor.COLOR_BLACK).harvestTool(ToolType.PICKAXE).harvestLevel(-1).strength(3.0F, 6.0F).sound(SoundType.STONE).noOcclusion()));

    //Hartnell Blowups
    public static final RegistryObject<Block> HARTNELL_BLOWUP_A = BLOCKS.register(
            "hartnell_blowup_a", () -> new Block(Block.Properties.of(
                    Material.STONE, MaterialColor.COLOR_GRAY).harvestTool(ToolType.PICKAXE).harvestLevel(-1).strength(3.0F, 6.0F).sound(SoundType.STONE).noOcclusion()));
    public static final RegistryObject<Block> HARTNELL_BLOWUP_B = BLOCKS.register(
            "hartnell_blowup_b", () -> new Block(Block.Properties.of(
                    Material.STONE, MaterialColor.COLOR_GRAY).harvestTool(ToolType.PICKAXE).harvestLevel(-1).strength(3.0F, 6.0F).sound(SoundType.STONE).noOcclusion()));

    //Coral Roundels
    public static final RegistryObject<Block> CORAL_WALL_BLOCK = BLOCKS.register(
            "coral_wall_block", () -> new Block(Block.Properties.of(
                    Material.STONE, MaterialColor.COLOR_GRAY).harvestTool(ToolType.PICKAXE).harvestLevel(-1).strength(3.0F, 6.0F).sound(SoundType.STONE).noOcclusion()));
    public static final RegistryObject<Block> CORAL_ROUNDEL = BLOCKS.register(
            "coral_roundel", () -> new Block(Block.Properties.of(
                    Material.STONE, MaterialColor.COLOR_GRAY).harvestTool(ToolType.PICKAXE).harvestLevel(-1).strength(3.0F, 6.0F).sound(SoundType.STONE).noOcclusion()));

    //Toyota Blocks
    public static final RegistryObject<Block> TOYOTA_FLASHING_LIGHT = BLOCKS.register(
            "toyota_flashing_light", () -> new Block(Block.Properties.of(
                    Material.STONE, MaterialColor.COLOR_GRAY).lightLevel((p_235464_0_) -> 15).harvestTool(ToolType.PICKAXE).harvestLevel(-1).strength(3.0F, 6.0F).sound(SoundType.STONE).noOcclusion()));
    public static final RegistryObject<Block> TOYOTA_FLASHING_LIGHT1 = BLOCKS.register(
            "toyota_flashing_light1", () -> new Block(Block.Properties.of(
                    Material.STONE, MaterialColor.COLOR_GRAY).lightLevel((p_235464_0_) -> 15).harvestTool(ToolType.PICKAXE).harvestLevel(-1).strength(3.0F, 6.0F).sound(SoundType.STONE).noOcclusion()));
    public static final RegistryObject<Block> TOYOTA_FLASHING_LIGHTA = BLOCKS.register(
            "toyota_flashing_lighta", () -> new Block(Block.Properties.of(
                    Material.STONE, MaterialColor.COLOR_GRAY).lightLevel((p_235464_0_) -> 15).harvestTool(ToolType.PICKAXE).harvestLevel(-1).strength(3.0F, 6.0F).sound(SoundType.STONE).noOcclusion()));
    public static final RegistryObject<Block> TOYOTA_FLASHING_LIGHT1A = BLOCKS.register(
            "toyota_flashing_light1a", () -> new Block(Block.Properties.of(
                    Material.STONE, MaterialColor.COLOR_GRAY).lightLevel((p_235464_0_) -> 15).harvestTool(ToolType.PICKAXE).harvestLevel(-1).strength(3.0F, 6.0F).sound(SoundType.STONE).noOcclusion()));
    public static final RegistryObject<Block> RESTLESS_OVERGROW = BLOCKS.register(
            "restless_overgrow", () -> new Block(Block.Properties.of(
                    Material.STONE, MaterialColor.COLOR_GRAY).harvestTool(ToolType.PICKAXE).harvestLevel(-1).strength(3.0F, 6.0F).sound(SoundType.STONE).noOcclusion()));
    public static final RegistryObject<Block> RESTLESS_OVERGROW2 = BLOCKS.register(
            "restless_overgrow2", () -> new Block(Block.Properties.of(
                    Material.STONE, MaterialColor.COLOR_GRAY).harvestTool(ToolType.PICKAXE).harvestLevel(-1).strength(3.0F, 6.0F).sound(SoundType.STONE).noOcclusion()));
    public static final RegistryObject<Block> DDF_ROUNDEL_1 = BLOCKS.register(
            "ddf_roundel_1", () -> new Block(Block.Properties.of(
                    Material.STONE, MaterialColor.COLOR_GREEN).harvestTool(ToolType.PICKAXE).harvestLevel(-1).strength(3.0F, 6.0F).sound(SoundType.STONE).noOcclusion()));
    public static final RegistryObject<Block> DDF_ROUNDEL_1OFFSET = BLOCKS.register(
            "ddf_roundel_1offset", () -> new Block(Block.Properties.of(
                    Material.STONE, MaterialColor.COLOR_GREEN).harvestTool(ToolType.PICKAXE).harvestLevel(-1).strength(3.0F, 6.0F).sound(SoundType.STONE).noOcclusion()));
    public static final RegistryObject<Block> VALEYARD_ROUNDEL = BLOCKS.register(
            "valeyard_roundel", () -> new Block(Block.Properties.of(
                    Material.STONE, MaterialColor.COLOR_BLACK).harvestTool(ToolType.PICKAXE).harvestLevel(-1).strength(3.0F, 6.0F).sound(SoundType.STONE).noOcclusion()));
    public static final RegistryObject<Block> VALEYARD_ROUNDEL1 = BLOCKS.register(
            "valeyard_roundel1", () -> new Block(Block.Properties.of(
                    Material.STONE, MaterialColor.COLOR_BLACK).harvestTool(ToolType.PICKAXE).harvestLevel(-1).strength(3.0F, 6.0F).sound(SoundType.STONE).noOcclusion()));
    public static final RegistryObject<Block> MYSTAL_ROUNDEL = BLOCKS.register(
            "mystal_roundel", () -> new Block(Block.Properties.of(
                    Material.STONE, MaterialColor.COLOR_GRAY).harvestTool(ToolType.PICKAXE).harvestLevel(-1).strength(3.0F, 6.0F).sound(SoundType.STONE).noOcclusion()));
    public static final RegistryObject<Block> MYSTAL_ROUNDEL1 = BLOCKS.register(
            "mystal_roundel1", () -> new Block(Block.Properties.of(
                    Material.STONE, MaterialColor.COLOR_GRAY).harvestTool(ToolType.PICKAXE).harvestLevel(-1).strength(3.0F, 6.0F).sound(SoundType.STONE).noOcclusion()));
    public static final RegistryObject<Block> TBAKER_SOLID = BLOCKS.register(
            "tbaker_solid", () -> new Block(Block.Properties.of(
                    Material.STONE, MaterialColor.COLOR_YELLOW).harvestTool(ToolType.PICKAXE).harvestLevel(-1).strength(3.0F, 6.0F).sound(SoundType.STONE).noOcclusion()));
    public static final RegistryObject<Block> MASTER_SOLID = BLOCKS.register(
            "master_solid", () -> new Block(Block.Properties.of(
                    Material.STONE, MaterialColor.COLOR_BLACK).harvestTool(ToolType.PICKAXE).harvestLevel(-1).strength(3.0F, 6.0F).sound(SoundType.STONE).noOcclusion()));
    public static final RegistryObject<Block> MINT_SOLID = BLOCKS.register(
            "mint_solid", () -> new Block(Block.Properties.of(
                    Material.STONE, MaterialColor.COLOR_LIGHT_GREEN).harvestTool(ToolType.PICKAXE).harvestLevel(-1).strength(3.0F, 6.0F).sound(SoundType.STONE).noOcclusion()));
    public static final RegistryObject<Block> HARTNELL_BLOWUP_SOLID = BLOCKS.register(
            "hartnell_blowup_solid", () -> new Block(Block.Properties.of(
                    Material.STONE, MaterialColor.COLOR_LIGHT_GRAY).harvestTool(ToolType.PICKAXE).harvestLevel(-1).strength(3.0F, 6.0F).sound(SoundType.STONE).noOcclusion()));
    public static final RegistryObject<Block> NEWBURY_SOLID = BLOCKS.register(
            "newbury_solid", () -> new Block(Block.Properties.of(
                    Material.STONE, MaterialColor.COLOR_BROWN).harvestTool(ToolType.PICKAXE).harvestLevel(-1).strength(3.0F, 6.0F).sound(SoundType.STONE).noOcclusion()));
    public static final RegistryObject<Block> OVERGROW_SOLID = BLOCKS.register(
            "overgrow_solid", () -> new Block(Block.Properties.of(
                    Material.STONE, MaterialColor.COLOR_GREEN).harvestTool(ToolType.PICKAXE).harvestLevel(-1).strength(3.0F, 6.0F).sound(SoundType.STONE).noOcclusion()));
    public static final RegistryObject<Block> TARDIS_LAMP = BLOCKS.register(
            "tardis_lamp", () -> new Block(LanternBlock.Properties.of(
                    Material.STONE, MaterialColor.COLOR_BLUE).lightLevel((p_235464_0_) -> 15).harvestTool(ToolType.PICKAXE).harvestLevel(-1).strength(3.0F, 6.0F).sound(SoundType.STONE).noOcclusion()));
    public static final RegistryObject<Block> CRYSTALLINE = BLOCKS.register(
            "crystalline", () -> new Block(AbstractGlassBlock.Properties.of(
                    Material.GLASS, MaterialColor.COLOR_ORANGE).lightLevel((p_235464_0_) -> 12).harvestTool(ToolType.PICKAXE).harvestLevel(-1).strength(3.0F, 6.0F).sound(SoundType.GLASS).noOcclusion()));
    public static final RegistryObject<Block> TRANSPARENT_BLOCKLIGHT = BLOCKS.register(
            "transparent_blocklight", () -> new Block(AbstractGlassBlock.Properties.of(
                    Material.GLASS, MaterialColor.COLOR_CYAN).lightLevel((p_235464_0_) -> 15).harvestTool(ToolType.PICKAXE).harvestLevel(-1).strength(3.0F, 6.0F).sound(SoundType.GLASS).noOcclusion()));
}