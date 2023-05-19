package com.zipcodewilmington.froilansfarm.classes.crops;

import com.zipcodewilmington.froilansfarm.interfaces.Edible;

public class TomatoPlant extends Crop {

    /*
    This method checks the `TomatoPlant`'s flags and if both `true`, it will yield (return)
    a `Tomato` after resetting the flags using the `restartCycle()` method from
    `Crop`. If both are not `true`, it will return `null`, hence nothing.
     */
   @Override
    public Edible yield() {
        if (this.isFertilized() && this.isHarvested()) {
            this.restartCycle();
            System.out.println("A Tomato has been yielded by its " + this.getClass().getSimpleName() + '.');
            return (new Tomato());
        } else {
            StringBuilder response = new StringBuilder("The " + this.getClass().getSimpleName() + " is not ready as it has not been ");
            if (!this.isFertilized() && !this.isHarvested()) {
                response.append("fertilized nor harvested. Once fertilized and harvested, it will be able to yield a Tomato.");
            } else if (!this.isFertilized() && this.isHarvested()) {
                response.append("fertilized. Once fertilized, it will be able to yield a Tomato.");
            } else {
                response.append("harvested. Once harvested, it will be able to yield a Tomato.");
            }
            System.out.println(response);
            return null;
        }
    }

    @Override
    public String toString() {
        return "Tomato Plant";
    }

}
