package net.spacetimebab.aquaria.entity.variant;

import java.util.Arrays;
import java.util.Comparator;

public enum OrnithoprionVariant {
    WILD(0),
    ALBINO(1),
    PLATINUM(2),
    DEEP_HUNTER(3);

    private static final OrnithoprionVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator.comparingInt(OrnithoprionVariant::getId)).toArray(OrnithoprionVariant[]::new);

    private final int id;

    OrnithoprionVariant(int id){
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public static OrnithoprionVariant byId(int id){
        return BY_ID[id % BY_ID.length];
    }
}
