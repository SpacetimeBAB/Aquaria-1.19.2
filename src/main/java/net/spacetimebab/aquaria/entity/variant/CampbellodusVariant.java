package net.spacetimebab.aquaria.entity.variant;

import java.util.Arrays;
import java.util.Comparator;

public enum CampbellodusVariant {
    WILD(0),
    ALBINO(1),
    STRIPED(2),
    MELANISTIC(3);



    private static final CampbellodusVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator.comparingInt(CampbellodusVariant::getId)).toArray(CampbellodusVariant[]::new);

    private final int id;

    CampbellodusVariant(int id){
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public static CampbellodusVariant byId(int id){
        return BY_ID[id % BY_ID.length];
    }
}
