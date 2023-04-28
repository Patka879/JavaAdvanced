package org.example.advanced.dodgeball;

import org.example.advanced.dodgeball.players.Player;
import org.example.advanced.dodgeball.players.RealPlayer;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {

    private Player[] players;

    public Game(Player[] players) {
    }

    public void start(){
        Scanner scanner = new Scanner(System.in);
        String startGame = scanner.nextLine();
        System.out.println("Type 'START' to start the game");
        if(startGame.equalsIgnoreCase("Start")) {
            for (Player player : players) {
//            player.move();
                printBoard();
                //if he is on place with another player? so remove another player
                //have we won or lost?
            }
        }
    }
    private void printBoard() {
        for (int y = 0; y < 10;y++) {
            for (int x = 0; x <10; x++) {
                System.out.println(whatOnTheField(x, y));
            }
            System.out.println();
        }
    }

    public String whatOnTheField(int x, int y) {
        if(players[0].getHorizontalPosition() == x && players[0].getVerticalPosition() == y) {
            System.out.println(players[0].getName());
        } else {
            System.out.println("- ");
        }
        return "move made";
    }

}
