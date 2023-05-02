package org.example.advanced.cards;

import org.example.advanced.dodgeball.Game;

import java.sql.SQLOutput;
import java.util.*;

public class Deck {

    private List<Card> player1Deck;
    private List<Card> player2Deck;

    public Deck() {
        player1Deck = new ArrayList<>();
        player2Deck = new ArrayList<>();
    }

    public List<Card> fullDeck() {
        List<Card> deck = new ArrayList<>();
        for(Rank rank : Rank.values()) {
            for(Suit suit : Suit.values()) {
                deck.add(new Card(rank, suit));
            }
        }
        //Shuffle
        Collections.shuffle(deck);
        System.out.println("Full, shuffled deck: " + deck);
        return deck;
    }

    public void dealCards() {
        List<Card> deck = fullDeck();
        int deckSize = deck.size();
        for (int i = 0; i < deckSize; i++) {
            if (i % 2 == 0) {
                player1Deck.add(deck.get(i));
            } else {
                player2Deck.add(deck.get(i));
            }
        }
        System.out.println("Player1 deck: " + player1Deck);
        System.out.println("Player2 deck: " + player2Deck);
    }

    public void gameRound() {
        System.out.println("Player1: " + player1Deck.get(0));
        System.out.println("Player2: " + player2Deck.get(0));
        if (player1Deck.get(0).getRank().getPower() > player2Deck.get(0).getRank().getPower()) {
            System.out.println(player1Deck.get(0) + " is higher than " + player2Deck.get(0) + "\n" +
            "Round won by player1");
            player2Deck.remove(0);
        }   else if (player1Deck.get(0).getRank().getPower() < player2Deck.get(0).getRank().getPower()) {
            System.out.println(player1Deck.get(0) + " is lower than " + player2Deck.get(0) + "\n" +
            "Round won by player2");
            player1Deck.remove(0);
        } else {
            System.out.println("Both cards are equal. It's time for war between next cards");
            System.out.println("Player1: " + player1Deck.get(1));
            System.out.println("Player2: " + player2Deck.get(1));
            if (player1Deck.get(1).getRank().getPower() > player2Deck.get(1).getRank().getPower()) {
                System.out.println(player1Deck.get(1) + " is higher than " + player2Deck.get(1) + "\n" +
                        "Round won by player1. Player 2 is loosing two cards");
                player2Deck.remove(0);
                player2Deck.remove(1);
            }   else if (player1Deck.get(1).getRank().getPower() < player2Deck.get(1).getRank().getPower()) {
                System.out.println(player1Deck.get(1) + " is lower than " + player2Deck.get(1) + "\n" +
                        "Round won by player2. Player 1 is loosing two cards");
                player1Deck.remove(0);
                player1Deck.remove(1);
            }   else {
                System.out.println("Too many equal Cards. Time to shuffle decks");
                Collections.shuffle(player1Deck);
                Collections.shuffle(player2Deck);
            }
        }
        System.out.println();
        System.out.println("DECKS AFTER THIS ROUND:");
        System.out.println("Player1 deck: " + player1Deck);
        System.out.println("Player2 deck: " + player2Deck);
    }

    public void gameplay() {
        Deck deck = new Deck();
        Scanner scanner = new Scanner(System.in);
        String startTheGame = "";
        while (!startTheGame.equalsIgnoreCase("START")) {
            System.out.println("Type 'START' to begin");
            startTheGame = scanner.nextLine();
            if (startTheGame.equalsIgnoreCase("START")) {
                deck.dealCards();
            } else {
                System.out.println("Incorrect. Type 'START' to begin.");
            }
        }
        System.out.println();
        System.out.println("LET THE WAR BEGIN!");
        while (true) {
            System.out.println("Type 'WAR' to play the battle");
            String startTheWar = scanner.nextLine();
            while (!startTheWar.equalsIgnoreCase("WAR")) {
                System.out.println("Incorrect. Type 'WAR' to begin.");
                startTheWar = scanner.nextLine();
            }
            deck.gameRound();
            if (deck.player1Deck.isEmpty() || deck.player2Deck.isEmpty()) {
                break;
            }
        }
        System.out.println();
        if (deck.player1Deck.isEmpty()) {
            System.out.println("----------------------THE WINNER IS PLAYER 2!------------------");
        } else {
            System.out.println("----------------------THE WINNER IS PLAYER 1!------------------");
        }
    }
}
