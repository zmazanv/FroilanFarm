package com.zipcodewilmington.froilansfarm.classes.persons;

import com.zipcodewilmington.froilansfarm.interfaces.*;

public class Farmer extends Person implements Botanist, Rider {

    public Farmer(String name) {
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.println("*YEEHAW*");
    }

}
