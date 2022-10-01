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
import net.spacetimebab.aquaria.inits.wpcustom.TooltipItem;
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

    public static final RegistryObject<Item> DOLLY_FLESH_COOKED = ITEMS.register("cooked_doli",
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

    public static final RegistryObject<Item> BUNGARITUS_SPAWN_EGG = ITEMS.register("bungaritus_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityInit.BUNGARITUS, 0xDFCC8F, 0x2D2611,
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
    
    public static final RegistryObject<Item> DIPLACANTHUS_COOKED = ITEMS.register("diplacanthus_cooked",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(FoodInit.DIPLACANTHUS_COOKED)));
    
    public static final RegistryObject<Item> DIPLACANTHUS_RAW = ITEMS.register("diplacanthus_raw",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(FoodInit.DIPLACANTHUS_RAW)));
    
    public static final RegistryObject<Item> LAMIASPIS_COOKED = ITEMS.register("lamiaspis_cooked",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(FoodInit.LAMIASPIS_COOKED)));
    
    public static final RegistryObject<Item> LAMIASPIS_RAW = ITEMS.register("lamiaspis_raw",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(FoodInit.LAMIASPIS_RAW)));
    
    public static final RegistryObject<Item> CAMPBELLODUS_COOKED = ITEMS.register("campbellodus_cooked",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(FoodInit.CAMPBELLODUS_COOKED)));
    
    public static final RegistryObject<Item> CAMPBELLODUS_RAW = ITEMS.register("campbellodus_raw",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(FoodInit.CAMPBELLODUS_RAW)));
    
    public static final RegistryObject<Item> BUNGARTIUS_COOKED = ITEMS.register("bungartius_cooked",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(FoodInit.BUNGARTIUS_COOKED)));
    
    public static final RegistryObject<Item> BUNGARTIUS_RAW = ITEMS.register("bungartius_raw",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(FoodInit.BUNGARTIUS_RAW)));
    
    public static final RegistryObject<Item> NEOCERATODUS_RAW = ITEMS.register("neoceratodus_raw",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(FoodInit.NEOCERATODUS_RAW)));
    
    public static final RegistryObject<Item> NEOCERATODUS_COOKED = ITEMS.register("neoceratodus_cooked",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(FoodInit.NEOCERATODUS_COOKED)));

    public static final RegistryObject<Item> LATIMERIA_RAW = ITEMS.register("latimeria_raw",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(FoodInit.LATIMERIA_RAW)));
    
    public static final RegistryObject<Item> LATIMERIA_COOKED = ITEMS.register("latimeria_cooked",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(FoodInit.LATIMERIA_COOKED)));
    
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
    
    public static final RegistryObject<Item> LAMIASPIS_CRYSTAL = ITEMS.register("lamiaspis_crystal",
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
    
    
    //snared souls
    
    public static final RegistryObject<TooltipItem> SNARED_SPHENACANTHUS = ITEMS.register("soul_of_an_old_alien_wedgespine",
            () -> new TooltipItem(new TooltipItem.Properties().tab(CreativeModeTab.TAB_MISC), "Soul of an old alien wedgespine. It quivers in fear and its spines are raised."));
    
    public static final RegistryObject<TooltipItem> SNARED_DOLLY = ITEMS.register("soul_of_a_familiar_long_snouted_face",
            () -> new TooltipItem(new TooltipItem.Properties().tab(CreativeModeTab.TAB_MISC), "Soul of a familiar long-snouted face. It perches upon its snare without fear, and its snout sniffs excitedly."));
    
    public static final RegistryObject<TooltipItem> SNARED_GOOGOO = ITEMS.register("soul_of_gooloogongs_first_forman",
            () -> new TooltipItem(new Item.Properties().tab(CreativeModeTab.TAB_MISC), "Soul of Gooloogong's first forman. It twists ceaselessly, limbs seeming to emerge at every point."));
    
    public static final RegistryObject<TooltipItem> SNARED_DIPTERUS = ITEMS.register("soul_of_twinned_ancient_wings",
            () -> new TooltipItem(new TooltipItem.Properties().tab(CreativeModeTab.TAB_MISC), "Soul of twinned ancient wings. No movement apart from a drifting of fins can be felt."));
    
    public static final RegistryObject<TooltipItem> SNARED_ORNITHOPRION = ITEMS.register("soul_of_a_sawbladed_avian",
            () -> new TooltipItem(new TooltipItem.Properties().tab(CreativeModeTab.TAB_MISC), "Soul of a sawbladed avian. Its maw twists violently with shredding strength."));
    
    public static final RegistryObject<TooltipItem> SNARED_PHLEBOLEPIS = ITEMS.register("soul_of_scaly_flecks",
            () -> new TooltipItem(new TooltipItem.Properties().tab(CreativeModeTab.TAB_MISC), "Soul of scaly flecks. Shards of it dissipate into thin air, as if the soul is not simply one whole."));
        
    public static final RegistryObject<TooltipItem> SNARED_DIPLACANTHUS = ITEMS.register("soul_of_halved_tiny_thorns",
            () -> new TooltipItem(new TooltipItem.Properties().tab(CreativeModeTab.TAB_MISC), "Soul of halved tiny thorns, it boils with ridged protrusions and thorny flaps."));
    
    public static final RegistryObject<TooltipItem> SNARED_BUNGARTIUS = ITEMS.register("soul_of_old_bungarts_lost_memory",
            () -> new TooltipItem(new TooltipItem.Properties().tab(CreativeModeTab.TAB_MISC),"Soul of Old Bungart's lost memory, its shearing jaws twist outwards and down upon your hand."));
    
    public static final RegistryObject<TooltipItem> SNARED_CAMPBELLODUS = ITEMS.register("soul_of_campbells_proud_love",
            () -> new TooltipItem(new TooltipItem.Properties().tab(CreativeModeTab.TAB_MISC), "Soul of Campbell's proud love, it calmly awaits its partner's return."));
    
    public static final RegistryObject<TooltipItem> SNARED_LAMIASPIS = ITEMS.register("soul_of_a_sharkfinned_bramble",
            () -> new TooltipItem(new TooltipItem.Properties().tab(CreativeModeTab.TAB_MISC), "Soul of a sharkfinned bramble, it is indistinguishable in a pile of osteoderms and spines."));
        
    
    public static final RegistryObject<Item> PHLEEB_SPAWN = ITEMS.register("phleeb_spawn",
            () -> new ForgeSpawnEggItem(EntityInit.PHLEEB, 0xDFCC8F, 0x2D2611,
                    new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    
    public static final RegistryObject<Item> DOLLY_SPAWN = ITEMS.register("dolly_spawn",
            () -> new ForgeSpawnEggItem(EntityInit.DOLLY, 0xDFCC8F, 0x2D2611,
                    new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    
    public static final RegistryObject<Item> LATIMERIA_SPAWN = ITEMS.register("latimeria_spawn",
            () -> new ForgeSpawnEggItem(EntityInit.LATIMERIA, 0xDFCC8F, 0x2D2611,
                    new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    
    public static final RegistryObject<Item> NEOCERATODUS_SPAWN = ITEMS.register("neoceratodus_spawn",
            () -> new ForgeSpawnEggItem(EntityInit.NEOCERATODUS, 0xDFCC8F, 0x2D2611,
                    new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    
    //buckets
    
    
    public static final RegistryObject<Item> PHLEEB_BUCKET = ITEMS.register("phleeb_bucket",
            () -> new ItemModFishBucket(EntityInit.PHLEEB, () -> Fluids.WATER, Items.BUCKET, false,
                    new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1)));
    
    public static final RegistryObject<Item> DIPLACANTHUS_BUCKET = ITEMS.register("diplacanthus_bucket",
            () -> new ItemModFishBucket(EntityInit.DIPLACANTHUS, () -> Fluids.WATER, Items.BUCKET, false,
                    new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1)));
    
    public static final RegistryObject<Item> CAMPBELLODUS_BUCKET = ITEMS.register("campbellodus_bucket",
            () -> new ItemModFishBucket(EntityInit.CAMPBELLODUS, () -> Fluids.WATER, Items.BUCKET, false,
                    new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1)));
    
    public static final RegistryObject<Item> LAMIASPIS_BUCKET = ITEMS.register("lamiaspis_bucket",
            () -> new ItemModFishBucket(EntityInit.LAMIASPIS, () -> Fluids.WATER, Items.BUCKET, false,
                    new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1)));
    
    public static final RegistryObject<Item> DIPTERUS_BUCKET = ITEMS.register("dipterus_bucket",
            () -> new ItemModFishBucket(EntityInit.DIPTERUS, () -> Fluids.WATER, Items.BUCKET, false,
                    new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1)));
    
    public static final RegistryObject<Item> LATIMERIA_BUCKET = ITEMS.register("latimeria_bucket",
            () -> new ItemModFishBucket(EntityInit.LATIMERIA, () -> Fluids.WATER, Items.BUCKET, false,
                    new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1)));
    
    public static final RegistryObject<Item> NEOCERATODUS_BUCKET = ITEMS.register("neoceratodus_bucket",
            () -> new ItemModFishBucket(EntityInit.NEOCERATODUS, () -> Fluids.WATER, Items.BUCKET, false,
                    new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1)));
    
    
    //weapons and ammo(imma figure out magic damage tomorrow)
    
    public static final RegistryObject<SoulBladeItem> SOULBLADE = ITEMS.register("soulblade",
            () -> new SoulBladeItem(Tiers.SOUL, 2, 2F, new SoulBladeItem.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    
    public static final RegistryObject<Item> SOULBOLT = ITEMS.register("soulbolt",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    
    
    //sacs n eggs
    
    public static final RegistryObject<Item> SPHEN_SAC = ITEMS.register("sphenacanthus_sac",
            () -> new ForgeSpawnEggItem(EntityInit.SPHENACANTHUS, 0xDFCC8F, 0x2D2611,
                    new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    
    public static final RegistryObject<Item> BUNGA_SAC = ITEMS.register("bunga_sac",
            () -> new ForgeSpawnEggItem(EntityInit.BUNGARITUS, 0xDFCC8F, 0x2D2611,
                    new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    
    public static final RegistryObject<Item> DOLLY_SAC = ITEMS.register("dolly_sac",
            () -> new ForgeSpawnEggItem(EntityInit.DOLLY, 0xDFCC8F, 0x2D2611,
                    new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    
    public static final RegistryObject<Item> ORNITHOPRION_SAC = ITEMS.register("ornithoprion_sac",
            () -> new ForgeSpawnEggItem(EntityInit.ORNITHOPRION, 0xDFCC8F, 0x2D2611,
                    new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> CAMPBELLODUS_SAC = ITEMS.register("campbellodus_sac",
            () -> new ForgeSpawnEggItem(EntityInit.CAMPBELLODUS, 0xDFCC8F, 0x2D2611,
                    new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    
    public static final RegistryObject<Item> GOOGOO_EGGS = ITEMS.register("googoo_eggs",
            () -> new ForgeSpawnEggItem(EntityInit.SPHENACANTHUS, 0xDFCC8F, 0x2D2611,
                    new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    
    public static final RegistryObject<Item> DIPTERUS_EGGS = ITEMS.register("dipterus_eggs",
            () -> new ForgeSpawnEggItem(EntityInit.DIPTERUS, 0xDFCC8F, 0x2D2611,
                    new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    
    public static final RegistryObject<Item> PHLEEB_EGGS = ITEMS.register("phleeb_eggs",
            () -> new ForgeSpawnEggItem(EntityInit.PHLEEB, 0xDFCC8F, 0x2D2611,
                    new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    
    public static final RegistryObject<Item> LAMIASPIS_EGGS = ITEMS.register("lamiaspis_eggs",
            () -> new ForgeSpawnEggItem(EntityInit.LAMIASPIS, 0xDFCC8F, 0x2D2611,
                    new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    
    public static final RegistryObject<Item> DIPLACANTHUS_EGGS = ITEMS.register("dipla_eggs",
            () -> new ForgeSpawnEggItem(EntityInit.DIPTERUS, 0xDFCC8F, 0x2D2611,
                    new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    
    public static final RegistryObject<Item> LATIMERIA_EGGS = ITEMS.register("latimeria_eggs",
            () -> new ForgeSpawnEggItem(EntityInit.LATIMERIA, 0xDFCC8F, 0x2D2611,
                    new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> NEOCERATODUS_EGGS = ITEMS.register("neoceratodus_eggs",
            () -> new ForgeSpawnEggItem(EntityInit.NEOCERATODUS, 0xDFCC8F, 0x2D2611,
                    new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    
    public static class Tiers { 	
    	public static final Tier SOUL = new ForgeTier(2, 1000, 2F, 2, 500, null, () -> Ingredient.of(ItemInit.SOUL_SHARD.get()));
    }
    
    
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
