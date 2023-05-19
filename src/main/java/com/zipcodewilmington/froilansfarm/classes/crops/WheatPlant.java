package com.zipcodewilmington.froilansfarm.classes.crops;

import com.zipcodewilmington.froilansfarm.interfaces.Edible;

public class WheatPlant extends Crop {

    public WheatPlant() {
        super();
    }
    public WheatPlant(boolean hasBeenFertilized, boolean hasBeenHarvested) {
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
            System.out.println("A grain of wheat has been yielded by its " + this.getClass().getSimpleName() + '.');
            return (new EarOfCorn());
        } else {
            StringBuilder response = new StringBuilder("The " + this.getClass().getSimpleName() + " is not ready as it has not been ");
            if (!this.isFertilized() && !this.isHarvested()) {
                response.append("fertilized nor harvested. Once fertilized and harvested, it will be able to yield a grain of wheat.");
            } else if (!this.isFertilized() && this.isHarvested()) {
                response.append("fertilized. Once fertilized, it will be able to yield a grain wheat.");
            } else {
                response.append("harvested. Once harvested, it will be able to yield a grain of wheat.");
            }
            System.out.println(response);
            return null;
        }
    }

}