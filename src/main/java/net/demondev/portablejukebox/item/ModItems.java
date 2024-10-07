package net.demondev.portablejukebox.item;

import net.demondev.portablejukebox.PortableJukebox;
import net.demondev.portablejukebox.item.custom.JukeboxItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, PortableJukebox.MOD_ID);

    // Registering the custom JukeboxItem instead of a basic item
    public static final RegistryObject<Item> PORTABLE_JUKEBOX = ITEMS.register("portable_jukebox",
            () -> new JukeboxItem(new Item.Properties().stacksTo(1)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
