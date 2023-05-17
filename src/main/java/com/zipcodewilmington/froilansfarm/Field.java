package com.zipcodewilmington.froilansfarm;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class Field {

    private final List<CropRow> cropRows = new ArrayList<>();

    public Field() {}
    public Field(CropRow cropRow) {
        this.cropRows.add(cropRow);
    }
    public Field(CropRow[] cropRows) {
        this.cropRows.addAll(Arrays.asList(cropRows));
    }
    public Field(List<CropRow> cropRows) {
        this.cropRows.addAll(cropRows);
    }

    public List<CropRow> getCurrentCropRows() {
        return this.cropRows;
    }

    public void storeCropRow(CropRow cropRowToBeStored) {
        this.cropRows.add(cropRowToBeStored);
    }
    public void storeCropRows(CropRow[] cropRowsToBeStored) {
        this.cropRows.addAll(Arrays.asList(cropRowsToBeStored));
    }
    public void storeCropRows(List<CropRow> cropRowsToBeStored) {
        this.cropRows.addAll(cropRowsToBeStored);
    }

    public CropRow removeCropRow(int cropRowToBeRemovedIdentificationNumber) {
        if (this.cropRows.size() >= cropRowToBeRemovedIdentificationNumber) {
            return (this.cropRows.remove(cropRowToBeRemovedIdentificationNumber - 1));
        }
        return null;
    }
    public CropRow removeCropRow(CropRow cropRowToBeRemoved) {
        if (this.cropRows.contains(cropRowToBeRemoved)) {
            this.cropRows.remove(cropRowToBeRemoved);
            return cropRowToBeRemoved;
        }
        return null;
    }
    public List<CropRow> removeCropRows(int startingCropRowToBeRemovedIdentificationNumber, int endingCropRowToBeRemovedIdentificationNumber) {
        if (startingCropRowToBeRemovedIdentificationNumber < endingCropRowToBeRemovedIdentificationNumber
                && this.cropRows.size() >= startingCropRowToBeRemovedIdentificationNumber
                && this.cropRows.size() >= endingCropRowToBeRemovedIdentificationNumber) {
            List<CropRow> cropRowsSubList = this.cropRows.subList((startingCropRowToBeRemovedIdentificationNumber - 1), endingCropRowToBeRemovedIdentificationNumber);
            List<CropRow> removedCropRows = new ArrayList<>(cropRowsSubList);
            this.cropRows.removeAll(cropRowsSubList);
            return removedCropRows;
        }
        return null;
    }
    public List<CropRow> removeCropRows(CropRow[] cropRowsToBeRemoved) {
        List<CropRow> cropRowsToBeRemovedAsList = new ArrayList<>(Arrays.asList(cropRowsToBeRemoved));
        List<CropRow> removedCropRows = new ArrayList<>(this.cropRows);
        removedCropRows.retainAll(cropRowsToBeRemovedAsList);
        this.cropRows.removeAll(cropRowsToBeRemovedAsList);
        return removedCropRows;
    }
    public List<CropRow> removeCropRows(List<CropRow> cropRowsToBeRemoved) {
        List<CropRow> removedCropRows = new ArrayList<>(this.cropRows);
        removedCropRows.retainAll(cropRowsToBeRemoved);
        this.cropRows.removeAll(cropRowsToBeRemoved);
        return removedCropRows;
    }

    public List<CropRow> clearField() {
        List<CropRow> clearedCropRows = new ArrayList<>(this.cropRows);
        this.cropRows.clear();
        return clearedCropRows;
    }

}
