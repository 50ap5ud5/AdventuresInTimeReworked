//package com.mdt.adventuresintime.common.items;
//
//import static net.minecraft.block.Blocks.REDSTONE_LAMP;
//import static net.minecraft.block.Blocks.TNT;
//import static net.minecraft.block.DoorBlock.OPEN;
//import static net.minecraft.block.RedstoneLampBlock.LIT;
//
//import java.lang.reflect.InvocationTargetException;
//import java.lang.reflect.Method;
//import java.util.ArrayList;
//
//import com.mdt.adventuresintime.common.items.SonicItem;
//import net.minecraft.block.Block;
//import net.minecraft.block.BlockState;
//import net.minecraft.block.DispenserBlock;
//import net.minecraft.block.DoorBlock;
//import net.minecraft.block.RedstoneLampBlock;
//import net.minecraft.block.TNTBlock;
//import net.minecraft.block.TrapDoorBlock;
//import net.minecraft.block.material.Material;
//import net.minecraft.entity.Entity;
//import net.minecraft.entity.item.TNTEntity;
//import net.minecraft.entity.player.PlayerEntity;
//import net.minecraft.item.ItemStack;
//import net.minecraft.util.SoundCategory;
//import net.minecraft.util.SoundEvents;
//import net.minecraft.util.math.BlockPos;
//import net.minecraft.util.text.TextFormatting;
//import net.minecraft.util.text.TranslationTextComponent;
//import net.minecraft.world.World;
//import net.minecraft.world.server.ServerWorld;
//import net.minecraftforge.event.entity.player.PlayerInteractEvent;
//import net.minecraftforge.fml.common.ObfuscationReflectionHelper;
//import net.minecraftforge.registries.ForgeRegistries;
//
//
//public class SonicInteractions extends SonicItem {
//
//    private final Method dispenseMethod = ObfuscationReflectionHelper.findMethod(DispenserBlock.class, "func_176439_d", ServerWorld.class, BlockPos.class);
//
//
//    public boolean processBlock(PlayerEntity player, BlockState blockState, ItemStack sonic, BlockPos pos) {
//        World world = player.world;
//        Block block = blockState.getBlock();
//
//        //isHandActive checks if player hand is active (active hand refers to when the player has let go of right click)
//        //This makes it so that i.e. player lets go of right click, onStoppedUsing will be called, so this method will be called, but ONLY if they let go of right click, instead of on right click
//        if (!world.isClientSide && player.isUsingItem()) {
//
//            //Explodes TNT
//            if (block instanceof TNTBlock) {
//                player.getCommandSenderWorld().removeBlock(pos, true);
//                TNTEntity tnt = new TNTEntity(world, (double) ((float) pos.getX() + 0.5F), (double) pos.getY(), (double) ((float) pos.getZ() + 0.5F), player);
//                world.addBlockEntity(TNTEntity);
//                world.playSound(null, tnt.getX(), tnt.getY(), tnt.getZ(), SoundEvents.TNT_PRIMED, SoundCategory.BLOCKS, 1.0F, 1.0F);
//                return true;
//            }
//
//            return false;
//        }
//
//        @Override
//        public ArrayList<TranslationTextComponent> getAdditionalInfo () {
//            ArrayList<TranslationTextComponent> list = new ArrayList<>();
//            list.add(new TranslationTextComponent("sonic.modes.info.interactable_blocks"));
//            for (Block interactableBlock : getDefaultBlock()) {
//                list.add((TranslationTextComponent) new TranslationTextComponent("- ").append(new TranslationTextComponent(interactableBlock.getDescriptionId()).withStyle(TextFormatting.GRAY)));
//            }
//        }
//    }
//}