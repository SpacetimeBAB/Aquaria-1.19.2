package net.spacetimebab.aquaria.entity.custom;

import net.minecraft.Util;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.Mth;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.control.SmoothSwimmingLookControl;
import net.minecraft.world.entity.ai.control.SmoothSwimmingMoveControl;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.navigation.AmphibiousPathNavigation;
import net.minecraft.world.entity.ai.navigation.PathNavigation;
import net.minecraft.world.entity.ai.navigation.WaterBoundPathNavigation;
import net.minecraft.world.entity.ai.util.DefaultRandomPos;
import net.minecraft.world.entity.animal.AbstractFish;
import net.minecraft.world.entity.animal.AbstractSchoolingFish;
import net.minecraft.world.entity.animal.Bucketable;
import net.minecraft.world.entity.animal.WaterAnimal;
import net.minecraft.world.entity.monster.Drowned;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.pathfinder.BlockPathTypes;
import net.minecraft.world.level.pathfinder.Path;
import net.minecraft.world.phys.Vec3;
import net.spacetimebab.aquaria.entity.ai.GoToBottom;
import net.spacetimebab.aquaria.entity.variant.DipterusVariant;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;

public class SoulEntity extends LivingEntity implements IAnimatable {

    private static final EntityDataAccessor<Integer> DATA_ID_TYPE_VARIANT=
            SynchedEntityData.defineId(SoulEntity.class, EntityDataSerializers.INT);


    private AnimationFactory factory = new AnimationFactory(this);

    public SoulEntity(EntityType<? extends LivingEntity> entityType, Level level) {
        super(entityType, level);

    }
    
    public static AttributeSupplier.Builder attributes() {
        return Mob.createMobAttributes()
                .add(Attributes.MAX_HEALTH, 2.0D)
                .add(Attributes.MOVEMENT_SPEED, (double) 1f);
    }
    
    
    private void addParticlesAroundSelf(ParticleOptions p_28338_) {
        for(int i = 0; i < 7; ++i) {
            double d0 = this.random.nextGaussian() * 0.01D;
            double d1 = this.random.nextGaussian() * 0.01D;
            double d2 = this.random.nextGaussian() * 0.01D;
            this.level.addParticle(p_28338_, this.getRandomX(1.0D), this.getRandomY() + 0.2D, this.getRandomZ(1.0D), d0, d1, d2);
        }

    }
    
    private <E extends IAnimatable> PlayState predicate(AnimationEvent<E> event) {

    	event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.soul.move", true));
        return PlayState.CONTINUE;
    }


    @Override
    public void registerControllers1(AnimationData data) {
        data.addAnimationController(new AnimationController(this, "controller",
                0, this::predicate));
    }


	@Override
	public void registerControllers(AnimationData data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public AnimationFactory getFactory() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected void defineSynchedData() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void readAdditionalSaveData(CompoundTag p_20052_) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addAdditionalSaveData(CompoundTag p_20139_) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Packet<?> getAddEntityPacket() {
		// TODO Auto-generated method stub
		return null;
	}
	
    protected void registerGoals() {
        this.goalSelector.addGoal(0, new TryFindWaterGoal(this));
        this.goalSelector.addGoal(1, new RandomSwimmingGoal(this, 1.0D, 10));
        this.goalSelector.addGoal(2, new RandomLookAroundGoal(this));
        this.targetSelector.addGoal(3, (new HurtByTargetGoal(this)).setAlertOthers());
        this.goalSelector.addGoal(2,new PanicGoal(this,10.0D));
        this.goalSelector.addGoal(0,new BreathAirGoal(this));
        this.goalSelector.addGoal(3,new GoToBottom(this,1.0,14));

    }

	@Override
	public Iterable<ItemStack> getArmorSlots() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ItemStack getItemBySlot(EquipmentSlot p_21127_) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setItemSlot(EquipmentSlot p_21036_, ItemStack p_21037_) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public HumanoidArm getMainArm() {
		// TODO Auto-generated method stub
		return null;
	}
} 