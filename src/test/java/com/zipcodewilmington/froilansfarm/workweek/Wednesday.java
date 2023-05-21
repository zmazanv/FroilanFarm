package com.zipcodewilmington.froilansfarm.workweek;

import org.junit.Assert;
import org.junit.Test;

import com.zipcodewilmington.froilansfarm.Routine;

public class Wednesday extends Routine {

    @Test
    public void testWednesday() {
        doMorningRoutine();
        // Froilanda likes to clear out the house when she does cleaning on Wednesdays
        farmHouse.clearResidents();
        Assert.assertEquals(0, farmHouse.getCurrentResidents().size());
        // Froilanda then moves in and does the needed cleaning duties
        farmHouse.addResident(froilanda);
        Assert.assertEquals(1, farmHouse.getCurrentResidents().size());
        // Froilan then comes back in to continue with the rest of their day
        farmHouse.addResident(froilan);
        Assert.assertEquals(2, farmHouse.getCurrentResidents().size());
    }

}
