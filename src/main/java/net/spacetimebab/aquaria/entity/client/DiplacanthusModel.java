package net.spacetimebab.aquaria.entity.client;

import net.minecraft.resources.ResourceLocation;
import net.spacetimebab.aquaria.Aquaria;
import net.spacetimebab.aquaria.entity.custom.*;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.model.provider.data.EntityModelData;

public class DiplacanthusModel extends AnimatedGeoModel<DiplacanthusEntity> {

    @Override
    public ResourceLocation getModelResource(DiplacanthusEntity object) {
        return new ResourceLocation(Aquaria.MOD_ID, "geo/diplacanthus.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(DiplacanthusEntity object) {
        return DiplacanthusRenderer.LOCATION_BY_VARIANT.get(object.getVariant());
    }

    @Override
    public ResourceLocation getAnimationResource(DiplacanthusEntity animatable) {
        return new ResourceLocation(Aquaria.MOD_ID, "animations/diplacanthus.animation.json");
    }
    @Override
    public void setLivingAnimations(DiplacanthusEntity entity, Integer uniqueID, AnimationEvent customPredicate) {
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
}