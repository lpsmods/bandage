package dev.lpsmods.bandage.core;

import com.mrcrayfish.framework.api.registry.RegistryContainer;
import com.mrcrayfish.framework.api.registry.RegistryEntry;
import dev.lpsmods.bandage.Constants;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

@RegistryContainer
public class ModCreativeTab {
    public static final RegistryEntry<CreativeModeTab> MAIN;

    static {
        MAIN = RegistryEntry.creativeModeTab(ModUtils.makeId("bandages"), builder -> {
            builder.title(Component.translatable("itemGroup."+ Constants.MOD_ID));
            builder.icon(() -> {
                return new ItemStack(ModItems.BANDAGE.get());
            });
            builder.displayItems((CreativeModeTab.ItemDisplayParameters params, CreativeModeTab.Output out) -> {
                out.accept(ModItems.BANDAGE.get());
                out.accept(ModItems.NETHER_BANDAGE.get());
                out.accept(ModItems.END_BANDAGE.get());
                out.accept(ModItems.WATER_BANDAGE.get());
            }).build();
        });
    }
}
