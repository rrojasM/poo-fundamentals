package com.rrojas.singletonFactory;

import com.rrojas.models.MindStone;
import com.rrojas.models.PowerStone;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.java.Log;

@Log
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class PowerStoneSingleton {

    private static volatile PowerStone powerStoneInstance;
    public static PowerStone getInstance() {
        if (powerStoneInstance == null) {
            log.info("CREANDO PRIMERA INSTANCE: " + PowerStoneSingleton.class.getSimpleName());
            synchronized (PowerStoneSingleton.class) {
                if (powerStoneInstance == null) {
                    powerStoneInstance = new PowerStone();
                }
            }
        }
        return powerStoneInstance;
    }
}
