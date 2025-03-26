package dev.lpsmods.bandage.core;

import com.mrcrayfish.framework.api.registry.RegistryContainer;
import com.mrcrayfish.framework.api.registry.RegistryEntry;
import dev.lpsmods.bandage.item.Bandage;
import net.minecraft.world.item.Item;

@RegistryContainer
public class ModItems {
    public static final RegistryEntry<Item> BANDAGE;
    public static final RegistryEntry<Item> NETHER_BANDAGE;
    public static final RegistryEntry<Item> END_BANDAGE;
    public static final RegistryEntry<Item> WATER_BANDAGE;

    private static RegistryEntry<Item> registerBandage(String name) {
        return RegistryEntry.item(ModUtils.makeId(name), () -> new Item(new Item.Properties().stacksTo(1).component(ModDataComponents.BANDAGE, new Bandage("test"))));
    }

    static {
        BANDAGE = registerBandage("bandage");
        NETHER_BANDAGE = registerBandage("nether_bandage");
        END_BANDAGE = registerBandage("end_bandage");
        WATER_BANDAGE = registerBandage("water_bandage");
    }
}
