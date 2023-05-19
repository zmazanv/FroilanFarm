package com.zipcodewilmington.froilansfarm.classes.vehicles;

import com.zipcodewilmington.froilansfarm.interfaces.NoiseMaker;
import com.zipcodewilmington.froilansfarm.interfaces.Rideable;

public abstract class Vehicle implements NoiseMaker, Rideable {

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
        System.out.println("*ROOM*");
    }

    @Override
    public String toString() {
        StringBuilder response = new StringBuilder(this.getClass().getSimpleName());
        if (this.hasBeenMounted) {
            response.append(" is mounted on.");
        } else {
            response.append(" is not mounted on.");
        }
        return response.toString();
    }
}
