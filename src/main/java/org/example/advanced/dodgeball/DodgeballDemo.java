package org.example.advanced.dodgeball;

import org.example.advanced.dodgeball.players.ComputerPlayer;
import org.example.advanced.dodgeball.players.Player;
import org.example.advanced.dodgeball.players.RealPlayer;

import java.util.Random;
import java.util.Scanner;

public class DodgeballDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter Your name:");
        String playerName = scanner.nextLine();
        RealPlayer realPlayer = new RealPlayer(playerName, getRandomPosition() , getRandomPosition());
        ComputerPlayer computerPlayer1 = new ComputerPlayer("Player 1", getRandomPosition(), getRandomPosition());
        ComputerPlayer computerPlayer2 = new ComputerPlayer("Player 2", getRandomPosition(), getRandomPosition());
        ComputerPlayer computerPlayer3 = new ComputerPlayer("Player 3", getRandomPosition(), getRandomPosition());

        Player[] players = {realPlayer, computerPlayer1, computerPlayer2, computerPlayer3};

        System.out.println("Type 'START' to start the game");
        String startGame = scanner.nextLine();

        if(startGame.equalsIgnoreCase("Start")) {
            for(Player player : players) {
                System.out.println(player);
            }
        }

    }

    public static int getRandomPosition() {
        Random random = new Random();
        return random.nextInt(1, 10);
    }
}
