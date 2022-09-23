package net.spacetimebab.aquaria.entity.custom;

import net.minecraft.Util;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.Mth;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.control.SmoothSwimmingLookControl;
import net.minecraft.world.entity.ai.control.SmoothSwimmingMoveControl;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.RandomSwimmingGoal;
import net.minecraft.world.entity.ai.goal.TryFindWaterGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.navigation.AmphibiousPathNavigation;
import net.minecraft.world.entity.ai.navigation.PathNavigation;
import net.minecraft.world.entity.animal.AbstractSchoolingFish;
import net.minecraft.world.entity.animal.Bucketable;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.pathfinder.BlockPathTypes;
import net.minecraft.world.phys.Vec3;
import net.spacetimebab.aquaria.entity.variant.GoologongiaVariant;
import net.spacetimebab.aquaria.entity.variant.LamiaspisVariant;
import net.spacetimebab.aquaria.entity.variant.PhleebVariant;
import net.spacetimebab.aquaria.entity.variant.SphenacanthusVariant;

import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;

public class PhleebEntity extends AbstractSchoolingFish implements IAnimatable, Bucketable {
	
    public PhleebEntity(EntityType<? extends AbstractSchoolingFish> p_27523_, Level p_27524_) {
        super(p_27523_, p_27524_);
        
        this.setPathfindingMalus(BlockPathTypes.WATER, 0.0F);
        
        this.moveControl = new SmoothSwimmingMoveControl(this, 85, 10, 0.02F, 0.1F, true);
        this.lookControl = new SmoothSwimmingLookControl(this, 10);
        
    }
    
	public void tick() {
		super.tick();

		if (this.level.isClientSide && this.isInWater() && this.getDeltaMovement().lengthSqr() > 0.03D) {
			Vec3 vec3 = this.getViewVector(0.0F);
			float f = Mth.cos(this.getYRot() * ((float) Math.PI / 180F)) * 0.3F;
			float f1 = Mth.sin(this.getYRot() * ((float) Math.PI / 180F)) * 0.3F;

		}

	}

    private static final EntityDataAccessor<Integer> DATA_ID_TYPE_VARIANT=
            SynchedEntityData.defineId(LamiaspisEntity.class, EntityDataSerializers.INT);

    public static AttributeSupplier.Builder attributes() {
        return Mob.createMobAttributes()
                .add(Attributes.MAX_HEALTH, 3.0D)
                .add(Attributes.MOVEMENT_SPEED, (double) 1.0D)
                .add( Attributes.ARMOR, 10D);
    }
    
    
    protected void registerGoals() {
        this.goalSelector.addGoal(0, new TryFindWaterGoal(this));
        this.goalSelector.addGoal(1, new RandomSwimmingGoal(this, 1.0D, 10));
        this.goalSelector.addGoal(2, new RandomLookAroundGoal(this));
        this.targetSelector.addGoal(3, (new HurtByTargetGoal(this)).setAlertOthers());
    }

    protected PathNavigation createNavigation(Level waterBoundPathNavigation) {
        return new AmphibiousPathNavigation(this, waterBoundPathNavigation);
    }
    

    private AnimationFactory factory = new AnimationFactory(this);

    public int getMaxSchoolSize() {
        return 100;
    }
    protected SoundEvent getFlopSound() {
        return SoundEvents.SALMON_FLOP;
    }

    protected SoundEvent getAmbientSound() {
        return SoundEvents.SALMON_AMBIENT;
    }


    protected SoundEvent getDeathSound() {
        return SoundEvents.SALMON_DEATH;
    }

    protected SoundEvent getHurtSound(DamageSource p_29795_) {
        return SoundEvents.SALMON_HURT;
    }
    
    protected float getSoundVolume() {
        return 0.5F;

    }
    
    
    @Override
    public boolean fromBucket() {
        return false;
    }

    @Override
    public void setFromBucket(boolean p_148834_) {

    }

    @Override
    public void saveToBucketTag(ItemStack p_148833_) {

    }

    @Override
    public void loadFromBucketTag(CompoundTag p_148832_) {

    }

    @Override
    public SoundEvent getPickupSound() {
        return SoundEvents.BUCKET_FILL_FISH;
    }
    

	private <E extends IAnimatable> PlayState predicate(AnimationEvent<E> event) {
		if (this.isInWater() && event.isMoving()) {
			event.getController()
					.setAnimation(new AnimationBuilder().addAnimation("animation.phleeb.swim", true));
			return PlayState.CONTINUE;
		}
		if (!this.isInWater()) {
			event.getController()
					.setAnimation(new AnimationBuilder().addAnimation("animation.phleeb.bounce", true));
			return PlayState.CONTINUE;
		}

		return PlayState.CONTINUE;
	}

	@Override
	public void registerControllers(AnimationData data) {
		data.addAnimationController(new AnimationController(this, "controller", 0, this::predicate));
	}

	@Override
	public AnimationFactory getFactory() {
		return this.factory;
	}
    
    @Override
    public void aiStep() {
        if (!this.isInWater() && this.onGround && this.verticalCollision) {
            this.onGround = false;
            this.hasImpulse = true;
            this.playSound(this.getFlopSound(), this.getSoundVolume(), this.getVoicePitch());
        }
        super.aiStep();
    }
    
    public boolean canBreatheUnderwater() {
        return true;
    }

    private void addParticlesAroundSelf(ParticleOptions p_28338_) {
        for(int i = 0; i < 7; ++i) {
            double d0 = this.random.nextGaussian() * 0.01D;
            double d1 = this.random.nextGaussian() * 0.01D;
            double d2 = this.random.nextGaussian() * 0.01D;
            this.level.addParticle(p_28338_, this.getRandomX(1.0D), this.getRandomY() + 0.2D, this.getRandomZ(1.0D), d0, d1, d2);
        }
        


    }
	@Override
	public ItemStack getBucketItemStack() {
		// TODO Auto-generated method stub
		return null;
		
		
	}
	
	
    @Override
    public void readAdditionalSaveData(CompoundTag tag) {
        super.readAdditionalSaveData(tag);
        this.entityData.set(DATA_ID_TYPE_VARIANT, tag.getInt("Variant"));

    }

    @Override
    public void addAdditionalSaveData(CompoundTag tag) {
        super.addAdditionalSaveData(tag);
        tag.putInt("Variant",this.getTypeVariant());
    }

    @Override
    protected void defineSynchedData() {
        super.defineSynchedData();
        this.entityData.define(DATA_ID_TYPE_VARIANT, 0);
    }
    
    public SpawnGroupData finalizeSpawn(ServerLevelAccessor p_146746_, DifficultyInstance p_146747_,
            MobSpawnType p_146748_, @Nullable SpawnGroupData p_146749_,
            @Nullable CompoundTag p_146750_) {
    	PhleebVariant variant = Util.getRandom(PhleebVariant.values(), this.random);
    	setVariant(variant);
    	return super.finalizeSpawn(p_146746_, p_146747_, p_146748_, p_146749_, p_146750_);
    }

    public PhleebVariant getVariant() {
    	return PhleebVariant.byId(this.getTypeVariant() & 255);
    }

    private int getTypeVariant() {
    	return this.entityData.get(DATA_ID_TYPE_VARIANT);
    }

    private void setVariant(PhleebVariant variant) {
    	this.entityData.set(DATA_ID_TYPE_VARIANT, variant.getId() & 255);
    }

    

}


