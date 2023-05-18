package com.zipcodewilmington.froilansfarm.classes;

import com.zipcodewilmington.froilansfarm.classes.animals.ChickenCoop;
import com.zipcodewilmington.froilansfarm.classes.animals.Stable;
import com.zipcodewilmington.froilansfarm.classes.crops.Field;
import com.zipcodewilmington.froilansfarm.classes.vehicles.Vehicle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Farm {

    private final FarmHouse farmHouse;
    private final Field field;
    private final List<ChickenCoop> chickenCoops = new ArrayList<>();
    private final List<Stable> stables = new ArrayList<>();
    private final List<Vehicle> vehicles = new ArrayList<>();

     public Farm() {
         this.farmHouse = new FarmHouse();
         this.field = new Field();
     }
     public Farm(FarmHouse farmHouse, Field field, ChickenCoop chickenCoop, Stable stable, Vehicle vehicle) {
         this.farmHouse = farmHouse;
         this.field = field;
         this.chickenCoops.add(chickenCoop);
         this.stables.add(stable);
         this.vehicles.add(vehicle);
     }
     public Farm(FarmHouse farmHouse, Field field, ChickenCoop[] chickenCoops, Stable[] stables, Vehicle[] vehicles) {
         this.farmHouse = farmHouse;
         this.field = field;
         this.chickenCoops.addAll(Arrays.asList(chickenCoops));
         this.stables.addAll(Arrays.asList(stables));
         this.vehicles.addAll(Arrays.asList(vehicles));
     }
     public Farm(FarmHouse farmHouse, Field field, List<ChickenCoop> chickenCoops, List<Stable> stables, List<Vehicle> vehicles) {
         this.farmHouse = farmHouse;
         this.field = field;
         this.chickenCoops.addAll(chickenCoops);
         this.stables.addAll(stables);
         this.vehicles.addAll(vehicles);
     }

     public FarmHouse getFarmHouse() {
         return this.farmHouse;
     }

     public Field getField() {
          return this.field;
     }

    public List<ChickenCoop> getChickenCoops() {
        return this.chickenCoops;
    }
     public void addChickenCoop(ChickenCoop chickenCoopToBeAdded) {
         this.chickenCoops.add(chickenCoopToBeAdded);
     }
    public void addChickenCoops(ChickenCoop[] chickenCoopsToBeAdded) {
        this.chickenCoops.addAll(Arrays.asList(chickenCoopsToBeAdded));
    }
    public void addChickenCoops(List<ChickenCoop> chickenCoopsToBeAdded) {
        this.chickenCoops.addAll(chickenCoopsToBeAdded);
    }
    public ChickenCoop removeChickenCoop(int chickenCoopToBeRemovedIdentificationNumber) {
         if (this.chickenCoops.size() >= (chickenCoopToBeRemovedIdentificationNumber)) {
             return (this.chickenCoops.remove(chickenCoopToBeRemovedIdentificationNumber - 1));
         }
         return null;
    }
    public ChickenCoop removeChickenCoop(ChickenCoop chickenCoopToBeRemoved) {
         if (this.chickenCoops.contains(chickenCoopToBeRemoved)) {
             this.chickenCoops.remove(chickenCoopToBeRemoved);
             return chickenCoopToBeRemoved;
         }
         return null;
    }
    public List<ChickenCoop> removeChickenCoops(int startingChickenCoopToBeRemovedIdentificationNumber, int endingChickenCoopToBeRemovedIdentificationNumber) {
         if (startingChickenCoopToBeRemovedIdentificationNumber < endingChickenCoopToBeRemovedIdentificationNumber
                 && this.chickenCoops.size() >= startingChickenCoopToBeRemovedIdentificationNumber
                 && this.chickenCoops.size() >= endingChickenCoopToBeRemovedIdentificationNumber) {
             List<ChickenCoop> chickenCoopsSubList = this.chickenCoops.subList((startingChickenCoopToBeRemovedIdentificationNumber - 1), endingChickenCoopToBeRemovedIdentificationNumber);
             List<ChickenCoop> removedChickenCoops = new ArrayList<>(chickenCoopsSubList);
             this.chickenCoops.removeAll(chickenCoopsSubList);
             return removedChickenCoops;
         }
         return null;
    }
    public List<ChickenCoop> removeChickenCoops(ChickenCoop[] chickenCoopsToBeRemoved) {
         List<ChickenCoop> removedChickenCoops = new ArrayList<>(this.chickenCoops);
         List<ChickenCoop> chickenCoopsToBeRemovedAsList = new ArrayList<>(Arrays.asList(chickenCoopsToBeRemoved));
         removedChickenCoops.retainAll(chickenCoopsToBeRemovedAsList);
         this.chickenCoops.removeAll(chickenCoopsToBeRemovedAsList);
         return removedChickenCoops;
    }
    public List<ChickenCoop> removeChickenCoops(List<ChickenCoop> chickenCoopsToBeRemoved) {
        List<ChickenCoop> removedChickenCoops = new ArrayList<>(this.chickenCoops);
        removedChickenCoops.retainAll(chickenCoopsToBeRemoved);
        this.chickenCoops.removeAll(chickenCoopsToBeRemoved);
        return removedChickenCoops;
    }
    public List<ChickenCoop> clearChickenCoops() {
         List<ChickenCoop> clearedChickenCoops = new ArrayList<>(this.chickenCoops);
         this.chickenCoops.clear();
         return clearedChickenCoops;
    }

    public List<Stable> getStables() {
        return this.stables;
    }
    public void addStable(Stable stableToBeAdded) {
        this.stables.add(stableToBeAdded);
    }
    public void addStables(Stable[] stablesToBeAdded) {
        this.stables.addAll(Arrays.asList(stablesToBeAdded));
    }
    public void addStables(List<Stable> stablesToBeAdded) {
        this.stables.addAll(stablesToBeAdded);
    }
    public Stable removeStable(int stableToBeRemovedIdentificationNumber) {
        if (this.stables.size() >= (stableToBeRemovedIdentificationNumber)) {
            return (this.stables.remove(stableToBeRemovedIdentificationNumber - 1));
        }
        return null;
    }
    public Stable removeStable(Stable stableToBeRemoved) {
        if (this.stables.contains(stableToBeRemoved)) {
            this.stables.remove(stableToBeRemoved);
            return stableToBeRemoved;
        }
        return null;
    }
    public List<Stable> removeStables(int startingStableToBeRemovedIdentificationNumber, int endingStableToBeRemovedIdentificationNumber) {
        if (this.stables.size() >= startingStableToBeRemovedIdentificationNumber && this.stables.size() >= endingStableToBeRemovedIdentificationNumber) {
            List<Stable> stablesSubList = this.stables.subList((startingStableToBeRemovedIdentificationNumber - 1), endingStableToBeRemovedIdentificationNumber);
            List<Stable> removedStables = new ArrayList<>(stablesSubList);
            this.stables.removeAll(stablesSubList);
            return removedStables;
        }
        return null;
    }
    public List<Stable> removeStables(Stable[] stablesToBeRemoved) {
        List<Stable> removedStables = new ArrayList<>(this.stables);
        List<Stable> stablesToBeRemovedAsList = new ArrayList<>(Arrays.asList(stablesToBeRemoved));
        removedStables.retainAll(stablesToBeRemovedAsList);
        this.stables.removeAll(stablesToBeRemovedAsList);
        return removedStables;
    }
    public List<Stable> removeStables(List<Stable> stablesToBeRemoved) {
        List<Stable> removedStables = new ArrayList<>(this.stables);
        removedStables.retainAll(stablesToBeRemoved);
        this.stables.removeAll(stablesToBeRemoved);
        return removedStables;
    }
    public List<Stable> clearStables() {
        List<Stable> clearedStables = new ArrayList<>(this.stables);
        this.stables.clear();
        return clearedStables;
    }

    public List<Vehicle> getVehicles() {
        return this.vehicles;
    }
    public void addVehicle(Vehicle vehicleToBeAdded) {
        this.vehicles.add(vehicleToBeAdded);
    }
    public void addVehicles(Vehicle[] vehiclesToBeAdded) {
        this.vehicles.addAll(Arrays.asList(vehiclesToBeAdded));
    }
    public void addVehicles(List<Vehicle> vehiclesToBeAdded) {
        this.vehicles.addAll(vehiclesToBeAdded);
    }
    public Vehicle removeVehicle(int vehicleToBeRemovedIdentificationNumber) {
        if (this.vehicles.size() >= (vehicleToBeRemovedIdentificationNumber)) {
            return (this.vehicles.remove(vehicleToBeRemovedIdentificationNumber - 1));
        }
        return null;
    }
    public Vehicle removeVehicle(Vehicle vehicleToBeRemoved) {
        if (this.vehicles.contains(vehicleToBeRemoved)) {
            this.vehicles.remove(vehicleToBeRemoved);
            return vehicleToBeRemoved;
        }
        return null;
    }
    public List<Vehicle> removeVehicles(int startingVehicleToBeRemovedIdentificationNumber, int endingVehicleToBeRemovedIdentificationNumber) {
        if (this.vehicles.size() >= startingVehicleToBeRemovedIdentificationNumber && this.vehicles.size() >= endingVehicleToBeRemovedIdentificationNumber) {
            List<Vehicle> vehiclesSubList = this.vehicles.subList((startingVehicleToBeRemovedIdentificationNumber - 1), endingVehicleToBeRemovedIdentificationNumber);
            List<Vehicle> removedVehicles = new ArrayList<>(vehiclesSubList);
            this.vehicles.removeAll(vehiclesSubList);
            return removedVehicles;
        }
        return null;
    }
    public List<Vehicle> removeVehicles(Vehicle[] vehiclesToBeRemoved) {
        List<Vehicle> removedVehicles = new ArrayList<>(this.vehicles);
        List<Vehicle> vehiclesToBeRemovedAsList = new ArrayList<>(Arrays.asList(vehiclesToBeRemoved));
        removedVehicles.retainAll(vehiclesToBeRemovedAsList);
        this.vehicles.removeAll(vehiclesToBeRemovedAsList);
        return removedVehicles;
    }
    public List<Vehicle> removeVehicles(List<Vehicle> vehiclesToBeRemoved) {
        List<Vehicle> removedVehicles = new ArrayList<>(this.vehicles);
        removedVehicles.retainAll(vehiclesToBeRemoved);
        this.vehicles.removeAll(vehiclesToBeRemoved);
        return removedVehicles;
    }
    public List<Vehicle> clearVehicles() {
        List<Vehicle> clearedVehicles = new ArrayList<>(this.vehicles);
        this.vehicles.clear();
        return clearedVehicles;
    }
    public Vehicle replaceVehicle(int vehicleToBeReplacedIdentificationNumber, Vehicle replacementVehicle) {
         if (this.vehicles.size() >= vehicleToBeReplacedIdentificationNumber) {
             Vehicle replacedVehicle = this.vehicles.remove(vehicleToBeReplacedIdentificationNumber - 1);
             this.vehicles.add(vehicleToBeReplacedIdentificationNumber - 1, replacementVehicle);
             return replacedVehicle;
         }
         return null;
    }
    public Vehicle replaceVehicle(Vehicle vehicleToBeReplaced, Vehicle replacementVehicle) {
        if (this.vehicles.contains(vehicleToBeReplaced)) {
            int replacedVehicleIndex = this.vehicles.indexOf(vehicleToBeReplaced);
            this.vehicles.remove(vehicleToBeReplaced);
            this.vehicles.add(replacedVehicleIndex, replacementVehicle);
            return vehicleToBeReplaced;
        }
        return null;
    }
    public List<Vehicle> replaceVehicles(Vehicle[] replacementVehicles) {
         List<Vehicle> replacedVehicles = new ArrayList<>(this.vehicles);
         this.vehicles.clear();
         this.vehicles.addAll(Arrays.asList(replacementVehicles));
         return replacedVehicles;
    }
    public List<Vehicle> replaceVehicles(List<Vehicle> replacementVehicles) {
        List<Vehicle> replacedVehicles = new ArrayList<>(this.vehicles);
        this.vehicles.clear();
        this.vehicles.addAll(replacementVehicles);
        return replacedVehicles;
    }

}
