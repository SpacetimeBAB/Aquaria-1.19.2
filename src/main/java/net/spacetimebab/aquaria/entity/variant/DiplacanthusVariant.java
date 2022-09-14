package net.spacetimebab.aquaria.entity.variant;

import java.util.Arrays;
import java.util.Comparator;

public enum DiplacanthusVariant {
    WILD(0),
    ALBINO(1),
    ANCHOVY(2),
    PLATINUM(3);



    private static final DiplacanthusVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator.comparingInt(DiplacanthusVariant::getId)).toArray(DiplacanthusVariant[]::new);

    private final int id;

    DiplacanthusVariant(int id){
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public static DiplacanthusVariant byId(int id){
        return BY_ID[id % BY_ID.length];
    }
}
