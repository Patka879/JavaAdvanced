package org.example.advanced.cards;

public class compareCards {
    private Card card;

    public compareCards() {
    }

    public void whichCardWins(Card card1, Card card2) {
        if (card1.getRank().getPower() > card2.getRank().getPower()) {
            System.out.println("Card 1 is a winner: " + card1);
        } else {
            System.out.println("Card 2 is a winner: " + card2);
        }
    }
}

