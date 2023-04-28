package org.example.advanced.dodgeball;

import org.example.advanced.dodgeball.players.ComputerPlayer;
import org.example.advanced.dodgeball.players.Player;
import org.example.advanced.dodgeball.players.RealPlayer;

import java.util.Scanner;

public class DodgeballDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter Your name:");
        String playerName = scanner.nextLine();
        RealPlayer realPlayer = new RealPlayer(playerName);
        ComputerPlayer computerPlayer1 = new ComputerPlayer("Player 1");
        ComputerPlayer computerPlayer2 = new ComputerPlayer("Player 2");
        ComputerPlayer computerPlayer3 = new ComputerPlayer("Player 3");

        Player[] players = {realPlayer, computerPlayer1, computerPlayer2, computerPlayer3};

        Game game = new Game(players);
        game.start();

    }
}
