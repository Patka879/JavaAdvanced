package org.example.advanced.cards;

//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//import java.util.Random;
//
//public class Deck {
//
//    private List<Card> player1Deck;
//    private List<Card> player2Deck;
//    public Deck() {
//    }
//
//
//    public void cardDeal() {}
//    public void fullDeck() {
//        List<Card> deck = new ArrayList<>();
//        for(Rank rank : Rank.values()) {
//            for(Suit suit : Suit.values()) {
//                deck.add(new Card(rank, suit));
//            }
//        }
//        //Shuffle
//        Collections.shuffle(deck);
//        System.out.println(deck);
//    }
//    {
//        player1Deck = new ArrayList<>();
//        player2Deck = new ArrayList<>();
//        Random random = new Random();
//        for (Card card : deck) {
//            if (random.nextBoolean()) {
//                player1Deck.add(card);
//            } else {
//                player2Deck.add(card);
//            }
//        }
//    }
//}
