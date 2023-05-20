package com.zipcodewilmington.froilansfarm.workweek;

import com.zipcodewilmington.froilansfarm.classes.crops.Crop;
import com.zipcodewilmington.froilansfarm.classes.crops.CropRow;
import org.junit.Assert;
import org.junit.Test;

import com.zipcodewilmington.froilansfarm.Routine;

public class Monday extends Routine {

    @Test
    public void testMonday() {
        doMorningRoutine();
        cropDuster.operate(farm);

        for (CropRow cropRowToBeFertilized : field.getContainedCropRows()) {
            for (Crop cropToBeFertilized : cropRowToBeFertilized.getContainedCrops()) {
                Assert.assertTrue(cropToBeFertilized.isFertilized());
            }
        }
    }

}
