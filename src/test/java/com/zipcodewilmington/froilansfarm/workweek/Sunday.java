package com.zipcodewilmington.froilansfarm.workweek;

import com.zipcodewilmington.froilansfarm.classes.animals.Horse;
import com.zipcodewilmington.froilansfarm.classes.animals.Stable;
import com.zipcodewilmington.froilansfarm.classes.crops.EarOfCorn;
import com.zipcodewilmington.froilansfarm.classes.persons.Farmer;
import com.zipcodewilmington.froilansfarm.classes.vehicles.CropDuster;
import com.zipcodewilmington.froilansfarm.classes.vehicles.Pilot;
import org.junit.Assert;
import org.junit.Test;

public class Sunday {

    @Test
    public void testSunday() {

        CropDuster cropDuster = new CropDuster();
        Farmer froilan = new Farmer("froilan");
        Pilot froilanda = new Pilot("froilanda", cropDuster);

        Horse[] horses = new Horse[10];
        for(int x = 0; x < horses.length; x++){
            horses[x] = new Horse();
        }
        Stable[] stables = new Stable[3];
        for(int x = 0; x < stables.length; x++){
            stables[x] = new Stable();
        }
        stables[0] = new Stable(new Horse[] {horses[0], horses[1], horses[2], horses[3]});
        stables[1] = new Stable(new Horse[] {horses[4], horses[5], horses[6]});
        stables[2] = new Stable(new Horse[] {horses[7], horses[8], horses[9]});

        Assert.assertFalse(horses[0].isMounted());
        for(int x = 0; x < horses.length; x++){
            if(x % 2 != 0){
                froilan.mount(horses[x]);
            }else{
                froilanda.mount(horses[x]);
            }
        }
        Assert.assertTrue(horses[0].isMounted());

        //Each horse eats 3 pieces of corn
        EarOfCorn corn = new EarOfCorn();
        for(int x = 0; x < horses.length; x++){
            for(int y = 0; y < 3; y++){
                horses[x].eat(corn);
            }
        }
        //Assert.assertEquals();
    }
}
