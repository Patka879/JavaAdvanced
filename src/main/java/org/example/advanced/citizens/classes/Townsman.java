package org.example.advanced.citizens.classes;

import org.example.advanced.citizens.classes.Citizen;

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
