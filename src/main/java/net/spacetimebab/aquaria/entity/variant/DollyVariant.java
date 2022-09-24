package net.spacetimebab.aquaria.entity.variant;

import java.util.Arrays;
import java.util.Comparator;

public enum DollyVariant {
    WILD(0),
    ALBINO(1),
    AMELANISTIC(2),
    ORCA(3);

    private static final DollyVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator.comparingInt(DollyVariant::getId)).toArray(DollyVariant[]::new);

    private final int id;

    DollyVariant(int id){
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public static DollyVariant byId(int id){
        return BY_ID[id % BY_ID.length];
    }
}
