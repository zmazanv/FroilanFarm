package com.zipcodewilmington.froilansfarm.classes;

import com.zipcodewilmington.froilansfarm.interfaces.Edible;

public class CornStalk extends Crop {

    @Override
    public Edible yield() {
        if (hasBeenHarvested() && hasBeenFertilized()) {
            return new EarCorn();
        } else {
            return null;
        }
    }

}
