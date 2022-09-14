package net.spacetimebab.aquaria.entity.client;

import net.minecraft.resources.ResourceLocation;
import net.spacetimebab.aquaria.Aquaria;
import net.spacetimebab.aquaria.entity.custom.DiplacanthusEntity;
import net.spacetimebab.aquaria.entity.custom.DipterusEntity;
import net.spacetimebab.aquaria.entity.custom.LamiaspisEntity;
import net.spacetimebab.aquaria.entity.custom.SphenacantusEntity;
import software.bernie.geckolib3.model.AnimatedGeoModel;

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
}