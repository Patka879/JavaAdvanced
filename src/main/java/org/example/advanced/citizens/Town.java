package org.example.advanced.citizens;


import org.example.advanced.citizens.classes.Citizen;

import java.util.ArrayList;

public class Town {


    public int howManyCanVote(Citizen... citizens) {
        int votersCount = 0;
        for (Citizen citizen : citizens) {
            if (citizen.canVote()) {
                votersCount++;
            }
        }
        System.out.println("How many citizens can vote? " + votersCount);
        return votersCount;
    }

    public void whoCanVote(Citizen... citizens) {
        for (Citizen citizen : citizens) {
            if (citizen.canVote()) {
                System.out.println(citizen);
            }
        }
    }
}
