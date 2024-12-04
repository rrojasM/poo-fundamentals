package com.rrojas.services;

import com.rrojas.models.AbstractStone;
import com.rrojas.models.RealityStone;
import com.rrojas.singletonFactory.MindStoneSingleton;
import lombok.extern.java.Log;

//@service
@Log
public class GauntletServiceImpl implements GauntletService {

    //public AbstractStone reality = new RealityStone();
    private final AbstractStone reality = MindStoneSingleton.getInstance();

    @Override
    public void useGauntlet(String stoneName) {
        log.info("USE_STONE: " + reality);
    }
}
