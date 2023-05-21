package com.zipcodewilmington.froilansfarm.workweek;

import com.zipcodewilmington.froilansfarm.classes.animals.Horse;
import com.zipcodewilmington.froilansfarm.classes.animals.Stable;
import com.zipcodewilmington.froilansfarm.classes.crops.CornStalk;
import com.zipcodewilmington.froilansfarm.classes.crops.Crop;
import com.zipcodewilmington.froilansfarm.classes.crops.CropRow;
import com.zipcodewilmington.froilansfarm.classes.crops.EarOfCorn;
import org.junit.Assert;
import org.junit.Test;

import com.zipcodewilmington.froilansfarm.Routine;

import java.util.List;

public class Thursday extends Routine {

    @Test
    public void testThursday() {
        doMorningRoutine();
        tractor.operate(farm);

        for (CropRow cropRow : field.getContainedCropRows()){
            List<Crop> crops = cropRow.getContainedCrops();
            for (Crop crop : crops){
                Assert.assertTrue(crop.isHarvested());


                    }
                }
            }
        }



