package com.zipcodewilmington.froilansfarm.classes.animals;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class ChickenCoop {

    private final List<Chicken> heldChickens = new ArrayList<>();

    public ChickenCoop() {}
//    public ChickenCoop(Chicken initialChicken) {
//        this.heldChickens.add(initialChicken);
//    }
//    public ChickenCoop(Chicken[] initialChickens) {
//        this.heldChickens.addAll(Arrays.asList(initialChickens));
//    }
//    public ChickenCoop(List<Chicken> initialChickens) {
//        this.heldChickens.addAll(initialChickens);
//    }

    public List<Chicken> getHeldChickens() {
        return this.heldChickens;
    }

    public void storeChicken(Chicken chickenToBeStored) {
        this.heldChickens.add(chickenToBeStored);
    }
//    public void storeChickens(Chicken[] chickensToBeStored) {
//        this.heldChickens.addAll(Arrays.asList(chickensToBeStored));
//    }
//    public void storeChickens(List<Chicken> chickensToBeStored) {
//        this.heldChickens.addAll(chickensToBeStored);
//    }

    public Chicken removeChicken(int chickenToBeRemovedIdentificationNumber) {
        if (this.heldChickens.size() >= chickenToBeRemovedIdentificationNumber) {
            return (this.heldChickens.remove(chickenToBeRemovedIdentificationNumber - 1));
        }
        return null;
    }
//    public Chicken removeChicken(Chicken chickenToBeRemoved) {
//        if (this.heldChickens.contains(chickenToBeRemoved)) {
//            this.heldChickens.remove(chickenToBeRemoved);
//            return chickenToBeRemoved;
//        } else {
//            return null;
//        }
//    }
//    public List<Chicken> removeChickens(Chicken[] chickensToBeRemoved) {
//        List<Chicken> removedChickens = new ArrayList<>(this.heldChickens);
//        List<Chicken> chickensToBeRemovedAsList = new ArrayList<>(Arrays.asList(chickensToBeRemoved));
//        removedChickens.retainAll(chickensToBeRemovedAsList);
//        this.heldChickens.removeAll(chickensToBeRemovedAsList);
//        return removedChickens;
//    }
//    public List<Chicken> removeChickens(List<Chicken> chickensToBeRemoved) {
//        List<Chicken> removedChickens = new ArrayList<>(this.heldChickens);
//        removedChickens.retainAll(chickensToBeRemoved);
//        this.heldChickens.removeAll(chickensToBeRemoved);
//        return removedChickens;
//    }
//    public List<Chicken> clearChickens() {
//        List<Chicken> clearedChickens = new ArrayList<>(this.heldChickens);
//        this.heldChickens.clear();
//        return clearedChickens;
//    }

}
