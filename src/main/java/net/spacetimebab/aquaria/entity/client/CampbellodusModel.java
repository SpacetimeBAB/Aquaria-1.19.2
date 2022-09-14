package net.spacetimebab.aquaria.entity.client;

import net.minecraft.resources.ResourceLocation;
import net.spacetimebab.aquaria.Aquaria;
import net.spacetimebab.aquaria.entity.custom.CampbellodusEntity;
import net.spacetimebab.aquaria.entity.custom.DipterusEntity;
import net.spacetimebab.aquaria.entity.custom.SphenacantusEntity;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class CampbellodusModel extends AnimatedGeoModel<CampbellodusEntity> {

    @Override
    public ResourceLocation getModelResource(CampbellodusEntity object) {
        return new ResourceLocation(Aquaria.MOD_ID, "geo/campbellodus.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(CampbellodusEntity object) {
        return CampbellodusRenderer.LOCATION_BY_VARIANT.get(object.getVariant());
    }

    @Override
    public ResourceLocation getAnimationResource(CampbellodusEntity animatable) {
        return new ResourceLocation(Aquaria.MOD_ID, "animations/campbellodus.animation.json");
    }
}