package net.spacetimebab.aquaria.entity.client;

import net.minecraft.resources.ResourceLocation;
import net.spacetimebab.aquaria.Aquaria;
import net.spacetimebab.aquaria.entity.custom.SphenacantusEntity;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class SphenacantusModel extends AnimatedGeoModel<SphenacantusEntity> {

    @Override
    public ResourceLocation getModelResource(SphenacantusEntity object) {
        return new ResourceLocation(Aquaria.MOD_ID, "geo/sphenacanthus.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(SphenacantusEntity object) {
        return new ResourceLocation(Aquaria.MOD_ID, "textures/entity/sphenacantus/wild_sphenacanthus.png");
    }

    @Override
    public ResourceLocation getAnimationResource(SphenacantusEntity animatable) {
        return new ResourceLocation(Aquaria.MOD_ID, "animations/sphenacanthus.animation.json");
    }
}