package net.spacetimebab.aquaria.block.custom;
/*
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.spacetimebab.aquaria.BlockProperties;
import net.spacetimebab.aquaria.entity.ResurrectionAltarBlockEntity;
import net.spacetimebab.aquaria.inits.BlockInit;
import org.jetbrains.annotations.NotNull;

public class ResurrectionAltarBlock extends Block {

    public static final EnumProperty<BlockProperties.ResurrectionAltarState> STATE = BlockProperties.RESURRECTION_STATE;

    public static final BooleanProperty HAS_ITEM = BlockProperties.HAS_ITEM;
    public static final BooleanProperty HAS_LIGHT = BlockProperties.HAS_LIGHT;

    protected float height = 1.0F;

    public ResurrectionAltarBlock(Properties properties) {
        super(properties);

        this.registerDefaultState(this.stateDefinition.getPossibleStates().get(1).setValue(STATE, BlockProperties.ResurrectionAltarState.DEFAULT).setValue(HAS_ITEM, false).setValue(HAS_LIGHT, false));
    }


    public float getHeight(BlockState state)
    {
        if (state.getBlock() instanceof ResurrectionAltarBlock && state.getValue(STATE) == BlockProperties.ResurrectionAltarState.PEDESTAL_TOP.PEDESTAL_TOP)
        {
            return this.height - 0.2F;
        }
        return this.height;
    }

    public boolean hasTileEntity(BlockState state)
    {
        return true;
    }

    public @NotNull ResurrectionAltarBlock createTileEntity(BlockState state)
    {
        return BlockInit.RESURRECTION_ALTAR.get();
    }
    public InteractionResult onBlockActivated(BlockState state, Level worldIn, BlockPos pos, Player player,
                                              InteractionHand handIn)
    {
        if (worldIn.isClientSide) return InteractionResult.CONSUME;
        if (!this.isPlaceable(state))
        {
            return InteractionResult.PASS;
        }
        BlockEntity tileEntity = worldIn.getBlockEntity(pos);
        if (tileEntity instanceof ResurrectionAltarBlockEntity)
        {
            ResurrectionAltarBlockEntity altar = (ResurrectionAltarBlockEntity) tileEntity;
            if (altar.isEmpty())
            {
                ItemStack itemStack = player.getItemInHand(handIn);
                if (itemStack.isEmpty()) return InteractionResult.CONSUME;
                altar.setStack(player.getAbilities().invulnerable ? itemStack.copy().split(1) : itemStack.split(1),pos);
                //this.checkRitual(worldIn, pos);
                return InteractionResult.SUCCESS;
            }
            else
            {
                ItemStack itemStack = altar.getStack();
                if (player.addItem(itemStack))
                {
                    altar.removeStack(worldIn, state);
                    return InteractionResult.SUCCESS;
                }
                return InteractionResult.FAIL;
            }
        }
        return InteractionResult.PASS;
    }
    protected boolean isPlaceable(BlockState state)
    {
        BlockProperties.ResurrectionAltarState currentState = state.getValue(STATE);
        return currentState != BlockProperties.ResurrectionAltarState.BOTTOM &&
                currentState != BlockProperties.ResurrectionAltarState.COLUMN &&
                currentState != BlockProperties.ResurrectionAltarState.PILLAR &&
                currentState != BlockProperties.ResurrectionAltarState.COLUMN_TOP;
    }



}

 */





