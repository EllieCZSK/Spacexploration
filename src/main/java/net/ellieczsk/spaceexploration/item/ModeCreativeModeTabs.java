package net.ellieczsk.spaceexploration.item;

import net.ellieczsk.spaceexploration.SpaceExploration;

import net.ellieczsk.spaceexploration.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;


public class ModeCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SpaceExploration.MOD_ID);

    public static final RegistryObject<CreativeModeTab> SPACE_EXPLORATION =
            CREATIVE_MODE_TABS.register("space_exploration", ()-> CreativeModeTab.builder().icon(()-> new ItemStack(ModItems.STEEL_INGOT.get())).
                    title(Component.translatable("creativetab.spacexplr_tab")).displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.STEEL_INGOT.get());
                        pOutput.accept(ModItems.ALUMINIUM_INGOT.get());
                        pOutput.accept(ModItems.RAW_ALUMINIUM.get());
                        pOutput.accept(ModItems.METAL_DETECTOR.get());

                        pOutput.accept(ModBlocks.ALUMINIUM_BLOCK.get());
                        pOutput.accept(ModBlocks.STEEL_BLOCK.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_ALUMINIUM_ORE.get());
                        pOutput.accept(ModBlocks.ALUMINIUM_ORE.get());



                    })
                    .build());
    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);

    }
}
