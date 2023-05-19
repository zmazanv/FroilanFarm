package com.zipcodewilmington.froilansfarm.classes.crops;

import com.zipcodewilmington.froilansfarm.classes.crops.CropRow;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class Field {

    private final List<CropRow> containedCropRows = new ArrayList<>();

    public Field() {}
    public Field(CropRow initialCropRow) {
        this.containedCropRows.add(initialCropRow);
    }
    public Field(CropRow[] initialCropRows) {
        this.containedCropRows.addAll(Arrays.asList(initialCropRows));
    }
    public Field(List<CropRow> initialCropRows) {
        this.containedCropRows.addAll(initialCropRows);
    }

    public List<CropRow> getContainedCropRows() {
        return this.containedCropRows;
    }

    public void storeCropRow(CropRow cropRowToBeStored) {
        this.containedCropRows.add(cropRowToBeStored);
    }
    public void storeCropRows(CropRow[] cropRowsToBeStored) {
        this.containedCropRows.addAll(Arrays.asList(cropRowsToBeStored));
    }
    public void storeCropRows(List<CropRow> cropRowsToBeStored) {
        this.containedCropRows.addAll(cropRowsToBeStored);
    }

    public CropRow removeCropRow(int cropRowToBeRemovedIdentificationNumber) {
        if (this.containedCropRows.size() >= cropRowToBeRemovedIdentificationNumber) {
            return (this.containedCropRows.remove(cropRowToBeRemovedIdentificationNumber - 1));
        }
        return null;
    }
    public CropRow removeCropRow(CropRow cropRowToBeRemoved) {
        if (this.containedCropRows.contains(cropRowToBeRemoved)) {
            this.containedCropRows.remove(cropRowToBeRemoved);
            return cropRowToBeRemoved;
        }
        return null;
    }
    public List<CropRow> removeCropRows(int startingCropRowToBeRemovedIdentificationNumber, int endingCropRowToBeRemovedIdentificationNumber) {
        if (startingCropRowToBeRemovedIdentificationNumber < endingCropRowToBeRemovedIdentificationNumber
                && this.containedCropRows.size() >= startingCropRowToBeRemovedIdentificationNumber
                && this.containedCropRows.size() >= endingCropRowToBeRemovedIdentificationNumber) {
            List<CropRow> cropRowsSubList = this.containedCropRows.subList((startingCropRowToBeRemovedIdentificationNumber - 1), endingCropRowToBeRemovedIdentificationNumber);
            List<CropRow> removedCropRows = new ArrayList<>(cropRowsSubList);
            this.containedCropRows.removeAll(cropRowsSubList);
            return removedCropRows;
        }
        return null;
    }
    public List<CropRow> removeCropRows(CropRow[] cropRowsToBeRemoved) {
        List<CropRow> cropRowsToBeRemovedAsList = new ArrayList<>(Arrays.asList(cropRowsToBeRemoved));
        List<CropRow> removedCropRows = new ArrayList<>(this.containedCropRows);
        removedCropRows.retainAll(cropRowsToBeRemovedAsList);
        this.containedCropRows.removeAll(cropRowsToBeRemovedAsList);
        return removedCropRows;
    }
    public List<CropRow> removeCropRows(List<CropRow> cropRowsToBeRemoved) {
        List<CropRow> removedCropRows = new ArrayList<>(this.containedCropRows);
        removedCropRows.retainAll(cropRowsToBeRemoved);
        this.containedCropRows.removeAll(cropRowsToBeRemoved);
        return removedCropRows;
    }

    public List<CropRow> clearField() {
        List<CropRow> clearedCropRows = new ArrayList<>(this.containedCropRows);
        this.containedCropRows.clear();
        return clearedCropRows;
    }

    public void fertilize() {
        for (CropRow cropToBeFertilized : this.containedCropRows) {
            cropToBeFertilized.fertilize();
        }
    }

    public void harvest() {
        for (CropRow cropRowToBeFertilized : this.containedCropRows) {
            cropRowToBeFertilized.harvest();
        }
    }

    @Override
    public String toString() {
        return this.containedCropRows.toString();
    }

}
