package net.spacetimebab.aquaria;

import net.minecraft.util.StringRepresentable;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;

public class BlockProperties {
    public static final BooleanProperty HAS_ITEM = BooleanProperty.create("has_item");
    public static final BooleanProperty HAS_LIGHT = BooleanProperty.create("has_light");
    public static final EnumProperty<ResurrectionAltarState> RESURRECTION_STATE = EnumProperty.create("state", ResurrectionAltarState.class);

    public static enum ResurrectionAltarState implements StringRepresentable {
        PEDESTAL_TOP("pedestal_top"),
        COLUMN_TOP("column_top"),
        BOTTOM("bottom"),
        PILLAR("pillar"),
        COLUMN("column"),
        DEFAULT("default");

        private final String name;

        ResurrectionAltarState(String name)
        {
            this.name = name;
        }



        @Override
        public String toString()
        {
            return this.name;
        }


        public String getString()
        {
            return name;
        }

        @Override
        public String getSerializedName() {
            return null;
        }
    }

}
