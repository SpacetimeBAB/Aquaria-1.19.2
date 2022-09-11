package net.spacetimebab.aquaria.entity.ai;

import net.minecraft.core.BlockPos;
import net.minecraft.core.SectionPos;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.ai.goal.MoveToBlockGoal;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.chunk.ChunkAccess;
import net.minecraft.world.level.chunk.ChunkStatus;

public class GetNearSeagrass extends MoveToBlockGoal {


    private final Mob Mob;

    private int ticksSinceReachedGoal;

    private int SeagrassFindCooldown;

    private static final int WAIT_AFTER_BLOCK_FOUND = 20;
    private Block blockToRemove;

    private boolean tryFindBlock() {
        return this.blockPos != null && this.isValidTarget(this.mob.level, this.blockPos) ? true : this.findNearestBlock();
    }

    public GetNearSeagrass(Block p_25840_, PathfinderMob p_25841_, double p_25842_, int p_25843_) {
        super(p_25841_, p_25842_, 24, p_25843_);
        this.Mob = p_25841_;
    }

    public boolean canUse() {
        if (SeagrassFindCooldown <= 200) {
            return false;
        } else if (this.nextStartTick > 0) {
            --this.nextStartTick;
            return false;
        } else if (this.tryFindBlock()) {
            this.nextStartTick = reducedTickDelay(20);
            return true;
        } else {
            this.nextStartTick = this.nextStartTick(this.mob);
            return false;
        }
    }
    @Override
    protected boolean isValidTarget(LevelReader p_25850_, BlockPos p_25851_) {
        ChunkAccess chunkaccess = p_25850_.getChunk(SectionPos.blockToSectionCoord(p_25851_.getX()), SectionPos.blockToSectionCoord(p_25851_.getZ()), ChunkStatus.FULL, false);
        if (chunkaccess == null) {
            return false;
        } else {
            if (!chunkaccess.getBlockState(p_25851_).canEntityDestroy(p_25850_, p_25851_, this.Mob)) return false;
            return chunkaccess.getBlockState(p_25851_).is(this.blockToRemove) && chunkaccess.getBlockState(p_25851_.above()).isAir() && chunkaccess.getBlockState(p_25851_.above(2)).isAir();
        }
    }
}