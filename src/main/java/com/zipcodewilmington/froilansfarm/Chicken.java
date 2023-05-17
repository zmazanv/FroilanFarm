package com.zipcodewilmington.froilansfarm;

public class Chicken extends Animal implements Produce {

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
