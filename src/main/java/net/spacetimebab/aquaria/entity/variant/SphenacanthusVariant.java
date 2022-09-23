package net.spacetimebab.aquaria.entity.variant;

import java.util.Arrays;
import java.util.Comparator;

public enum SphenacanthusVariant {
    WILD(0),
    ALBINO(1),
    AMELANISTIC(2),
    PIEBALD(3);

    private static final SphenacanthusVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator.comparingInt(SphenacanthusVariant::getId)).toArray(SphenacanthusVariant[]::new);

    private final int id;

    SphenacanthusVariant(int id){
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public static SphenacanthusVariant byId(int id){
        return BY_ID[id % BY_ID.length];
    }
}
