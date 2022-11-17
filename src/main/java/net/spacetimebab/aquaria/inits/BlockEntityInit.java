package net.spacetimebab.aquaria.inits;

import com.mojang.datafixers.types.Type;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.spacetimebab.aquaria.Aquaria;
//import net.spacetimebab.aquaria.block.custom.ResurrectionAltarBlock;
//import net.spacetimebab.aquaria.entity.ResurrectionAltarBlockEntity;
import net.spacetimebab.aquaria.entity.custom.NeoceratodusEntity;

import java.util.Set;
import java.util.function.Supplier;

public class BlockEntityInit extends BlockEntityType{
    public static final DeferredRegister<BlockEntityType<?>> TILE_ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, Aquaria.MOD_ID);




  //  public static final RegistryObject<BlockEntityType<ResurrectionAltarBlockEntity>> RESALTAR_TILE =
   //         TILE_ENTITY_TYPES.register("resaltar_tile",
     //               () -> BlockEntityType.Builder.of(ResurrectionAltarBlockEntity::new, MobCategory.WATER_CREATURE)));

//    public static final RegistryObject<EntityType<NeoceratodusEntity>> NEOCERATODUS =
   //         ENTITY_TYPES.register("neoceratodus",
     //               () -> EntityType.Builder.of(NeoceratodusEntity::new, MobCategory.WATER_CREATURE)
       //                     .sized(0.25f, 0.25f)
         //                   .build(new ResourceLocation(Aquaria.MOD_ID, "neoceratodus").toString()));



    public BlockEntityInit(BlockEntitySupplier p_155259_, Set p_155260_, Type p_155261_) {
        super(p_155259_, p_155260_, p_155261_);
    }




    public static void register(IEventBus eventBus) {
        TILE_ENTITY_TYPES.register(eventBus);
    }


}
