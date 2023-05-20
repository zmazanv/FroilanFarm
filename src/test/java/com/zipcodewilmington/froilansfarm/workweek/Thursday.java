package com.zipcodewilmington.froilansfarm.workweek;

import com.zipcodewilmington.froilansfarm.classes.animals.Horse;
import com.zipcodewilmington.froilansfarm.classes.animals.Stable;
import org.junit.Test;

import com.zipcodewilmington.froilansfarm.Routine;

import static org.junit.Assert.assertEquals;

public class Thursday extends Routine {

    @Test
    public void testThursday() {
        doMorningRoutine();
        for (Stable stable : new Stable[]{stableOne, stableTwo, stableThree}) {
            for (Horse horse : stable.getHeldHorses()) {
                horse.beMounted();
                horse.eatCorn(3);
                horse.beDismounted();
            }
        }

        // 4. Perform breakfast for Froilan and Froilanda
        // Farmer had to have a method made for breakfast refer to class for the change
        froilan.eatBreakfast();
        // froilanda.eatBreakfast();

        // Assertions or other checks can be added as needed
        // For example:
        assertEquals(4, stableOne.getHeldHorses().size());
        assertEquals(3, stableTwo.getHeldHorses().size());
        assertEquals(3, stableThree.getHeldHorses().size());
    }
}


