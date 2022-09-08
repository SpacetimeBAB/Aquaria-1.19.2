package net.spacetimebab.aquaria.inits;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.spacetimebab.aquaria.Aquaria;
import net.spacetimebab.aquaria.entity.custom.SphenacantusEntity;

public class EntityInit {


    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, Aquaria.MOD_ID);


    public static final RegistryObject<EntityType<SphenacantusEntity>> SPHENACANTHUS =
            ENTITY_TYPES.register("sphenacantus",
                    () -> EntityType.Builder.of(SphenacantusEntity::new, MobCategory.WATER_CREATURE)
                            .sized(1f, 1f)
                            .build(new ResourceLocation(Aquaria.MOD_ID, "sphenacantus").toString()));



    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }

}
