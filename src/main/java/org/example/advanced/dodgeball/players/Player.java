package org.example.advanced.dodgeball.players;

import java.util.Random;

public abstract class Player {
    String name;
    int verticalPosition;
    int horizontalPosition;
    Random random = new Random();

    public Player(String name) {
        this.name = name;
        this.verticalPosition = getRandomPosition();
        this.horizontalPosition = getRandomPosition();
    }

    public int getVerticalPosition() {
        return verticalPosition;
    }

    public void setVerticalPosition(int verticalPosition) {
        this.verticalPosition = verticalPosition;
    }

    public int getHorizontalPosition() {
        return horizontalPosition;
    }

    public void setHorizontalPosition(int horizontalPosition) {
        this.horizontalPosition = horizontalPosition;
    }

    public String getName() {
        return name;
    }

    public int getRandomPosition() {
        return random.nextInt(1, 10);
    }

    public abstract void makeMove();
}
