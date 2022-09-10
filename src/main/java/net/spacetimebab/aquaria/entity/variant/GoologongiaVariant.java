package net.spacetimebab.aquaria.entity.variant;

import java.util.Arrays;
import java.util.Comparator;

public enum GoologongiaVariant {
    WILD(0),
    ALBINO(1);

    private static final GoologongiaVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator.comparingInt(GoologongiaVariant::getId)).toArray(GoologongiaVariant[]::new);

    private final int id;

    GoologongiaVariant(int id){
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public static GoologongiaVariant byId(int id){
        return BY_ID[id % BY_ID.length];
    }
}
