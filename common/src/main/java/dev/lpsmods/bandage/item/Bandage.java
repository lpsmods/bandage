package dev.lpsmods.bandage.item;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record Bandage(String test) {
    public static final Codec<Bandage> CODEC = RecordCodecBuilder.create((p_332588_) -> {
        return p_332588_.group(
                Codec.STRING.fieldOf("test").forGetter(Bandage::test)
        ).apply(p_332588_, Bandage::new);
    });

    public Bandage(String test) {
        this.test = test;
    }
}
