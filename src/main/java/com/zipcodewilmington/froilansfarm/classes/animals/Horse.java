package com.zipcodewilmington.froilansfarm.classes.animals;

import com.zipcodewilmington.froilansfarm.interfaces.Rideable;

public class Horse extends Animal implements Rideable {

    private boolean hasBeenMounted = false;

    public boolean isMounted() {
        return this.hasBeenMounted;
    }

    @Override
    public void beDismounted() {
        this.hasBeenMounted = false;
        Rideable.super.beDismounted();
    }

    @Override
    public void beMounted() {
        this.hasBeenMounted = true;
        Rideable.super.beMounted();
    }

    @Override
    public void makeNoise() {
        System.out.println("*NEIGH*");
    }

    @Override
    public String toString() {
        StringBuilder response = new StringBuilder(this.getClass().getSimpleName());
        if (this.hasBeenMounted) {
            response.append(" is being ridden.");
        } else {
            response.append(" is not being ridden.");
        }
        return response.toString();
    }

}
