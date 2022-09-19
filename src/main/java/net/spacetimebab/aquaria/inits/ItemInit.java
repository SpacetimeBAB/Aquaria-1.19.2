package net.spacetimebab.aquaria.inits;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.MobBucketItem;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.Fluids;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.spacetimebab.aquaria.Aquaria;
import net.spacetimebab.aquaria.inits.wpcustom.SoulBladeItem;

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
    
    //food
    public static final RegistryObject<Item> DIPTERUS_COOKED = ITEMS.register("dipterus_cooked",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(FoodInit.DIPTERUS_COOKED)));
    
    public static final RegistryObject<Item> DIPTERUS_RAW = ITEMS.register("dipterus_raw",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(FoodInit.DIPTERUS_RAW)));
    
    public static final RegistryObject<Item> ORNITHOPRION_COOKED = ITEMS.register("ornithoprion_cooked",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(FoodInit.ORNITHOPRION_COOKED)));
    
    public static final RegistryObject<Item> ORNITHOPRION_RAW = ITEMS.register("ornithoprion_raw",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(FoodInit.ORNITHOPRION_RAW)));
    
    public static final RegistryObject<Item> DIPLACANTHUS_COOKED = ITEMS.register("diplacanthus_COOKED",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(FoodInit.DIPLACANTHUS_COOKED)));
    
    public static final RegistryObject<Item> DIPLACANTHUS_RAW = ITEMS.register("diplacanthus_raw",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(FoodInit.DIPLACANTHUS_RAW)));
    
    public static final RegistryObject<Item> LAMIASPIS_COOKED = ITEMS.register("lamiaspis_cooked",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(FoodInit.LAMIASPIS_COOKED)));
    
    public static final RegistryObject<Item> LAMIASPIS_RAW = ITEMS.register("lamiaspis_raw",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(FoodInit.LAMIASPIS_RAW)));
    
    
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
    
    
    public static final RegistryObject<Item> SOUL_CRYSTAL = ITEMS.register("soul_crystal",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    
    public static final RegistryObject<Item> SOUL_SHARD = ITEMS.register("soul_shard",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    
    //miscellaneous tools
    
    public static final RegistryObject<Item> AMETHYST_STICK = ITEMS.register("amethyst_stick",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    
    public static final RegistryObject<Item> STICKY_AMETHYST_STICK = ITEMS.register("sticky_amethyst_stick",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    
    public static final RegistryObject<Item> SPECTOGEL = ITEMS.register("spectogel",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    
    public static final RegistryObject<Item> SPIRITSTONE_SHARD = ITEMS.register("spiritstone_shard",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    
    //weapons and ammo(imma figure out magic damage tomorrow)
    
    public static final RegistryObject<SwordItem> SOULBLADE = ITEMS.register("soulblade",
            () -> new SoulBladeItem(Tiers.SOUL, 2, 2F, new SoulBladeItem.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    
    public static final RegistryObject<Item> SOULBOLT = ITEMS.register("soulbolt",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    
    
    
    
    //bab pls help
    public static class Tiers { 	
    	public static final Tier SOUL = new ForgeTier(2, 1000, 2F, 2, 500, null, () -> Ingredient.of(ItemInit.SOUL_SHARD.get()));
    }
    
    
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
