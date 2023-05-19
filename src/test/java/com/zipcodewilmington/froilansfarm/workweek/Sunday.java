package com.zipcodewilmington.froilansfarm.workweek;

import com.zipcodewilmington.froilansfarm.classes.crops.*;
import com.zipcodewilmington.froilansfarm.classes.persons.Farmer;
import org.junit.Assert;
import org.junit.Test;

public class Sunday {

    @Test
    public void testSunday() {

        Farmer farmer = new Farmer("froilan");

        Crop wheat = new WheatPlant();
        Crop tomato = new TomatoPlant();
        Crop corn = new CornStalk();

        CropRow rowOne = new CropRow();
        CropRow rowTwo = new CropRow();
        CropRow rowThree = new CropRow();

        farmer.plant(wheat, rowOne);
        farmer.plant(tomato, rowTwo);
        farmer.plant(corn, rowThree);

        Assert.assertNotEquals(rowOne.getContainedCrops(), rowTwo.getContainedCrops());
        Assert.assertNotEquals(rowTwo.getContainedCrops(), rowThree.getContainedCrops());
    }

}
