package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;
import java.util.List;

import com.zipcodewilmington.froilansfarm.classes.*;
import com.zipcodewilmington.froilansfarm.classes.animals.*;
import com.zipcodewilmington.froilansfarm.classes.crops.*;
import com.zipcodewilmington.froilansfarm.classes.persons.*;
import com.zipcodewilmington.froilansfarm.classes.vehicles.*;
import com.zipcodewilmington.froilansfarm.interfaces.*;

/*
Created by leon on 2/26/18.
*/
public class MainApplication {

    public static void main(String[] args) {

        ///////////////////////////////////////////////////////////////////////
        // VEHICLES
        ///////////////////////////////////////////////////////////////////////
        // Creates list to store FarmVehicles
        List<Vehicle> farmVehicles = new ArrayList<>();

        // Creates new CropDuster
        CropDuster cropDuster = new CropDuster();
        //
        // Creates new Tractor
        Tractor tractor = new Tractor();

        // Adds CropDuster to list of FarmVehicles
        farmVehicles.add(cropDuster);
        //
        // Adds Tractor to list of FarmVehicles
        farmVehicles.add(tractor);
        ///////////////////////////////////////////////////////////////////////


        ///////////////////////////////////////////////////////////////////////
        // PERSONS
        ///////////////////////////////////////////////////////////////////////
        Farmer froilan = new Farmer("Froilan");
        Pilot froilanda = new Pilot("Froilanda", cropDuster);
        ///////////////////////////////////////////////////////////////////////


        ///////////////////////////////////////////////////////////////////////
        // ANIMALS
        ///////////////////////////////////////////////////////////////////////
        // Chickens
        ///////////////////////////////////////////////////////////////////////
        // Creates 4 ChickenCoops
        ChickenCoop chickenCoopOne = new ChickenCoop();
        ChickenCoop chickenCoopTwo = new ChickenCoop();
        ChickenCoop chickenCoopThree = new ChickenCoop();
        ChickenCoop chickenCoopFour = new ChickenCoop();

        // Adds 5 new Chickens to ChickenCoop one
        for (int i = 0; i < 5; i++) {
            chickenCoopOne.storeChicken(new Chicken());
        }
        //
        // Adds 5 new Chickens to ChickenCoop two
        for (int i = 0; i < 5; i++) {
            chickenCoopTwo.storeChicken(new Chicken());
        }
        //
        // Adds 3 new Chickens to ChickenCoop three
        for (int i = 0; i < 3; i++) {
            chickenCoopThree.storeChicken(new Chicken());
        }
        //
        // Adds 2 new Chickens to ChickenCoop four
        for (int i = 0; i < 2; i++) {
            chickenCoopFour.storeChicken(new Chicken());
        }
        ///////////////////////////////////////////////////////////////////////
        ///////////////////////////////////////////////////////////////////////
        // Horses
        ///////////////////////////////////////////////////////////////////////
        // Creates 4 Stables
        Stable stableOne = new Stable();
        Stable stableTwo = new Stable();
        Stable stableThree = new Stable();

        // Adds 4 new Horses to Stable one
        for (int i = 0; i < 4; i++) {
            stableOne.storeHorse(new Horse());
        }
        //
        // Adds 3 new Horses to Stable two
        for (int i = 0; i < 3; i++) {
            stableTwo.storeHorse(new Horse());
        }
        //
        // Adds 3 new Horses to Stable three
        for (int i = 0; i < 3; i++) {
            stableThree.storeHorse(new Horse());
        }
        ///////////////////////////////////////////////////////////////////////


        ///////////////////////////////////////////////////////////////////////
        // CROPS
        ///////////////////////////////////////////////////////////////////////
        // CrowRows
        ///////////////////////////////////////////////////////////////////////
        // Creates 5 CropRows
        CropRow cornStalkCropRow = new CropRow();
        CropRow tomatoPlantCropRow = new CropRow();
        CropRow mixedCropRowOne = new CropRow();
        CropRow mixedCropRowTwo = new CropRow();
        CropRow mixedCropRowThree = new CropRow();


        // Adds 10 new CornStalks to CropRow for CornStalks
        for (int i = 0; i < 10; i++) {
            cornStalkCropRow.storeCrop(new CornStalk());
        }
        //
        // Adds 8 new TomatoPlants to CropRow for TomatoPlants
        for (int i = 0; i < 8; i++) {
            tomatoPlantCropRow.storeCrop(new TomatoPlant());
        }
        //
        // Adds 4 new CornStalks to MixedCropRow one
        for (int i = 0; i < 4; i++) {
            mixedCropRowOne.storeCrop(new CornStalk());
        }
        // Adds 6 new TomatoPlants to MixedCropRow one
        for (int i = 0; i < 6; i++) {
            mixedCropRowOne.storeCrop(new TomatoPlant());
        }
        // Adds 3 new WheatPlants to MixedCropRow one
        for (int i = 0; i < 3; i++) {
            mixedCropRowOne.storeCrop(new WheatPlant());
        }
        //
        // Adds 6 new CornStalks to MixedCropRow two
        for (int i = 0; i < 6; i++) {
            mixedCropRowTwo.storeCrop(new CornStalk());
        }
        // Adds 3 new TomatoPlants to MixedCropRow two
        for (int i = 0; i < 3; i++) {
            mixedCropRowTwo.storeCrop(new TomatoPlant());
        }
        // Adds 5 new WheatPlants to MixedCropRow two
        for (int i = 0; i < 5; i++) {
            mixedCropRowTwo.storeCrop(new WheatPlant());
        }
        //
        // Adds 4 new CornStalks to MixedCropRow three
        for (int i = 0; i < 4; i++) {
            mixedCropRowThree.storeCrop(new CornStalk());
        }
        // Adds 3 new TomatoPlants to MixedCropRow three
        for (int i = 0; i < 3; i++) {
            mixedCropRowThree.storeCrop(new TomatoPlant());
        }
        // Adds 2 new WheatPlants to MixedCropRow three
        for (int i = 0; i < 2; i++) {
            mixedCropRowThree.storeCrop(new WheatPlant());
        }
        ///////////////////////////////////////////////////////////////////////
        ///////////////////////////////////////////////////////////////////////
        // Field
        ///////////////////////////////////////////////////////////////////////
        // Creates Field
        Field froilanFarmField = new Field();

        // Adds CropRow for CornStalks to Field
        froilanFarmField.storeCropRow(cornStalkCropRow);
        //
        // Adds CropRow for TomatoPlants to Field
        froilanFarmField.storeCropRow(tomatoPlantCropRow);
        //
        // Adds 3 Mixed Crop Rows to Field
        froilanFarmField.storeCropRow(mixedCropRowOne);
        froilanFarmField.storeCropRow(mixedCropRowTwo);
        froilanFarmField.storeCropRow(mixedCropRowThree);
        ///////////////////////////////////////////////////////////////////////


        ///////////////////////////////////////////////////////////////////////
        // FARM
        ///////////////////////////////////////////////////////////////////////
        // FarmHouse
        ///////////////////////////////////////////////////////////////////////
        // Creates new FarmHouse
        FarmHouse froilanFarmHouse = new FarmHouse();

        // Adds Froilan as resident to FarmHouse
        froilanFarmHouse.addResident(froilan);
        // Adds Froilanda as resident to FarmHouse
        froilanFarmHouse.addResident(froilanda);
        ///////////////////////////////////////////////////////////////////////
        ///////////////////////////////////////////////////////////////////////
        // Farm
        ///////////////////////////////////////////////////////////////////////
        Farm froilanFarm = new Farm(froilanFarmHouse, froilanFarmField);

        // Adds 4 ChickenCoops to Farm
        froilanFarm.addChickenCoop(chickenCoopOne);
        froilanFarm.addChickenCoop(chickenCoopTwo);
        froilanFarm.addChickenCoop(chickenCoopThree);
        froilanFarm.addChickenCoop(chickenCoopFour);

        // Adds 3 Stables to Farm
        froilanFarm.addStable(stableOne);
        froilanFarm.addStable(stableTwo);
        froilanFarm.addStable(stableThree);
        ///////////////////////////////////////////////////////////////////////



        ///////////////////////////////////////////////////////////////////////
        // PRINTED OUTPUT
        ///////////////////////////////////////////////////////////////////////
        System.out.println("###############################################################################");
        System.out.println("Vehicles:");
        System.out.println(farmVehicles);
        System.out.println("###############################################################################");
        System.out.println();
        System.out.println("###############################################################################");
        System.out.println("Persons:");
        System.out.println(froilan);
        System.out.println(froilanda);
        System.out.println("###############################################################################");
        System.out.println();
        System.out.println("###############################################################################");
        System.out.println("Field:");
        System.out.println("Froilan Farm's Field has " + froilanFarmField.getContainedCropRows().size() + " CropRows.");
        System.out.println("-------------------------------------------------------------------------------");
        for (int i = 0; i < froilanFarmField.getContainedCropRows().size(); i++) {
            System.out.println("CropRow " + (i + 1) + " contains " + froilanFarmField.getContainedCropRows().get(i).getContainedCrops().size() + " Crops:");
            for (int ii = 0; ii < froilanFarmField.getContainedCropRows().get(i).getContainedCrops().size(); ii++) {
                System.out.println((ii + 1) + ".: " + froilanFarmField.getContainedCropRows().get(i).getContainedCrops().get(ii));
            }
            System.out.println("-------------------------------------------------------------------------------");
        }
        System.out.println("###############################################################################");
        System.out.println();
        System.out.println("###############################################################################");
        System.out.println("Animals");
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("Froilan's Farm has " + froilanFarm.getChickenCoops().size() + " ChickenCoops.");
        System.out.println("-------------------------------------------------------------------------------");
        for (int i = 0; i < froilanFarm.getChickenCoops().size(); i++) {
            System.out.println("ChickenCoop " + (i + 1) + " contains " + froilanFarm.getChickenCoops().get(i).getHeldChickens().size() + " Chickens:");
            for (int ii = 0; ii < froilanFarm.getChickenCoops().get(i).getHeldChickens().size(); ii++) {
                System.out.println((ii + 1) + ".: " + froilanFarm.getChickenCoops().get(i).getHeldChickens().get(ii));
            }
            System.out.println("-------------------------------------------------------------------------------");
        }
        System.out.println("===============================================================================");
        System.out.println("Froilan's Farm has " + froilanFarm.getStables().size() + " Stables.");
        System.out.println("-------------------------------------------------------------------------------");
        for (int i = 0; i < froilanFarm.getStables().size(); i++) {
            System.out.println("Stable " + (i + 1) + " contains " + froilanFarm.getStables().get(i).getHeldHorses().size() + " Horses:");
            for (int ii = 0; ii < froilanFarm.getStables().get(i).getHeldHorses().size(); ii++) {
                System.out.println((ii + 1) + ".: " + froilanFarm.getStables().get(i).getHeldHorses().get(ii));
            }
            System.out.println("-------------------------------------------------------------------------------");
        }
        System.out.println("###############################################################################");
        ///////////////////////////////////////////////////////////////////////

    }
}

