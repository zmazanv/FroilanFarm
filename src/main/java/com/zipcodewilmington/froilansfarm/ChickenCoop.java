package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ChickenCoop {

    private final List<Chicken> chickens = new ArrayList<>();

    public ChickenCoop(){

    }

    public ChickenCoop(Chicken chicken){
        this.chickens.add(chicken);
    }

    public ChickenCoop(Chicken[] chickens){
        this.chickens.addAll(Arrays.asList(chickens));
    }

    public ChickenCoop(List<Chicken> chickens){
        this.chickens.addAll(chickens);
    }

    public List<Chicken> getChickens(){
        return this.chickens;
    }

    public void storeChicken(Chicken chicken){
        this.chickens.add(chicken);
    }

    public void storeChickens(Chicken[] chickens){
        this.chickens.addAll(Arrays.asList(chickens));
    }

    public void storeChickens(List<Chicken> chickens){
        this.chickens.addAll(chickens);
    }
}
