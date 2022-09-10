package net.spacetimebab.aquaria.entity.client;

import net.minecraft.resources.ResourceLocation;
import net.spacetimebab.aquaria.Aquaria;
import net.spacetimebab.aquaria.entity.custom.DipterusEntity;
import net.spacetimebab.aquaria.entity.custom.SphenacantusEntity;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class DipterusModel extends AnimatedGeoModel<DipterusEntity> {

    @Override
    public ResourceLocation getModelResource(DipterusEntity object) {
        return new ResourceLocation(Aquaria.MOD_ID, "geo/dipterus.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(DipterusEntity object) {
        return DipterusRenderer.LOCATION_BY_VARIANT.get(object.getVariant());
    }

    @Override
    public ResourceLocation getAnimationResource(DipterusEntity animatable) {
        return new ResourceLocation(Aquaria.MOD_ID, "animations/dipterus.animation.json");
    }
}