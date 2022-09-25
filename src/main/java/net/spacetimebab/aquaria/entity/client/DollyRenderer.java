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
import net.spacetimebab.aquaria.entity.custom.DollyEntity;
import net.spacetimebab.aquaria.entity.custom.SphenacantusEntity;
import net.spacetimebab.aquaria.entity.variant.DollyVariant;
import net.spacetimebab.aquaria.entity.variant.SphenacanthusVariant;
import org.jetbrains.annotations.NotNull;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import java.util.Map;

public class DollyRenderer extends GeoEntityRenderer<DollyEntity> {
    public static final Map<DollyVariant, ResourceLocation> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(DollyVariant.class), (p_114874_) -> {
                p_114874_.put(DollyVariant.WILD,
                        new ResourceLocation(Aquaria.MOD_ID, "textures/entity/dolly/dollywild.png"));
                p_114874_.put(DollyVariant.AMELANISTIC,
                        new ResourceLocation(Aquaria.MOD_ID, "textures/entity/dolly/dollyamelanistic.png"));
                p_114874_.put(DollyVariant.ALBINO,
                        new ResourceLocation(Aquaria.MOD_ID, "textures/entity/dolly/dollyalbino.png"));
                p_114874_.put(DollyVariant.ORCA,
                        new ResourceLocation(Aquaria.MOD_ID, "textures/entity/dolly/dollyorca.png"));
            });


    public DollyRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new DollyModel());
        this.shadowRadius = 1f;
    }

    @Override
    public @NotNull ResourceLocation getTextureLocation(@NotNull DollyEntity instance) {
        return LOCATION_BY_VARIANT.get(instance.getVariant());
    }

    @Override
    public RenderType getRenderType(DollyEntity animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(1F, 1F, 1F);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}
