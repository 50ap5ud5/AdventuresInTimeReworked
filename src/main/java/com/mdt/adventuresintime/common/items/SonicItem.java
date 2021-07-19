package com.mdt.adventuresintime.common.items;
import com.mdt.adventuresintime.itemgroups.AIItemGroups;
import net.minecraft.block.*;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.item.TNTEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class SonicItem extends Item {

    public SonicItem(Properties tab) {
        super(new Item.Properties().stacksTo(1).tab(AIItemGroups.AITM));
    }

    @Override
    public boolean shouldCauseReequipAnimation(ItemStack oldStack, ItemStack newStack, boolean slotChanged) {
        return false;
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable World pWorldIn, List<ITextComponent> pTooltip, ITooltipFlag pFlagIn) {
        super.appendHoverText(pStack, pWorldIn, pTooltip, pFlagIn);
        pTooltip.add(new TranslationTextComponent("tooltip.sonic.text_tooltip"));
    }


    public void useOn(World pWorldIn, LivingEntity pLivingEntityIn, ItemStack pStack, int pCount) {

    }

    public ActionResultType useOn(ItemUseContext context) {
        PlayerEntity playerentity = context.getPlayer();
        World world = playerentity.level;
        BlockPos blockpos = context.getClickedPos();
        BlockState blockstate = world.getBlockState(blockpos);
        Block block = blockstate.getBlock();
        if (CampfireBlock.canLight(blockstate)) {
            world.playSound(playerentity, blockpos, SoundEvents.FLINTANDSTEEL_USE, SoundCategory.BLOCKS, 1.0F, random.nextFloat() * 0.4F + 0.8F);
            world.setBlock(blockpos, blockstate.setValue(BlockStateProperties.LIT, Boolean.valueOf(true)), 11);
        }
        if (block instanceof TNTBlock) {
            playerentity.level.removeBlock(blockpos, true);
            TNTEntity tnt = new TNTEntity(world, (double) ((float) blockpos.getX() + 0.5F), (double) blockpos.getY(), (double) ((float) blockpos.getZ() + 0.5F), playerentity);
            world.addFreshEntity(tnt);
            world.playSound(null, tnt.getX(), tnt.getY(), tnt.getZ(), SoundEvents.TNT_PRIMED, SoundCategory.BLOCKS, 1.0F, 1.0F);

            return ActionResultType.sidedSuccess(world.isClientSide());
        }
        return ActionResultType.SUCCESS;
    }
}
