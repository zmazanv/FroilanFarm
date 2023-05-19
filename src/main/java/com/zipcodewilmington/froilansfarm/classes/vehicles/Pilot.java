package com.zipcodewilmington.froilansfarm.classes.vehicles;

import com.zipcodewilmington.froilansfarm.classes.persons.Person;

public class Pilot extends Person {
    private Aircraft aircraft;

    public Pilot(String name, Aircraft aircraft) {
        super(name);
        this.aircraft = aircraft;
    }

    public Aircraft getAircraft() {
        return this.aircraft;
    }

    public void setAircraft(Aircraft aircraft) {
        this.aircraft = aircraft;
    }

    @Override
    public String toString() {
        return "Pilot{" +
                "name='" + this.getName() + '\'' +
                ", uses this aircraft='" + this.aircraft + '\'' +
                '}';
    }

    @Override
    public void makeNoise() {

    }
}
