package net.ellieczsk.spaceexploration.item;

import net.ellieczsk.spaceexploration.SpaceExploration;
import net.ellieczsk.spaceexploration.item.custom.MetalDetectorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    //creates register for registering items
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SpaceExploration.MOD_ID);

    public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ALUMINIUM_INGOT = ITEMS.register("aluminium_ingot",()-> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_ALUMINIUM =ITEMS.register("raw_aluminium",()-> new Item(new Item.Properties()));

    public static final RegistryObject<Item>METAL_DETECTOR = ITEMS.register("metal_detector", () -> new MetalDetectorItem(new Item.Properties().stacksTo(1).durability(250)));

    //registering register
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}
