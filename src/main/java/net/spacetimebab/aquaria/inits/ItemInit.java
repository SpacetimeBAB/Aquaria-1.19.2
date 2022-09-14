package net.spacetimebab.aquaria.inits;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.MobBucketItem;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.Fluids;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.spacetimebab.aquaria.Aquaria;

import java.util.function.Supplier;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Aquaria.MOD_ID);

    public static final RegistryObject<Item> RAW_SPHETHACANTHUS = ITEMS.register("raw_sphethacantus",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).food(FoodInit.RAW_SPHETHACANTHUS)));

    public static final RegistryObject<Item> COOKED_SPHETHACANTHUS = ITEMS.register("cooked_sphethacantus",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).food(FoodInit.COOKED_SPHETHACANTHUS)));

    public static final RegistryObject<Item> SPHENA_SOUL = ITEMS.register("sphena_soul",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> SPHENA_BUCKET = ITEMS.register("sphena_bucket",
            () -> new ItemModFishBucket(EntityInit.SPHENACANTHUS, () -> Fluids.WATER, Items.BUCKET, false,
                    new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1)));
    public static final RegistryObject<Item> SPHENACANTHUS_SPAWN_EGG = ITEMS.register("sphenacanthus_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityInit.SPHENACANTHUS, 0xDFCC8F, 0x2D2611,
                    new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> DIPTERUS_SPAWN_EGG = ITEMS.register("dipterus_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityInit.DIPTERUS, 0xDFCC8F, 0x2D2611,
                    new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> GOOLAGONGIA_SPAWN_EGG = ITEMS.register("goolagongia_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityInit.GOOLOGONGIA, 0xDFCC8F, 0x2D2611,
                    new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> LAMIASPIS_SPAWN_EGG = ITEMS.register("lamiaspis_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityInit.LAMIASPIS, 0xDFCC8F, 0x2D2611,
                    new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> RAW_PHLEBOLEPIS = ITEMS.register("raw_phlebolepis",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).food(FoodInit.RAW_PHLEBOLEPIS)));

    public static final RegistryObject<Item> COOKED_PHLEBOLEPIS = ITEMS.register("cooked_phlebolepis",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).food(FoodInit.COOKED_PHLEBOLEPIS)));

    public static final RegistryObject<Item> RAW_DOLI = ITEMS.register("raw_doli",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).food(FoodInit.RAW_DOLI)));

    public static final RegistryObject<Item> COOKED_DOLI = ITEMS.register("cooked_doli",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).food(FoodInit.COOKED_DOLI)));

    public static final RegistryObject<Item> RAW_GOOLAGONGIA = ITEMS.register("raw_goolagongia",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).food(FoodInit.RAW_GOOLAGONGIA)));

    public static final RegistryObject<Item> COOKED_GOOLAGONGIA = ITEMS.register("cooked_goolagongia",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).food(FoodInit.COOKED_GOOLAGONGIA)));




    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
