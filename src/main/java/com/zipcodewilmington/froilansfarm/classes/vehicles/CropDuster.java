package com.zipcodewilmington.froilansfarm.classes.vehicles;

import com.zipcodewilmington.froilansfarm.classes.Farm;
import com.zipcodewilmington.froilansfarm.interfaces.FarmVehicle;

public class CropDuster extends Aircraft implements FarmVehicle {
    
    public void operate(Farm farm) {
        farm.getField().fertilize();
    }

    @Override
    public String toString() {
        return "CropDuster";
    }
}
