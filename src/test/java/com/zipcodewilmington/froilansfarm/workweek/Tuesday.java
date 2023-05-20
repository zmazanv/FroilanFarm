package com.zipcodewilmington.froilansfarm.workweek;

import com.zipcodewilmington.froilansfarm.classes.crops.Crop;
import com.zipcodewilmington.froilansfarm.classes.crops.CropRow;
import org.junit.Assert;
import org.junit.Test;

import com.zipcodewilmington.froilansfarm.Routine;

public class Tuesday extends Routine {

    @Test
    public void testTuesday() {
        doMorningRoutine();
        tractor.operate(farm);

        for (CropRow cropRowToBeHarvested : field.getContainedCropRows()) {
            for (Crop cropToBeHarvested : cropRowToBeHarvested.getContainedCrops()) {
                Assert.assertTrue(cropToBeHarvested.isHarvested());
            }
        }
    }

}
