package net.spacetimebab.aquaria.entity.variant;

import java.util.Arrays;
import java.util.Comparator;

public enum PhleebVariant {
    WILD(0),
    ALBINO(1),
    MELANISTIC(2),
    DIAMOND(3);

    private static final PhleebVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator.comparingInt(PhleebVariant::getId)).toArray(PhleebVariant[]::new);

    private final int id;

    PhleebVariant(int id){
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public static PhleebVariant byId(int id){
        return BY_ID[id % BY_ID.length];
    }
}
