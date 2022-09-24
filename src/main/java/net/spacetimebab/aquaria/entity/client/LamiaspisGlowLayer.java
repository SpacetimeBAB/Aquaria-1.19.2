package net.spacetimebab.aquaria.entity.client;


import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.spacetimebab.aquaria.entity.custom.LamiaspisEntity;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;
import software.bernie.geckolib3.renderers.geo.layer.LayerGlowingAreasGeo;

import java.util.function.Function;

@OnlyIn(Dist.CLIENT)
public class LamiaspisGlowLayer<T extends LivingEntity> extends LayerGlowingAreasGeo<LamiaspisEntity> {

        private static final RenderType LAMIASPIS_GLOW = RenderType.eyes(new ResourceLocation("textures/entity/lamiaspis/lamiaspis_glow.png"));

    public LamiaspisGlowLayer(GeoEntityRenderer<LamiaspisEntity> renderer, Function<LamiaspisEntity, ResourceLocation> funcGetCurrentTexture, Function<LamiaspisEntity, ResourceLocation> funcGetCurrentModel, Function<ResourceLocation, RenderType> funcGetEmissiveRenderType) {
        super(renderer, funcGetCurrentTexture, funcGetCurrentModel, funcGetEmissiveRenderType);
    }




    public RenderType renderType() {
            return LAMIASPIS_GLOW;
        }
    @OnlyIn(Dist.CLIENT)
    public interface RenderLayerParent2<T extends Entity, M extends LivingEntity> {
        M getModel();

        ResourceLocation getTextureLocation(T p_115812_);
    }

    }
