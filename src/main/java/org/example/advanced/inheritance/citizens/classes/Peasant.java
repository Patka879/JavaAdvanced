package org.example.advanced.inheritance.citizens.classes;

public class Peasant extends Citizen {

    public Peasant(String name) {
        super(name);
    }

    @Override
    public boolean canVote() {
        return false;
    }

    @Override
    public String toString() {
        return "Peasant{" +
                "name='" + name + '\'' +
                '}';
    }
}
