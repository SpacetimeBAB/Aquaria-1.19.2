package net.spacetimebab.aquaria.events;

import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.spacetimebab.aquaria.Aquaria;
import net.spacetimebab.aquaria.entity.client.*;
import net.spacetimebab.aquaria.inits.EntityInit;

@Mod.EventBusSubscriber(modid = Aquaria.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientModEvents {
    @SubscribeEvent
    public static void clientSetup(final EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(EntityInit.SPHENACANTHUS.get(), SphenacantusRenderer::new);
        event.registerEntityRenderer(EntityInit.DIPTERUS.get(), DipterusRenderer::new);
        event.registerEntityRenderer(EntityInit.GOOLOGONGIA.get(), GoologongiaRenderer::new);
        event.registerEntityRenderer(EntityInit.LAMIASPIS.get(), LamiaspisRenderer::new);
        event.registerEntityRenderer(EntityInit.DIPLACANTHUS.get(), DiplacanthusRenderer::new);
        event.registerEntityRenderer(EntityInit.CAMPBELLODUS.get(), CampbellodusRenderer::new);
        event.registerEntityRenderer(EntityInit.ORNITHOPRION.get(), OrnithoprionRenderer::new);
        event.registerEntityRenderer(EntityInit.BUNGARITUS.get(), BungaritusRenderer::new);
        event.registerEntityRenderer(EntityInit.PHLEEB.get(), PhleebRenderer::new);
        event.registerEntityRenderer(EntityInit.DOLLY.get(), DollyRenderer::new);
        event.registerEntityRenderer(EntityInit.LATIMERIA.get(), LatimeriaRenderer::new);
        event.registerEntityRenderer(EntityInit.NEOCERATODUS.get(),NeoceratodusRenderer::new);
    }
}
