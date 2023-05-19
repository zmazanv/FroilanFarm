package com.zipcodewilmington.froilansfarm.classes.crops;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CropRow {

    private final List<Crop> containedCrops = new ArrayList<>();

    public CropRow() {}
    public CropRow(Crop initialCrop) {
        this.containedCrops.add(initialCrop);
    }
    public CropRow(Crop[] initialCrops) {
        this.containedCrops.addAll(Arrays.asList(initialCrops));
    }
    public CropRow(List<Crop> initialCrops) {
        this.containedCrops.addAll(initialCrops);
    }

    public List<Crop> getContainedCrops() {
        return this.containedCrops;
    }

    public void storeCrop(Crop cropToBeStored) {
        this.containedCrops.add(cropToBeStored);
    }
    public void storeCrops(Crop[] cropsToBeStored) {
        this.containedCrops.addAll(Arrays.asList(cropsToBeStored));
    }
    public void storeCrops(List<Crop> cropsToBeStored) {
        this.containedCrops.addAll(cropsToBeStored);
    }

    public Crop removeCrop(int cropToBeRemovedIdentificationNumber) {
        if (this.containedCrops.size() >= cropToBeRemovedIdentificationNumber) {
            return (this.containedCrops.remove(cropToBeRemovedIdentificationNumber - 1));
        }
        return null;
    }
    public Crop removeCrop(Crop cropToBeRemoved) {
        if (this.containedCrops.contains(cropToBeRemoved)) {
            this.containedCrops.remove(cropToBeRemoved);
            return cropToBeRemoved;
        } else {
            return null;
        }
    }
    public List<Crop> removeCrops(int startingCropToBeRemovedIdentificationNumber, int endingCropToBeRemovedIdentificationNumber) {
        if (startingCropToBeRemovedIdentificationNumber < endingCropToBeRemovedIdentificationNumber
                && this.containedCrops.size() >= startingCropToBeRemovedIdentificationNumber
                && this.containedCrops.size() >= endingCropToBeRemovedIdentificationNumber) {
            List<Crop> cropsSubList = this.containedCrops.subList((startingCropToBeRemovedIdentificationNumber - 1), endingCropToBeRemovedIdentificationNumber);
            List<Crop> removedCrops = new ArrayList<>(cropsSubList);
            this.containedCrops.removeAll(cropsSubList);
            return removedCrops;
        }
        return null;
    }
    public List<Crop> removeCrops(Crop[] cropsToBeRemoved) {
        List<Crop> removedCrops = new ArrayList<>(this.containedCrops);
        List<Crop> cropsToBeRemovedAsList = new ArrayList<>(Arrays.asList(cropsToBeRemoved));
        removedCrops.retainAll(cropsToBeRemovedAsList);
        this.containedCrops.removeAll(cropsToBeRemovedAsList);
        return removedCrops;
    }
    public List<Crop> removeCrops(List<Crop> cropsToBeRemoved) {
        List<Crop> removedCrops = new ArrayList<>(this.containedCrops);
        removedCrops.retainAll(cropsToBeRemoved);
        this.containedCrops.removeAll(cropsToBeRemoved);
        return removedCrops;
    }
    public List<Crop> clearCrops() {
        List<Crop> clearedCrops = new ArrayList<>(this.containedCrops);
        this.containedCrops.clear();
        return clearedCrops;
    }

    public void fertilize() {
        for (Crop cropToBeFertilized : this.containedCrops) {
            cropToBeFertilized.fertilize();
        }
    }

    public void harvest() {
        for (Crop cropToBeHarvested : this.containedCrops) {
            cropToBeHarvested.harvest();
        }
    }

    @Override
    public String toString() {
        return containedCrops + "\n";
    }
}
