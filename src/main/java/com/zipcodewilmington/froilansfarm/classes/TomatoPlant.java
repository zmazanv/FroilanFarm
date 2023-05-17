package com.zipcodewilmington.froilansfarm.classes;

import com.zipcodewilmington.froilansfarm.interfaces.Edible;

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
