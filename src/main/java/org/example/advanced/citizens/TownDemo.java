package org.example.advanced.citizens;

import org.example.advanced.citizens.classes.King;
import org.example.advanced.citizens.classes.Peasant;
import org.example.advanced.citizens.classes.Soldier;
import org.example.advanced.citizens.classes.Townsman;

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

        Town town = new Town();
        town.howManyCanVote(king, soldier1, soldier2, soldier3, townsman1, townsman2, townsman3, peasant1, peasant2, peasant3);
        town.whoCanVote(king, soldier1, soldier2, soldier3, townsman1, townsman2, townsman3, peasant1, peasant2, peasant3);
    }
}
