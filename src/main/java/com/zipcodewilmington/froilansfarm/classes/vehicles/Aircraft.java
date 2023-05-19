package com.zipcodewilmington.froilansfarm.classes.vehicles;

public class Aircraft extends Vehicle {

    public void fly() {
        System.out.println(this.getClass().getSimpleName() + " is in flight.");
    }

    @Override
    public String toString() {
        return "Aircraft";
    }
}
