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

}
