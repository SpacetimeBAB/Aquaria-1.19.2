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
import net.spacetimebab.aquaria.entity.custom.OrnithoprionEntity;
import net.spacetimebab.aquaria.entity.custom.SphenacantusEntity;
import net.spacetimebab.aquaria.entity.variant.OrnithoprionVariant;
import net.spacetimebab.aquaria.entity.variant.SphenacanthusVariant;
import org.jetbrains.annotations.NotNull;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import java.util.Map;

public class OrnithoprionRenderer extends GeoEntityRenderer<OrnithoprionEntity> {
    public static final Map<OrnithoprionVariant, ResourceLocation> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(OrnithoprionVariant.class), (p_114874_) -> {
                p_114874_.put(OrnithoprionVariant.WILD,
                        new ResourceLocation(Aquaria.MOD_ID, "textures/entity/ornithoprion/ornithoprion.png"));
                p_114874_.put(OrnithoprionVariant.PLATINUM,
                        new ResourceLocation(Aquaria.MOD_ID, "textures/entity/ornithoprion/platinum_ornithoprion.png"));
                p_114874_.put(OrnithoprionVariant.ALBINO,
                        new ResourceLocation(Aquaria.MOD_ID, "textures/entity/ornithoprion/albino_ornithoprion.png"));
                p_114874_.put(OrnithoprionVariant.DEEP_HUNTER,
                        new ResourceLocation(Aquaria.MOD_ID, "textures/entity/ornithoprion/deep_hunter_ornithoprion.png"));
            });


    public OrnithoprionRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new OrnithoprionModel());
        this.shadowRadius = 1f;
    }

    @Override
    public @NotNull ResourceLocation getTextureLocation(@NotNull OrnithoprionEntity instance) {
        return LOCATION_BY_VARIANT.get(instance.getVariant());
    }

    @Override
    public RenderType getRenderType(OrnithoprionEntity animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(1F, 1F, 1F);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}
