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

    public static final RegistryObject<Item> RAW_SPHETHACANTHUS = ITEMS.register("raw_sphenacantus",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(FoodInit.RAW_SPHETHACANTHUS)));

    public static final RegistryObject<Item> COOKED_SPHETHACANTHUS = ITEMS.register("cooked_sphenacantus",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(FoodInit.COOKED_SPHETHACANTHUS)));

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
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(FoodInit.RAW_PHLEBOLEPIS)));

    public static final RegistryObject<Item> COOKED_PHLEBOLEPIS = ITEMS.register("cooked_phlebolepis",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(FoodInit.COOKED_PHLEBOLEPIS)));

    public static final RegistryObject<Item> DOLLY_FLESH = ITEMS.register("dolly_flesh",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(FoodInit.RAW_DOLI)));

    public static final RegistryObject<Item> DOLLY_FLESH_COOKED = ITEMS.register("dolly_flesh_cooked",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(FoodInit.COOKED_DOLI)));

    public static final RegistryObject<Item> RAW_GOOLAGONGIA = ITEMS.register("raw_goolagongia",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(FoodInit.RAW_GOOLAGONGIA)));

    public static final RegistryObject<Item> COOKED_GOOLAGONGIA = ITEMS.register("cooked_goolagongia",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(FoodInit.COOKED_GOOLAGONGIA)));

    public static final RegistryObject<Item> GOOLAGONGIA_BUCKET = ITEMS.register("goolagongia_bucket",
            () -> new ItemModFishBucket(EntityInit.GOOLOGONGIA, () -> Fluids.WATER, Items.BUCKET, false,
                    new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1)));

    public static final RegistryObject<Item> DIPLACANTHUS_SPAWN_EGG = ITEMS.register("diplacanthus_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityInit.DIPLACANTHUS, 0xDFCC8F, 0x2D2611,
                    new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> CAMPBELLODUS_SPAWN_EGG = ITEMS.register("campbellodus_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityInit.CAMPBELLODUS, 0xDFCC8F, 0x2D2611,
                    new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    
    
    //crystals
    
    public static final RegistryObject<Item> SPHENA_CRYSTAL = ITEMS.register("sphena_crystal",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> GOOGOO_CRYSTAL = ITEMS.register("googoo_crystal",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> ORNITHOPRION_CRYSTAL = ITEMS.register("ornithoprion_crystal",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> DOLLY_CRYSTAL = ITEMS.register("dolly_crystal",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> DIPLACANTHUS_CRYSTAL = ITEMS.register("diplacanthus_crystal",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> DIPTERUS_CRYSTAL = ITEMS.register("dipterus_crystal",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> CAMPBELLODUS_CRYSTAL = ITEMS.register("campbellodus_crystal",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    
    public static final RegistryObject<Item> LAMIASPIS_CRYSTAL = ITEMS.register("dipterus_crystal",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    
    public static final RegistryObject<Item> BUNGARTIUS_CRYSTAL = ITEMS.register("bungartius_crystal",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    
    public static final RegistryObject<Item> PHLEBOLEPIS_CRYSTAL = ITEMS.register("phlebolepis_crystal",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    
    //miscellaneous tools
    
    public static final RegistryObject<Item> AMETHYST_STICK = ITEMS.register("amethyst_stick",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    
    public static final RegistryObject<Item> STICKY_AMETHYST_STICK = ITEMS.register("sticky_amethyst_stick",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    
    
    
    
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
