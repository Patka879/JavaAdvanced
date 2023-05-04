package org.example.advanced.automat;

import java.util.ArrayList;
import java.util.List;


public class GameMachine {
    private List<Game> games;

    public GameMachine() {
        games = new ArrayList<>();
    }

    public void addGame(Game game) {
        games.add(game);
    }


    public void buyGame(String name, int amount) throws GameNotAvailableException, InsuficientFundsException {
        Game game = null;
        for (Game g : games) {
            if (g.getName().equals(name)) {
                game = g;
                break;
            }
        }
        if (game == null) {
            throw new GameNotAvailableException();
        }
        if (amount < game.getPrice()) {
            throw new InsuficientFundsException();
        }
        int change = amount - game.getPrice();
        if (change > 0) {
            System.out.println("Your change is " + change + " ZŁ.");
        }
        System.out.println("You bought game " + game.getName());
        }

}
