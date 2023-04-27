package org.example.advanced.cards;

public class Card {
    private Suit suit;
    private Rank rank;

    public Card(Rank rank, Suit suit) {
        this.suit = suit;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "SUIT: " + rank + " OF " + suit;
    }
}
