package org.example.advanced.dodgeball.players;

import java.util.Random;

public class ComputerPlayer extends Player {

    private boolean isAlive;
    public ComputerPlayer(String name) {
        super(name);
        isAlive = true;
    }

    @Override
    public void makeMove() {
        Random random = new Random();
        int direction = random.nextInt(4);
        int newHorizontalPosition = horizontalPosition;
        int newVerticalPosition = verticalPosition;
        switch (direction) {
            case 0:
                newHorizontalPosition--;
                break;
            case 1:
                newHorizontalPosition++;
                break;
            case 2:
                newVerticalPosition--;
                break;
            case 3:
                newVerticalPosition++;
                break;
        }
        horizontalPosition = newHorizontalPosition;
        newVerticalPosition = newVerticalPosition;
    }

    @Override
    public String toString() {
        return "BOT " + "\n" +
                "Name: " + name + ", Position: " + verticalPosition + "." + horizontalPosition;
    }
}
