package org.example.advanced.cards;

public enum Suit {
    SPADES("Spades"),
    HEARTS("Hearts"),
    DIAMONDS("Diamonds"),
    CLUBS("Clubs");

    private String color;
    Suit(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
}
