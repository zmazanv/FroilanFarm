package com.zipcodewilmington.froilansfarm.workweek;

import com.zipcodewilmington.froilansfarm.classes.Farm;
import com.zipcodewilmington.froilansfarm.classes.FarmHouse;
import com.zipcodewilmington.froilansfarm.classes.crops.*;
import com.zipcodewilmington.froilansfarm.classes.persons.Farmer;
import com.zipcodewilmington.froilansfarm.classes.vehicles.Tractor;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Tuesday {

    @Test
    public void testTuesday() {

        //Given
        Tractor tractor = new Tractor();
        Farmer farmer = new Farmer("froilan");

        FarmHouse farmHouse = new FarmHouse();
        farmHouse.addResident(farmer);

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

        farmer.mount(tractor);

        //Test to see if each row is fertilized
        //When
        assertFalse(corn.isHarvested());
        assertFalse(corn1.isHarvested());
        assertFalse(tomato.isHarvested());
        assertFalse(tomato1.isHarvested());

        tractor.operate(farm);

        //Then
        assertTrue(corn.isHarvested());
        assertTrue(corn1.isHarvested());
        assertTrue(tomato.isHarvested());
        assertTrue(tomato1.isHarvested());
    }

}
