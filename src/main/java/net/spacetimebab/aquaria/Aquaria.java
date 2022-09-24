package net.spacetimebab.aquaria;

import com.mojang.logging.LogUtils;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.spacetimebab.aquaria.inits.BlockInit;
import net.spacetimebab.aquaria.inits.EntityInit;
import net.spacetimebab.aquaria.inits.FoodInit;
import net.spacetimebab.aquaria.inits.ItemInit;
import org.slf4j.Logger;

import java.util.ArrayList;
import java.util.List;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Aquaria.MOD_ID)
public class Aquaria
{
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "aquaria";
    private static final Logger LOGGER = LogUtils.getLogger();
    public static final List<Runnable> CALLBACKS = new ArrayList<>();

    public Aquaria()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        ItemInit.register(modEventBus);
        EntityInit.register(modEventBus);
        BlockInit.register(modEventBus);



        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {

    }
    //public static ResourceLocation rl(String s) {
     //   return new ResourceLocation(MOD_ID, s);
   // }



    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {

        }
    }
}
