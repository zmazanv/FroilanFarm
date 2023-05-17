package com.zipcodewilmington.froilansfarm;

public abstract class Crop implements Produce {

    private boolean hasBeenFertilized;
    private boolean hasBeenHarvested;

    public Crop() {
        this.hasBeenFertilized = false;
        this.hasBeenHarvested = false;
    }

    public boolean hasBeenFertilized() {
        return hasBeenFertilized;
    }

    public boolean hasBeenHarvested() {
        return hasBeenHarvested;
    }

    public void setHasBeenHarvested(boolean harvested) {
        this.hasBeenHarvested = harvested;
    }

    public void setHasBeenFertilized(boolean fertilized) {
        this.hasBeenFertilized = fertilized;
    }

}
