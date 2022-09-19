package net.spacetimebab.aquaria.entity.ai;


import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;


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

    @Override
    public void tick() {
        super.tick();
    }
}
