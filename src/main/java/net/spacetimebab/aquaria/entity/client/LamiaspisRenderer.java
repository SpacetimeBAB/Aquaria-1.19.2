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
import net.spacetimebab.aquaria.entity.custom.DipterusEntity;
import net.spacetimebab.aquaria.entity.custom.LamiaspisEntity;
import net.spacetimebab.aquaria.entity.custom.SphenacantusEntity;
import net.spacetimebab.aquaria.entity.variant.DipterusVariant;
import net.spacetimebab.aquaria.entity.variant.LamiaspisVariant;
import net.spacetimebab.aquaria.entity.variant.SphenacanthusVariant;
import org.jetbrains.annotations.NotNull;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import java.util.Map;

public class LamiaspisRenderer extends GeoEntityRenderer<LamiaspisEntity> {
    public static final Map<LamiaspisVariant, ResourceLocation> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(LamiaspisVariant.class), (p_114874_) -> {
                p_114874_.put(LamiaspisVariant.WILD,
                        new ResourceLocation(Aquaria.MOD_ID, "textures/entity/lamiaspis/wild_lamiaspis.png"));
                p_114874_.put(LamiaspisVariant.PLATINUM,
                        new ResourceLocation(Aquaria.MOD_ID, "textures/entity/lamiaspis/platinum_lamiaspis.png"));
                p_114874_.put(LamiaspisVariant.ALBINO,
                        new ResourceLocation(Aquaria.MOD_ID, "textures/entity/lamiaspis/albino_lamiaspis.png"));
                p_114874_.put(LamiaspisVariant.STEELHEAD,
                        new ResourceLocation(Aquaria.MOD_ID, "textures/entity/lamiaspis/steel_head_lamiaspis.png"));
            });


    public LamiaspisRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new LamiaspisModel());
        this.shadowRadius = 0.5f;
    }

    @Override
    public @NotNull ResourceLocation getTextureLocation(@NotNull LamiaspisEntity instance) {
        return LOCATION_BY_VARIANT.get(instance.getVariant());
    }

    @Override
    public RenderType getRenderType(LamiaspisEntity animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(1F, 1F, 1F);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}
