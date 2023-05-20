package com.zipcodewilmington.froilansfarm.workweek;

import com.zipcodewilmington.froilansfarm.classes.crops.CornStalk;
import com.zipcodewilmington.froilansfarm.classes.crops.TomatoPlant;
import com.zipcodewilmington.froilansfarm.classes.crops.WheatPlant;
import org.junit.Assert;
import org.junit.Test;

import com.zipcodewilmington.froilansfarm.Routine;

public class Sunday extends Routine {

    @Test
    public void testSunday() {
        doMorningRoutine();
        froilan.plant(new CornStalk(), cornStalkCropRow);
        froilan.plant(new TomatoPlant(), tomatoPlantCropRow);
        froilan.plant(new WheatPlant(), mixedCropRowOne);

        Assert.assertEquals(11, cornStalkCropRow.getContainedCrops().size());
        Assert.assertEquals(11, farm.getField().getContainedCropRows().get(0).getContainedCrops().size());

        Assert.assertEquals(9, tomatoPlantCropRow.getContainedCrops().size());
        Assert.assertEquals(9, farm.getField().getContainedCropRows().get(1).getContainedCrops().size());

        Assert.assertEquals(14, mixedCropRowOne.getContainedCrops().size());
        Assert.assertEquals(14, farm.getField().getContainedCropRows().get(2).getContainedCrops().size());
    }

}
