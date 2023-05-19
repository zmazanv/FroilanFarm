package com.zipcodewilmington.froilansfarm.classes.crops;

import com.zipcodewilmington.froilansfarm.interfaces.Edible;

public class CornStalk extends Crop {

    public CornStalk() {
        super();
    }
    public CornStalk(boolean hasBeenFertilized, boolean hasBeenHarvested) {
        super(hasBeenFertilized, hasBeenHarvested);
    }

    /*
    This method checks the `CornStalk`'s flags and if both `true`, it will yield (return)
    an `EarCorn` after resetting the flags using the `restartCycle()` method from
    `Crop`. If both are not `true`, it will return `null`, hence nothing.
     */
    @Override
    public Edible yield() {
        if (this.isFertilized() && this.isHarvested()) {
            this.restartCycle();
            System.out.println("An Ear of Corn has been yielded by its " + this.getClass().getSimpleName() + '.');
            return (new EarOfCorn());
        } else {
            StringBuilder response = new StringBuilder("The " + this.getClass().getSimpleName() + " is not ready as it has not been ");
            if (!this.isFertilized() && !this.isHarvested()) {
                response.append("fertilized nor harvested. Once fertilized and harvested, it will be able to yield an Ear of Corn.");
            } else if (!this.isFertilized() && this.isHarvested()) {
                response.append("fertilized. Once fertilized, it will be able to yield an Ear of Corn.");
            } else {
                response.append("harvested. Once harvested, it will be able to yield an Ear of Corn.");
            }
            System.out.println(response);
            return null;
        }
    }

    @Override
    public String toString() {
        return "EarOfCorn";
    }
}
