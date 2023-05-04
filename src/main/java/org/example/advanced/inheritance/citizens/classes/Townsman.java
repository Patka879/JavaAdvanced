package org.example.advanced.inheritance.citizens.classes;

public class Townsman extends Citizen {
    public Townsman(String name) {
        super(name);
    }
    @Override
    public boolean canVote() {
        return true;
    }

    @Override
    public String toString() {
        return "Townsman " + name;
    }
}
