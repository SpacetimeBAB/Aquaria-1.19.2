package net.spacetimebab.aquaria.entity.custom;

import net.minecraft.Util;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.players.OldUsersConverter;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.Mth;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
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
import net.minecraft.world.entity.ai.targeting.TargetingConditions;
import net.minecraft.world.entity.animal.AbstractFish;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.animal.Bucketable;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.GameRules;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.pathfinder.BlockPathTypes;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.scores.Team;
import net.minecraftforge.event.ForgeEventFactory;
import net.spacetimebab.aquaria.entity.Fishes;
import net.spacetimebab.aquaria.entity.ai.HungriGetFudGoal;
import net.spacetimebab.aquaria.entity.variant.BungaritusVariant;
import net.spacetimebab.aquaria.entity.variant.DollyVariant;
import net.spacetimebab.aquaria.entity.variant.OrnithoprionVariant;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;

import java.rmi.server.UID;
import java.util.Optional;
import java.util.UUID;

public class DollyEntity extends AbstractFish implements IAnimatable, Bucketable, OwnableEntity {


    private static final EntityDataAccessor<Boolean> SITTING =
            SynchedEntityData.defineId(DollyEntity.class, EntityDataSerializers.BOOLEAN);


    private static final EntityDataAccessor<Integer> DATA_ID_TYPE_VARIANT =
            SynchedEntityData.defineId(DollyEntity.class, EntityDataSerializers.INT);


    private AnimationFactory factory = new AnimationFactory(this);

    public DollyEntity(EntityType<? extends AbstractFish> p_30341_, Level p_30342_) {
        super(p_30341_, p_30342_);
        this.setPathfindingMalus(BlockPathTypes.WATER, 0.0F);

        //tilt control segment

        this.moveControl = new SmoothSwimmingMoveControl(this, 85, 10, 0.02F, 0.1F, true);
        this.lookControl = new SmoothSwimmingLookControl(this, 10);
        this.maxUpStep = 0.9f;

    }


    public void tick() {
        super.tick();

        if (this.level.isClientSide && this.isInWater() && this.getDeltaMovement().lengthSqr() > 0.03D) {
            Vec3 vec3 = this.getViewVector(0.0F);
            float f = Mth.cos(this.getYRot() * ((float) Math.PI / 180F)) * 0.3F;
            float f1 = Mth.sin(this.getYRot() * ((float) Math.PI / 180F)) * 0.3F;

        }

    }


    public static AttributeSupplier.Builder attributes() {
        return Mob.createMobAttributes()
                .add(Attributes.MAX_HEALTH, 20.0D)
                .add(Attributes.MOVEMENT_SPEED, (double) 3D)
                .add(Attributes.ATTACK_DAMAGE, 3D)
                .add(Attributes.ARMOR, 4D);
    }

    @Override
    public boolean canBeLeashed(Player p_30346_) {
        return super.canBeLeashed(p_30346_);
    }

    protected void registerGoals() {
        this.goalSelector.addGoal(0, new TryFindWaterGoal(this));
        this.goalSelector.addGoal(1, new RandomSwimmingGoal(this, 1.0D, 10));
        this.goalSelector.addGoal(2, new RandomLookAroundGoal(this));
        this.targetSelector.addGoal(3, (new HurtByTargetGoal(this)).setAlertOthers());
        this.goalSelector.addGoal(4, new MeleeAttackGoal(this, 2.0d, false));
        this.goalSelector.addGoal(3, new HungriGetFudGoal(this, LivingEntity.class, false));
        this.goalSelector.addGoal(5, new BreathAirGoal(this));

    }

    protected PathNavigation createNavigation(Level waterBoundPathNavigation) {
        return new AmphibiousPathNavigation(this, waterBoundPathNavigation);
    }

    public boolean attackable(LivingEntity pTarget) {
        if (!(pTarget instanceof DollyEntity))
            return super.attackable();
        return true;
    }

    public boolean doHurtTarget(Entity p_28319_) {
        boolean flag = p_28319_.hurt(DamageSource.mobAttack(this), (float) ((int) this.getAttributeValue(Attributes.ATTACK_DAMAGE)));
        if (flag) {
            this.doEnchantDamageEffects(this, p_28319_);
            this.playSound(SoundEvents.DOLPHIN_ATTACK, 1.0F, 1.0F);
        }

        return flag;
    }

    private void addParticlesAroundSelf(ParticleOptions p_28338_) {
        for (int i = 0; i < 7; ++i) {
            double d0 = this.random.nextGaussian() * 0.01D;
            double d1 = this.random.nextGaussian() * 0.01D;
            double d2 = this.random.nextGaussian() * 0.01D;
            this.level.addParticle(p_28338_, this.getRandomX(1.0D), this.getRandomY() + 0.2D, this.getRandomZ(1.0D), d0, d1, d2);
        }

    }

    public boolean canBreatheUnderwater() {
        return false;
    }

    protected int increaseAirSupply(int pCurrentAir) {
        return this.getMaxAirSupply();
    }

    public int getMaxAirSupply() {
        return 5000000;
    }


    private <E extends IAnimatable> PlayState predicate(AnimationEvent<E> event) {
        if (this.isInWater() && event.isMoving()) {
            event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.Dolichorhynchops.swim", true));
            return PlayState.CONTINUE;
        }
        if (!this.isInWater() && !this.isSitting()) {
            event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.Dolichorhynchops.crawl", true));
            return PlayState.CONTINUE;
        }
        if (this.isSitting() && !this.isOnGround()) {
            event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.Dolichorhynchops.idle", true));
            return PlayState.CONTINUE;
        }
        if (this.isSitting() && this.isOnGround()) {
            event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.Dolichorhynchops.idleland", true));
            return PlayState.CONTINUE;
        }


        return PlayState.CONTINUE;
    }


    @Override
    public void registerControllers(AnimationData data) {
        data.addAnimationController(new AnimationController(this, "controller",
                0, this::predicate));
    }

    @Override
    public AnimationFactory getFactory() {
        return this.factory;
    }


    protected SoundEvent getAmbientSound() {
        return SoundEvents.DOLPHIN_AMBIENT_WATER;
    }

    protected SoundEvent getHurtSound(DamageSource damageSourceIn) {
        return SoundEvents.DOLPHIN_HURT;
    }

    protected SoundEvent getDeathSound() {
        return SoundEvents.DOLPHIN_DEATH;
    }

    protected SoundEvent getFlopSound() {
        return SoundEvents.SALMON_FLOP;
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
    public ItemStack getBucketItemStack() {
        return null;
    }




    @Override
    public SoundEvent getPickupSound() {
        return SoundEvents.BUCKET_FILL_FISH;
    }

    @Override
    public void readAdditionalSaveData(CompoundTag tag) {
        super.readAdditionalSaveData(tag);
        this.entityData.set(DATA_ID_TYPE_VARIANT, tag.getInt("Variant"));




    }

    @Override
    public void addAdditionalSaveData(CompoundTag tag) {
        super.addAdditionalSaveData(tag);
        tag.putInt("Variant", this.getTypeVariant());
       // tag.putBoolean("isSitting", this.isSitting());
    }

    @Override
    protected void defineSynchedData() {
        super.defineSynchedData();
        this.entityData.define(DATA_ID_TYPE_VARIANT, 0);
      //  this.entityData.define(SITTING, false);
    }

    public SpawnGroupData finalizeSpawn(ServerLevelAccessor p_146746_, DifficultyInstance p_146747_,
                                        MobSpawnType p_146748_, @Nullable SpawnGroupData p_146749_,
                                        @Nullable CompoundTag p_146750_) {
        DollyVariant variant = Util.getRandom(DollyVariant.values(), this.random);
        setVariant(variant);
        return super.finalizeSpawn(p_146746_, p_146747_, p_146748_, p_146749_, p_146750_);
    }

    @Nullable
    public AgeableMob getBreedOffspring(ServerLevel p_146743_, AgeableMob p_146744_) {
        return null;
    }



    public boolean isSitting() {
        return this.entityData.get(SITTING);
    }

    @Override
    public Team getTeam() {
        return super.getTeam();
    }

    public DollyVariant getVariant() {
        return DollyVariant.byId(this.getTypeVariant() & 255);
    }

    private int getTypeVariant() {
        return this.entityData.get(DATA_ID_TYPE_VARIANT);
    }

    private void setVariant(DollyVariant variant) {
        this.entityData.set(DATA_ID_TYPE_VARIANT, variant.getId() & 255);
    }

    @Nullable
    @Override
    public UUID getOwnerUUID() {
        return null;
    }

    @Nullable
    @Override
    public Entity getOwner() {
        return null;
    }
}