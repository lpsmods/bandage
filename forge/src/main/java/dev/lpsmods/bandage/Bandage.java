package dev.lpsmods.bandage;

import net.minecraftforge.fml.common.Mod;

@Mod(Constants.MOD_ID)
public class Bandage {

    public Bandage() {
        Constants.LOG.info("Hello Forge world!");
        CommonClass.init();
    }
}