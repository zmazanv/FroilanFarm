package com.zipcodewilmington.froilansfarm.workweek;

import org.junit.Assert;
import org.junit.Test;

import com.zipcodewilmington.froilansfarm.Routine;
import com.zipcodewilmington.froilansfarm.classes.crops.Crop;
import com.zipcodewilmington.froilansfarm.classes.crops.CropRow;

public class Monday extends Routine {

    @Test
    public void testMonday() {
        doMorningRoutine();
        // The CropDuster fertilizes the field
        cropDuster.fly();
        cropDuster.makeNoise();
        cropDuster.operate(farm);
        for (CropRow cropRowToBeFertilized : field.getContainedCropRows()) {
            for (Crop cropToBeFertilized : cropRowToBeFertilized.getContainedCrops()) {
                // Ensuring that all Crops were fertilized successfully
                Assert.assertTrue(cropToBeFertilized.isFertilized());
            }
        }
    }

}
