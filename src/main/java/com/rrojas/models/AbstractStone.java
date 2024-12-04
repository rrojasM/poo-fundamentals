package com.rrojas.models;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public abstract class AbstractStone implements Serializable {
    String Color;
    String Name;
    String Location;
    Integer EnergyLevel;
    Integer NumberOfSides;

    private static final int NUMBER_OF_SIDES = 6;
    public AbstractStone(String color, String name, String location, Integer energyLevel) {
        Color = color;
        Name = name;
        Location = location;
        EnergyLevel = energyLevel;
        NumberOfSides = NUMBER_OF_SIDES;
    }

    public abstract void usePower();
}
