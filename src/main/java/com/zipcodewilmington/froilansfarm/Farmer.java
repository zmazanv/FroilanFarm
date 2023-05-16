package com.zipcodewilmington.froilansfarm;

public class Farmer extends Person implements Rider,Eater,Botanist{
    public Farmer(String name) {
        super(name);
    }

    public void eat(Edible edible) {
        System.out.println( this.getName() + "Eats " + edible);
    }

    public void plant(Crop crop, CropRow crowRow) {
        System.out.println(this.getName() + "Planted" + "" + crowRow + "of " + crop);

    }

    public void mount(Rideable rideable) {
        System.out.println(this.getName() + "Gets on" + rideable );

    }

    public void dismount(Rideable rideable) {
        System.out.println(this.getName() + "Gets on" + rideable );
    }


}
