package com.zipcodewilmington.froilansfarm.workweek;

import org.junit.Assert;
import org.junit.Test;

import com.zipcodewilmington.froilansfarm.Routine;
import com.zipcodewilmington.froilansfarm.classes.crops.Crop;
import com.zipcodewilmington.froilansfarm.classes.crops.CropRow;

public class Tuesday extends Routine {

    @Test
    public void testTuesday() {
        doMorningRoutine();
        // Tractor harvested the field
        tractor.operate(farm);
        tractor.makeNoise();
        for (CropRow cropRowToBeHarvested : field.getContainedCropRows()) {
            for (Crop cropToBeHarvested : cropRowToBeHarvested.getContainedCrops()) {
                // Ensuring that all Crops were harvested successfully
                Assert.assertTrue(cropToBeHarvested.isHarvested());
            }
        }
    }

}
