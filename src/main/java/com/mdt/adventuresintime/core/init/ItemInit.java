package com.mdt.adventuresintime.core.init;

import com.mdt.adventuresintime.adventuresintime;
import com.mdt.adventuresintime.common.items.SonicItem;
import com.mdt.adventuresintime.itemgroups.AIItemGroups;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, adventuresintime.MOD_ID);


    //Items are registered here
    public static final RegistryObject<SonicItem> WHITTAKER_SONIC = ITEMS.register(
            "whittaker_sonic", () -> new SonicItem(new Item.Properties().tab(AIItemGroups.AITMSONICS)));
    public static final RegistryObject<SonicItem> TENNANT_SONIC = ITEMS.register(
            "tennant_sonic", () -> new SonicItem(new Item.Properties().tab(AIItemGroups.AITMSONICS)));
    public static final RegistryObject<SonicItem> SMITH_SONIC = ITEMS.register(
            "smith_sonic", () -> new SonicItem(new Item.Properties().tab(AIItemGroups.AITMSONICS)));
    public static final RegistryObject<SonicItem> SONIC_SCREWDRIVER = ITEMS.register(
            "sonic_screwdriver", () -> new SonicItem(new Item.Properties().tab(AIItemGroups.AITMSONICS)));
    public static final RegistryObject<SonicItem> MYSTAL_SONIC = ITEMS.register(
            "mystal_sonic", () -> new SonicItem(new Item.Properties().tab(AIItemGroups.AITMSONICS)));
    public static final RegistryObject<SonicItem> TBAKER_SONIC = ITEMS.register(
            "tbaker_sonic", () -> new SonicItem(new Item.Properties().tab(AIItemGroups.AITMSONICS)));
    public static final RegistryObject<SonicItem> WAR_SONIC = ITEMS.register(
            "war_sonic", () -> new SonicItem(new Item.Properties().tab(AIItemGroups.AITMSONICS)));
    public static final RegistryObject<SonicItem> SCEPTER_SONIC = ITEMS.register(
            "scepter_sonic", () -> new SonicItem(new Item.Properties().tab(AIItemGroups.AITMSONICS)));
    public static final RegistryObject<Item> VORTEX_MANIPULATOR = ITEMS.register(
            "vmclosed", () -> new Item(new Item.Properties().tab(AIItemGroups.AITMITEMS)));
    public static final RegistryObject<Item> BIODAMPENER = ITEMS.register(
            "biodampener", () -> new Item(new Item.Properties().tab(AIItemGroups.AITMITEMS)));
    public static final RegistryObject<Item> DISPOSABLE_CAMERA = ITEMS.register(
            "disposable_camera", () -> new Item(new Item.Properties().tab(AIItemGroups.AITMITEMS)));
    public static final RegistryObject<SonicItem> VALE_SONIC = ITEMS.register(
            "valesonic", () -> new SonicItem(new Item.Properties().tab(AIItemGroups.AITMSONICS)));
    public static final RegistryObject<SonicItem> SARAH_JANE_SONIC = ITEMS.register(
            "sarah_jane_sonic", () -> new SonicItem(new Item.Properties().tab(AIItemGroups.AITMSONICS)));


    //BlockItems
    public static final  RegistryObject<BlockItem> STEEL_GRATE = ITEMS.register(
            "steel_grate", () -> new BlockItem(AIBlocks.STEEL_GRATE.get(), new Item.Properties().tab(AIItemGroups.AITMBLOCKS)));
    public static final  RegistryObject<BlockItem> STEEL_GRATE_SLAB = ITEMS.register(
            "steel_grate_slab", () -> new BlockItem(AIBlocks.STEEL_GRATE_SLAB.get(), new Item.Properties().tab(AIItemGroups.AITMBLOCKS)));

    //Roundel Blocks
    public static final  RegistryObject<BlockItem> NEWBURY_PLAIN = ITEMS.register(
            "newbury_roundel_plain", () -> new BlockItem(AIBlocks.NEWBURY_PLAIN.get(), new Item.Properties().tab(AIItemGroups.AITMBLOCKS)));
    public static final  RegistryObject<BlockItem> NEWBURY_GLASS_A = ITEMS.register(
            "newbury_roundel_glass_a", () -> new BlockItem(AIBlocks.NEWBURY_GLASS_A.get(), new Item.Properties().tab(AIItemGroups.AITMBLOCKS)));
    public static final  RegistryObject<BlockItem> HARTNELL_MINT_A = ITEMS.register(
            "hartnell_mint_a", () -> new BlockItem(AIBlocks.HARTNELL_MINT_A.get(), new Item.Properties().tab(AIItemGroups.AITMBLOCKS)));
    public static final  RegistryObject<BlockItem> HARTNELL_MINT_B = ITEMS.register(
            "hartnell_mint_b", () -> new BlockItem(AIBlocks.HARTNELL_MINT_B.get(), new Item.Properties().tab(AIItemGroups.AITMBLOCKS)));
    public static final  RegistryObject<BlockItem> TBAKER_ROUNDEL_A = ITEMS.register(
            "tbaker_roundel_a", () -> new BlockItem(AIBlocks.TBAKER_ROUNDEL_A.get(), new Item.Properties().tab(AIItemGroups.AITMBLOCKS)));
    public static final  RegistryObject<BlockItem> TBAKER_ROUNDEL_B = ITEMS.register(
            "tbaker_roundel_b", () -> new BlockItem(AIBlocks.TBAKER_ROUNDEL_B.get(), new Item.Properties().tab(AIItemGroups.AITMBLOCKS)));
    public static final  RegistryObject<BlockItem> MASTER_ROUNDEL_A = ITEMS.register(
            "master_roundel_a", () -> new BlockItem(AIBlocks.MASTER_ROUNDEL_A.get(), new Item.Properties().tab(AIItemGroups.AITMBLOCKS)));
    public static final  RegistryObject<BlockItem> MASTER_ROUNDEL_B = ITEMS.register(
            "master_roundel_b", () -> new BlockItem(AIBlocks.MASTER_ROUNDEL_B.get(), new Item.Properties().tab(AIItemGroups.AITMBLOCKS)));
    public static final  RegistryObject<BlockItem> HARTNELL_BLOWUP_A = ITEMS.register(
            "hartnell_blowup_a", () -> new BlockItem(AIBlocks.HARTNELL_BLOWUP_A.get(), new Item.Properties().tab(AIItemGroups.AITMBLOCKS)));
    public static final  RegistryObject<BlockItem> HARTNELL_BLOWUP_B = ITEMS.register(
            "hartnell_blowup_b", () -> new BlockItem(AIBlocks.HARTNELL_BLOWUP_B.get(), new Item.Properties().tab(AIItemGroups.AITMBLOCKS)));
    public static final RegistryObject<BlockItem> CORAL_WALL_BLOCK = ITEMS.register(
            "coral_wall_block", () -> new BlockItem(AIBlocks.CORAL_WALL_BLOCK.get(),new Item.Properties().tab(AIItemGroups.AITMBLOCKS)));
    public static final RegistryObject<BlockItem> CORAL_ROUNDEL = ITEMS.register(
            "coral_roundel", () -> new BlockItem(AIBlocks.CORAL_ROUNDEL.get(),new Item.Properties().tab(AIItemGroups.AITMBLOCKS)));
    public static final RegistryObject<BlockItem> TOYOTA_FLASHING_LIGHT = ITEMS.register(
            "toyota_flashing_light", () -> new BlockItem(AIBlocks.TOYOTA_FLASHING_LIGHT.get(),new Item.Properties().tab(AIItemGroups.AITMBLOCKS)));
    public static final RegistryObject<BlockItem> TOYOTA_FLASHING_LIGHT1 = ITEMS.register(
            "toyota_flashing_light1", () -> new BlockItem(AIBlocks.TOYOTA_FLASHING_LIGHT1.get(),new Item.Properties().tab(AIItemGroups.AITMBLOCKS)));
    public static final RegistryObject<BlockItem> TOYOTA_FLASHING_LIGHTA = ITEMS.register(
            "toyota_flashing_lighta", () -> new BlockItem(AIBlocks.TOYOTA_FLASHING_LIGHTA.get(),new Item.Properties().tab(AIItemGroups.AITMBLOCKS)));
    public static final RegistryObject<BlockItem> TOYOTA_FLASHING_LIGHT1A = ITEMS.register(
            "toyota_flashing_light1a", () -> new BlockItem(AIBlocks.TOYOTA_FLASHING_LIGHT1A.get(),new Item.Properties().tab(AIItemGroups.AITMBLOCKS)));
    public static final RegistryObject<BlockItem> RESTLESS_OVERGROW = ITEMS.register(
            "restless_overgrow", () -> new BlockItem(AIBlocks.RESTLESS_OVERGROW.get(),new Item.Properties().tab(AIItemGroups.AITMBLOCKS)));
    public static final RegistryObject<BlockItem> RESTLESS_OVERGROW2 = ITEMS.register(
            "restless_overgrow2", () -> new BlockItem(AIBlocks.RESTLESS_OVERGROW2.get(),new Item.Properties().tab(AIItemGroups.AITMBLOCKS)));
    public static final RegistryObject<BlockItem> DDF_ROUNDEL_1 = ITEMS.register(
            "ddf_roundel_1", () -> new BlockItem(AIBlocks.DDF_ROUNDEL_1.get(),new Item.Properties().tab(AIItemGroups.AITMBLOCKS)));
    public static final RegistryObject<BlockItem> DDF_ROUNDEL_1OFFSET = ITEMS.register(
            "ddf_roundel_1offset", () -> new BlockItem(AIBlocks.DDF_ROUNDEL_1OFFSET.get(),new Item.Properties().tab(AIItemGroups.AITMBLOCKS)));
    public static final RegistryObject<BlockItem> VALEYARD_ROUNDEL = ITEMS.register(
            "valeyard_roundel", () -> new BlockItem(AIBlocks.VALEYARD_ROUNDEL.get(),new Item.Properties().tab(AIItemGroups.AITMBLOCKS)));
    public static final RegistryObject<BlockItem> VALEYARD_ROUNDEL1 = ITEMS.register(
            "valeyard_roundel1", () -> new BlockItem(AIBlocks.VALEYARD_ROUNDEL1.get(),new Item.Properties().tab(AIItemGroups.AITMBLOCKS)));
    public static final RegistryObject<BlockItem> MYSTAL_ROUNDEL = ITEMS.register(
            "mystal_roundel", () -> new BlockItem(AIBlocks.MYSTAL_ROUNDEL.get(),new Item.Properties().tab(AIItemGroups.AITMBLOCKS)));
    public static final RegistryObject<BlockItem> MYSTAL_ROUNDEL1 = ITEMS.register(
            "mystal_roundel1", () -> new BlockItem(AIBlocks.MYSTAL_ROUNDEL1.get(),new Item.Properties().tab(AIItemGroups.AITMBLOCKS)));
    public static final RegistryObject<BlockItem> TBAKER_SOLID = ITEMS.register(
            "tbaker_solid", () -> new BlockItem(AIBlocks.TBAKER_SOLID.get(),new Item.Properties().tab(AIItemGroups.AITMBLOCKS)));
    public static final RegistryObject<BlockItem> MASTER_SOLID = ITEMS.register(
            "master_solid", () -> new BlockItem(AIBlocks.MASTER_SOLID.get(),new Item.Properties().tab(AIItemGroups.AITMBLOCKS)));
    public static final RegistryObject<BlockItem> MINT_SOLID = ITEMS.register(
            "mint_solid", () -> new BlockItem(AIBlocks.MINT_SOLID.get(),new Item.Properties().tab(AIItemGroups.AITMBLOCKS)));
    public static final RegistryObject<BlockItem> HARTNELL_BLOWUP_SOLID = ITEMS.register(
            "hartnell_blowup_solid", () -> new BlockItem(AIBlocks.HARTNELL_BLOWUP_SOLID.get(),new Item.Properties().tab(AIItemGroups.AITMBLOCKS)));
    public static final RegistryObject<BlockItem> NEWBURY_SOLID = ITEMS.register(
            "newbury_solid", () -> new BlockItem(AIBlocks.NEWBURY_SOLID.get(),new Item.Properties().tab(AIItemGroups.AITMBLOCKS)));
    public static final RegistryObject<BlockItem> OVERGROW_SOLID = ITEMS.register(
            "overgrow_solid", () -> new BlockItem(AIBlocks.OVERGROW_SOLID.get(),new Item.Properties().tab(AIItemGroups.AITMBLOCKS)));
    public static final RegistryObject<BlockItem> TARDIS_LAMP = ITEMS.register(
            "tardis_lamp", () -> new BlockItem(AIBlocks.TARDIS_LAMP.get(),new Item.Properties().tab(AIItemGroups.AITMBLOCKS)));
    public static final RegistryObject<BlockItem> CRYSTALLINE = ITEMS.register(
            "crystalline", () -> new BlockItem(AIBlocks.CRYSTALLINE.get(),new Item.Properties().tab(AIItemGroups.AITMBLOCKS)));
    public static final RegistryObject<BlockItem> STEEL_GRATE_BLOCK = ITEMS.register(
            "steel_grate_block", () -> new BlockItem(AIBlocks.STEEL_GRATE_BLOCK.get(),new Item.Properties().tab(AIItemGroups.AITMBLOCKS)));
    public static final RegistryObject<BlockItem> TRANSPARENT_BLOCKLIGHT = ITEMS.register(
            "transparent_blocklight", () -> new BlockItem(AIBlocks.TRANSPARENT_BLOCKLIGHT.get(),new Item.Properties().tab(AIItemGroups.AITMBLOCKS)));
    public static final RegistryObject<BlockItem> STEEL_GRATE_BLOCK_SLAB = ITEMS.register(
            "steel_grate_block_slab", () -> new BlockItem(AIBlocks.STEEL_GRATE_BLOCK_SLAB.get(),new Item.Properties().tab(AIItemGroups.AITMBLOCKS)));
}
