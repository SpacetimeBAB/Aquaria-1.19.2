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
import net.spacetimebab.aquaria.entity.custom.NeoceratodusEntity;
import net.spacetimebab.aquaria.entity.custom.OrnithoprionEntity;
import net.spacetimebab.aquaria.entity.custom.SphenacantusEntity;
import net.spacetimebab.aquaria.entity.variant.LatimeriaVariant;
import net.spacetimebab.aquaria.entity.variant.NeoceratodusVariant;
import net.spacetimebab.aquaria.entity.variant.OrnithoprionVariant;
import net.spacetimebab.aquaria.entity.variant.SphenacanthusVariant;
import org.jetbrains.annotations.NotNull;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import java.util.Map;

public class NeoceratodusRenderer extends GeoEntityRenderer<NeoceratodusEntity> {
    public static final Map<NeoceratodusVariant, ResourceLocation> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(NeoceratodusVariant.class), (p_114874_) -> {
                p_114874_.put(NeoceratodusVariant.WILD,
                        new ResourceLocation(Aquaria.MOD_ID, "textures/entity/neoceratodus/neoceratodus.png"));
                p_114874_.put(NeoceratodusVariant.PLATINUM,
                        new ResourceLocation(Aquaria.MOD_ID, "textures/entity/neoceratodus/neoceratodusplatinum.png"));
                p_114874_.put(NeoceratodusVariant.ALBINO,
                        new ResourceLocation(Aquaria.MOD_ID, "textures/entity/neoceratodus/neoceratodusalbino.png"));
                p_114874_.put(NeoceratodusVariant.LEUCISTIC,
                        new ResourceLocation(Aquaria.MOD_ID, "textures/entity/neoceratodus/neoceratodusleucistic.png"));
            });


    public NeoceratodusRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new NeoceratodusModel());
        this.shadowRadius = 1f;
    }

    @Override
    public @NotNull ResourceLocation getTextureLocation(@NotNull NeoceratodusEntity instance) {
        return LOCATION_BY_VARIANT.get(instance.getVariant());
    }

    @Override
    public RenderType getRenderType(NeoceratodusEntity animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(1F, 1F, 1F);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}
