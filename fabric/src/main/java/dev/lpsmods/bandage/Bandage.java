package dev.lpsmods.bandage;

import com.mrcrayfish.framework.FrameworkSetup;
import net.fabricmc.api.ModInitializer;

public class Bandage implements ModInitializer {
    
    @Override
    public void onInitialize() {
        FrameworkSetup.run();
        Bootstrap.init();
    }
}
