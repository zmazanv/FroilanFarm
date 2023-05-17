package com.zipcodewilmington.froilansfarm.classes;

import java.util.ArrayList;
import java.util.List;

public class CropRow {

    private List<Crop> crops;

    public CropRow() {
        this.crops = new ArrayList<>();
    }

    public void addCrop(Crop crop) {
        crops.add(crop);
    }

    public List<Crop> getCrops() {
        return this.crops;
    }

}
