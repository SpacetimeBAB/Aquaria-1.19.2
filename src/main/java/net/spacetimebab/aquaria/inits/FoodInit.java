package net.spacetimebab.aquaria.inits;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.food.Foods;

public class FoodInit extends Foods {
    public static final FoodProperties RAW_SPHETHACANTHUS = (new FoodProperties.Builder()).nutrition(2).saturationMod(0.5F).effect(new MobEffectInstance(MobEffects.POISON, 600, 0), 0.3F).meat().build();
    public static final FoodProperties COOKED_SPHETHACANTHUS = (new FoodProperties.Builder()).nutrition(7).saturationMod(1F).meat().build();

    public static final FoodProperties RAW_PHLEBOLEPIS = (new FoodProperties.Builder()).nutrition(1).saturationMod(1F).effect(new MobEffectInstance(MobEffects.HARM, 600, 0), 0.3F).meat().build();
    public static final FoodProperties COOKED_PHLEBOLEPIS = (new FoodProperties.Builder()).nutrition(3).saturationMod(4F).meat().build();

    public static final FoodProperties RAW_DOLI = (new FoodProperties.Builder()).nutrition(4).saturationMod(2F).meat().build();
    public static final FoodProperties COOKED_DOLI = (new FoodProperties.Builder()).nutrition(8).saturationMod(4F).meat().build();

    public static final FoodProperties RAW_GOOLAGONGIA = (new FoodProperties.Builder()).nutrition(6).saturationMod(2F).meat().build();
    public static final FoodProperties COOKED_GOOLAGONGIA = (new FoodProperties.Builder()).nutrition(6).saturationMod(6F).meat().build();

    public static final FoodProperties DIPTERUS_RAW = (new FoodProperties.Builder()).nutrition(2).saturationMod(1F).meat().build();
    public static final FoodProperties DIPTERUS_COOKED = (new FoodProperties.Builder()).nutrition(4).saturationMod(3F).meat().build();
    
    public static final FoodProperties ORNITHOPRION_RAW = (new FoodProperties.Builder()).nutrition(3).saturationMod(1F).meat().build();
    public static final FoodProperties ORNITHOPRION_COOKED = (new FoodProperties.Builder()).nutrition(8).saturationMod(4F).meat().build();
    
    public static final FoodProperties DIPLACANTHUS_RAW = (new FoodProperties.Builder()).nutrition(2).saturationMod(1F).meat().effect(new MobEffectInstance(MobEffects.HARM, 600, 0), 0.5F).fast().build();
    public static final FoodProperties DIPLACANTHUS_COOKED = (new FoodProperties.Builder()).nutrition(8).saturationMod(4F).meat().build();

    public static final FoodProperties LAMIASPIS_RAW = (new FoodProperties.Builder()).nutrition(2).saturationMod(1F).meat().build();
    public static final FoodProperties LAMIASPIS_COOKED = (new FoodProperties.Builder()).nutrition(4).saturationMod(2F).meat().build();
    
    public static final FoodProperties CAMPBELLODUS_RAW = (new FoodProperties.Builder()).nutrition(4).saturationMod(3F).meat().build();
    public static final FoodProperties CAMPBELLODUS_COOKED = (new FoodProperties.Builder()).nutrition(8).saturationMod(6F).build();
    
    public static final FoodProperties BUNGARTIUS_RAW = (new FoodProperties.Builder()).nutrition(1).saturationMod(5F).meat().build();
    public static final FoodProperties BUNGARTIUS_COOKED = (new FoodProperties.Builder()).nutrition(6).saturationMod(3F).meat().build();

    public static final FoodProperties NEOCERATODUS_RAW = (new FoodProperties.Builder()).nutrition(2).saturationMod(2F).meat().build();
    public static final FoodProperties NEOCERATODUS_COOKED = (new FoodProperties.Builder()).nutrition(5).saturationMod(3F).meat().build();
}
