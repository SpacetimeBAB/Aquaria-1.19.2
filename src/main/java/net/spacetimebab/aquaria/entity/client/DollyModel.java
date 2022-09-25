package net.spacetimebab.aquaria.entity.client;

import net.minecraft.resources.ResourceLocation;
import net.spacetimebab.aquaria.Aquaria;
import net.spacetimebab.aquaria.entity.custom.BungaritusEntity;
import net.spacetimebab.aquaria.entity.custom.DollyEntity;
import net.spacetimebab.aquaria.entity.custom.GoologongiaEntity;
import net.spacetimebab.aquaria.entity.custom.SphenacantusEntity;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.model.provider.data.EntityModelData;

public class DollyModel extends AnimatedGeoModel<DollyEntity> {

    @Override
    public ResourceLocation getModelResource(DollyEntity object) {
        return new ResourceLocation(Aquaria.MOD_ID, "geo/dolly.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(DollyEntity object) {
        return SphenacantusRenderer.LOCATION_BY_VARIANT.get(object.getVariant());
    }

    @Override
    public ResourceLocation getAnimationResource(DollyEntity animatable) {
        return new ResourceLocation(Aquaria.MOD_ID, "animations/dolly.animation.json");
    }
    @Override
    public void setLivingAnimations(DollyEntity entity, Integer uniqueID, AnimationEvent customPredicate) {
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