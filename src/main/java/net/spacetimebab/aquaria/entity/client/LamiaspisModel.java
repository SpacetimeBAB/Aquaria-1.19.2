package net.spacetimebab.aquaria.entity.client;

import net.minecraft.resources.ResourceLocation;
import net.spacetimebab.aquaria.Aquaria;
import net.spacetimebab.aquaria.entity.custom.DipterusEntity;
import net.spacetimebab.aquaria.entity.custom.LamiaspisEntity;
import net.spacetimebab.aquaria.entity.custom.SphenacantusEntity;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class LamiaspisModel extends AnimatedGeoModel<LamiaspisEntity> {

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
}