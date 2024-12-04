package com.rrojas.models;

import lombok.ToString;
import lombok.extern.java.Log;

import java.io.*;

@ToString
@Log
public class TimeStone extends AbstractStone {
    private static final String COLOR = "GREEN";
    private static final String NAME = "Time Stone";
    private static final String LOCATION = "Agamotto";
    private static final int ENERGY_LEVEL = 9;

    public TimeStone() {
        super(COLOR, NAME, LOCATION, ENERGY_LEVEL);
    }

    @Override
    public void usePower() {
        System.out.println("USE TIME_STONE: " + super.toString());
    }
    public TimeStone getPrototype(){
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
                return (TimeStone) ois.readObject();
            }
        }catch (IOException | ClassNotFoundException e){
            log.warning("CANT CAST OR READ CLAS MIND STONE");
            throw new RuntimeException(e.getMessage());
        }
    }
}
