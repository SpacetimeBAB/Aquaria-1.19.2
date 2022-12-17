package net.spacetimebab.aquaria.entity.client;

import net.minecraft.resources.ResourceLocation;
import net.spacetimebab.aquaria.Aquaria;
import net.spacetimebab.aquaria.entity.custom.BungaritusEntity;
import net.spacetimebab.aquaria.entity.custom.OrnithoprionEntity;
import net.spacetimebab.aquaria.entity.custom.SphenacantusEntity;
import net.spacetimebab.aquaria.entity.variant.OrnithoprionVariant;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.model.provider.data.EntityModelData;

public class OrnithoprionModel extends AnimatedGeoModel<OrnithoprionEntity> {

    @Override
    public ResourceLocation getModelResource(OrnithoprionEntity object) {
        return new ResourceLocation(Aquaria.MOD_ID, "geo/ornithoprion.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(OrnithoprionEntity object) {
        return OrnithoprionRenderer.LOCATION_BY_VARIANT.get(object.getVariant());
    }

    @Override
    public ResourceLocation getAnimationResource(OrnithoprionEntity animatable) {
        return new ResourceLocation(Aquaria.MOD_ID, "animations/ornithoprion.animation.json");
    }

    @Override
    public void setLivingAnimations(OrnithoprionEntity entity, Integer uniqueID, AnimationEvent customPredicate) {
        super.setLivingAnimations(entity, uniqueID, customPredicate);
        IBone body = this.getAnimationProcessor().getBone("bodycore");
        EntityModelData extraData = (EntityModelData) customPredicate.getExtraDataOfType(EntityModelData.class).get(0);

        if (!entity.isInWater()) {
            body.setRotationZ(1.5708f);
            float rotationYawMultiplier = 1.4F;
        }
        else {
            body.setRotationX(extraData.headPitch * (float)Math.PI / 200);
            //body.setRotationY(extraData.netHeadYaw * (float)Math.PI / 200);
        }
        
        float multiplier = 1.4F;

        float rotate = entity.prevSetYaw+(entity.setYaw-entity.prevSetYaw)*customPredicate.getPartialTick();
        this.getAnimationProcessor().getBone("tail").setRotationY(-rotate * multiplier);
        this.getAnimationProcessor().getBone("tail2").setRotationY(-rotate * multiplier);
        this.getAnimationProcessor().getBone("tail3").setRotationY(-rotate * multiplier);
        this.getAnimationProcessor().getBone("tail4").setRotationY(-rotate * multiplier);
        this.getAnimationProcessor().getBone("head").setRotationY(rotate * multiplier);
    
    }
    
    //modifying the bones with delayed rotation
    /*
    
    public void setCustomAnimations(OrnithoprionEntity animatable, int instanceId, AnimationEvent animationEvent) {
        float multiplier = 1.6F;

            float rotate = animatable.prevSetYaw+(animatable.setYaw-animatable.prevSetYaw)*animationEvent.getPartialTick();
            this.getAnimationProcessor().getBone("tail").setRotationY(rotate * multiplier);
            this.getAnimationProcessor().getBone("tail1").setRotationY(rotate * multiplier);
            this.getAnimationProcessor().getBone("tail2").setRotationY(rotate * multiplier);
            this.getAnimationProcessor().getBone("tail3").setRotationY(rotate * multiplier);
            this.getAnimationProcessor().getBone("tail4").setRotationY(rotate * multiplier);
            this.getAnimationProcessor().getBone("head").setRotationY(-rotate * multiplier);
    }
    */

}