package com.zipcodewilmington.froilansfarm.classes.animals;

import com.zipcodewilmington.froilansfarm.interfaces.Rideable;

public class Horse extends Animal implements Rideable {

    @Override
    public void makeNoise() {
        System.out.println("*NEIGH*");
    }

}
