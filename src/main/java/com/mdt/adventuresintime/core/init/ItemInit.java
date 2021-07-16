package com.mdt.adventuresintime.core.init;

import com.mdt.adventuresintime.adventuresintime;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, adventuresintime.MOD_ID);


    //Items are registered here
    public static final RegistryObject<Item> WHITTAKER_SONIC = ITEMS.register(
            "whittaker_sonic",() -> new Item(new Item.Properties().tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item> TENNANT_SONIC = ITEMS.register(
            "tennant_sonic",() -> new Item(new Item.Properties().tab(ItemGroup.TAB_TOOLS)));


    //BlockItems
    public static final  RegistryObject<BlockItem> STEEL_GRATE = ITEMS.register(
            "steel_grate", () -> new BlockItem(AIBlocks.STEEL_GRATE.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
    public static final  RegistryObject<BlockItem> STEEL_GRATE_SLAB = ITEMS.register(
            "steel_grate_slab", () -> new BlockItem(AIBlocks.STEEL_GRATE_SLAB.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
    public static final  RegistryObject<BlockItem> NEWBURY_PLAIN = ITEMS.register(
            "newbury_roundel_plain", () -> new BlockItem(AIBlocks.NEWBURY_PLAIN.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
    public static final  RegistryObject<BlockItem> NEWBURY_GLASS_A = ITEMS.register(
            "newbury_roundel_glass_a", () -> new BlockItem(AIBlocks.NEWBURY_GLASS_A.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
    public static final  RegistryObject<BlockItem> HARTNELL_MINT_A = ITEMS.register(
            "hartnell_mint_a", () -> new BlockItem(AIBlocks.HARTNELL_MINT_A.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
    public static final  RegistryObject<BlockItem> HARTNELL_MINT_B = ITEMS.register(
            "hartnell_mint_b", () -> new BlockItem(AIBlocks.HARTNELL_MINT_B.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
    public static final  RegistryObject<BlockItem> TBAKER_ROUNDEL_A = ITEMS.register(
            "tbaker_roundel_a", () -> new BlockItem(AIBlocks.TBAKER_ROUNDEL_A.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
    public static final  RegistryObject<BlockItem> TBAKER_ROUNDEL_B = ITEMS.register(
            "tbaker_roundel_b", () -> new BlockItem(AIBlocks.TBAKER_ROUNDEL_B.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
    public static final  RegistryObject<BlockItem> MASTER_ROUNDEL_A = ITEMS.register(
            "master_roundel_a", () -> new BlockItem(AIBlocks.MASTER_ROUNDEL_A.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
    public static final  RegistryObject<BlockItem> MASTER_ROUNDEL_B = ITEMS.register(
            "master_roundel_b", () -> new BlockItem(AIBlocks.MASTER_ROUNDEL_B.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
    public static final  RegistryObject<BlockItem> HARTNELL_BLOWUP_A = ITEMS.register(
            "hartnell_blowup_a", () -> new BlockItem(AIBlocks.HARTNELL_BLOWUP_A.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
    public static final  RegistryObject<BlockItem> HARTNELL_BLOWUP_B = ITEMS.register(
            "hartnell_blowup_b", () -> new BlockItem(AIBlocks.HARTNELL_BLOWUP_B.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));

}
