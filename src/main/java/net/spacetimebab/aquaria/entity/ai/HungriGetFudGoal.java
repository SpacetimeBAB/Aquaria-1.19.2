package net.spacetimebab.aquaria.entity.ai;


import net.minecraft.core.BlockPos;
import net.minecraft.stats.Stats;
import net.minecraft.tags.FluidTags;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.util.DefaultRandomPos;
import net.minecraft.world.level.pathfinder.PathComputationType;
import net.minecraft.world.phys.Vec3;


public class HungriGetFudGoal extends NearestAttackableTargetGoal {
    public HungriGetFudGoal(Mob p_26060_, Class p_26061_, boolean p_26062_) {
        super(p_26060_, p_26061_, p_26062_);
    }

    private int hungrier;

    @Override
    public boolean canUse() {
        if (this.hungrier > 0 && this.mob.getRandom().nextInt(this.hungrier) != 0) {
            return false;
        } else {
            this.findTarget();
            return this.target != null;
        }
    }

    public Vec3 AmFullHeal() {

        Vec3 vec = DefaultRandomPos.getPos((PathfinderMob) this.mob, 10, 7);
        if (this.hungrier > 100 && mob.isDeadOrDying()) {
            mob.heal(1.0f);
            mob.setAbsorptionAmount(20f);


        }


        return vec;
    }

    @Override
    public void tick() {
        super.tick();
    }
}
