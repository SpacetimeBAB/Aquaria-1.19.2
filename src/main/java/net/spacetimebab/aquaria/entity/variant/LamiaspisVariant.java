package net.spacetimebab.aquaria.entity.variant;

import java.util.Arrays;
import java.util.Comparator;

public enum LamiaspisVariant {
    WILD(0),
    ALBINO(1),
    STEELHEAD(2),
    PLATINUM(3);



    private static final LamiaspisVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator.comparingInt(LamiaspisVariant::getId)).toArray(LamiaspisVariant[]::new);

    private final int id;

    LamiaspisVariant(int id){
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public static LamiaspisVariant byId(int id){
        return BY_ID[id % BY_ID.length];
    }
}
