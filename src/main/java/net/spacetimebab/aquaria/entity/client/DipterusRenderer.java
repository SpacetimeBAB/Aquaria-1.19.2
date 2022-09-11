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
import net.spacetimebab.aquaria.entity.custom.SphenacantusEntity;
import net.spacetimebab.aquaria.entity.variant.DipterusVariant;
import net.spacetimebab.aquaria.entity.variant.SphenacanthusVariant;
import org.jetbrains.annotations.NotNull;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import java.util.Map;

public class DipterusRenderer extends GeoEntityRenderer<DipterusEntity> {
    public static final Map<DipterusVariant, ResourceLocation> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(DipterusVariant.class), (p_114874_) -> {
                p_114874_.put(DipterusVariant.WILD,
                        new ResourceLocation(Aquaria.MOD_ID, "textures/entity/dipterus/wild_dipterus.png"));
                p_114874_.put(DipterusVariant.PLATINUM,
                        new ResourceLocation(Aquaria.MOD_ID, "textures/entity/dipterus/platinum_dipterus.png"));
                p_114874_.put(DipterusVariant.ALBINO,
                        new ResourceLocation(Aquaria.MOD_ID, "textures/entity/dipterus/albino_dipterus.png"));
                p_114874_.put(DipterusVariant.INVERTED,
                        new ResourceLocation(Aquaria.MOD_ID, "textures/entity/dipterus/inverted_dipterus.png"));
            });


    public DipterusRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new DipterusModel());
        this.shadowRadius = 0.5f;
    }

    @Override
    public @NotNull ResourceLocation getTextureLocation(@NotNull DipterusEntity instance) {
        return LOCATION_BY_VARIANT.get(instance.getVariant());
    }

    @Override
    public RenderType getRenderType(DipterusEntity animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(1F, 1F, 1F);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}
