package com.zipcodewilmington.froilansfarm.workweek;

import org.junit.Assert;
import org.junit.Test;

import com.zipcodewilmington.froilansfarm.Routine;

public class Thursday extends Routine {

    @Test
    public void testThursday() {
        doMorningRoutine();
        // Froilan and Froilanda like to use this day to go out riding to pass the time
        // Froilan gets his Horse
        froilan.mount(farm.getStables().get(0).getHeldHorses().get(0));
        // Ensuring that Froilan was able to find and get on his Horse
        Assert.assertTrue(farm.getStables().get(0).getHeldHorses().get(0).isMounted());
        // Froilanda gets her Horse
        froilanda.mount(farm.getStables().get(0).getHeldHorses().get(1));
        // Ensuring that Froilanda was able to find and get on her Horse
        Assert.assertTrue(farm.getStables().get(0).getHeldHorses().get(1).isMounted());
        // Froilan and Froilanda return after some hours and carry on with their day
        // Froilan returns his Horse
        froilan.dismount(farm.getStables().get(0).getHeldHorses().get(0));
        // Ensuring that Froilan was able to get off his Horse
        Assert.assertFalse(farm.getStables().get(0).getHeldHorses().get(0).isMounted());
        // Froilanda returns her Horse
        froilanda.dismount(farm.getStables().get(0).getHeldHorses().get(1));
        // Ensuring that Froilanda was able to get off her Horse
        Assert.assertFalse(farm.getStables().get(0).getHeldHorses().get(1).isMounted());
    }

}
