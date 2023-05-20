package com.zipcodewilmington.froilansfarm.classes.persons;

<<<<<<< HEAD
import com.zipcodewilmington.froilansfarm.classes.animals.EdibleEgg;
import com.zipcodewilmington.froilansfarm.classes.crops.CornStalk;
import com.zipcodewilmington.froilansfarm.classes.crops.Tomato;
=======
import com.zipcodewilmington.froilansfarm.classes.animals.Animal;
>>>>>>> main
import com.zipcodewilmington.froilansfarm.interfaces.*;

public class Farmer extends Person implements Botanist, Rider {

    public Farmer(String name) {
        super(name);
    }

<<<<<<< HEAD
    public void eatBreakfast() {
        // Implementation for eating breakfast
            // Consume the specific food items for breakfast
    }



=======
    public void feed(Animal animalToBeFed, Edible edibleToBeGiven) {
        animalToBeFed.eat(edibleToBeGiven);
    }

>>>>>>> main
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
