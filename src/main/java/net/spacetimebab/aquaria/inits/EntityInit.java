package net.spacetimebab.aquaria.inits;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.level.Level;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.spacetimebab.aquaria.Aquaria;
import net.spacetimebab.aquaria.entity.custom.*;

public class EntityInit {


    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, Aquaria.MOD_ID);


    public static final RegistryObject<EntityType<SphenacantusEntity>> SPHENACANTHUS =
            ENTITY_TYPES.register("sphenacantus",
                    () -> EntityType.Builder.of(SphenacantusEntity::new, MobCategory.WATER_CREATURE)
                            .sized(0.75f, 0.75f)
                            .build(new ResourceLocation(Aquaria.MOD_ID, "sphenacantus").toString()));
    public static final RegistryObject<EntityType<DipterusEntity>> DIPTERUS =
            ENTITY_TYPES.register("dipterus",
                    () -> EntityType.Builder.of(DipterusEntity::new, MobCategory.WATER_CREATURE)
                            .sized(1f, 0.55f)
                            .build(new ResourceLocation(Aquaria.MOD_ID, "dipterus").toString()));
    public static final RegistryObject<EntityType<GoologongiaEntity>> GOOLOGONGIA =
            ENTITY_TYPES.register("goologongia",
                    () -> EntityType.Builder.of(GoologongiaEntity::new, MobCategory.WATER_CREATURE)
                            .sized(0.75f, 0.5f)
                            .build(new ResourceLocation(Aquaria.MOD_ID, "goologongia").toString()));

    public static final RegistryObject<EntityType<LamiaspisEntity>> LAMIASPIS =
            ENTITY_TYPES.register("lamiaspis",
                    () -> EntityType.Builder.of(LamiaspisEntity::new, MobCategory.WATER_CREATURE)
                            .sized(0.25f, 0.25f)
                            .build(new ResourceLocation(Aquaria.MOD_ID, "lamiaspis").toString()));

    public static final RegistryObject<EntityType<DiplacanthusEntity>> DIPLACANTHUS =
            ENTITY_TYPES.register("diplacanthus",
                    () -> EntityType.Builder.of(DiplacanthusEntity::new, MobCategory.WATER_CREATURE)
                            .sized(0.5f, 0.5f)
                            .build(new ResourceLocation(Aquaria.MOD_ID, "diplacanthus").toString()));

    public static final RegistryObject<EntityType<CampbellodusEntity>> CAMPBELLODUS =
            ENTITY_TYPES.register("campbellodus",
                    () -> EntityType.Builder.of(CampbellodusEntity::new, MobCategory.WATER_CREATURE)
                            .sized(0.25f, 0.25f)
                            .build(new ResourceLocation(Aquaria.MOD_ID, "campbellodus").toString()));

    public static final RegistryObject<EntityType<OrnithoprionEntity>> ORNITHOPRION =
            ENTITY_TYPES.register("ornithoprion",
                    () -> EntityType.Builder.of(OrnithoprionEntity::new, MobCategory.WATER_CREATURE)
                            .sized(2.3f, 0.75f)
                            .build(new ResourceLocation(Aquaria.MOD_ID, "ornithoprion").toString()));

    public static final RegistryObject<EntityType<BungaritusEntity>> BUNGARITUS =
            ENTITY_TYPES.register("bungaritus",
                    () -> EntityType.Builder.of(BungaritusEntity::new, MobCategory.WATER_CREATURE)
                            .sized(2f, 1f)
                            .build(new ResourceLocation(Aquaria.MOD_ID, "bungaritus").toString()));

    public static final RegistryObject<EntityType<PhleebEntity>> PHLEEB =
            ENTITY_TYPES.register("phleeb",
                    () -> EntityType.Builder.of((EntityType<PhleebEntity> aSuper, Level aSuper1) -> new PhleebEntity(aSuper, aSuper1), MobCategory.WATER_CREATURE)
                            .sized(0.25f, 0.25f)
                            .build(new ResourceLocation(Aquaria.MOD_ID, "phleeb").toString()));
    
    public static final RegistryObject<EntityType<DollyEntity>> DOLLY =
            ENTITY_TYPES.register("dolly",
                    () -> EntityType.Builder.of(DollyEntity::new, MobCategory.WATER_CREATURE)
                            .sized(2.5f, 0.90f)
                            .build(new ResourceLocation(Aquaria.MOD_ID, "dolly").toString()));
    
    public static final RegistryObject<EntityType<LatimeriaEntity>> LATIMERIA =
            ENTITY_TYPES.register("latimeria",
                    () -> EntityType.Builder.of(LatimeriaEntity::new, MobCategory.WATER_CREATURE)
                            .sized(0.25f, 0.25f)
                            .build(new ResourceLocation(Aquaria.MOD_ID, "latimeria").toString()));
    
    public static final RegistryObject<EntityType<NeoceratodusEntity>> NEOCERATODUS =
            ENTITY_TYPES.register("neoceratodus",
                    () -> EntityType.Builder.of(NeoceratodusEntity::new, MobCategory.WATER_CREATURE)
                            .sized(0.25f, 0.25f)
                            .build(new ResourceLocation(Aquaria.MOD_ID, "neoceratodus").toString()));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }

}
