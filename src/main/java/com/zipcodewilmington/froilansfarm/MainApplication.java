package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.classes.Farm;
import com.zipcodewilmington.froilansfarm.classes.FarmHouse;
import com.zipcodewilmington.froilansfarm.classes.animals.Horse;
import com.zipcodewilmington.froilansfarm.classes.animals.Stable;
import com.zipcodewilmington.froilansfarm.classes.crops.*;
import com.zipcodewilmington.froilansfarm.classes.persons.Farmer;
import com.zipcodewilmington.froilansfarm.interfaces.FarmVehicle;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by leon on 2/26/18.
 */
public class MainApplication {

    public static void main(String[] args) {

        Farmer froilan = new Farmer("froilan");
        FarmHouse froilanFarmHouse = new FarmHouse();
        froilanFarmHouse.addResident(froilan);

        Crop[] earCorn = new CornStalk[10];
        for(int c = 0; c < earCorn.length; c++){
            earCorn[c] = new CornStalk();
        }
        Crop[] tomato = new TomatoPlant[10];
        for(int t = 0; t < tomato.length; t++){
            tomato[t] = new TomatoPlant();
        }
        List<Crop> cropsOfCorn = List.of(new Crop[]{earCorn[0], earCorn[1],
                earCorn[2], earCorn[3]});
        List<Crop> cropsOfTomato = List.of(new Crop[]{tomato[0], tomato[1],
                tomato[2], tomato[3]});
        List<Crop> mixOfCrops1 = List.of(new Crop[]{earCorn[4], earCorn[5],
                tomato[4], tomato[5]});
        List<Crop> mixOfCrops2 = List.of(new Crop[]{tomato[6], earCorn[6],
                tomato[7], earCorn[7]});
        List<Crop> mixOfCrops3 = List.of(new Crop[]{earCorn[8], tomato[8],
                earCorn[9], tomato[9]});

        CropRow[] cropRows = new CropRow[5];
        for(int x = 0; x < cropRows.length; x++){
            cropRows[x] = new CropRow();
        }
        cropRows[0].storeCrops(cropsOfCorn);
        cropRows[1].storeCrops(cropsOfTomato);
        cropRows[2].storeCrops(mixOfCrops1);
        cropRows[3].storeCrops(mixOfCrops2);
        cropRows[4].storeCrops(mixOfCrops3);

        Field froilanField = new Field();
        froilanField.storeCropRows(cropRows);
        System.out.println(cropsOfTomato.size());
        System.out.println(cropsOfCorn.size());
        System.out.println(mixOfCrops1.size());
        System.out.println(froilanField.getContainedCropRows().size());
        System.out.println(froilanField.getContainedCropRows());

        Farm froilanFarm = new Farm(froilanFarmHouse, froilanField);

    }

}
