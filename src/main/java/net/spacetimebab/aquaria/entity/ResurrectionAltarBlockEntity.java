package net.spacetimebab.aquaria.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.Connection;
import net.minecraft.network.protocol.game.ServerboundSignUpdatePacket;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.spacetimebab.aquaria.block.IBlockEntityTick;
//import net.spacetimebab.aquaria.block.custom.ResurrectionAltarBlock;

import javax.annotation.Nullable;
/*
public class ResurrectionAltarBlockEntity extends BlockEntity implements IBlockEntityTick {
    private ItemStack activeItem = ItemStack.EMPTY;
    private final int maxAge = 314;

    private int age;

    private BlockPos pos;


    public ResurrectionAltarBlockEntity(BlockEntityType<?> p_155228_, BlockPos p_155229_, BlockState p_155230_) {
        super(p_155228_, p_155229_, p_155230_);
    }

    public int getAge()
    {
        return this.age;
    }

    public int getMaxAge()
    {
        return this.maxAge;
    }

    public void clear()
    {
        activeItem = ItemStack.EMPTY;
    }

    public boolean isEmpty()
    {
        return activeItem.isEmpty();
    }

    public ItemStack getStack()
    {
        return activeItem;
    }

    public void setStack(ItemStack split, BlockPos pos)
    {
        this.activeItem = split;
        this.markDirty(pos);
        this.getLevel().blockEntityChanged(this.getBlockPos());
    }

    public void removeStack(Level world, BlockState state)
    {
        world.setBlockAndUpdate(pos, state.setValue(ResurrectionAltarBlock.HAS_ITEM, false).setValue(ResurrectionAltarBlock.HAS_ITEM, false));
        this.activeItem = ItemStack.EMPTY;
        this.markDirty(pos);
    }

    public ItemStack removeStack(BlockPos pos)
    {

        ItemStack stored = this.activeItem;
        this.activeItem = ItemStack.EMPTY;
        this.markDirty(pos);
        return stored;
    }


    public void markDirty(BlockPos pos) {
        if (level != null && !level.isClientSide) {
            BlockState state = level.getBlockState(pos);
            if (state.getBlock() instanceof ResurrectionAltarBlock) {
                state = state.setValue(ResurrectionAltarBlock.HAS_ITEM, !isEmpty());
                state = state.setValue(ResurrectionAltarBlock.HAS_LIGHT, false);
            }
            level.setBlockAndUpdate(pos, state);
        }
    }

    @Override
    public void tick()
    {
        if (!isEmpty())
        {
            this.age++;
            if (age > maxAge)
            {
                this.age = 0;
            }
        }
    }

    @OnlyIn(Dist.CLIENT)
    public double getPosition()
    {
        return 256.0D;
    }

    @Nullable
    public ServerboundSignUpdatePacket getUpdatePacket(BlockPos pos)
    {
        CompoundTag nbtTagCompound = new CompoundTag();
        write(nbtTagCompound);
        int tileEntityType = 42;
        return new ServerboundSignUpdatePacket(pos,"hello","hello there","how u doin","balls");
    }

    public void onDataPacket(Connection net, ServerboundSignUpdatePacket pkt)
    {
        BlockState blockState = level.getBlockState(pos);
    }

    @Override
    public CompoundTag getUpdateTag()
    {
        CompoundTag nbtTagCompound = new CompoundTag();
        write(nbtTagCompound);
        return nbtTagCompound;
    }

    public void handleUpdateTag(BlockState blockState, CompoundTag parentNBTTagCompound)
    {
        this.read(blockState, parentNBTTagCompound);
    }

    public CompoundTag write(CompoundTag compound)
    {
        CompoundTag itemStackNBT = new CompoundTag();
        return compound;
    }

    public void read(BlockState state, CompoundTag nbt)
    {


    }
}

 */
