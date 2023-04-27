package org.example.advanced.cards;

import java.util.ArrayList;
import java.util.List;

public class GameDemo {
    public static void main(String[] args) {
        Card card1 = new Card(Rank.ACE, Suit.CLUBS);
        Card card2 = new Card(Rank.FIVE, Suit.HEARTS);

        System.out.println("Card 1: " + card1);
        System.out.println("Card 2: " + card2);

        System.out.println();
        System.out.println("Higher card");
        CompareCards compareCards = new CompareCards();
        compareCards.whichCardWins(card1, card2);
        compareCards.printWhoWins(card1, card2);

        System.out.println();
        System.out.println("ALL RANK POWERS");
        for(Rank rank : Rank.values()) {
            System.out.println(rank + " power is " + rank.getPower());
        }

        System.out.println();
        System.out.println("THIS IS A FULL DECK");
        List<Card> deck = new ArrayList<>();
        for(Rank rank : Rank.values()) {
            for(Suit suit : Suit.values()) {
                deck.add(new Card(rank, suit));
            }
        }
        System.out.println(deck);

        System.out.println();
        System.out.println("ALL SPADE CARDS");
        List<Card> allSpades = new ArrayList<>();
        for(Rank rank : Rank.values()) {
            allSpades.add(new Card(rank, Suit.SPADES));
        }
        System.out.println(allSpades);

    }


}
