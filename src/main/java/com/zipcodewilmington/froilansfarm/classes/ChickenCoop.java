package com.zipcodewilmington.froilansfarm.classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ChickenCoop {

    private final List<Chicken> chickens = new ArrayList<>();

    public ChickenCoop() {}
    public ChickenCoop(Chicken chicken) {
        this.chickens.add(chicken);
    }
    public ChickenCoop(Chicken[] chickens) {
        this.chickens.addAll(Arrays.asList(chickens));
    }
    public ChickenCoop(List<Chicken> chickens) {
        this.chickens.addAll(chickens);
    }

    public List<Chicken> getChickens() {
        return this.chickens;
    }

    public void storeChicken(Chicken chickenToBeStored) {
        this.chickens.add(chickenToBeStored);
    }

    public void storeChickens(Chicken[] chickensToBeStored) {
        this.chickens.addAll(Arrays.asList(chickensToBeStored));
    }

    public void storeChickens(List<Chicken> chickensToBeStored) {
        this.chickens.addAll(chickensToBeStored);
    }
    
}
