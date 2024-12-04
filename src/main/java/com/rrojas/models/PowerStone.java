package com.rrojas.models;

import lombok.ToString;
import lombok.extern.java.Log;

import java.io.*;

@ToString
@Log
public class PowerStone extends AbstractStone{
    private static final String COLOR = "PURPLE";
    private static final String NAME = "Power Stone";
    private static final String LOCATION = "Xandar";
    private static final int ENERGY_LEVEL = 10;

    public PowerStone() {
        super(COLOR, NAME, LOCATION, ENERGY_LEVEL);
    }

    @Override
    public void usePower() {
        System.out.println("USE POWER_STONE: " + super.toString());
    }
    public PowerStone getPrototype(){
        try(final var bos = new ByteArrayOutputStream();
            final var oos = new ObjectOutputStream(bos);){
            //CONVERT OBJECT INTO BYTES
            //final var bos = new ByteArrayOutputStream();
            //final var oos = new ObjectOutputStream(bos);

            //SERiaLIZE OBJECTS (CLONE)
            oos.writeObject(this);
            //VACIAR BUFFER
            oos.flush();

            try(

                    //deserialize
                    final var bis = new ByteArrayInputStream(bos.toByteArray());
                    final var ois = new ObjectInputStream(bis);
            ){
                //return and cast object MINDSTONE
                return (PowerStone) ois.readObject();
            }
        }catch (IOException | ClassNotFoundException e){
            log.warning("CANT CAST OR READ CLAS MIND STONE");
            throw new RuntimeException(e.getMessage());
        }
    }
}
