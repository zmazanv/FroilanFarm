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
        
        Horse thunder = new Horse();
        Horse Stardust = new Horse();
        Horse Midnight = new Horse();
        Horse Bella = new Horse();
        Horse Maverick = new Horse();
        Horse Spirit  = new Horse();
        Horse Blaze= new Horse();
        Horse Luna = new Horse();
        Horse Shadow = new Horse();
        Horse Atlas = new Horse();

        List<Horse>horseList1 = new ArrayList<>();
        horseList1.add(thunder);
        horseList1.add(Stardust);
        horseList1.add(Midnight);
        List<Horse>horseList2 = new ArrayList<>();
        horseList1.add(Bella);
        horseList1.add(Maverick);
        horseList1.add(Spirit);


        List<Horse>horseList3 = new ArrayList<>();
        horseList1.add(Blaze);
        horseList1.add(Luna);
        horseList1.add(Shadow);
        horseList1.add(Atlas);

        List<Stable> stables = new ArrayList<>();
        stables.add(1,new Stable(horseList1));
        stables.add(2,new Stable(horseList2));
        stables.add(3,new Stable(horseList3));

       List<Chicken> chickenList = new ArrayList<>();



    }
}
