package dev.lpsmods.bandage;

import net.fabricmc.api.ModInitializer;

public class Bandage implements ModInitializer {
    
    @Override
    public void onInitialize() {
        Constants.LOG.info("Hello Fabric world!");
        CommonClass.init();
    }
}
