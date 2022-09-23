package net.spacetimebab.aquaria.entity.client;

import net.minecraft.resources.ResourceLocation;
import net.spacetimebab.aquaria.Aquaria;
import net.spacetimebab.aquaria.entity.custom.BungaritusEntity;
import net.spacetimebab.aquaria.entity.custom.OrnithoprionEntity;
import net.spacetimebab.aquaria.entity.custom.SphenacantusEntity;
import net.spacetimebab.aquaria.entity.variant.OrnithoprionVariant;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.model.provider.data.EntityModelData;

public class BungaritusModel extends AnimatedGeoModel<BungaritusEntity> {

    @Override
    public ResourceLocation getModelResource(BungaritusEntity object) {
        return new ResourceLocation(Aquaria.MOD_ID, "geo/bungartius.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(BungaritusEntity object) {
        return BungaritusRenderer.LOCATION_BY_VARIANT.get(object.getVariant());
    }

    @Override
    public ResourceLocation getAnimationResource(BungaritusEntity animatable) {
        return new ResourceLocation(Aquaria.MOD_ID, "animations/bungartius.animation.json");
    }
    @Override
    public void setLivingAnimations(BungaritusEntity entity, Integer uniqueID, AnimationEvent customPredicate) {
        super.setLivingAnimations(entity, uniqueID, customPredicate);
        IBone body = this.getAnimationProcessor().getBone("bodycore");
        EntityModelData extraData = (EntityModelData) customPredicate.getExtraDataOfType(EntityModelData.class).get(0);

        if (!entity.isInWater()) {
            body.setRotationZ(1.5708f);
        }
        else {
            body.setRotationX(extraData.headPitch * (float)Math.PI / 140);
            body.setRotationY(extraData.netHeadYaw * (float)Math.PI / 140);
        }
    }
}