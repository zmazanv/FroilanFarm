package com.zipcodewilmington.froilansfarm.classes.persons;

import com.zipcodewilmington.froilansfarm.interfaces.Eater;
import com.zipcodewilmington.froilansfarm.interfaces.NoiseMaker;

public abstract class Person implements Eater, NoiseMaker {

    private String name;

    public Person(String name) {
        StringBuilder titledName = new StringBuilder(name);
        for (int i = 0; i < titledName.length(); i++) {
            if (i == 0) {
                titledName.setCharAt(i, Character.toUpperCase(titledName.charAt(i)));
            } else {
                titledName.setCharAt(i, Character.toLowerCase(titledName.charAt(i)));
            }
        }
        this.name = titledName.toString();
    }

    public String getName() {
        return this.name;
    }

//    public void setName(String newName) {
//        StringBuilder titledNewName = new StringBuilder(newName);
//        for (int i = 0; i < titledNewName.length(); i++) {
//            if (i == 0) {
//                titledNewName.setCharAt(i, Character.toUpperCase(titledNewName.charAt(i)));
//            } else {
//                titledNewName.setCharAt(i, Character.toLowerCase(titledNewName.charAt(i)));
//            }
//        }
//        this.name = titledNewName.toString();
//    }

    @Override
    public String toString() {
        return (this.getClass().getSimpleName() + ' ' + this.getName());
    }
}
