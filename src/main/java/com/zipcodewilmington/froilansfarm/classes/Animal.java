package com.zipcodewilmington.froilansfarm.classes;

import com.zipcodewilmington.froilansfarm.interfaces.Eater;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.NoiseMaker;

public class Animal implements Eater, NoiseMaker {

    @Override
    public void eat(Edible edible) {}

    @Override
    public void makeNoise() {}

}
