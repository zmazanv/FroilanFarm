package com.zipcodewilmington.froilansfarm.classes.animals;

import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.Produce;

public class Chicken extends Animal implements Produce {

    private boolean hasBeenFertilized;

    public Chicken() {
        this.hasBeenFertilized = false;
    }
//    public Chicken(boolean hasBeenFertilized) {
//        this.hasBeenFertilized = hasBeenFertilized;
//    }

    public void fertilize() {
        this.hasBeenFertilized = true;
    }

    public boolean isFertilized() {
        return this.hasBeenFertilized;
    }

    @Override
    public Edible yield() {
        if(this.hasBeenFertilized) {
            this.hasBeenFertilized = false;
            System.out.println("An egg has been yielded by its " + this.getClass().getSimpleName() + '.');
            return (new EdibleEgg());
        } else {
            System.out.println("The " + this.getClass().getSimpleName() + " is not ready as it has not been fertilized."
                    + "Once fertilized it will be able to yield an Egg.");
            return null;
        }
    }

    @Override
    public void makeNoise() {
        System.out.println("\"Cluck\"");
    }

    @Override
    public String toString() {
        StringBuilder response = new StringBuilder(this.getClass().getSimpleName());
        if (this.hasBeenFertilized) {
            response.append(" has been fertilized.");
        } else {
            response.append(" has not been fertilized.");
        }
        return response.toString();
    }
}
