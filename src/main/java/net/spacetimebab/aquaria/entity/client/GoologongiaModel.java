package net.spacetimebab.aquaria.entity.client;

import net.minecraft.resources.ResourceLocation;
import net.spacetimebab.aquaria.Aquaria;
import net.spacetimebab.aquaria.entity.custom.GoologongiaEntity;
import net.spacetimebab.aquaria.entity.custom.SphenacantusEntity;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class GoologongiaModel extends AnimatedGeoModel<GoologongiaEntity> {

    @Override
    public ResourceLocation getModelResource(GoologongiaEntity object) {
        return new ResourceLocation(Aquaria.MOD_ID, "geo/goologongia.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(GoologongiaEntity object) {
        return SphenacantusRenderer.LOCATION_BY_VARIANT.get(object.getVariant());
    }

    @Override
    public ResourceLocation getAnimationResource(GoologongiaEntity animatable) {
        return new ResourceLocation(Aquaria.MOD_ID, "animations/goologongia.animation.json");
    }
}