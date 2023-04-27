package org.example.advanced.cards;

public class CompareCards {
    private Card card;

    public CompareCards() {
    }

    public void printWhoWins(Card card1, Card card2) {
        int result =  whichCardWins(card1, card2);
        if (result < 0) {
            System.out.println("Winner is " + card1);
        } else if (result == 1) {
            System.out.println("All cards are the same, it's a tie");
        } else {
            System.out.println("Winner is: " + card2);
        }
    }

    public int whichCardWins(Card card1, Card card2) {
        if (card1.getRank().getPower() > card2.getRank().getPower()) {
            return -1;
        } else if (card1.getRank().getPower() == card2.getRank().getPower()){
            return 0;
        } else {
            return 1;
        }
    }
}

