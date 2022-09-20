package net.spacetimebab.aquaria.entity.variant;

import java.util.Arrays;
import java.util.Comparator;

public enum BungaritusVariant {
    WILD(0),
    ALBINO(1),
    PLATINUM(2),
    RELIC_PLATE(3);

    private static final BungaritusVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator.comparingInt(BungaritusVariant::getId)).toArray(BungaritusVariant[]::new);

    private final int id;

    BungaritusVariant(int id){
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public static BungaritusVariant byId(int id){
        return BY_ID[id % BY_ID.length];
    }
}
