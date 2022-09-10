package net.spacetimebab.aquaria.inits;

import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.MobBucketItem;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.registries.RegistryObject;
import net.spacetimebab.aquaria.Aquaria;
import net.spacetimebab.aquaria.entity.custom.SphenacantusEntity;

import java.util.function.Supplier;

public class ItemModFishBucket extends MobBucketItem {

    public ItemModFishBucket(Supplier<? extends EntityType<?>> entityType, Supplier<? extends Fluid> fluid, Item item,
                             boolean hasTooltip, Properties builder) {
        super(entityType, fluid, () -> SoundEvents.BUCKET_EMPTY_FISH, builder);
        DistExecutor.unsafeCallWhenOn(Dist.CLIENT, () -> () -> Aquaria.CALLBACKS.add(() -> ItemProperties.register(this, new ResourceLocation(Aquaria.MOD_ID, "variant"), (stack, world, player, i) -> stack.hasTag() ? stack.getTag().getInt("Variant") : 0)));
    }

    public ItemModFishBucket(RegistryObject<EntityType<SphenacantusEntity>> sphenacanthus, Supplier<? extends Fluid> water, Supplier<? extends SoundEvent> bucketEmptyFish, Properties tab) {
        super(sphenacanthus, water, bucketEmptyFish, tab);
    }
}