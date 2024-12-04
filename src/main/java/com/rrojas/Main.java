package com.rrojas;

import com.rrojas.models.AbstractStone;
import com.rrojas.models.MindStone;
import com.rrojas.models.PowerStone;
import com.rrojas.models.RealityStone;
import com.rrojas.services.GauntletService;
import com.rrojas.services.GauntletServiceImpl;
import com.rrojas.singletonFactory.RealityStoneSingleton;

public class Main {
    public static void main(String[] args) {
        //final var mind = new MindStone(); //INSTANCIAR UNA CLASE ABSTRACTA
        //final var power = new PowerStone();
        //final var reality = new RealityStone();
        //final var guantlet = new GauntletServiceImpl();

       // guantlet.useGauntlet("STONE");

//        var r1 = RealityStoneSingleton.getInstance();
//        var r2 = RealityStoneSingleton.getInstance();
//        var r3 = RealityStoneSingleton.getInstance();
//
//        if(r1 == r2 && r2 == r3) {
//            System.out.println("SINGLETON!!");
//        }



        // instancia 1
        final var mind = new MindStone();
        System.out.println(mind);
        System.out.println(System.identityHashCode(mind));

        //instance 2
        final var mindPrototype = mind.getPrototype();
        System.out.println(mindPrototype);
        System.out.println(System.identityHashCode(mindPrototype));
    }
}