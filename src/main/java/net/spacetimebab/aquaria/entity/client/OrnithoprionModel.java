package net.spacetimebab.aquaria.entity.client;

import net.minecraft.resources.ResourceLocation;
import net.spacetimebab.aquaria.Aquaria;
import net.spacetimebab.aquaria.entity.custom.OrnithoprionEntity;
import net.spacetimebab.aquaria.entity.custom.SphenacantusEntity;
import net.spacetimebab.aquaria.entity.variant.OrnithoprionVariant;
import software.bernie.geckolib3.model.AnimatedGeoModel;

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
}