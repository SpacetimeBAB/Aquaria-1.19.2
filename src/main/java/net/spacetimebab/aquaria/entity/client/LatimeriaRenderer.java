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
import net.spacetimebab.aquaria.entity.custom.LatimeriaEntity;
import net.spacetimebab.aquaria.entity.custom.OrnithoprionEntity;
import net.spacetimebab.aquaria.entity.custom.SphenacantusEntity;
import net.spacetimebab.aquaria.entity.variant.LatimeriaVariant;
import net.spacetimebab.aquaria.entity.variant.OrnithoprionVariant;
import net.spacetimebab.aquaria.entity.variant.SphenacanthusVariant;
import org.jetbrains.annotations.NotNull;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import java.util.Map;

public class LatimeriaRenderer extends GeoEntityRenderer<LatimeriaEntity> {
    public static final Map<LatimeriaVariant, ResourceLocation> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(LatimeriaVariant.class), (p_114874_) -> {
                p_114874_.put(LatimeriaVariant.WILD,
                        new ResourceLocation(Aquaria.MOD_ID, "textures/entity/latimeria/latimeriawild.png"));
                p_114874_.put(LatimeriaVariant.PLATINUM,
                        new ResourceLocation(Aquaria.MOD_ID, "textures/entity/latimeria/latimeriaplatinum.png"));
                p_114874_.put(LatimeriaVariant.ALBINO,
                        new ResourceLocation(Aquaria.MOD_ID, "textures/entity/latimeria/latimeriaalbino.png"));
                p_114874_.put(LatimeriaVariant.MURICA,
                        new ResourceLocation(Aquaria.MOD_ID, "textures/entity/latimeria/latimeriamerica.png"));
            });


    public LatimeriaRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new LatimeriaModel());
        this.shadowRadius = 1f;
    }

    @Override
    public @NotNull ResourceLocation getTextureLocation(@NotNull LatimeriaEntity instance) {
        return LOCATION_BY_VARIANT.get(instance.getVariant());
    }

    @Override
    public RenderType getRenderType(LatimeriaEntity animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(1F, 1F, 1F);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}
