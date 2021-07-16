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


    //BlockItems
    public static final  RegistryObject<BlockItem> STEEL_GRATE = ITEMS.register(
            "steel_grate", () -> new BlockItem(AIBlocks.STEEL_GRATE.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
    public static final  RegistryObject<BlockItem> STEEL_GRATE_SLAB = ITEMS.register(
            "steel_grate_slab", () -> new BlockItem(AIBlocks.STEEL_GRATE_SLAB.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));

}
