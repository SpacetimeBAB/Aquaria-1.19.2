package net.spacetimebab.aquaria.entity.variant;

import java.util.Arrays;
import java.util.Comparator;

public enum NeoceratodusVariant {
    WILD(0),
    ALBINO(1),
    PLATINUM(2),
    LEUCISTIC(3);

    private static final NeoceratodusVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator.comparingInt(NeoceratodusVariant::getId)).toArray(NeoceratodusVariant[]::new);

    private final int id;

    NeoceratodusVariant(int id){
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public static NeoceratodusVariant byId(int id){
        return BY_ID[id % BY_ID.length];
    }
}
