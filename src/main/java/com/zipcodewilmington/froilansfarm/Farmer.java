package com.zipcodewilmington.froilansfarm;

public class Farmer extends Person implements Botanist, Eater, Rider {

    public Farmer(String name) {
        super(name);
    }

    public void eat(Edible edible) {
        System.out.println(this.getName() + " eats" + edible);
    }

    public void plant(Crop crop, CropRow crowRow) {
        System.out.println(this.getName() + " planted " +  crowRow + " of " + crop);
    }


    public void mount(Rideable rideable) {
        System.out.println(this.getName() + " gets on " + rideable );
    }


    public void dismount(Rideable rideable) {
        System.out.println(this.getName() + " gets off " + rideable );
    }

}
