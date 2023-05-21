package com.zipcodewilmington.froilansfarm.workweek;

import com.zipcodewilmington.froilansfarm.classes.animals.Chicken;
import com.zipcodewilmington.froilansfarm.classes.animals.ChickenCoop;
import com.zipcodewilmington.froilansfarm.classes.animals.Horse;
import com.zipcodewilmington.froilansfarm.classes.animals.Stable;
import org.junit.Assert;
import org.junit.Test;

import com.zipcodewilmington.froilansfarm.Routine;

import java.util.ArrayList;
import java.util.List;

public class Friday extends Routine {

    @Test
    public void testFriday() {
        doMorningRoutine();
//        // Froilan and Froilanda mounts each horse as part of their daily morning
//        for (Stable checkStables : farm.getStables()) {
//            for (Horse eachHorseRidden : checkStables.getHeldHorses()) {
//                eachHorseRidden.beMounted();
//                eachHorseRidden.makeNoise();
//                Assert.assertTrue(eachHorseRidden.isMounted());
//                eachHorseRidden.beDismounted();
//                Assert.assertFalse(eachHorseRidden.isMounted());
//            }
//        }

        /* Froilan starts Friday routine by removing horses from stable #3
         * and removing chickens from chicken coop #1. Froilan also checks
         * each chicken if they each yields an edible egg.
         */
        // Froilan removes all horses in stable #3
        for (int x = stableOne.getHeldHorses().size(); x > 0; x--) {
            stableOne.removeHorse(x);
        }
        Assert.assertEquals(0, stableOne.getHeldHorses().size());

        // Froilan checks if each chicken is fertilized where each one yields an egg if true
        for (ChickenCoop checkChickenCoop : farm.getChickenCoops()) {
            for (Chicken chickensToBeFertilized : checkChickenCoop.getHeldChickens()) {
                chickensToBeFertilized.fertilize();
                chickensToBeFertilized.makeNoise();
                Assert.assertTrue(chickensToBeFertilized.isFertilized());
                chickensToBeFertilized.yield();
            }
        }

        // Froilan removes all the chickens in chicken coop #1
        for (int x = chickenCoopOne.getHeldChickens().size(); x > 0; x--) {
            chickenCoopOne.removeChicken(x);
        }
        Assert.assertEquals(0, chickenCoopOne.getHeldChickens().size());
    }

}
