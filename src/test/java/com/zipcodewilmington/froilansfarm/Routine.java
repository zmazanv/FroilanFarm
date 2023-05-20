package com.zipcodewilmington.froilansfarm;

import org.junit.Before;

import com.zipcodewilmington.froilansfarm.classes.*;
import com.zipcodewilmington.froilansfarm.classes.animals.*;
import com.zipcodewilmington.froilansfarm.classes.crops.*;
import com.zipcodewilmington.froilansfarm.classes.persons.*;
import com.zipcodewilmington.froilansfarm.classes.vehicles.*;
import com.zipcodewilmington.froilansfarm.interfaces.*;

public abstract class Routine {

    //////////////////////////////////////////////////////////////////////////
    // PERSONS
    //////////////////////////////////////////////////////////////////////////
    protected Farmer froilan;
    protected Pilot froilanda;
    //////////////////////////////////////////////////////////////////////////

    //////////////////////////////////////////////////////////////////////////
    // FARM
    //////////////////////////////////////////////////////////////////////////
    protected Farm farm;
    //------------------------------------------------------------------------
    protected FarmHouse farmHouse;
    //////////////////////////////////////////////////////////////////////////

    //////////////////////////////////////////////////////////////////////////
    // ANIMALS
    //////////////////////////////////////////////////////////////////////////
    protected ChickenCoop chickenCoopOne = new ChickenCoop();
    protected ChickenCoop chickenCoopTwo = new ChickenCoop();
    protected ChickenCoop chickenCoopThree = new ChickenCoop();
    protected ChickenCoop chickenCoopFour = new ChickenCoop();
    //------------------------------------------------------------------------
    protected Stable stableOne = new Stable();
    protected Stable stableTwo = new Stable();
    protected Stable stableThree = new Stable();
    //////////////////////////////////////////////////////////////////////////

    //////////////////////////////////////////////////////////////////////////
    // CROPS
    //////////////////////////////////////////////////////////////////////////
    protected Field field = new Field();
    //------------------------------------------------------------------------
    protected CropRow cornStalkCropRow = new CropRow();
    protected CropRow tomatoPlantCropRow = new CropRow();
    protected CropRow mixedCropRowOne = new CropRow();
    protected CropRow mixedCropRowTwo = new CropRow();
    protected CropRow mixedCropRowThree = new CropRow();
    //////////////////////////////////////////////////////////////////////////

    @Before
    public void setUp() {
        //////////////////////////////////////////////////////////////////////////
        // VEHICLES
        //////////////////////////////////////////////////////////////////////////
        Aircraft cropDuster = new CropDuster();
        FarmVehicle tractor = new Tractor();
        //////////////////////////////////////////////////////////////////////////

        //////////////////////////////////////////////////////////////////////////
        // PERSONS
        //////////////////////////////////////////////////////////////////////////
        froilan = new Farmer("Froilan");
        froilanda = new Pilot("Froilanda", cropDuster);
        //////////////////////////////////////////////////////////////////////////

        //////////////////////////////////////////////////////////////////////////
        // CROPS
        //////////////////////////////////////////////////////////////////////////
        // Adds 10 new CornStalks to CropRow for CornStalks
        for (int i = 0; i < 10; i++) {
            cornStalkCropRow.storeCrop(new CornStalk());
        }
        //------------------------------------------------------------------------
        // Adds 8 new TomatoPlants to CropRow for TomatoPlants
        for (int i = 0; i < 8; i++) {
            tomatoPlantCropRow.storeCrop(new TomatoPlant());
        }
        //------------------------------------------------------------------------
        // Adds 4 new CornStalks to MixedCropRow one
        for (int i = 0; i < 4; i++) {
            mixedCropRowOne.storeCrop(new CornStalk());
        }
        // Adds 6 new TomatoPlants to MixedCropRow one
        for (int i = 0; i < 6; i++) {
            mixedCropRowOne.storeCrop(new TomatoPlant());
        }
        //------------------------------------------------------------------------
        // Adds 3 new WheatPlants to MixedCropRow one
        for (int i = 0; i < 3; i++) {
            mixedCropRowOne.storeCrop(new WheatPlant());
        }
        // Adds 6 new CornStalks to MixedCropRow two
        for (int i = 0; i < 6; i++) {
            mixedCropRowTwo.storeCrop(new CornStalk());
        }
        //------------------------------------------------------------------------
        // Adds 3 new TomatoPlants to MixedCropRow two
        for (int i = 0; i < 3; i++) {
            mixedCropRowTwo.storeCrop(new TomatoPlant());
        }
        // Adds 5 new WheatPlants to MixedCropRow two
        for (int i = 0; i < 5; i++) {
            mixedCropRowTwo.storeCrop(new WheatPlant());
        }
        //------------------------------------------------------------------------
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
        //------------------------------------------------------------------------
        // Adds CropRow for CornStalks to Field
        field.storeCropRow(cornStalkCropRow);
        //
        // Adds CropRow for TomatoPlants to Field
        field.storeCropRow(tomatoPlantCropRow);
        //
        // Adds 3 Mixed Crop Rows to Field
        field.storeCropRow(mixedCropRowOne);
        field.storeCropRow(mixedCropRowTwo);
        field.storeCropRow(mixedCropRowThree);
        //////////////////////////////////////////////////////////////////////////

        //////////////////////////////////////////////////////////////////////////
        // FARM
        //////////////////////////////////////////////////////////////////////////
        farmHouse.addResident(froilan);
        farmHouse.addResident(froilanda);
        //------------------------------------------------------------------------
        farm = new Farm(farmHouse, field);
        //////////////////////////////////////////////////////////////////////////

        //////////////////////////////////////////////////////////////////////////
        // ANIMALS
        //////////////////////////////////////////////////////////////////////////
        // Adds 5 new Chickens to ChickenCoop one
        for (int i = 0; i < 5; i++) {
            chickenCoopOne.storeChicken(new Chicken());
        }
        // Adds 5 new Chickens to ChickenCoop two
        for (int i = 0; i < 5; i++) {
            chickenCoopTwo.storeChicken(new Chicken());
        }
        // Adds 3 new Chickens to ChickenCoop three
        for (int i = 0; i < 3; i++) {
            chickenCoopThree.storeChicken(new Chicken());
        }
        // Adds 2 new Chickens to ChickenCoop four
        for (int i = 0; i < 2; i++) {
            chickenCoopFour.storeChicken(new Chicken());
        }
        //------------------------------------------------------------------------
        // Adds 4 new Horses to Stable one
        for (int i = 0; i < 4; i++) {
            stableOne.storeHorse(new Horse());
        }
        // Adds 3 new Horses to Stable two
        for (int i = 0; i < 3; i++) {
            stableTwo.storeHorse(new Horse());
        }
        // Adds 3 new Horses to Stable three
        for (int i = 0; i < 3; i++) {
            stableThree.storeHorse(new Horse());
        }
        //------------------------------------------------------------------------
        // Adds 4 ChickenCoops to Farm
        farm.addChickenCoop(chickenCoopOne);
        farm.addChickenCoop(chickenCoopTwo);
        farm.addChickenCoop(chickenCoopThree);
        farm.addChickenCoop(chickenCoopFour);
        //------------------------------------------------------------------------
        // Adds 3 Stables to Farm
        farm.addStable(stableOne);
        farm.addStable(stableTwo);
        farm.addStable(stableThree);
        //////////////////////////////////////////////////////////////////////////
    }

    public void doMorningRoutine() {
    }

}
