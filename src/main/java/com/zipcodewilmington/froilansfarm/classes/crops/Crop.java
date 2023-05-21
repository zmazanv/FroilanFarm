package com.zipcodewilmington.froilansfarm.classes.crops;

import com.zipcodewilmington.froilansfarm.interfaces.Produce;

public abstract class Crop implements Produce {

    private boolean hasBeenFertilized;
    private boolean hasBeenHarvested;

    public Crop() {
        this.hasBeenFertilized = false;
        this.hasBeenHarvested = false;
    }
//    public Crop(boolean hasBeenFertilized, boolean hasBeenHarvested) {
//        this.hasBeenFertilized = hasBeenFertilized;
//        this.hasBeenHarvested = hasBeenHarvested;
//    }

    public boolean isFertilized() {
        return this.hasBeenFertilized;
    }

    public boolean isHarvested() {
        return this.hasBeenHarvested;
    }

    public void fertilize() {
        System.out.println(this.getClass().getSimpleName() + " has been fertilized.");
        this.hasBeenFertilized = true;
    }

    public void harvest() {
        System.out.println(this.getClass().getSimpleName() + " has been harvested.");
        this.hasBeenHarvested = true;
    }


    /*
    This method is `protected` so it can be accessed by `Crop`'s subclasses, being `CornStalk` and `TomatoPlant` in this case.
    The subclasses are able to use it, which they do in their respective `yield()` methods.
    In such methods, they call this method to reset the `hasBeenFertilized` and `hasBeenHarvested` flags for the `Crop`.
    This is so they can be fertilized and harvested to be able to `yield()` again.
    This method is restricted to subclasses and classes in this package, but nothing outside.
    This means the `MainApplication` class can't access this method, which is desirable.
    The `Crop` should have to `yield()` in order for these to be reset, and not be manually adjustable.
    */
    protected void restartCycle() {
        this.hasBeenFertilized = false;
        this.hasBeenHarvested = false;
    }

    @Override
    public String toString() {
        StringBuilder response = new StringBuilder(this.getClass().getSimpleName());
        if (this.hasBeenFertilized && this.hasBeenHarvested) {
            response.append(" has been fertilized and harvested.");
        } else if (this.hasBeenFertilized && !this.hasBeenHarvested) {
            response.append(" has been fertilized, but not harvested.");
        } else if (!this.hasBeenFertilized && this.hasBeenHarvested){
            response.append(" has been harvested, but not fertilized.");
        } else {
            response.append(" has not been fertilized nor harvested.");
        }
        return response.toString();
    }

}
