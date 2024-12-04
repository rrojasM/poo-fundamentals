package com.rrojas.singletonFactory;

import com.rrojas.models.SoulStone;
import com.rrojas.models.SpaceStone;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.java.Log;

@Log
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class SpaceStoneSingleton {
    private static volatile SpaceStone spaceStoneInstance;
    public static SpaceStone getInstance() {
        if (spaceStoneInstance == null) {
            log.info("CREANDO PRIMERA INSTANCE: " + SpaceStoneSingleton.class.getSimpleName());
            synchronized (SpaceStoneSingleton.class) {
                if (spaceStoneInstance == null) {
                    spaceStoneInstance = new SpaceStone();
                }
            }
        }
        return spaceStoneInstance;
    }
}
