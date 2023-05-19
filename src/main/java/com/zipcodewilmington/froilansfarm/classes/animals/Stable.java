package com.zipcodewilmington.froilansfarm.classes.animals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Stable {

    private final List<Horse> heldHorses = new ArrayList<>();

    public Stable() {}
    public Stable(Horse initialHorses) {
        this.heldHorses.add(initialHorses);
    }
    public Stable(Horse[] initialHorses) {
        this.heldHorses.addAll(Arrays.asList(initialHorses));
    }
    public Stable(List<Horse> initialHorses) {
        this.heldHorses.addAll(initialHorses);
    }

    public List<Horse> getHeldHorses() {
        return this.heldHorses;
    }

    public void storeHorse(Horse horseToBeStored) {
        this.heldHorses.add(horseToBeStored);
    }

    public void storeHorses(Horse[] horsesToBeStored) {
        this.heldHorses.addAll(Arrays.asList(horsesToBeStored));
    }

    public void storeHorses(List<Horse> horsesToBeStored) {
        this.heldHorses.addAll(horsesToBeStored);
    }

    public Horse removeHorse(int horseToBeRemovedIdentificationNumber) {
        if (this.heldHorses.size() >= horseToBeRemovedIdentificationNumber) {
            return (this.heldHorses.remove(horseToBeRemovedIdentificationNumber - 1));
        }
        return null;
    }
    public Horse removeHorse(Horse horseToBeRemoved) {
        if (this.heldHorses.contains(horseToBeRemoved)) {
            this.heldHorses.remove(horseToBeRemoved);
            return horseToBeRemoved;
        } else {
            return null;
        }
    }
    public List<Horse> removeHorses(int startingHorseToBeRemovedIdentificationNumber, int endingHorseToBeRemovedIdentificationNumber) {
        if (startingHorseToBeRemovedIdentificationNumber < endingHorseToBeRemovedIdentificationNumber
                && this.heldHorses.size() >= startingHorseToBeRemovedIdentificationNumber
                && this.heldHorses.size() >= endingHorseToBeRemovedIdentificationNumber) {
            List<Horse> horsesSubList = this.heldHorses.subList((startingHorseToBeRemovedIdentificationNumber - 1), endingHorseToBeRemovedIdentificationNumber);
            List<Horse> removedHorses = new ArrayList<>(horsesSubList);
            this.heldHorses.removeAll(horsesSubList);
            return removedHorses;
        }
        return null;
    }
    public List<Horse> removeHorses(Horse[] horsesToBeRemoved) {
        List<Horse> removedHorses = new ArrayList<>(this.heldHorses);
        List<Horse> horsesToBeRemovedAsList = new ArrayList<>(Arrays.asList(horsesToBeRemoved));
        removedHorses.retainAll(horsesToBeRemovedAsList);
        this.heldHorses.removeAll(horsesToBeRemovedAsList);
        return removedHorses;
    }
    public List<Horse> removeHorses(List<Horse> horsesToBeRemoved) {
        List<Horse> removedHorses = new ArrayList<>(this.heldHorses);
        removedHorses.retainAll(horsesToBeRemoved);
        this.heldHorses.removeAll(horsesToBeRemoved);
        return removedHorses;
    }
    public List<Horse> clearHorses() {
        List<Horse> clearedHorses = new ArrayList<>(this.heldHorses);
        this.heldHorses.clear();
        return clearedHorses;
    }
    
}
