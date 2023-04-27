package org.example.advanced.cards;

public class CompareCards {
    private Card card;

    public CompareCards() {
    }

    public void whichCardWins(Card card1, Card card2) {
        if (card1.getRank().getPower() > card2.getRank().getPower()) {
            System.out.println("Card 1 is a winner: " + card1);
        } else if (card1.getRank().getPower() == card2.getRank().getPower()){
            System.out.println("It's a tie");
        } else {
            System.out.println("Card 2 is a winner: " + card2);
        }
    }
}

