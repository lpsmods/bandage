package dev.lpsmods.bandage.core;

import dev.lpsmods.bandage.Constants;
import net.minecraft.resources.ResourceLocation;

public class ModUtils {
    public static ResourceLocation makeId(String path) {
        return ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, path);
    }
}
