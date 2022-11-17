package net.spacetimebab.aquaria.inits;

import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.spacetimebab.aquaria.Aquaria;
//import net.spacetimebab.aquaria.block.custom.ResurrectionAltarBlock;

import java.util.function.Supplier;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Aquaria.MOD_ID);



  /*  public static final RegistryObject<ResurrectionAltarBlock> RESURRECTION_ALTAR =  registerBlock("resaltar",
            () -> new ResurrectionAltarBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(4f).requiresCorrectToolForDrops().noOcclusion()), CreativeModeTab.TAB_DECORATIONS);*/
    
    public static final RegistryObject<DropExperienceBlock> HAUNTED_SOIL = registerBlock("haunted_soil",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.DIRT)
                    .strength(2f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    
    public static final RegistryObject<DropExperienceBlock> HAUNTED_SAND = registerBlock("haunted_sand",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.SAND)
                    .strength(2f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    
    public static final RegistryObject<Block> CRYSTAL_SMALL = registerBlock("soul_crystal_small",
            () -> new Block(BlockBehaviour.Properties.of(Material.GLASS)
                    .strength(2f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_DECORATIONS);
    
    public static final RegistryObject<Block> CRYSTAL_MID = registerBlock("soul_crystal_mid",
            () -> new Block(BlockBehaviour.Properties.of(Material.GLASS)
                    .strength(2f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_DECORATIONS);
    
    public static final RegistryObject<Block> CRYSTAL_LARGE = registerBlock("soul_crystal_large",
            () -> new Block(BlockBehaviour.Properties.of(Material.GLASS)
                    .strength(2f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_DECORATIONS);
    
    public static final RegistryObject<Block> SOUL_CRUCIBLE = registerBlock("soul_crucible",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(2f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_DECORATIONS);



    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab) {
        return ItemInit.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
