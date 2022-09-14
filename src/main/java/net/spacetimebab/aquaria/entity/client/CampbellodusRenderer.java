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
import net.spacetimebab.aquaria.entity.custom.CampbellodusEntity;
import net.spacetimebab.aquaria.entity.custom.DipterusEntity;
import net.spacetimebab.aquaria.entity.custom.SphenacantusEntity;
import net.spacetimebab.aquaria.entity.variant.CampbellodusVariant;
import net.spacetimebab.aquaria.entity.variant.DipterusVariant;
import net.spacetimebab.aquaria.entity.variant.SphenacanthusVariant;
import org.jetbrains.annotations.NotNull;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import java.util.Map;

public class CampbellodusRenderer extends GeoEntityRenderer<CampbellodusEntity> {
    public static final Map<CampbellodusVariant, ResourceLocation> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(CampbellodusVariant.class), (p_114874_) -> {
                p_114874_.put(CampbellodusVariant.WILD,
                        new ResourceLocation(Aquaria.MOD_ID, "textures/entity/campbellodus/wild_campbellodus.png"));
                p_114874_.put(CampbellodusVariant.MELANISTIC,
                        new ResourceLocation(Aquaria.MOD_ID, "textures/entity/campbellodus/melanistic_campbellodus.png"));
                p_114874_.put(CampbellodusVariant.ALBINO,
                        new ResourceLocation(Aquaria.MOD_ID, "textures/entity/campbellodus/albino_campbellodus.png"));
                p_114874_.put(CampbellodusVariant.STRIPED,
                        new ResourceLocation(Aquaria.MOD_ID, "textures/entity/campbellodus/striped_campbellodus.png"));
            });


    public CampbellodusRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new CampbellodusModel());
        this.shadowRadius = 0.5f;
    }

    @Override
    public @NotNull ResourceLocation getTextureLocation(@NotNull CampbellodusEntity instance) {
        return LOCATION_BY_VARIANT.get(instance.getVariant());
    }

    @Override
    public RenderType getRenderType(CampbellodusEntity animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(1F, 1F, 1F);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}
