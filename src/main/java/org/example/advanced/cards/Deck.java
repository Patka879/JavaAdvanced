package org.example.advanced.cards;

import java.util.ArrayList;
import java.util.List;

public class Deck {

    public void fullDeck() {
        List<Card> deck = new ArrayList<>();
        for(Rank rank : Rank.values()) {
            for(Suit suit : Suit.values()) {
                deck.add(new Card(rank, suit));
            }
        }
        System.out.println(deck);
    }
}
