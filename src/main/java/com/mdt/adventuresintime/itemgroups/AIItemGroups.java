package com.mdt.adventuresintime.itemgroups;

import com.mdt.adventuresintime.core.init.AIBlocks;
import com.mdt.adventuresintime.core.init.ItemInit;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class AIItemGroups {

    public static final ItemGroup AITM = new ItemGroup("Sonics") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ItemInit.TENNANT_SONIC.get());
        }
    };

    public static final ItemGroup AITMBLOCKS = new ItemGroup("Blocks") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(AIBlocks.HARTNELL_BLOWUP_A.get());
        }
    };
    public static final ItemGroup AITMITEMS = new ItemGroup("Items") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ItemInit.VORTEX_MANIPULATOR.get());
        }
    };
}