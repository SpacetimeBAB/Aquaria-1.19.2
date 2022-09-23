package net.spacetimebab.aquaria.inits.wpcustom;



import java.util.List;

import javax.annotation.Nullable;


import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

public class TooltipItem extends Item{

	public TooltipItem(Properties properties, String text) {
		super(properties);
		// TODO Auto-generated constructor stub
	}
	
	public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag, String text) {
			
			if(Screen.hasShiftDown()) {
				components.add(Component.literal(text).withStyle(ChatFormatting.ITALIC).withStyle(ChatFormatting.AQUA));
				
			}else {	
				components.add(Component.literal(text).withStyle(ChatFormatting.GOLD));
			}
			
			super.appendHoverText(stack, level, components, flag);
	}

}
