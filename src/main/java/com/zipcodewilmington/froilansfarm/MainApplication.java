package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.classes.Farm;
import com.zipcodewilmington.froilansfarm.classes.persons.Farmer;
import com.zipcodewilmington.froilansfarm.classes.vehicles.Aircraft;
import com.zipcodewilmington.froilansfarm.classes.vehicles.CropDuster;
import com.zipcodewilmington.froilansfarm.classes.vehicles.Tractor;
import com.zipcodewilmington.froilansfarm.classes.vehicles.Vehicle;
import com.zipcodewilmington.froilansfarm.interfaces.FarmVehicle;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by leon on 2/26/18.
 */
public class MainApplication {

    public static void main(String[] args) {
        Farmer froilan = new Farmer("Froilan");

        List<Vehicle> farmVehicles = new ArrayList<>();

        Tractor tractor = new Tractor();
        CropDuster cropDuster = new CropDuster();
        farmVehicles.add(tractor);
        farmVehicles.add(cropDuster);

        Aircraft aircraft = new Aircraft();

        // Print out the farmVehicles list
        for (Vehicle vehicle : farmVehicles) {
            System.out.println(vehicle); //
        }
    }
}
