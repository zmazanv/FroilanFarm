package com.zipcodewilmington.froilansfarm.classes;

import com.zipcodewilmington.froilansfarm.interfaces.NoiseMaker;
import com.zipcodewilmington.froilansfarm.interfaces.Rideable;

public abstract class Vehicle implements NoiseMaker, Rideable {

  @Override
    public void makeNoise() {

    }

    @Override
    public void beDismounted() {

    }

    @Override
    public void beMounted() {

    }
}
