package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;
import java.util.List;
import com.zipcodewilmington.froilansfarm.*;

/*
Created by leon on 2/26/18.
*/
public class MainApplication {

    public static void main(String[] args) {
        
        List<Vehicle> farmVehicles = new ArrayList<>();
        CropDuster cropDuster = new CropDuster();
        Tractor tractor = new Tractor();
        farmVehicles.add(tractor);
        farmVehicles.add(cropDuster);
        
        Farmer froilan = new Farmer("Froilan");
        Pilot froilanda = new Pilot("Froilanda", cropDuster);

        FarmHouse froilanFarmHouse = new FarmHouse();
        froilanFarmHouse.addResident(froilan, froilanda);

        Crop[] earCorn = new CornStalk[10];
        for(int c = 0; c < earCorn.length; c++){
            earCorn[c] = new CornStalk();
        }
        Crop[] tomato = new TomatoPlant[10];
        for(int t = 0; t < tomato.length; t++){
            tomato[t] = new TomatoPlant();
        }
        List<Crop> cropsOfCorn = List.of(new Crop[]{earCorn[0], earCorn[1],
                earCorn[2], earCorn[3]});
        List<Crop> cropsOfTomato = List.of(new Crop[]{tomato[0], tomato[1],
                tomato[2], tomato[3]});
        List<Crop> mixOfCrops1 = List.of(new Crop[]{earCorn[4], earCorn[5],
                tomato[4], tomato[5]});
        List<Crop> mixOfCrops2 = List.of(new Crop[]{tomato[6], earCorn[6],
                tomato[7], earCorn[7]});
        List<Crop> mixOfCrops3 = List.of(new Crop[]{earCorn[8], tomato[8],
                earCorn[9], tomato[9]});

        CropRow[] cropRows = new CropRow[5];
        for(int x = 0; x < cropRows.length; x++){
            cropRows[x] = new CropRow();
        }
        cropRows[0].storeCrops(cropsOfCorn);
        cropRows[1].storeCrops(cropsOfTomato);
        cropRows[2].storeCrops(mixOfCrops1);
        cropRows[3].storeCrops(mixOfCrops2);
        cropRows[4].storeCrops(mixOfCrops3);

        Field froilanField = new Field();
        froilanField.storeCropRows(cropRows);
        System.out.println(cropsOfTomato.size());
        System.out.println(cropsOfCorn.size());
        System.out.println(mixOfCrops1.size());
        System.out.println(froilanField.getContainedCropRows().size());
        System.out.println(froilanField.getContainedCropRows());

        Farm froilanFarm = new Farm(froilanFarmHouse, froilanField);
        System.out.println(froilan);
        System.out.println(froilanda);
        System.out.println(farm);
        // Print out the farmVehicles list
        for (Vehicle vehicle : farmVehicles) {
            System.out.println(vehicle);
        }
      
        Stable stable1 = new Stable();
        Stable stable2 = new Stable();
        Stable stable3 = new Stable();

        List<Horse> horseList1 = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            Horse horse = new Horse();
            horseList1.add(horse);
        }
        stable1.storeHorses(horseList1);
      
        List<Horse> horseList2 = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            Horse horse = new Horse();
            horseList2.add(horse);
        }
        stable2.storeHorses(horseList2);

        List<Horse> horseList3 = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            Horse horse = new Horse();
            horseList3.add(horse);
        }
        stable3.storeHorses(horseList3);

        // create an instance of a stable and a chicken coop
        ChickenCoop chickenCoop1 = new ChickenCoop();
        ChickenCoop chickenCoop2 = new ChickenCoop();
        ChickenCoop chickenCoop3 = new ChickenCoop();
        ChickenCoop chickenCoop4 = new ChickenCoop();

        List<Chicken> chickenList1 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Chicken chicken = new Chicken();
            chickenList1.add(chicken);
            chickenCoop1.storeChickens(chickenList1);
        }
        List<Chicken> chickenList2 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Chicken chicken = new Chicken();
            chickenList2.add(chicken);
            chickenCoop2.storeChickens(chickenList2);
        }
        List<Chicken> chickenList3 = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            Chicken chicken = new Chicken();
            chickenList3.add(chicken);
            chickenCoop3.storeChickens(chickenList3);
        }
        List<Chicken> chickenList4 = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            Chicken chicken = new Chicken();
            chickenList4.add(chicken);
            chickenCoop4.storeChickens(chickenList4);

        }
    
    }
    
}

