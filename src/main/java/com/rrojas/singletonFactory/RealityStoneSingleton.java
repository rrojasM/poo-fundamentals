package com.rrojas.singletonFactory;

import com.rrojas.models.MindStone;
import com.rrojas.models.RealityStone;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.java.Log;

@Log
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class RealityStoneSingleton {
    private static volatile RealityStone realityStoneInstance;
    public static RealityStone getInstance() {
        if (realityStoneInstance == null) {
            log.info("CREANDO PRIMERA INSTANCE: " + RealityStoneSingleton.class.getSimpleName());
            synchronized (RealityStoneSingleton.class) {
                if (realityStoneInstance == null) {
                    realityStoneInstance = new RealityStone();
                }
            }
        }
        return realityStoneInstance;
    }

}
