package com.zipcodewilmington.froilansfarm.workweek;

<<<<<<< HEAD
import com.zipcodewilmington.froilansfarm.classes.Farm;
import com.zipcodewilmington.froilansfarm.classes.animals.Horse;
import com.zipcodewilmington.froilansfarm.classes.animals.Stable;
import com.zipcodewilmington.froilansfarm.classes.crops.*;
import com.zipcodewilmington.froilansfarm.classes.persons.Farmer;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class Wednesday {
@Test
    public void testWednesday() {
    /*
   1. Every morning, Froilan and Froilanda begin their morning by
   Froilan is an object of Farmer and so is Froilanda

   2. Riding each Horse in each Stable.
    This horse is another object and will need to loop through the list of horses in the stable and ride them

   3.  Feeding each Horse 3 ear of Corn.
   For the list of horses in the list they will need to call the EarOfCorn

   4. For breakfast,
    Froilan eats 1 EarCorn, 2 Tomoato, and 5 Egg.
            Froilanda eats 2 EarCorn, 1 Tomoato, and 2 Egg.

     */
    //1. Making the instances of Farmers:
        Farmer froilan = new Farmer("Froilan");
        Farmer froilanda = new Farmer("Froilanda");


        // 2. Create Stables and add Horses
        Stable stableOne = new Stable();
        Stable stableTwo = new Stable();
        Stable stableThree = new Stable();

        // Adds 4 new Horses to Stable one
        for (int i = 0; i < 4; i++) {
            stableOne.storeHorse(new Horse());
        }

        // Adds 3 new Horses to Stable two
        for (int i = 0; i < 3; i++) {
            stableTwo.storeHorse(new Horse());
        }

        // Adds 3 new Horses to Stable three
        for (int i = 0; i < 3; i++) {
            stableThree.storeHorse(new Horse());
        }

        // 2.1 Create Crops for feeding
        Crop corn = new CornStalk();
        Crop corn1 = new CornStalk();
        Crop tomato = new TomatoPlant();
        Crop tomato1 = new TomatoPlant();

        CropRow rowOne = new CropRow(new Crop[] {corn, corn1});
        CropRow rowTwo = new CropRow(new Crop[] {tomato, tomato1});

        // 2.2 Create Field and add CropRows
        Field field = new Field();
        field.storeCropRow(rowOne);
        field.storeCropRow(rowTwo);

        // 3. Perform riding and feeding for Froilan
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
        froilanda.eatBreakfast();

        // Assertions or other checks can be added as needed
        // For example:
        assertEquals(4, stableOne.getHeldHorses().size());
        assertEquals(3, stableTwo.getHeldHorses().size());
        assertEquals(3, stableThree.getHeldHorses().size());
    }
=======
import org.junit.Test;

import com.zipcodewilmington.froilansfarm.Routine;

public class Wednesday extends Routine {

    @Test
    public void testWednesday() {
        doMorningRoutine();
    }

>>>>>>> main
}

