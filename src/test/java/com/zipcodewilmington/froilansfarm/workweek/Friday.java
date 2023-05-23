package com.zipcodewilmington.froilansfarm.workweek;

import org.junit.Assert;
import org.junit.Test;

import com.zipcodewilmington.froilansfarm.Routine;
import com.zipcodewilmington.froilansfarm.classes.animals.Chicken;
import com.zipcodewilmington.froilansfarm.classes.animals.ChickenCoop;
import com.zipcodewilmington.froilansfarm.classes.animals.Stable;

import java.util.ArrayList;
import java.util.List;

public class Friday extends Routine {

    @Test
    public void testFriday() {
        doMorningRoutine();
        // Froilan removes all Horses in Stable 3
        for (int x = stableThree.getHeldHorses().size(); x > 0; x--) {
            stableThree.removeHorse(x);
        }
        // Ensuring that Stable 3 could be cleared
        Assert.assertEquals(0, stableThree.getHeldHorses().size());
        // Froilan removes all Horses from all Stables
        for (Stable checkStables : farm.getStables()) {
            checkStables.clearHorses();
        }
        // Ensuring that the other two Stables could be cleared
        Assert.assertEquals(0, stableTwo.getHeldHorses().size());
        Assert.assertEquals(0, stableOne.getHeldHorses().size());

        // Froilan checks up on the Chickens
        for (ChickenCoop checkChickenCoop : farm.getChickenCoops()) {
            for (Chicken chickensToBeFertilized : checkChickenCoop.getHeldChickens()) {
                chickensToBeFertilized.fertilize();
                chickensToBeFertilized.makeNoise();
                // Ensuring that each Chickens is fertilized and yields if true
                Assert.assertTrue(chickensToBeFertilized.isFertilized());
                chickensToBeFertilized.yield();
            }
        }

        // Froilan removes all Chickens in ChickenCoop 1
        for (int x = chickenCoopOne.getHeldChickens().size(); x > 0; x--) {
            chickenCoopOne.removeChicken(x);
        }
        // Ensuring that ChickenCoop 1 could be cleared
        Assert.assertEquals(0, chickenCoopOne.getHeldChickens().size());
        // Froilan removes all Chickens in the other ChickenCoops
        for (ChickenCoop checkChickenCoop : farm.getChickenCoops()) {
            checkChickenCoop.clearChickens();
        }
        // Ensuring that the other ChickenCoops could be cleared successfully
        Assert.assertEquals(0, chickenCoopTwo.getHeldChickens().size());
        Assert.assertEquals(0, chickenCoopThree.getHeldChickens().size());
        Assert.assertEquals(0, chickenCoopFour.getHeldChickens().size());
    }

}
