package com.zipcodewilmington.froilansfarm;

public class TomatoPlant extends Crop {
   @Override
    public Edible yield() {

        if (hasBeenHarvested() && hasBeenFertilized()) {
            return (new Tomato());
        } else {
            return null;
        }
    }


}
