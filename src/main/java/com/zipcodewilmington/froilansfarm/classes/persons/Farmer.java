package com.zipcodewilmington.froilansfarm.classes.persons;

import com.zipcodewilmington.froilansfarm.classes.animals.Animal;
import com.zipcodewilmington.froilansfarm.interfaces.*;

public class Farmer extends Person implements Botanist, Rider {

    public Farmer(String name) {
        super(name);
    }

    public void feed(Animal animalToBeFed, Edible edibleToBeGiven) {
        animalToBeFed.eat(edibleToBeGiven);
    }

    @Override
    public void makeNoise() {
        System.out.println("*YEEHAW*");
    }

    @Override
    public String toString() {
        StringBuilder response = new StringBuilder(super.toString());
        response.append(" works on a Farm.");
        return response.toString();
    }
}
