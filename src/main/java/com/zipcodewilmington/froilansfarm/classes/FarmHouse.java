package com.zipcodewilmington.froilansfarm.classes;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class FarmHouse {

    private final List<Person> residents = new ArrayList<>();

    public FarmHouse() {}
    public FarmHouse(Person resident) {
        this.residents.add(resident);
    }
    public FarmHouse(Person[] residents) {
        this.residents.addAll(Arrays.asList(residents));
    }
    public FarmHouse(List<Person> residents) {
        this.residents.addAll(residents);
    }

    public List<Person> getCurrentResidents() {
        return this.residents;
    }

    public void addResident(Person residentToBeAdded) {
        this.residents.add(residentToBeAdded);
    }
    public void addResidents(Person[] residentsToBeAdded) {
        this.residents.addAll(Arrays.asList(residentsToBeAdded));
    }
    public void addResidents(List<Person> residentsToBeAdded) {
        this.residents.addAll(residentsToBeAdded);
    }

    public Person removeResident(Person residentToBeRemoved) {
        if (this.residents.contains(residentToBeRemoved)) {
            this.residents.remove(residentToBeRemoved);
            return residentToBeRemoved;
        }
        return null;
    }
    public List<Person> removeResidents(Person[] personsToBeRemoved) {
        List<Person> residentsRemoved = new ArrayList<>(this.residents);
        List<Person> residentsToBeRemovedAsList = new ArrayList<>(Arrays.asList(personsToBeRemoved));
        residentsRemoved.retainAll(residentsToBeRemovedAsList);
        this.residents.removeAll(residentsToBeRemovedAsList);
        return residentsRemoved;
    }
    public List<Person> removeResidents(List<Person> residentsToBeRemoved) {
        List<Person> residentsRemoved = new ArrayList<Person>(this.residents);
        residentsRemoved.retainAll(residentsToBeRemoved);
        this.residents.removeAll(residentsToBeRemoved);
        return residentsRemoved;
    }

}