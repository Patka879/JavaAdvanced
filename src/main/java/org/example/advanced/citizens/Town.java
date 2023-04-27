package org.example.advanced.citizens;


import org.example.advanced.citizens.classes.Citizen;

import java.util.ArrayList;

public class Town {
    ArrayList<Citizen> citizens = new ArrayList<>();
    void addCitizen(Citizen citizen) {
        citizens.add(citizen);
    }

    public int howManyCanVote() {
        int votersCount = 0;
        for (Citizen citizen : citizens) {
            if (citizen.canVote()) {
                votersCount++;
            }
        }
        System.out.println("How many citizens can vote? " + votersCount);
        return votersCount;
    }

    public void whoCanVote() {
        for (Citizen citizen : citizens) {
            if (citizen.canVote()) {
                System.out.println(citizen);
            }
        }
    }
}
