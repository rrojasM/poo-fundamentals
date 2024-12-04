package com.rrojas.singletonFactory;

import com.rrojas.models.RealityStone;
import com.rrojas.models.SoulStone;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.java.Log;

@Log
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class SoulStoneSingleton {
    private static volatile SoulStone soulStoneInstance;
    public static SoulStone getInstance() {
        if (soulStoneInstance == null) {
            log.info("CREANDO PRIMERA INSTANCE: " + SoulStoneSingleton.class.getSimpleName());
            synchronized (SoulStoneSingleton.class) {
                if (soulStoneInstance == null) {
                    soulStoneInstance = new SoulStone();
                }
            }
        }
        return soulStoneInstance;
    }
}
