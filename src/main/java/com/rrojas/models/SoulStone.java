package com.rrojas.models;

import lombok.ToString;
import lombok.extern.java.Log;

import java.io.*;

@ToString
@Log
public class SoulStone extends AbstractStone{
    private static final String COLOR = "ORANGE";
    private static final String NAME = "Soul Stone";
    private static final String LOCATION = "Vormir";
    private static final int ENERGY_LEVEL = 7;
    public SoulStone() {
        super(COLOR, NAME, LOCATION, ENERGY_LEVEL);
    }

    @Override
    public void usePower() {
        System.out.println("USE SOUL_STONE: " + super.toString());
    }

    public SoulStone getPrototype(){
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
                return (SoulStone) ois.readObject();
            }
        }catch (IOException | ClassNotFoundException e){
            log.warning("CANT CAST OR READ CLAS MIND STONE");
            throw new RuntimeException(e.getMessage());
        }
    }
}
