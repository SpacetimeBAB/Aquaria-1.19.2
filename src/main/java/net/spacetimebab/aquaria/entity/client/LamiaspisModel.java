package net.spacetimebab.aquaria.entity.client;

import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.Model;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.spacetimebab.aquaria.Aquaria;
import net.spacetimebab.aquaria.entity.custom.LamiaspisEntity;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.model.provider.data.EntityModelData;

import java.util.function.Function;

public class LamiaspisModel<T extends LivingEntity> extends AnimatedGeoModel<LamiaspisEntity> {

    @Override
    public ResourceLocation getModelResource(LamiaspisEntity object) {
        return new ResourceLocation(Aquaria.MOD_ID, "geo/lamiaspis.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(LamiaspisEntity object) {
        return LamiaspisRenderer.LOCATION_BY_VARIANT.get(object.getVariant());
    }

    @Override
    public ResourceLocation getAnimationResource(LamiaspisEntity animatable) {
        return new ResourceLocation(Aquaria.MOD_ID, "animations/lamiaspis.animation.json");
    }
    @Override
    public void setLivingAnimations(LamiaspisEntity entity, Integer uniqueID, AnimationEvent customPredicate) {
        super.setLivingAnimations(entity, uniqueID, customPredicate);
        IBone body = this.getAnimationProcessor().getBone("bodycore");
        EntityModelData extraData = (EntityModelData) customPredicate.getExtraDataOfType(EntityModelData.class).get(0);

        if (!entity.isInWater()) {
            body.setRotationZ(1.5708f);
        }
        else {
            body.setRotationX(extraData.headPitch * (float)Math.PI / 180F);
            body.setRotationY(extraData.netHeadYaw * (float)Math.PI / 180F);
        }
    }
    @OnlyIn(Dist.CLIENT)
    public abstract class EntityModel<T extends Entity> extends Model {
        public float attackTime;
        public boolean riding;
        public boolean young = true;

        protected EntityModel() {
            this(RenderType::entityCutoutNoCull);
        }

        protected EntityModel(Function<ResourceLocation, RenderType> p_102613_) {
            super(p_102613_);
        }

        public abstract void setupAnim(T p_102618_, float p_102619_, float p_102620_, float p_102621_, float p_102622_, float p_102623_);

        public void prepareMobModel(T p_102614_, float p_102615_, float p_102616_, float p_102617_) {
        }

        public void copyPropertiesTo(net.minecraft.client.model.EntityModel<T> p_102625_) {
            p_102625_.attackTime = this.attackTime;
            p_102625_.riding = this.riding;
            p_102625_.young = this.young;
        }
    }
}