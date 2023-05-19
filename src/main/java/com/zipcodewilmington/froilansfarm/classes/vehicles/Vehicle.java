package com.zipcodewilmington.froilansfarm.classes.vehicles;

import com.zipcodewilmington.froilansfarm.interfaces.NoiseMaker;
import com.zipcodewilmington.froilansfarm.interfaces.Rideable;

public abstract class Vehicle implements NoiseMaker, Rideable {



    @Override
    public void makeNoise() {
        System.out.println("*ROOM*");
    }



}
