package net.demondev.portablejukebox.item;

import net.demondev.portablejukebox.PortableJukebox;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, PortableJukebox.MOD_ID);

public static final RegistryObject<Item> PORTABLE_JUKEBOX = ITEMS.register("portable_jukebox",
        () -> new Item(new Item.Properties()));


}
