package com.zipcodewilmington.froilansfarm.workweek;

import com.zipcodewilmington.froilansfarm.classes.animals.Horse;
import com.zipcodewilmington.froilansfarm.classes.animals.Stable;
import com.zipcodewilmington.froilansfarm.classes.crops.Crop;
import com.zipcodewilmington.froilansfarm.classes.crops.CropRow;
import org.junit.Assert;
import org.junit.Test;

import com.zipcodewilmington.froilansfarm.Routine;

public class Saturday extends Routine {

    @Test
    public void testSaturday() {
        doMorningRoutine();
//        //Froilan and Froilanda mounts each horse as part of their daily morning
//        for (Stable checkStables : farm.getStables()) {
//            for (Horse eachHorseRidden : checkStables.getHeldHorses()) {
//                eachHorseRidden.beMounted();
//                eachHorseRidden.makeNoise();
//                Assert.assertTrue(eachHorseRidden.isMounted());
//                eachHorseRidden.beDismounted();
//                Assert.assertFalse(eachHorseRidden.isMounted());
//            }
//        }

        /* Froilan starts Saturday routine by checking crops if they are
         * yielded. If true, the cycle restarts, where their fertilization
         * is set to false.
         */
        cropDuster.operate(farm);
        tractor.operate(farm);
        for (CropRow cropRowToBeYielded : field.getContainedCropRows()) {
            for (Crop cropsToBeYielded : cropRowToBeYielded.getContainedCrops()) {
                cropsToBeYielded.yield();
                Assert.assertFalse(cropsToBeYielded.isFertilized());
            }
        }
    }

}
