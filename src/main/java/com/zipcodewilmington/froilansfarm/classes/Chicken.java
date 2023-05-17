package com.zipcodewilmington.froilansfarm.classes;

import com.zipcodewilmington.froilansfarm.interfaces.Eater;
import com.zipcodewilmington.froilansfarm.interfaces.NoiseMaker;
import com.zipcodewilmington.froilansfarm.interfaces.Produce;

public class Chicken implements Produce, Eater, NoiseMaker {

    private boolean hasBeenFertilized;

    public Chicken() {
        this.hasBeenFertilized = false;
    }
    public Chicken(boolean hasBeenFertilized) {
        this.hasBeenFertilized = hasBeenFertilized;
    }

    public void fertilize() {
        this.hasBeenFertilized = true;
    }

    public boolean isFertilized() {
        return this.hasBeenFertilized;
    }
    
}
