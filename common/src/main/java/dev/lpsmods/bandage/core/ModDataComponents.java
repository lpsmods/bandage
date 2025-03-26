package dev.lpsmods.bandage.core;

import dev.lpsmods.bandage.item.Bandage;
import net.minecraft.core.Registry;
import net.minecraft.core.component.DataComponentType;
import net.minecraft.core.registries.BuiltInRegistries;

import java.util.function.UnaryOperator;

public class ModDataComponents {
    public static final DataComponentType<Bandage> BANDAGE = register("bandage", (builder) -> {
        return builder.persistent(Bandage.CODEC);
    });

    private static <T> DataComponentType<T> register(String name, UnaryOperator<DataComponentType.Builder<T>> builder) {
        return (DataComponentType) Registry.register(BuiltInRegistries.DATA_COMPONENT_TYPE, name, ((DataComponentType.Builder)builder.apply(DataComponentType.builder())).build());
    }
}
