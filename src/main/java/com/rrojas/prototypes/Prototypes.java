package com.rrojas.prototypes;

import com.rrojas.models.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Prototypes {
    public static StonePrototype<MindStone> mindPrototype = MindStone::getPrototype;
    public static StonePrototype<PowerStone> powerPrototype = stone -> stone.getPrototype();
    public static StonePrototype<RealityStone> realityPrototype = stone -> stone.getPrototype();
    public static StonePrototype<SpaceStone> spacePrototype = SpaceStone::getPrototype;
    public static StonePrototype<SoulStone> soulPrototype = stone -> stone.getPrototype();
    public static StonePrototype<TimeStone> timePrototype = stone -> stone.getPrototype();
}
