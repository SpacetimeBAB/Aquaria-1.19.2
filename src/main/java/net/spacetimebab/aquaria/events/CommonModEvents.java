package net.spacetimebab.aquaria.events;

import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.spacetimebab.aquaria.Aquaria;
import net.spacetimebab.aquaria.entity.custom.*;
import net.spacetimebab.aquaria.inits.EntityInit;

@Mod.EventBusSubscriber(modid = Aquaria.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class CommonModEvents {
    @SubscribeEvent
    public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
        event.put(EntityInit.SPHENACANTHUS.get(), SphenacantusEntity.attributes().build());
        event.put(EntityInit.DIPTERUS.get(), DipterusEntity.attributes().build());
        event.put(EntityInit.GOOLOGONGIA.get(), GoologongiaEntity.attributes().build());
        event.put(EntityInit.LAMIASPIS.get(), LamiaspisEntity.attributes().build());
        event.put(EntityInit.DIPLACANTHUS.get(), DiplacanthusEntity.attributes().build());
        event.put(EntityInit.CAMPBELLODUS.get(), CampbellodusEntity.attributes().build());
        event.put(EntityInit.ORNITHOPRION.get(), OrnithoprionEntity.attributes().build());


    }


}
