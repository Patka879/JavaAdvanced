package org.example.advanced.cards;

public class GameDemo {
    public static void main(String[] args) {
        Card card1 = new Card(Rank.ACE, Suit.CLUBS);
        Card card2 = new Card(Rank.FIVE, Suit.HEARTS);

        System.out.println("Card 1: " + card1);
        System.out.println("Card 2: " + card2);

        System.out.println();

        System.out.println("All Ranks Power:");
        for(Rank rank : Rank.values()) {
            System.out.println(rank + " power is " + rank.getPower());
        }


    }


}
