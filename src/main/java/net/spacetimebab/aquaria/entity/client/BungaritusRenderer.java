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
import net.spacetimebab.aquaria.entity.custom.BungaritusEntity;
import net.spacetimebab.aquaria.entity.custom.SphenacantusEntity;
import net.spacetimebab.aquaria.entity.variant.BungaritusVariant;
import net.spacetimebab.aquaria.entity.variant.SphenacanthusVariant;
import org.jetbrains.annotations.NotNull;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import java.util.Map;

public class BungaritusRenderer extends GeoEntityRenderer<BungaritusEntity> {
    public static final Map<BungaritusVariant, ResourceLocation> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(BungaritusVariant.class), (p_114874_) -> {
                p_114874_.put(BungaritusVariant.WILD,
                        new ResourceLocation(Aquaria.MOD_ID, "textures/entity/bungaritus/wild_bungartius.png"));
                p_114874_.put(BungaritusVariant.PLATINUM,
                        new ResourceLocation(Aquaria.MOD_ID, "textures/entity/bungaritus/platinum_bungartius.png"));
                p_114874_.put(BungaritusVariant.ALBINO,
                        new ResourceLocation(Aquaria.MOD_ID, "textures/entity/bungaritus/albino_bungartius.png"));
                p_114874_.put(BungaritusVariant.RELIC_PLATE,
                        new ResourceLocation(Aquaria.MOD_ID, "textures/entity/bungaritus/relic_plate_bungartius.png"));
            });


    public BungaritusRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new BungaritusModel());
        this.shadowRadius = 1f;
    }

    @Override
    public @NotNull ResourceLocation getTextureLocation(@NotNull BungaritusEntity instance) {
        return LOCATION_BY_VARIANT.get(instance.getVariant());
    }

    @Override
    public RenderType getRenderType(BungaritusEntity animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(1F, 1F, 1F);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}
