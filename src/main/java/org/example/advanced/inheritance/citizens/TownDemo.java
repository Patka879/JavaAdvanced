package org.example.advanced.inheritance.citizens;

import org.example.advanced.inheritance.citizens.classes.*;
import org.example.advanced.inheritance.citizens.classes.*;

public class TownDemo {
    public static void main(String[] args) {
        King king = new King("Karol");

        Peasant peasant1 = new Peasant("Carl");
        Peasant peasant2 = new Peasant("Łukasz");
        Peasant peasant3 = new Peasant("Andrzej");

        Townsman townsman1 = new Townsman("Krzysztof");
        Townsman townsman2 = new Townsman("Anna");
        Townsman townsman3 = new Townsman("Łucja");

        Soldier soldier1 = new Soldier("Zenon");
        Soldier soldier2 = new Soldier("Mieszko");
        Soldier soldier3 = new Soldier("Kamil");

        Citizen[] citizens = {king, soldier1, soldier2, soldier3, townsman1, townsman2, townsman3, peasant1, peasant2, peasant3};
        Town town = new Town();
        for(Citizen citizen : citizens) {
            town.addCitizen(citizen);
        }

        town.howManyCanVote();

        System.out.println("===========");
        System.out.println("WHO CAN VOTE?");
        town.whoCanVote();
    }
}
