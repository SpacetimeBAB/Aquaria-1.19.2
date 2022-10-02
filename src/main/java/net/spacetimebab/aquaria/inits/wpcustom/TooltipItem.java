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
import net.spacetimebab.aquaria.Aquaria;

public class TooltipItem extends Item{
	
	String text;
	
	ChatFormatting colour;

	public TooltipItem(Properties pProperties, String text) {
		super(pProperties);
		// TODO Auto-generated constructor stub
	}
	
	public TooltipItem setText (String text) {
		
		this.text = text;
		return this;
	}
	
	public TooltipItem setColour (ChatFormatting colour) {
		
		this.colour = colour;
		return this;
	}
	

	
	@Override
	public void appendHoverText(ItemStack pStack, @Nullable Level plevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
			
		if(Screen.hasShiftDown()) {
			pTooltipComponents.add(Component.literal(text).withStyle(ChatFormatting.ITALIC).withStyle(this.colour));
		}else {	
			pTooltipComponents.add(Component.literal("Hold shift to observe.").withStyle(ChatFormatting.GOLD));
		}

			
			super.appendHoverText(pStack, plevel, pTooltipComponents, pIsAdvanced);
	}
	
	
	

}
