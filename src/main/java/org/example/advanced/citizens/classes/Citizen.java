package org.example.advanced.citizens.classes;

public abstract class Citizen {
    String name;

    Citizen(String name) {
        this.name = name;
    }

    public abstract boolean canVote();

}
