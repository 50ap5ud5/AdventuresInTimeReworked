package com.mdt.adventuresintime.common.items;
import com.mdt.adventuresintime.client.util.AISounds;
import com.mdt.adventuresintime.itemgroups.AIItemGroups;
import com.mojang.datafixers.types.templates.Sum;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.item.TNTEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.event.world.NoteBlockEvent;
import net.minecraftforge.event.world.PistonEvent;
import org.w3c.dom.ranges.DocumentRange;

import javax.annotation.Nullable;
import java.util.List;

import static net.minecraft.block.DoorBlock.OPEN;
import static net.minecraft.block.DoorBlock.POWERED;
import static net.minecraft.block.RedstoneLampBlock.LIT;
import static net.minecraft.block.RedstoneWireBlock.POWER;

public class SonicItem extends Item {
    private static final Integer COOLDOWN_TIME = 20;
    private static final Integer REDSTONE_COOLDOWN_TIME = 10;

    public SonicItem(Properties tab) {
        super(new Item.Properties().stacksTo(1).tab(AIItemGroups.AITMSONICS));
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
    public void useOn(World pWorldIn, LivingEntity pLivingEntityIn, ItemStack pStack, int pCount, PlayerEntity playerEntity) {
    }

    public ActionResultType useOn(ItemUseContext context) {
        PlayerEntity playerentity = context.getPlayer();
        World world = playerentity.level;
        BlockPos blockpos = context.getClickedPos();
        BlockState blockstate = world.getBlockState(blockpos);
        Block block = blockstate.getBlock();
        if (CampfireBlock.canLight(blockstate)) {
            world.setBlock(blockpos, blockstate.setValue(BlockStateProperties.LIT, Boolean.valueOf(true)), 11);
        }
        if (block instanceof TNTBlock) {
            playerentity.level.removeBlock(blockpos, true);
            TNTEntity tnt = new TNTEntity(world, (double) ((float) blockpos.getX() + 0.5F), (double) blockpos.getY(), (double) ((float) blockpos.getZ() + 0.5F), playerentity);
            world.addFreshEntity(tnt);
            world.playSound(null, tnt.getX(), tnt.getY(), tnt.getZ(), SoundEvents.TNT_PRIMED, SoundCategory.BLOCKS, 1.0F, 1.0F);
            return ActionResultType.sidedSuccess(world.isClientSide());
        }

        if (block instanceof DoorBlock) {
            world.setBlock(blockpos, blockstate.setValue(OPEN, !blockstate.getValue(OPEN)), 10);
            world.levelEvent(playerentity, blockstate.getValue(DoorBlock.OPEN) ? blockstate.getMaterial() == Material.METAL ? 1005 : 1006 : blockstate.getMaterial() == Material.METAL ? 1011 : 1012, blockpos, 0);
        }
        if (block instanceof TrapDoorBlock) {
            world.setBlock(blockpos, blockstate.setValue(OPEN, !blockstate.getValue(OPEN)), 10);
            world.levelEvent(playerentity, blockstate.getValue(DoorBlock.OPEN) ? blockstate.getMaterial() == Material.METAL ? 1005 : 1006 : blockstate.getMaterial() == Material.METAL ? 1011 : 1012, blockpos, 0);
        }

        if (block instanceof RedstoneLampBlock) {
            world.setBlock(blockpos, blockstate.setValue(LIT, !blockstate.getValue(LIT)), 10);
        }
       if (block instanceof RedstoneWireBlock) {
           int i = world.getBestNeighborSignal(blockpos);
           if (i == 15) {
               world.setBlock(blockpos, (BlockState)blockstate.setValue(POWER, i = 0), 2);
           }
           else {
               world.setBlock(blockpos, (BlockState)blockstate.setValue(POWER, i+1), 2);
           }
       }


        if (block instanceof Block) {
            world.playSound(null, blockpos.getX(), blockpos.getY(), blockpos.getZ(), AISounds.SONIC_SOUND.get(), SoundCategory.PLAYERS, 0.25F, 1.0F);
            if (block instanceof RedstoneWireBlock) {
                playerentity.getCooldowns().addCooldown(this, REDSTONE_COOLDOWN_TIME);
            }
            else {
                playerentity.getCooldowns().addCooldown(this, COOLDOWN_TIME);
            }
        }
        if (block instanceof AirBlock) {
            world.playSound(null, blockpos.getX(), blockpos.getY(), blockpos.getZ(), AISounds.SONIC_SOUND.get(), SoundCategory.PLAYERS, 0.25F, 1.0F);
            playerentity.getCooldowns().addCooldown(this, COOLDOWN_TIME);
        }

        return ActionResultType.SUCCESS;
    }
}
