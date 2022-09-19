package net.spacetimebab.aquaria.inits.wpcustom;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

public class SoulBladeItem extends SwordItem{

	public SoulBladeItem(Tier p_43269_, int p_43270_, float p_43271_, Properties p_43272_) {
		super(p_43269_, p_43270_, p_43271_, p_43272_);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public boolean hurtEnemy(ItemStack pStack, LivingEntity pTarget, LivingEntity pAttacker) {
		
		pTarget.addEffect(new MobEffectInstance(MobEffects.HARM, 1), pAttacker);
		return super.hurtEnemy(pStack, pTarget, pAttacker);
		
		
	}

}
