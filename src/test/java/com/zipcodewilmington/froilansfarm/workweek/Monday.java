package com.zipcodewilmington.froilansfarm.workweek;

import com.zipcodewilmington.froilansfarm.classes.Farm;
import com.zipcodewilmington.froilansfarm.classes.FarmHouse;
import com.zipcodewilmington.froilansfarm.classes.crops.*;
import com.zipcodewilmington.froilansfarm.classes.vehicles.*;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Monday {

    @Test
    public void testMonday() {

        //Given
        CropDuster cropDuster = new CropDuster();
        Pilot pilot = new Pilot("Froilanda", cropDuster);

        FarmHouse farmHouse = new FarmHouse();
        farmHouse.addResident(pilot);

        Crop corn = new CornStalk();
        Crop corn1 = new CornStalk();
        Crop tomato = new TomatoPlant();
        Crop tomato1 = new TomatoPlant();

        CropRow rowOne = new CropRow(new Crop[] {corn, corn1});
        CropRow rowTwo = new CropRow(new Crop[] {tomato, tomato1});

        Field field = new Field();
        field.storeCropRow(rowOne);
        field.storeCropRow(rowTwo);

        Farm farm = new Farm(farmHouse, field);

        pilot.mount(cropDuster);
        cropDuster.fly();

        //Test to see if each row is fertilized
        //When
        assertFalse(corn.isFertilized());
        assertFalse(tomato.isFertilized());

        cropDuster.operate(farm);

        //Then
        assertTrue(corn.isFertilized());
        assertTrue(tomato.isFertilized());

    }

}
