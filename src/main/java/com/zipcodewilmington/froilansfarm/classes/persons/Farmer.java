package com.zipcodewilmington.froilansfarm.classes.persons;

import com.zipcodewilmington.froilansfarm.classes.animals.EdibleEgg;
import com.zipcodewilmington.froilansfarm.classes.crops.CornStalk;
import com.zipcodewilmington.froilansfarm.classes.crops.Tomato;
import com.zipcodewilmington.froilansfarm.interfaces.*;

public class Farmer extends Person implements Botanist, Rider {

    public Farmer(String name) {
        super(name);
    }

    public void eatBreakfast() {
        // Implementation for eating breakfast
            // Consume the specific food items for breakfast
    }



    @Override
    public void makeNoise() {
        System.out.println("*YEEHAW*");
    }

    @Override
    public String toString() {
        StringBuilder response = new StringBuilder(super.toString());
        response.append(" works on a Farm.");
        return response.toString();
    }
}
