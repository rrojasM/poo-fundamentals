package com.rrojas.singletonFactory;

import com.rrojas.models.SpaceStone;
import com.rrojas.models.TimeStone;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.java.Log;

@Log
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class TimeStoneSingleton {
    private static volatile TimeStone timeStoneInstance;
    public static TimeStone getInstance() {
        if (timeStoneInstance == null) {
            log.info("CREANDO PRIMERA INSTANCE: " + TimeStoneSingleton.class.getSimpleName());
            synchronized (TimeStoneSingleton.class) {
                if (timeStoneInstance == null) {
                    timeStoneInstance = new TimeStone();
                }
            }
        }
        return timeStoneInstance;
    }
}
