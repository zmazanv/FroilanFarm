package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Stable{

    private final List<Horse> horses = new ArrayList<>();

    public Stable(){

    }

    public Stable(Horse horse){
        this.horses.add(horse);
    }

    public Stable(Horse[] horses){
        this.horses.addAll(Arrays.asList(horses));
    }

    public Stable(List<Horse> horses){
        this.horses.addAll(horses);
    }

    public List<Horse> getHorses(){
        return this.horses;
    }

    public void storeHorse(Horse horse){
        this.horses.add(horse);
    }

    public void storeHorses(Horse[] horses){
        this.horses.addAll(Arrays.asList(horses));
    }

    public void storeHorses(List<Horse> horses){
        this.horses.addAll(horses);
    }
}
