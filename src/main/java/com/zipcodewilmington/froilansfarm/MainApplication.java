package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.classes.Farm;
import com.zipcodewilmington.froilansfarm.classes.persons.Farmer;
import com.zipcodewilmington.froilansfarm.classes.vehicles.Aircraft;
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

        List<Vehicle> farmVehicles = new ArrayList<Vehicle>();

        int numFarmVehicles = 2;
        for ( int i = 0; i < numFarmVehicles ; i++ ) {
            Farm addFarmVehicle = (Farm) new Farm().getVehicles();
            addFarmVehicle.addVehicles(farmVehicles);
        }
    }
    Aircraft aircraft = new Aircraft();

}
