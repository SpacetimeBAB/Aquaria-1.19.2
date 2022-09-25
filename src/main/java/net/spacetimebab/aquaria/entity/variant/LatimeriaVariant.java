package net.spacetimebab.aquaria.entity.variant;

import java.util.Arrays;
import java.util.Comparator;

public enum LatimeriaVariant {
    WILD(0),
    ALBINO(1),
    PLATINUM(2),
    MURICA(3);

    private static final LatimeriaVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator.comparingInt(LatimeriaVariant::getId)).toArray(LatimeriaVariant[]::new);

    private final int id;

    LatimeriaVariant(int id){
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public static LatimeriaVariant byId(int id){
        return BY_ID[id % BY_ID.length];
    }
}
