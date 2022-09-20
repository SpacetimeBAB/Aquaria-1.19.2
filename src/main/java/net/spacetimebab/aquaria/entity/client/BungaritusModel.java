package net.spacetimebab.aquaria.entity.client;

import net.minecraft.resources.ResourceLocation;
import net.spacetimebab.aquaria.Aquaria;
import net.spacetimebab.aquaria.entity.custom.BungaritusEntity;
import net.spacetimebab.aquaria.entity.custom.OrnithoprionEntity;
import net.spacetimebab.aquaria.entity.custom.SphenacantusEntity;
import net.spacetimebab.aquaria.entity.variant.OrnithoprionVariant;
import software.bernie.geckolib3.model.AnimatedGeoModel;

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
}