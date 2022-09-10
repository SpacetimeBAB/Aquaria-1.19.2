package net.spacetimebab.aquaria.entity.variant;

import java.util.Arrays;
import java.util.Comparator;

public enum DipterusVariant {
    WILD(0),
    ALBINO(1),
    PLATINUM(2),
    INVERTED(3);

    private static final DipterusVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator.comparingInt(DipterusVariant::getId)).toArray(DipterusVariant[]::new);

    private final int id;

    DipterusVariant(int id){
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public static DipterusVariant byId(int id){
        return BY_ID[id % BY_ID.length];
    }
}
