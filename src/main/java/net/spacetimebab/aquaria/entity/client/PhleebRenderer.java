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
import net.spacetimebab.aquaria.entity.custom.PhleebEntity;
import net.spacetimebab.aquaria.entity.custom.SphenacantusEntity;
import net.spacetimebab.aquaria.entity.variant.SphenacanthusVariant;
import org.jetbrains.annotations.NotNull;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import java.util.Map;

public class PhleebRenderer extends GeoEntityRenderer<PhleebEntity> {
    public static final Map<SphenacanthusVariant, ResourceLocation> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(SphenacanthusVariant.class), (p_114874_) -> {
                p_114874_.put(SphenacanthusVariant.WILD,
                        new ResourceLocation(Aquaria.MOD_ID, "textures/entity/phleeb/phlebolepis.png"));
                p_114874_.put(SphenacanthusVariant.AMELANISTIC,
                        new ResourceLocation(Aquaria.MOD_ID, "textures/entity/phleeb/phlebolepisplatinum.png"));
                p_114874_.put(SphenacanthusVariant.ALBINO,
                        new ResourceLocation(Aquaria.MOD_ID, "textures/entity/phleeb/phlebolepisalbino.png"));
                p_114874_.put(SphenacanthusVariant.OPAL,
                        new ResourceLocation(Aquaria.MOD_ID, "textures/entity/phleeb/phlebolepisopal.png"));
            });


    public PhleebRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new PhleebModel());
        this.shadowRadius = 1f;
    }

    @Override
    public @NotNull ResourceLocation getTextureLocation(@NotNull PhleebEntity instance) {
        return LOCATION_BY_VARIANT.get(instance.getVariant());
    }

    @Override
    public RenderType getRenderType(PhleebEntity animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(1F, 1F, 1F);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}
