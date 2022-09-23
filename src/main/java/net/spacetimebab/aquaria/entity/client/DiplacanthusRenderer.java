package net.spacetimebab.aquaria.entity.client;

import com.google.common.collect.Maps;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.Util;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.spacetimebab.aquaria.Aquaria;
import net.spacetimebab.aquaria.entity.custom.DiplacanthusEntity;
import net.spacetimebab.aquaria.entity.custom.DipterusEntity;
import net.spacetimebab.aquaria.entity.custom.LamiaspisEntity;
import net.spacetimebab.aquaria.entity.custom.SphenacantusEntity;
import net.spacetimebab.aquaria.entity.variant.DiplacanthusVariant;
import net.spacetimebab.aquaria.entity.variant.DipterusVariant;
import net.spacetimebab.aquaria.entity.variant.LamiaspisVariant;
import net.spacetimebab.aquaria.entity.variant.SphenacanthusVariant;
import org.jetbrains.annotations.NotNull;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;
import software.bernie.geckolib3.renderers.geo.layer.LayerGlowingAreasGeo;

import java.util.Map;
import java.util.function.Function;

public class DiplacanthusRenderer extends GeoEntityRenderer<DiplacanthusEntity> {
    public static final Map<DiplacanthusVariant, ResourceLocation> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(DiplacanthusVariant.class), (p_114874_) -> {
                p_114874_.put(DiplacanthusVariant.WILD,
                        new ResourceLocation(Aquaria.MOD_ID, "textures/entity/diplacanthus/diplacanthus.png"));
                p_114874_.put(DiplacanthusVariant.PLATINUM,
                        new ResourceLocation(Aquaria.MOD_ID, "textures/entity/diplacanthus/platinum_diplacanthus.png"));
                p_114874_.put(DiplacanthusVariant.ALBINO,
                        new ResourceLocation(Aquaria.MOD_ID, "textures/entity/diplacanthus/albino_diplacanthus.png"));
                p_114874_.put(DiplacanthusVariant.ANCHOVY,
                        new ResourceLocation(Aquaria.MOD_ID, "textures/entity/diplacanthus/anchovy_diplacanthus.png"));
            });


    public DiplacanthusRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new DiplacanthusModel());
        this.shadowRadius = 0.5f;
    }

    @Override
    public @NotNull ResourceLocation getTextureLocation(@NotNull DiplacanthusEntity instance) {
        return LOCATION_BY_VARIANT.get(instance.getVariant());
    }

    @Override
    public RenderType getRenderType(DiplacanthusEntity animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(1F, 1F, 1F);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }

    public class EmissiveRenderer extends LayerGlowingAreasGeo{

        public EmissiveRenderer(GeoEntityRenderer renderer, Function funcGetCurrentTexture, Function funcGetCurrentModel, Function funcGetEmissiveRenderType) {
            super(renderer, funcGetCurrentTexture, funcGetCurrentModel, funcGetEmissiveRenderType);
        }
    }
}
