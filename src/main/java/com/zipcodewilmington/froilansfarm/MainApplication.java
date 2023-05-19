package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.classes.animals.Chicken;
import com.zipcodewilmington.froilansfarm.classes.animals.ChickenCoop;
import com.zipcodewilmington.froilansfarm.classes.animals.Horse;
import com.zipcodewilmington.froilansfarm.classes.animals.Stable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by leon on 2/26/18.
 */
public class MainApplication {
    public static void main(String[] args) {


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

