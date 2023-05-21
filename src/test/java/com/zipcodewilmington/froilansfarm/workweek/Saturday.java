package com.zipcodewilmington.froilansfarm.workweek;

import org.junit.Assert;
import org.junit.Test;

import com.zipcodewilmington.froilansfarm.Routine;
import com.zipcodewilmington.froilansfarm.classes.crops.Crop;
import com.zipcodewilmington.froilansfarm.classes.crops.CropRow;

public class Saturday extends Routine {

    @Test
    public void testSaturday() {
        doMorningRoutine();
        // The CropDuster fertilizes the field again
        cropDuster.fly();
        cropDuster.makeNoise();
        cropDuster.operate(farm);
        // The Tractor harvests the field again
        tractor.makeNoise();
        tractor.operate(farm);
        for (CropRow cropRowToBeYielded : field.getContainedCropRows()) {
            for (Crop cropsToBeYielded : cropRowToBeYielded.getContainedCrops()) {
                // Ensuring that the Crops were able to yield and ready to be refertilized and reharvested
                cropsToBeYielded.yield();
                Assert.assertFalse(cropsToBeYielded.isFertilized());
            }
        }
    }

}
