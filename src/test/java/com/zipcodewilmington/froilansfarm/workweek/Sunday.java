package com.zipcodewilmington.froilansfarm.workweek;

import org.junit.Assert;
import org.junit.Test;

import com.zipcodewilmington.froilansfarm.Routine;
import com.zipcodewilmington.froilansfarm.classes.crops.CornStalk;
import com.zipcodewilmington.froilansfarm.classes.crops.TomatoPlant;
import com.zipcodewilmington.froilansfarm.classes.crops.WheatPlant;

public class Sunday extends Routine {

    @Test
    public void testSunday() {
        doMorningRoutine();
        // Froilan plants Crops in his CropRows
        froilan.plant(new CornStalk(), cornStalkCropRow);
        froilan.plant(new TomatoPlant(), tomatoPlantCropRow);
        froilan.plant(new WheatPlant(), mixedCropRowOne);

        // Ensuring the CropRow has the correct amount of Crops after successful planting
        Assert.assertEquals(11, cornStalkCropRow.getContainedCrops().size());
        Assert.assertEquals(11, farm.getField().getContainedCropRows().get(0).getContainedCrops().size());

        // Ensuring the CropRow has the correct amount of Crops after successful planting
        Assert.assertEquals(9, tomatoPlantCropRow.getContainedCrops().size());
        Assert.assertEquals(9, farm.getField().getContainedCropRows().get(1).getContainedCrops().size());

        // Ensuring the CropRow has the correct amount of Crops after successful planting
        Assert.assertEquals(14, mixedCropRowOne.getContainedCrops().size());
        Assert.assertEquals(14, farm.getField().getContainedCropRows().get(2).getContainedCrops().size());
    }

}
