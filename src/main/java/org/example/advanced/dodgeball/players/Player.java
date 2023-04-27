package org.example.advanced.dodgeball.players;

public abstract class Player {
    String name;
    int verticalPosition;
    int horizontalPosition;

    public Player(String name, int verticalPosition, int horizontalPosition) {
        this.name = name;
        this.verticalPosition = verticalPosition;
        this.horizontalPosition = horizontalPosition;
    }

    abstract String makeMove();
}
