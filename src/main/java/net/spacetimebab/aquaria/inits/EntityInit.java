package net.spacetimebab.aquaria.inits;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.spacetimebab.aquaria.Aquaria;
import net.spacetimebab.aquaria.entity.client.DipterusRenderer;
import net.spacetimebab.aquaria.entity.custom.DipterusEntity;
import net.spacetimebab.aquaria.entity.custom.GoologongiaEntity;
import net.spacetimebab.aquaria.entity.custom.SphenacantusEntity;

public class EntityInit {


    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, Aquaria.MOD_ID);


    public static final RegistryObject<EntityType<SphenacantusEntity>> SPHENACANTHUS =
            ENTITY_TYPES.register("sphenacantus",
                    () -> EntityType.Builder.of(SphenacantusEntity::new, MobCategory.WATER_CREATURE)
                            .sized(1f, 1f)
                            .build(new ResourceLocation(Aquaria.MOD_ID, "sphenacantus").toString()));
    public static final RegistryObject<EntityType<DipterusEntity>> DIPTERUS =
            ENTITY_TYPES.register("dipterus",
                    () -> EntityType.Builder.of(DipterusEntity::new, MobCategory.WATER_CREATURE)
                            .sized(0.75f, 0.75f)
                            .build(new ResourceLocation(Aquaria.MOD_ID, "dipterus").toString()));
    public static final RegistryObject<EntityType<GoologongiaEntity>> GOOLOGONGIA =
            ENTITY_TYPES.register("goologongia",
                    () -> EntityType.Builder.of(GoologongiaEntity::new, MobCategory.WATER_CREATURE)
                            .sized(0.75f, 0.5f)
                            .build(new ResourceLocation(Aquaria.MOD_ID, "goologongia").toString()));



    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }

}
