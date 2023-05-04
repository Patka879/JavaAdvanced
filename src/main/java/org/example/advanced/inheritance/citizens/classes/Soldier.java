package org.example.advanced.inheritance.citizens.classes;

public class Soldier extends Citizen{
    public Soldier(String name) {
        super(name);
    }

    @Override
    public boolean canVote() {
        return true;
    }

    @Override
    public String toString() {
        return "Soldier " + name;
    }
}
